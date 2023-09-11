grammar Python;

tokens {INDENT, DEDENT}

@lexer::header {
  import com.yuvalshavit.antlr4.DenterHelper;
}

@lexer::members {
  private final DenterHelper denter = DenterHelper.builder()
    .nl(NEWLINE)
    .indent(PythonParser.INDENT)
    .dedent(PythonParser.DEDENT)
    .pullToken(PythonLexer.super::nextToken);

  @Override
  public Token nextToken() {
    return denter.nextToken();
  }
}

//parser

program 	: stmt* 
			;

stmt 		: simple_stmt
			| compound_stmt  
			;
			
			
simple_stmt	: small_stmt (';' small_stmt)* (';')? NEWLINE
			;

small_stmt	: print_stmt
			| expr_stmt 
			| del_stmt 
			| pass_stmt 
			| flow_stmt
			| import_stmt 
			| global_stmt 
			| nonlocal_stmt 			
			;

print_stmt	:	(TK_PRINT | TK_PRINTLN) '(' expr_stmt ')'
			;

expr_stmt	: expr_aritm			
			| expr_log				
			| expr_assign		    
			;

expr_aritm	: MATH '.' opFuncMat=('ceil'|'fabs' | 'factorial' | 'floor' | 'gcd' | 'sqrt' | 'log' | 'cos' | 'sin' | 'tan') '(' expr_aritm ')' #ExpFuncionMatematica
			| funcCall														#ExpCall 
			| <assoc=right> expr_aritm '**' expr_aritm				     	#ExpPot
			| opUnario=('+' | '-' | '~') expr_aritm							#ExpUnario
			| expr_aritm op1=('*' | '@' | '/' | '//' | '%') expr_aritm		#ExpMulDivANDOthers
			| expr_aritm op2=('+' | '-' ) expr_aritm						#ExpAddSub
			| expr_aritm op3=('<<' | '>>') expr_aritm						#ExpShift
			| expr_aritm '&' expr_aritm										#ExpANDBits
			| expr_aritm '^' expr_aritm										#ExpBitwise
			| expr_aritm '|' expr_aritm                                     #ExpOrBits
			| atom															#ExpAtom
			| '(' expr_aritm ')'											#ExpBraces
			;

expr_log 	: expr_aritm opL1=('in' | 'not in' | 'is' | 'is not' | '<' | '<=' | '>' | '>=' | '!=' | '==') expr_aritm	#ExpRel
			| 'not' expr_log																						#ExpNot
			| expr_log 'and' expr_log																				#ExpAND
			| expr_log 'or' expr_log																				#ExpOR		
			| NAME																									#ExpNameLog
			| cte_log																								#ExpCteLog		
			| '(' expr_log ')'																						#ExpLogBr
			;	

atom		: NAME'['NAME']'																						#Atom1
			|'[' ( ( expr_stmt ',')* expr_stmt)? ']'																#AtomArray
			|'{' ( ( NAME ',')* NAME)? '}'																			#Atom3
 			|'{' ((('\'' NAME '\'' | '"' NAME '"') ':' NAME ',')* ('\'' NAME '\''| '"' NAME '"') ':' NAME)? '}'		#Atom4
			| NAME																							        #AtomName
			| NUMBER																								#AtomNumber
			| STRING																								#AtomString
			| cte_log																								#AtomCteLog
			|																										#AtomEmptyString																						
			;

cte_log		: TK_TRUE
			| TK_FALSE
			;

expr_assign	:	NAME opAssign=('+=' | '-=' | '*=' | '@=' | '/=' | '%=' | '&=' | '|=' | '^=' |'<<=' | '>>=' 
			| '**=' | '//=' | '=') expr_stmt
			;

del_stmt	: 'del' NAME
			;

pass_stmt	: 'pass'
			;

flow_stmt	: break_stmt			#BreakStmt
			| continue_stmt			#ContinueStmt
			| return_stmt			#ReturnStmt
			;

break_stmt	: 'break'
			;

continue_stmt: 'continue'
			;

return_stmt	: 'return'  (expr_list)?
			;

expr_list	: expr_stmt (',' expr_stmt )* (';')?
			;

import_stmt	: import_name 
			| import_from
			;

import_name	: 'import' dotted_as_names
			;

import_from	: ('from' (('.' | '...')* dotted_name 
			| ('.' | '...')+)'import' ('*' | '(' import_as_names ')' 
			| import_as_names))
			;

import_as_name: NAME ('as' NAME)?		
			;
dotted_as_name: dotted_name ('as' NAME)?		
			;

import_as_names: import_as_name (',' import_as_name)* (',')?
			;

dotted_as_names: dotted_as_name (',' dotted_as_name)*
			;

dotted_name	: NAME ('.' NAME)*
			;

global_stmt	: 'global' NAME (',' NAME)*
			;

nonlocal_stmt: 'nonlocal' NAME (',' NAME)*
			;

compound_stmt: if_stmt 
			| while_stmt 
			| for_stmt 
			| try_stmt 
			| funcdef 
			| classdef 
			;

if_stmt		: 'if' test ':' suite (ELIF test ':' suite)* (ELSE ':' suite)?
			;

test 		: expr_aritm 
			| expr_log
			;
			
suite		: INDENT stmt+ DEDENT
			;

while_stmt	: 'while' test ':' suite 
			;

for_stmt	: 'for' expr_list 'in' testlist ':' suite 
			;

testlist	: test (',' test)* (',')?
			;

try_stmt	: 'try' ':' suite(except_clause ':' suite)+('else' ':' suite)?('finally' ':' suite)? 
			| 'try' ':' suite 'finally' ':' suite
			;

except_clause: 'except' (test ('as' NAME)?)?;

funcdef		: 'def' NAME '(' def_param_list? ')' ('->' test)? ':' suite
			;

def_param_list : TK_TYPE NAME (',' TK_TYPE NAME)*; 

classdef	: 'class' NAME ('(' (arglist)? ')')? ':' suite
			;	

arglist		: argument (',' argument)*  (',')?	
			;

argument	: NAME
			;

funcCall	: 
			 NAME '(' expr_list	')'
			;

//Lexer

//Palabras reservadas


DEF : 'def';
RETURN : 'return';
RAISE : 'raise';
FROM : 'from';
IMPORT : 'import';
AS : 'as';
GLOBAL : 'global';
NONLOCAL : 'nonlocal';
ASSERT : 'assert';
IF : 'if';
ELIF : 'elif';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
IN : 'in';
TRY : 'try';
FINALLY : 'finally';
WITH : 'with';
EXCEPT : 'except';
LAMBDA : 'lambda';
OR : 'or';
AND : 'and';
NOT : 'not';
IS : 'is';
NONE : 'None';
TK_TRUE : 'True';
TK_FALSE : 'False' ;
CLASS : 'class';
YIELD : 'yield';
DEL : 'del';
PASS : 'pass';
CONTINUE : 'continue';
BREAK : 'break';
ASYNC : 'async';
AWAIT : 'await';

TK_COMPLEX: 'complex';
TK_LIST: 'list';
TK_DICT: 'dict';
TK_SET: 'set';
TK_E: 'E' | 'e';

TK_TYPE   : 'void' | 'int' | 'float' | 'str' | 'bool';

TK_PRINT: 'print';
TK_PRINTLN: 'println';
//Operadores

//aritméticos
MUL: '*';
DIV: '/';
AT:	'@';
IDIV: '//';
ADD: '+';
SUB: '-';
MOD: '%';
POW: '**';
SIGN: (ADD) | (SUB);

//bit a bit
OR_OP : '|';
XOR : '^';
AND_OP : '&';
LEFT_SHIFT : '<<';
RIGHT_SHIFT : '>>';
NOT_OP : '~';

//relacionales
LESS_THAN : '<';
GREATER_THAN : '>';
EQUALS : '==';
GT_EQ : '>=';
LT_EQ : '<=';
NOT_EQ : '!=';

//asignación
ASSIGN : '=';
ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MULT_ASSIGN : '*=';
DIV_ASSIGN : '/=';
MOD_ASSIGN : '%=';
AND_ASSIGN : '&=';
OR_ASSIGN : '|=';
XOR_ASSIGN : '^=';
LEFT_SHIFT_ASSIGN : '<<=';
RIGHT_SHIFT_ASSIGN : '>>=';
POWER_ASSIGN : '**=';
IDIV_ASSIGN : '//=';

ARROW : '->';

SQRT : 'sqrt';
SIN : 'sin';
COS : 'cos';
MATH : 'math';
//CASTEO

CAST_INT: 'int' '(' ')';

CAST_FLOAT: 'float' '(' ')';

CAST_COMPLEX: 'complex'  '(' ')';

CAST_STRING: 'str' '(' (.)*? ')';

SKIP_
 : ( SPACES | COMMENT  ) -> skip
 ;


NEWLINE	:LINE_JOINING
 		;



NAME
 : ID_START ID_CONTINUE*
 ;

STRING
 : STRING_LITERAL
 | BYTES_LITERAL
 ;

NUMBER
 : INTEGER
 | FLOAT_NUMBER
 | IMAG_NUMBER
 ;

INTEGER
 : DECIMAL_INTEGER
 | OCT_INTEGER
 | HEX_INTEGER
 | BIN_INTEGER
 ;

//fragments

/// stringliteral   ::=  [stringprefix](shortstring | longstring)
/// stringprefix    ::=  "r" | "u" | "R" | "U" | "f" | "F"
///                      | "fr" | "Fr" | "fR" | "FR" | "rf" | "rF" | "Rf" | "RF"
STRING_LITERAL
 : ( [rR] | [uU] | [fF] | ( [fF] [rR] ) | ( [rR] [fF] ) )? ( SHORT_STRING | LONG_STRING )
 ;

/// bytesliteral   ::=  bytesprefix(shortbytes | longbytes)
/// bytesprefix    ::=  "b" | "B" | "br" | "Br" | "bR" | "BR" | "rb" | "rB" | "Rb" | "RB"
BYTES_LITERAL
 : ( [bB] | ( [bB] [rR] ) | ( [rR] [bB] ) ) ( SHORT_BYTES | LONG_BYTES )
 ;

/// decimalinteger ::=  nonzerodigit digit* | "0"+
DECIMAL_INTEGER: NON_ZERO_DIGIT DIGIT*
			| '0'+
 			;

/// octinteger     ::=  "0" ("o" | "O") octdigit+
OCT_INTEGER
 : '0' [oO] OCT_DIGIT+
 ;

/// hexinteger     ::=  "0" ("x" | "X") hexdigit+
HEX_INTEGER
 : '0' [xX] HEX_DIGIT+
 ;

/// bininteger     ::=  "0" ("b" | "B") bindigit+
BIN_INTEGER
 : '0' [bB] BIN_DIGIT+
 ;

/// floatnumber   ::=  pointfloat | exponentfloat
FLOAT_NUMBER
 : POINT_FLOAT
 | EXPONENT_FLOAT
 ;

/// imagnumber ::=  (floatnumber | intpart) ("j" | "J")
IMAG_NUMBER
 : ( FLOAT_NUMBER | INT_PART ) [jJ]
 ;
 fragment SHORT_STRING
 : '\'' ( STRING_ESCAPE_SEQ | ~[\\\r\n\f'] )* '\''
 | '"' ( STRING_ESCAPE_SEQ | ~[\\\r\n\f"] )* '"'
 ;
/// longstring      ::=  "'''" longstringitem* "'''" | '"""' longstringitem* '"""'
fragment LONG_STRING
 : '\'\'\'' LONG_STRING_ITEM*? '\'\'\''
 | '"""' LONG_STRING_ITEM*? '"""'
 ;

/// longstringitem  ::=  longstringchar | stringescapeseq
fragment LONG_STRING_ITEM
 : LONG_STRING_CHAR
 | STRING_ESCAPE_SEQ
 ;

/// longstringchar  ::=  <any source character except "\">
fragment LONG_STRING_CHAR
 : ~'\\'
 ;

/// stringescapeseq ::=  "\" <any source character>
fragment STRING_ESCAPE_SEQ
 : '\\' .
 | '\\' /*NEWLINE me daba bateo el de arriba*/ LINE_JOINING
 ;

/// nonzerodigit   ::=  "1"..."9"
fragment NON_ZERO_DIGIT: [1-9]
			;

/// digit          ::=  "0"..."9"
fragment DIGIT: [0-9]
			;

/// octdigit       ::=  "0"..."7"
fragment OCT_DIGIT
 : [0-7]
 ;

/// hexdigit       ::=  digit | "a"..."f" | "A"..."F"
fragment HEX_DIGIT
 : [0-9a-fA-F]
 ;

/// bindigit       ::=  "0" | "1"
fragment BIN_DIGIT
 : [01]
 ;

/// pointfloat    ::=  [intpart] fraction | intpart "."
fragment POINT_FLOAT
 : INT_PART? FRACTION
 | INT_PART '.'
 ;

/// exponentfloat ::=  (intpart | pointfloat) exponent
fragment EXPONENT_FLOAT
 : ( INT_PART | POINT_FLOAT ) EXPONENT
 ;

/// intpart       ::=  digit+
fragment INT_PART
 : DIGIT+
 ;

/// fraction      ::=  "." digit+
fragment FRACTION
 : '.' DIGIT+
 ;

/// exponent      ::=  ("e" | "E") ["+" | "-"] digit+
fragment EXPONENT
 : [eE] [+-]? DIGIT+
 ;

/// shortbytes     ::=  "'" shortbytesitem* "'" | '"' shortbytesitem* '"'
/// shortbytesitem ::=  shortbyteschar | bytesescapeseq
fragment SHORT_BYTES
 : '\'' ( SHORT_BYTES_CHAR_NO_SINGLE_QUOTE | BYTES_ESCAPE_SEQ )* '\''
 | '"' ( SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE | BYTES_ESCAPE_SEQ )* '"'
 ;

/// longbytes      ::=  "'''" longbytesitem* "'''" | '"""' longbytesitem* '"""'
fragment LONG_BYTES
 : '\'\'\'' LONG_BYTES_ITEM*? '\'\'\''
 | '"""' LONG_BYTES_ITEM*? '"""'
 ;

/// longbytesitem  ::=  longbyteschar | bytesescapeseq
fragment LONG_BYTES_ITEM
 : LONG_BYTES_CHAR
 | BYTES_ESCAPE_SEQ
 ;

/// shortbyteschar ::=  <any ASCII character except "\" or newline or the quote>
fragment SHORT_BYTES_CHAR_NO_SINGLE_QUOTE
 : [\u0000-\u0009]
 | [\u000B-\u000C]
 | [\u000E-\u0026]
 | [\u0028-\u005B]
 | [\u005D-\u007F]
 ;

fragment SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE
 : [\u0000-\u0009]
 | [\u000B-\u000C]
 | [\u000E-\u0021]
 | [\u0023-\u005B]
 | [\u005D-\u007F]
 ;

/// longbyteschar  ::=  <any ASCII character except "\">
fragment LONG_BYTES_CHAR
 : [\u0000-\u005B]
 | [\u005D-\u007F]
 ;

/// bytesescapeseq ::=  "\" <any ASCII character>
fragment BYTES_ESCAPE_SEQ
 : '\\' [\u0000-\u007F]
 ;

fragment UNICODE_OIDS
 : '\u1885'..'\u1886'
 | '\u2118'
 | '\u212e'
 | '\u309b'..'\u309c'
 ;

fragment UNICODE_OIDC
 : '\u00b7'
 | '\u0387'
 | '\u1369'..'\u1371'
 | '\u19da'
 ;

/// id_start     ::=  <all characters in general categories Lu, Ll, Lt, Lm, Lo, Nl, the underscore, and characters with the Other_ID_Start property>
fragment ID_START
 : '_'
 | [\p{L}]
 | [\p{Nl}]
 | UNICODE_OIDS
 ;

/// id_continue  ::=  <all characters in id_start, plus characters in the categories Mn, Mc, Nd, Pc and others with the Other_ID_Continue property>
fragment ID_CONTINUE
 : ID_START
 | [\p{Mn}]
 | [\p{Mc}]
 | [\p{Nd}]
 | [\p{Pc}]
 | UNICODE_OIDC
 ;

fragment SPACES
 : [ \t]+
 ;

fragment COMMENT
 : '#' ~[\r\n\f]*
 ;

fragment LINE_JOINING
 : ('\r'? '\n' ' '*)
 ;
