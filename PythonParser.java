// Generated from Python.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, DEF=24, RETURN=25, 
		RAISE=26, FROM=27, IMPORT=28, AS=29, GLOBAL=30, NONLOCAL=31, ASSERT=32, 
		IF=33, ELIF=34, ELSE=35, WHILE=36, FOR=37, IN=38, TRY=39, FINALLY=40, 
		WITH=41, EXCEPT=42, LAMBDA=43, OR=44, AND=45, NOT=46, IS=47, NONE=48, 
		TK_TRUE=49, TK_FALSE=50, CLASS=51, YIELD=52, DEL=53, PASS=54, CONTINUE=55, 
		BREAK=56, ASYNC=57, AWAIT=58, TK_COMPLEX=59, TK_LIST=60, TK_DICT=61, TK_SET=62, 
		TK_E=63, TK_TYPE=64, TK_PRINT=65, TK_PRINTLN=66, MUL=67, DIV=68, AT=69, 
		IDIV=70, ADD=71, SUB=72, MOD=73, POW=74, SIGN=75, OR_OP=76, XOR=77, AND_OP=78, 
		LEFT_SHIFT=79, RIGHT_SHIFT=80, NOT_OP=81, LESS_THAN=82, GREATER_THAN=83, 
		EQUALS=84, GT_EQ=85, LT_EQ=86, NOT_EQ=87, ASSIGN=88, ADD_ASSIGN=89, SUB_ASSIGN=90, 
		MULT_ASSIGN=91, DIV_ASSIGN=92, MOD_ASSIGN=93, AND_ASSIGN=94, OR_ASSIGN=95, 
		XOR_ASSIGN=96, LEFT_SHIFT_ASSIGN=97, RIGHT_SHIFT_ASSIGN=98, POWER_ASSIGN=99, 
		IDIV_ASSIGN=100, ARROW=101, SQRT=102, SIN=103, COS=104, MATH=105, CAST_INT=106, 
		CAST_FLOAT=107, CAST_COMPLEX=108, CAST_STRING=109, SKIP_=110, NEWLINE=111, 
		NAME=112, STRING=113, NUMBER=114, INTEGER=115, STRING_LITERAL=116, BYTES_LITERAL=117, 
		DECIMAL_INTEGER=118, OCT_INTEGER=119, HEX_INTEGER=120, BIN_INTEGER=121, 
		FLOAT_NUMBER=122, IMAG_NUMBER=123, INDENT=124, DEDENT=125;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_simple_stmt = 2, RULE_small_stmt = 3, 
		RULE_print_stmt = 4, RULE_expr_stmt = 5, RULE_expr_aritm = 6, RULE_expr_log = 7, 
		RULE_atom = 8, RULE_cte_log = 9, RULE_expr_assign = 10, RULE_del_stmt = 11, 
		RULE_pass_stmt = 12, RULE_flow_stmt = 13, RULE_break_stmt = 14, RULE_continue_stmt = 15, 
		RULE_return_stmt = 16, RULE_expr_list = 17, RULE_import_stmt = 18, RULE_import_name = 19, 
		RULE_import_from = 20, RULE_import_as_name = 21, RULE_dotted_as_name = 22, 
		RULE_import_as_names = 23, RULE_dotted_as_names = 24, RULE_dotted_name = 25, 
		RULE_global_stmt = 26, RULE_nonlocal_stmt = 27, RULE_compound_stmt = 28, 
		RULE_if_stmt = 29, RULE_test = 30, RULE_suite = 31, RULE_while_stmt = 32, 
		RULE_for_stmt = 33, RULE_testlist = 34, RULE_try_stmt = 35, RULE_except_clause = 36, 
		RULE_funcdef = 37, RULE_def_param_list = 38, RULE_classdef = 39, RULE_arglist = 40, 
		RULE_argument = 41, RULE_funcCall = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "simple_stmt", "small_stmt", "print_stmt", "expr_stmt", 
			"expr_aritm", "expr_log", "atom", "cte_log", "expr_assign", "del_stmt", 
			"pass_stmt", "flow_stmt", "break_stmt", "continue_stmt", "return_stmt", 
			"expr_list", "import_stmt", "import_name", "import_from", "import_as_name", 
			"dotted_as_name", "import_as_names", "dotted_as_names", "dotted_name", 
			"global_stmt", "nonlocal_stmt", "compound_stmt", "if_stmt", "test", "suite", 
			"while_stmt", "for_stmt", "testlist", "try_stmt", "except_clause", "funcdef", 
			"def_param_list", "classdef", "arglist", "argument", "funcCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'.'", "'ceil'", "'fabs'", "'factorial'", 
			"'floor'", "'gcd'", "'log'", "'tan'", "'not in'", "'is not'", "'['", 
			"']'", "','", "'{'", "'}'", "'''", "'\"'", "':'", "'@='", "'...'", "'def'", 
			"'return'", "'raise'", "'from'", "'import'", "'as'", "'global'", "'nonlocal'", 
			"'assert'", "'if'", "'elif'", "'else'", "'while'", "'for'", "'in'", "'try'", 
			"'finally'", "'with'", "'except'", "'lambda'", "'or'", "'and'", "'not'", 
			"'is'", "'None'", "'True'", "'False'", "'class'", "'yield'", "'del'", 
			"'pass'", "'continue'", "'break'", "'async'", "'await'", "'complex'", 
			"'list'", "'dict'", "'set'", null, null, "'print'", "'println'", "'*'", 
			"'/'", "'@'", "'//'", "'+'", "'-'", "'%'", "'**'", null, "'|'", "'^'", 
			"'&'", "'<<'", "'>>'", "'~'", "'<'", "'>'", "'=='", "'>='", "'<='", "'!='", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", 
			"'<<='", "'>>='", "'**='", "'//='", "'->'", "'sqrt'", "'sin'", "'cos'", 
			"'math'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"DEF", "RETURN", "RAISE", "FROM", "IMPORT", "AS", "GLOBAL", "NONLOCAL", 
			"ASSERT", "IF", "ELIF", "ELSE", "WHILE", "FOR", "IN", "TRY", "FINALLY", 
			"WITH", "EXCEPT", "LAMBDA", "OR", "AND", "NOT", "IS", "NONE", "TK_TRUE", 
			"TK_FALSE", "CLASS", "YIELD", "DEL", "PASS", "CONTINUE", "BREAK", "ASYNC", 
			"AWAIT", "TK_COMPLEX", "TK_LIST", "TK_DICT", "TK_SET", "TK_E", "TK_TYPE", 
			"TK_PRINT", "TK_PRINTLN", "MUL", "DIV", "AT", "IDIV", "ADD", "SUB", "MOD", 
			"POW", "SIGN", "OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", 
			"NOT_OP", "LESS_THAN", "GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ", 
			"ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", 
			"POWER_ASSIGN", "IDIV_ASSIGN", "ARROW", "SQRT", "SIN", "COS", "MATH", 
			"CAST_INT", "CAST_FLOAT", "CAST_COMPLEX", "CAST_STRING", "SKIP_", "NEWLINE", 
			"NAME", "STRING", "NUMBER", "INTEGER", "STRING_LITERAL", "BYTES_LITERAL", 
			"DECIMAL_INTEGER", "OCT_INTEGER", "HEX_INTEGER", "BIN_INTEGER", "FLOAT_NUMBER", 
			"IMAG_NUMBER", "INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Python.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					stmt();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				simple_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				compound_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_stmtContext extends ParserRuleContext {
		public List<Small_stmtContext> small_stmt() {
			return getRuleContexts(Small_stmtContext.class);
		}
		public Small_stmtContext small_stmt(int i) {
			return getRuleContext(Small_stmtContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			small_stmt();
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					match(T__0);
					setState(98);
					small_stmt();
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(104);
				match(T__0);
				}
			}

			setState(107);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Small_stmtContext extends ParserRuleContext {
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Del_stmtContext del_stmt() {
			return getRuleContext(Del_stmtContext.class,0);
		}
		public Pass_stmtContext pass_stmt() {
			return getRuleContext(Pass_stmtContext.class,0);
		}
		public Flow_stmtContext flow_stmt() {
			return getRuleContext(Flow_stmtContext.class,0);
		}
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public Nonlocal_stmtContext nonlocal_stmt() {
			return getRuleContext(Nonlocal_stmtContext.class,0);
		}
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitSmall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_small_stmt);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				print_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				expr_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				del_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				pass_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				flow_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				import_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				global_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(116);
				nonlocal_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_stmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public TerminalNode TK_PRINT() { return getToken(PythonParser.TK_PRINT, 0); }
		public TerminalNode TK_PRINTLN() { return getToken(PythonParser.TK_PRINTLN, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==TK_PRINT || _la==TK_PRINTLN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
			match(T__1);
			setState(121);
			expr_stmt();
			setState(122);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public Expr_aritmContext expr_aritm() {
			return getRuleContext(Expr_aritmContext.class,0);
		}
		public Expr_logContext expr_log() {
			return getRuleContext(Expr_logContext.class,0);
		}
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr_stmt);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				expr_aritm(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				expr_log(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				expr_assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_aritmContext extends ParserRuleContext {
		public Expr_aritmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_aritm; }
	 
		public Expr_aritmContext() { }
		public void copyFrom(Expr_aritmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpANDBitsContext extends Expr_aritmContext {
		public List<Expr_aritmContext> expr_aritm() {
			return getRuleContexts(Expr_aritmContext.class);
		}
		public Expr_aritmContext expr_aritm(int i) {
			return getRuleContext(Expr_aritmContext.class,i);
		}
		public TerminalNode AND_OP() { return getToken(PythonParser.AND_OP, 0); }
		public ExpANDBitsContext(Expr_aritmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpANDBits(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpFuncionMatematicaContext extends Expr_aritmContext {
		public Token opFuncMat;
		public TerminalNode MATH() { return getToken(PythonParser.MATH, 0); }
		public Expr_aritmContext expr_aritm() {
			return getRuleContext(Expr_aritmContext.class,0);
		}
		public TerminalNode SQRT() { return getToken(PythonParser.SQRT, 0); }
		public TerminalNode COS() { return getToken(PythonParser.COS, 0); }
		public TerminalNode SIN() { return getToken(PythonParser.SIN, 0); }
		public ExpFuncionMatematicaContext(Expr_aritmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpFuncionMatematica(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpBracesContext extends Expr_aritmContext {
		public Expr_aritmContext expr_aritm() {
			return getRuleContext(Expr_aritmContext.class,0);
		}
		public ExpBracesContext(Expr_aritmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpBitwiseContext extends Expr_aritmContext {
		public List<Expr_aritmContext> expr_aritm() {
			return getRuleContexts(Expr_aritmContext.class);
		}
		public Expr_aritmContext expr_aritm(int i) {
			return getRuleContext(Expr_aritmContext.class,i);
		}
		public TerminalNode XOR() { return getToken(PythonParser.XOR, 0); }
		public ExpBitwiseContext(Expr_aritmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpBitwise(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpAtomContext extends Expr_aritmContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExpAtomContext(Expr_aritmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpMulDivANDOthersContext extends Expr_aritmContext {
		public Token op1;
		public List<Expr_aritmContext> expr_aritm() {
			return getRuleContexts(Expr_aritmContext.class);
		}
		public Expr_aritmContext expr_aritm(int i) {
			return getRuleContext(Expr_aritmContext.class,i);
		}
		public TerminalNode MUL() { return getToken(PythonParser.MUL, 0); }
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public TerminalNode DIV() { return getToken(PythonParser.DIV, 0); }
		public TerminalNode IDIV() { return getToken(PythonParser.IDIV, 0); }
		public TerminalNode MOD() { return getToken(PythonParser.MOD, 0); }
		public ExpMulDivANDOthersContext(Expr_aritmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpMulDivANDOthers(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpPotContext extends Expr_aritmContext {
		public List<Expr_aritmContext> expr_aritm() {
			return getRuleContexts(Expr_aritmContext.class);
		}
		public Expr_aritmContext expr_aritm(int i) {
			return getRuleContext(Expr_aritmContext.class,i);
		}
		public TerminalNode POW() { return getToken(PythonParser.POW, 0); }
		public ExpPotContext(Expr_aritmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpPot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpCallContext extends Expr_aritmContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ExpCallContext(Expr_aritmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpShiftContext extends Expr_aritmContext {
		public Token op3;
		public List<Expr_aritmContext> expr_aritm() {
			return getRuleContexts(Expr_aritmContext.class);
		}
		public Expr_aritmContext expr_aritm(int i) {
			return getRuleContext(Expr_aritmContext.class,i);
		}
		public TerminalNode LEFT_SHIFT() { return getToken(PythonParser.LEFT_SHIFT, 0); }
		public TerminalNode RIGHT_SHIFT() { return getToken(PythonParser.RIGHT_SHIFT, 0); }
		public ExpShiftContext(Expr_aritmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpShift(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpOrBitsContext extends Expr_aritmContext {
		public List<Expr_aritmContext> expr_aritm() {
			return getRuleContexts(Expr_aritmContext.class);
		}
		public Expr_aritmContext expr_aritm(int i) {
			return getRuleContext(Expr_aritmContext.class,i);
		}
		public TerminalNode OR_OP() { return getToken(PythonParser.OR_OP, 0); }
		public ExpOrBitsContext(Expr_aritmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpOrBits(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpUnarioContext extends Expr_aritmContext {
		public Token opUnario;
		public Expr_aritmContext expr_aritm() {
			return getRuleContext(Expr_aritmContext.class,0);
		}
		public TerminalNode ADD() { return getToken(PythonParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PythonParser.SUB, 0); }
		public TerminalNode NOT_OP() { return getToken(PythonParser.NOT_OP, 0); }
		public ExpUnarioContext(Expr_aritmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpUnario(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpAddSubContext extends Expr_aritmContext {
		public Token op2;
		public List<Expr_aritmContext> expr_aritm() {
			return getRuleContexts(Expr_aritmContext.class);
		}
		public Expr_aritmContext expr_aritm(int i) {
			return getRuleContext(Expr_aritmContext.class,i);
		}
		public TerminalNode ADD() { return getToken(PythonParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PythonParser.SUB, 0); }
		public ExpAddSubContext(Expr_aritmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_aritmContext expr_aritm() throws RecognitionException {
		return expr_aritm(0);
	}

	private Expr_aritmContext expr_aritm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_aritmContext _localctx = new Expr_aritmContext(_ctx, _parentState);
		Expr_aritmContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr_aritm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ExpFuncionMatematicaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(130);
				match(MATH);
				setState(131);
				match(T__3);
				setState(132);
				((ExpFuncionMatematicaContext)_localctx).opFuncMat = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (SQRT - 102)) | (1L << (SIN - 102)) | (1L << (COS - 102)))) != 0)) ) {
					((ExpFuncionMatematicaContext)_localctx).opFuncMat = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				match(T__1);
				setState(134);
				expr_aritm(0);
				setState(135);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new ExpCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				funcCall();
				}
				break;
			case 3:
				{
				_localctx = new ExpUnarioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				((ExpUnarioContext)_localctx).opUnario = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (ADD - 71)) | (1L << (SUB - 71)) | (1L << (NOT_OP - 71)))) != 0)) ) {
					((ExpUnarioContext)_localctx).opUnario = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(139);
				expr_aritm(9);
				}
				break;
			case 4:
				{
				_localctx = new ExpAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				atom();
				}
				break;
			case 5:
				{
				_localctx = new ExpBracesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(T__1);
				setState(142);
				expr_aritm(0);
				setState(143);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpPotContext(new Expr_aritmContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_aritm);
						setState(147);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(148);
						match(POW);
						setState(149);
						expr_aritm(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpMulDivANDOthersContext(new Expr_aritmContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_aritm);
						setState(150);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(151);
						((ExpMulDivANDOthersContext)_localctx).op1 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (MUL - 67)) | (1L << (DIV - 67)) | (1L << (AT - 67)) | (1L << (IDIV - 67)) | (1L << (MOD - 67)))) != 0)) ) {
							((ExpMulDivANDOthersContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						expr_aritm(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpAddSubContext(new Expr_aritmContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_aritm);
						setState(153);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(154);
						((ExpAddSubContext)_localctx).op2 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpAddSubContext)_localctx).op2 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(155);
						expr_aritm(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpShiftContext(new Expr_aritmContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_aritm);
						setState(156);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(157);
						((ExpShiftContext)_localctx).op3 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
							((ExpShiftContext)_localctx).op3 = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(158);
						expr_aritm(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpANDBitsContext(new Expr_aritmContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_aritm);
						setState(159);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(160);
						match(AND_OP);
						setState(161);
						expr_aritm(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpBitwiseContext(new Expr_aritmContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_aritm);
						setState(162);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(163);
						match(XOR);
						setState(164);
						expr_aritm(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpOrBitsContext(new Expr_aritmContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_aritm);
						setState(165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(166);
						match(OR_OP);
						setState(167);
						expr_aritm(4);
						}
						break;
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_logContext extends ParserRuleContext {
		public Expr_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_log; }
	 
		public Expr_logContext() { }
		public void copyFrom(Expr_logContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpRelContext extends Expr_logContext {
		public Token opL1;
		public List<Expr_aritmContext> expr_aritm() {
			return getRuleContexts(Expr_aritmContext.class);
		}
		public Expr_aritmContext expr_aritm(int i) {
			return getRuleContext(Expr_aritmContext.class,i);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public TerminalNode LESS_THAN() { return getToken(PythonParser.LESS_THAN, 0); }
		public TerminalNode LT_EQ() { return getToken(PythonParser.LT_EQ, 0); }
		public TerminalNode GREATER_THAN() { return getToken(PythonParser.GREATER_THAN, 0); }
		public TerminalNode GT_EQ() { return getToken(PythonParser.GT_EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(PythonParser.NOT_EQ, 0); }
		public TerminalNode EQUALS() { return getToken(PythonParser.EQUALS, 0); }
		public ExpRelContext(Expr_logContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpRel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpNameLogContext extends Expr_logContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ExpNameLogContext(Expr_logContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpNameLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpCteLogContext extends Expr_logContext {
		public Cte_logContext cte_log() {
			return getRuleContext(Cte_logContext.class,0);
		}
		public ExpCteLogContext(Expr_logContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpCteLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpORContext extends Expr_logContext {
		public List<Expr_logContext> expr_log() {
			return getRuleContexts(Expr_logContext.class);
		}
		public Expr_logContext expr_log(int i) {
			return getRuleContext(Expr_logContext.class,i);
		}
		public TerminalNode OR() { return getToken(PythonParser.OR, 0); }
		public ExpORContext(Expr_logContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpANDContext extends Expr_logContext {
		public List<Expr_logContext> expr_log() {
			return getRuleContexts(Expr_logContext.class);
		}
		public Expr_logContext expr_log(int i) {
			return getRuleContext(Expr_logContext.class,i);
		}
		public TerminalNode AND() { return getToken(PythonParser.AND, 0); }
		public ExpANDContext(Expr_logContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpLogBrContext extends Expr_logContext {
		public Expr_logContext expr_log() {
			return getRuleContext(Expr_logContext.class,0);
		}
		public ExpLogBrContext(Expr_logContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpLogBr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpNotContext extends Expr_logContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public Expr_logContext expr_log() {
			return getRuleContext(Expr_logContext.class,0);
		}
		public ExpNotContext(Expr_logContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_logContext expr_log() throws RecognitionException {
		return expr_log(0);
	}

	private Expr_logContext expr_log(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_logContext _localctx = new Expr_logContext(_ctx, _parentState);
		Expr_logContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr_log, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new ExpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(174);
				expr_aritm(0);
				setState(175);
				((ExpRelContext)_localctx).opL1 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << IN) | (1L << IS))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (LESS_THAN - 82)) | (1L << (GREATER_THAN - 82)) | (1L << (EQUALS - 82)) | (1L << (GT_EQ - 82)) | (1L << (LT_EQ - 82)) | (1L << (NOT_EQ - 82)))) != 0)) ) {
					((ExpRelContext)_localctx).opL1 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				expr_aritm(0);
				}
				break;
			case 2:
				{
				_localctx = new ExpNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(NOT);
				setState(179);
				expr_log(6);
				}
				break;
			case 3:
				{
				_localctx = new ExpNameLogContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(NAME);
				}
				break;
			case 4:
				{
				_localctx = new ExpCteLogContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				cte_log();
				}
				break;
			case 5:
				{
				_localctx = new ExpLogBrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(T__1);
				setState(183);
				expr_log(0);
				setState(184);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpANDContext(new Expr_logContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_log);
						setState(188);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(189);
						match(AND);
						setState(190);
						expr_log(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpORContext(new Expr_logContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_log);
						setState(191);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(192);
						match(OR);
						setState(193);
						expr_log(5);
						}
						break;
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomNameContext extends AtomContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public AtomNameContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitAtomName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomNumberContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public AtomNumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitAtomNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom3Context extends AtomContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public Atom3Context(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitAtom3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom4Context extends AtomContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public Atom4Context(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitAtom4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomCteLogContext extends AtomContext {
		public Cte_logContext cte_log() {
			return getRuleContext(Cte_logContext.class,0);
		}
		public AtomCteLogContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitAtomCteLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom1Context extends AtomContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public Atom1Context(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitAtom1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomEmptyStringContext extends AtomContext {
		public AtomEmptyStringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitAtomEmptyString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomArrayContext extends AtomContext {
		public List<Expr_stmtContext> expr_stmt() {
			return getRuleContexts(Expr_stmtContext.class);
		}
		public Expr_stmtContext expr_stmt(int i) {
			return getRuleContext(Expr_stmtContext.class,i);
		}
		public AtomArrayContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitAtomArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomStringContext extends AtomContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public AtomStringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitAtomString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atom);
		int _la;
		try {
			int _alt;
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new Atom1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(NAME);
				setState(200);
				match(T__13);
				setState(201);
				match(NAME);
				setState(202);
				match(T__14);
				}
				break;
			case 2:
				_localctx = new AtomArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__13);
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(209);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(204);
							expr_stmt();
							setState(205);
							match(T__15);
							}
							} 
						}
						setState(211);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(212);
					expr_stmt();
					}
					break;
				}
				setState(215);
				match(T__14);
				}
				break;
			case 3:
				_localctx = new Atom3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(T__16);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(217);
							match(NAME);
							setState(218);
							match(T__15);
							}
							} 
						}
						setState(223);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					setState(224);
					match(NAME);
					}
				}

				setState(227);
				match(T__17);
				}
				break;
			case 4:
				_localctx = new Atom4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(T__16);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18 || _la==T__19) {
					{
					setState(242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(235);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case T__18:
								{
								setState(229);
								match(T__18);
								setState(230);
								match(NAME);
								setState(231);
								match(T__18);
								}
								break;
							case T__19:
								{
								setState(232);
								match(T__19);
								setState(233);
								match(NAME);
								setState(234);
								match(T__19);
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(237);
							match(T__20);
							setState(238);
							match(NAME);
							setState(239);
							match(T__15);
							}
							} 
						}
						setState(244);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					}
					setState(251);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__18:
						{
						setState(245);
						match(T__18);
						setState(246);
						match(NAME);
						setState(247);
						match(T__18);
						}
						break;
					case T__19:
						{
						setState(248);
						match(T__19);
						setState(249);
						match(NAME);
						setState(250);
						match(T__19);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(253);
					match(T__20);
					setState(254);
					match(NAME);
					}
				}

				setState(257);
				match(T__17);
				}
				break;
			case 5:
				_localctx = new AtomNameContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				match(NAME);
				}
				break;
			case 6:
				_localctx = new AtomNumberContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				match(NUMBER);
				}
				break;
			case 7:
				_localctx = new AtomStringContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				match(STRING);
				}
				break;
			case 8:
				_localctx = new AtomCteLogContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
				cte_log();
				}
				break;
			case 9:
				_localctx = new AtomEmptyStringContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_logContext extends ParserRuleContext {
		public TerminalNode TK_TRUE() { return getToken(PythonParser.TK_TRUE, 0); }
		public TerminalNode TK_FALSE() { return getToken(PythonParser.TK_FALSE, 0); }
		public Cte_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_log; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitCte_log(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_logContext cte_log() throws RecognitionException {
		Cte_logContext _localctx = new Cte_logContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cte_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==TK_TRUE || _la==TK_FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_assignContext extends ParserRuleContext {
		public Token opAssign;
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public TerminalNode ADD_ASSIGN() { return getToken(PythonParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(PythonParser.SUB_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(PythonParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(PythonParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(PythonParser.MOD_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(PythonParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(PythonParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(PythonParser.XOR_ASSIGN, 0); }
		public TerminalNode LEFT_SHIFT_ASSIGN() { return getToken(PythonParser.LEFT_SHIFT_ASSIGN, 0); }
		public TerminalNode RIGHT_SHIFT_ASSIGN() { return getToken(PythonParser.RIGHT_SHIFT_ASSIGN, 0); }
		public TerminalNode POWER_ASSIGN() { return getToken(PythonParser.POWER_ASSIGN, 0); }
		public TerminalNode IDIV_ASSIGN() { return getToken(PythonParser.IDIV_ASSIGN, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public Expr_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpr_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(NAME);
			setState(268);
			((Expr_assignContext)_localctx).opAssign = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__21 || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (ASSIGN - 88)) | (1L << (ADD_ASSIGN - 88)) | (1L << (SUB_ASSIGN - 88)) | (1L << (MULT_ASSIGN - 88)) | (1L << (DIV_ASSIGN - 88)) | (1L << (MOD_ASSIGN - 88)) | (1L << (AND_ASSIGN - 88)) | (1L << (OR_ASSIGN - 88)) | (1L << (XOR_ASSIGN - 88)) | (1L << (LEFT_SHIFT_ASSIGN - 88)) | (1L << (RIGHT_SHIFT_ASSIGN - 88)) | (1L << (POWER_ASSIGN - 88)) | (1L << (IDIV_ASSIGN - 88)))) != 0)) ) {
				((Expr_assignContext)_localctx).opAssign = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(269);
			expr_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Del_stmtContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(PythonParser.DEL, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Del_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitDel_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Del_stmtContext del_stmt() throws RecognitionException {
		Del_stmtContext _localctx = new Del_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_del_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(DEL);
			setState(272);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pass_stmtContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(PythonParser.PASS, 0); }
		public Pass_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitPass_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pass_stmtContext pass_stmt() throws RecognitionException {
		Pass_stmtContext _localctx = new Pass_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pass_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(PASS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flow_stmtContext extends ParserRuleContext {
		public Flow_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_stmt; }
	 
		public Flow_stmtContext() { }
		public void copyFrom(Flow_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContinueStmtContext extends Flow_stmtContext {
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public ContinueStmtContext(Flow_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStmtContext extends Flow_stmtContext {
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public BreakStmtContext(Flow_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmtContext extends Flow_stmtContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public ReturnStmtContext(Flow_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_flow_stmt);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				break_stmt();
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				continue_stmt();
				}
				break;
			case RETURN:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				return_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(PythonParser.BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(PythonParser.CONTINUE, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(CONTINUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(RETURN);
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(286);
				expr_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public List<Expr_stmtContext> expr_stmt() {
			return getRuleContexts(Expr_stmtContext.class);
		}
		public Expr_stmtContext expr_stmt(int i) {
			return getRuleContext(Expr_stmtContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			expr_stmt();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(290);
				match(T__15);
				setState(291);
				expr_stmt();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(297);
				match(T__0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_stmtContext extends ParserRuleContext {
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitImport_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_import_stmt);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				import_name();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				import_from();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_nameContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public Dotted_as_namesContext dotted_as_names() {
			return getRuleContext(Dotted_as_namesContext.class,0);
		}
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitImport_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_import_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(IMPORT);
			setState(305);
			dotted_as_names();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_fromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode MUL() { return getToken(PythonParser.MUL, 0); }
		public Import_as_namesContext import_as_names() {
			return getRuleContext(Import_as_namesContext.class,0);
		}
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitImport_from(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_import_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(307);
			match(FROM);
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3 || _la==T__22) {
					{
					{
					setState(308);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==T__22) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				dotted_name();
				}
				break;
			case 2:
				{
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(315);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==T__22) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(318); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 || _la==T__22 );
				}
				break;
			}
			setState(322);
			match(IMPORT);
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(323);
				match(MUL);
				}
				break;
			case T__1:
				{
				setState(324);
				match(T__1);
				setState(325);
				import_as_names();
				setState(326);
				match(T__2);
				}
				break;
			case NAME:
				{
				setState(328);
				import_as_names();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_as_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public Import_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitImport_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_as_nameContext import_as_name() throws RecognitionException {
		Import_as_nameContext _localctx = new Import_as_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_import_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(NAME);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(332);
				match(AS);
				setState(333);
				match(NAME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dotted_as_nameContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Dotted_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitDotted_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_as_nameContext dotted_as_name() throws RecognitionException {
		Dotted_as_nameContext _localctx = new Dotted_as_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dotted_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			dotted_name();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(337);
				match(AS);
				setState(338);
				match(NAME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_as_namesContext extends ParserRuleContext {
		public List<Import_as_nameContext> import_as_name() {
			return getRuleContexts(Import_as_nameContext.class);
		}
		public Import_as_nameContext import_as_name(int i) {
			return getRuleContext(Import_as_nameContext.class,i);
		}
		public Import_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_names; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitImport_as_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_as_namesContext import_as_names() throws RecognitionException {
		Import_as_namesContext _localctx = new Import_as_namesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_import_as_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			import_as_name();
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(342);
					match(T__15);
					setState(343);
					import_as_name();
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(349);
				match(T__15);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dotted_as_namesContext extends ParserRuleContext {
		public List<Dotted_as_nameContext> dotted_as_name() {
			return getRuleContexts(Dotted_as_nameContext.class);
		}
		public Dotted_as_nameContext dotted_as_name(int i) {
			return getRuleContext(Dotted_as_nameContext.class,i);
		}
		public Dotted_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_names; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitDotted_as_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_as_namesContext dotted_as_names() throws RecognitionException {
		Dotted_as_namesContext _localctx = new Dotted_as_namesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dotted_as_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			dotted_as_name();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(353);
				match(T__15);
				setState(354);
				dotted_as_name();
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dotted_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitDotted_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dotted_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(NAME);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(361);
				match(T__3);
				setState(362);
				match(NAME);
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_stmtContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(PythonParser.GLOBAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public Global_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitGlobal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_stmtContext global_stmt() throws RecognitionException {
		Global_stmtContext _localctx = new Global_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_global_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(GLOBAL);
			setState(369);
			match(NAME);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(370);
				match(T__15);
				setState(371);
				match(NAME);
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nonlocal_stmtContext extends ParserRuleContext {
		public TerminalNode NONLOCAL() { return getToken(PythonParser.NONLOCAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public Nonlocal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocal_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitNonlocal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonlocal_stmtContext nonlocal_stmt() throws RecognitionException {
		Nonlocal_stmtContext _localctx = new Nonlocal_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nonlocal_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(NONLOCAL);
			setState(378);
			match(NAME);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(379);
				match(T__15);
				setState(380);
				match(NAME);
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Try_stmtContext try_stmt() {
			return getRuleContext(Try_stmtContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_compound_stmt);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				for_stmt();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				try_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				funcdef();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
				classdef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(PythonParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PythonParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(IF);
			setState(395);
			test();
			setState(396);
			match(T__20);
			setState(397);
			suite();
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(398);
					match(ELIF);
					setState(399);
					test();
					setState(400);
					match(T__20);
					setState(401);
					suite();
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(408);
				match(ELSE);
				setState(409);
				match(T__20);
				setState(410);
				suite();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestContext extends ParserRuleContext {
		public Expr_aritmContext expr_aritm() {
			return getRuleContext(Expr_aritmContext.class,0);
		}
		public Expr_logContext expr_log() {
			return getRuleContext(Expr_logContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_test);
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				expr_aritm(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				expr_log(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuiteContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_suite);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(INDENT);
			setState(419); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(418);
					stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(421); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(423);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(WHILE);
			setState(426);
			test();
			setState(427);
			match(T__20);
			setState(428);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(FOR);
			setState(431);
			expr_list();
			setState(432);
			match(IN);
			setState(433);
			testlist();
			setState(434);
			match(T__20);
			setState(435);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestlistContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TestlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitTestlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_testlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			test();
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(438);
					match(T__15);
					setState(439);
					test();
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(445);
				match(T__15);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_stmtContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(PythonParser.TRY, 0); }
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<Except_clauseContext> except_clause() {
			return getRuleContexts(Except_clauseContext.class);
		}
		public Except_clauseContext except_clause(int i) {
			return getRuleContext(Except_clauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public TerminalNode FINALLY() { return getToken(PythonParser.FINALLY, 0); }
		public Try_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitTry_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_stmtContext try_stmt() throws RecognitionException {
		Try_stmtContext _localctx = new Try_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_try_stmt);
		try {
			int _alt;
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(TRY);
				setState(449);
				match(T__20);
				setState(450);
				suite();
				setState(455); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(451);
						except_clause();
						setState(452);
						match(T__20);
						setState(453);
						suite();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(457); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(459);
					match(ELSE);
					setState(460);
					match(T__20);
					setState(461);
					suite();
					}
					break;
				}
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(464);
					match(FINALLY);
					setState(465);
					match(T__20);
					setState(466);
					suite();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(TRY);
				setState(470);
				match(T__20);
				setState(471);
				suite();
				setState(472);
				match(FINALLY);
				setState(473);
				match(T__20);
				setState(474);
				suite();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Except_clauseContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(PythonParser.EXCEPT, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Except_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitExcept_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Except_clauseContext except_clause() throws RecognitionException {
		Except_clauseContext _localctx = new Except_clauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_except_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(EXCEPT);
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(479);
				test();
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(480);
					match(AS);
					setState(481);
					match(NAME);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public Def_param_listContext def_param_list() {
			return getRuleContext(Def_param_listContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(PythonParser.ARROW, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(DEF);
			setState(487);
			match(NAME);
			setState(488);
			match(T__1);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_TYPE) {
				{
				setState(489);
				def_param_list();
				}
			}

			setState(492);
			match(T__2);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(493);
				match(ARROW);
				setState(494);
				test();
				}
			}

			setState(497);
			match(T__20);
			setState(498);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_param_listContext extends ParserRuleContext {
		public List<TerminalNode> TK_TYPE() { return getTokens(PythonParser.TK_TYPE); }
		public TerminalNode TK_TYPE(int i) {
			return getToken(PythonParser.TK_TYPE, i);
		}
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public Def_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_param_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitDef_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_param_listContext def_param_list() throws RecognitionException {
		Def_param_listContext _localctx = new Def_param_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_def_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(TK_TYPE);
			setState(501);
			match(NAME);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(502);
				match(T__15);
				setState(503);
				match(TK_TYPE);
				setState(504);
				match(NAME);
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassdefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitClassdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(CLASS);
			setState(511);
			match(NAME);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(512);
				match(T__1);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(513);
					arglist();
					}
				}

				setState(516);
				match(T__2);
				}
			}

			setState(519);
			match(T__20);
			setState(520);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArglistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			argument();
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(523);
					match(T__15);
					setState(524);
					argument();
					}
					} 
				}
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(530);
				match(T__15);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonVisitor ) return ((PythonVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(NAME);
			setState(536);
			match(T__1);
			setState(537);
			expr_list();
			setState(538);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_aritm_sempred((Expr_aritmContext)_localctx, predIndex);
		case 7:
			return expr_log_sempred((Expr_logContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_aritm_sempred(Expr_aritmContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_log_sempred(Expr_logContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\177\u021f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\3\3\3\5\3a\n\3\3\4\3\4\3\4\7\4f\n\4"+
		"\f\4\16\4i\13\4\3\4\5\4l\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5x\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7\u0082\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0094\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\b\u00ab\n\b\f\b\16\b\u00ae\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bd\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c5"+
		"\n\t\f\t\16\t\u00c8\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d2\n\n"+
		"\f\n\16\n\u00d5\13\n\3\n\5\n\u00d8\n\n\3\n\3\n\3\n\3\n\7\n\u00de\n\n\f"+
		"\n\16\n\u00e1\13\n\3\n\5\n\u00e4\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00ee\n\n\3\n\3\n\3\n\7\n\u00f3\n\n\f\n\16\n\u00f6\13\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00fe\n\n\3\n\3\n\5\n\u0102\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u010a\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\5\17\u011a\n\17\3\20\3\20\3\21\3\21\3\22\3\22\5\22\u0122\n"+
		"\22\3\23\3\23\3\23\7\23\u0127\n\23\f\23\16\23\u012a\13\23\3\23\5\23\u012d"+
		"\n\23\3\24\3\24\5\24\u0131\n\24\3\25\3\25\3\25\3\26\3\26\7\26\u0138\n"+
		"\26\f\26\16\26\u013b\13\26\3\26\3\26\6\26\u013f\n\26\r\26\16\26\u0140"+
		"\5\26\u0143\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u014c\n\26\3"+
		"\27\3\27\3\27\5\27\u0151\n\27\3\30\3\30\3\30\5\30\u0156\n\30\3\31\3\31"+
		"\3\31\7\31\u015b\n\31\f\31\16\31\u015e\13\31\3\31\5\31\u0161\n\31\3\32"+
		"\3\32\3\32\7\32\u0166\n\32\f\32\16\32\u0169\13\32\3\33\3\33\3\33\7\33"+
		"\u016e\n\33\f\33\16\33\u0171\13\33\3\34\3\34\3\34\3\34\7\34\u0177\n\34"+
		"\f\34\16\34\u017a\13\34\3\35\3\35\3\35\3\35\7\35\u0180\n\35\f\35\16\35"+
		"\u0183\13\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u018b\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0196\n\37\f\37\16\37\u0199\13"+
		"\37\3\37\3\37\3\37\5\37\u019e\n\37\3 \3 \5 \u01a2\n \3!\3!\6!\u01a6\n"+
		"!\r!\16!\u01a7\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\7$\u01bb\n$\f$\16$\u01be\13$\3$\5$\u01c1\n$\3%\3%\3%\3%\3%\3%\3%\6%"+
		"\u01ca\n%\r%\16%\u01cb\3%\3%\3%\5%\u01d1\n%\3%\3%\3%\5%\u01d6\n%\3%\3"+
		"%\3%\3%\3%\3%\3%\5%\u01df\n%\3&\3&\3&\3&\5&\u01e5\n&\5&\u01e7\n&\3\'\3"+
		"\'\3\'\3\'\5\'\u01ed\n\'\3\'\3\'\3\'\5\'\u01f2\n\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\7(\u01fc\n(\f(\16(\u01ff\13(\3)\3)\3)\3)\5)\u0205\n)\3)\5)\u0208"+
		"\n)\3)\3)\3)\3*\3*\3*\7*\u0210\n*\f*\16*\u0213\13*\3*\5*\u0216\n*\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\2\4\16\20-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\f\3\2CD\4\2\7\rhj\4\2IJSS\4\2"+
		"EHKK\3\2IJ\3\2QR\6\2\16\17((\61\61TY\3\2\63\64\4\2\30\30Zf\4\2\6\6\31"+
		"\31\2\u024c\2[\3\2\2\2\4`\3\2\2\2\6b\3\2\2\2\bw\3\2\2\2\ny\3\2\2\2\f\u0081"+
		"\3\2\2\2\16\u0093\3\2\2\2\20\u00bc\3\2\2\2\22\u0109\3\2\2\2\24\u010b\3"+
		"\2\2\2\26\u010d\3\2\2\2\30\u0111\3\2\2\2\32\u0114\3\2\2\2\34\u0119\3\2"+
		"\2\2\36\u011b\3\2\2\2 \u011d\3\2\2\2\"\u011f\3\2\2\2$\u0123\3\2\2\2&\u0130"+
		"\3\2\2\2(\u0132\3\2\2\2*\u0135\3\2\2\2,\u014d\3\2\2\2.\u0152\3\2\2\2\60"+
		"\u0157\3\2\2\2\62\u0162\3\2\2\2\64\u016a\3\2\2\2\66\u0172\3\2\2\28\u017b"+
		"\3\2\2\2:\u018a\3\2\2\2<\u018c\3\2\2\2>\u01a1\3\2\2\2@\u01a3\3\2\2\2B"+
		"\u01ab\3\2\2\2D\u01b0\3\2\2\2F\u01b7\3\2\2\2H\u01de\3\2\2\2J\u01e0\3\2"+
		"\2\2L\u01e8\3\2\2\2N\u01f6\3\2\2\2P\u0200\3\2\2\2R\u020c\3\2\2\2T\u0217"+
		"\3\2\2\2V\u0219\3\2\2\2XZ\5\4\3\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2"+
		"\2\2\\\3\3\2\2\2][\3\2\2\2^a\5\6\4\2_a\5:\36\2`^\3\2\2\2`_\3\2\2\2a\5"+
		"\3\2\2\2bg\5\b\5\2cd\7\3\2\2df\5\b\5\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2g"+
		"h\3\2\2\2hk\3\2\2\2ig\3\2\2\2jl\7\3\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2"+
		"mn\7q\2\2n\7\3\2\2\2ox\5\n\6\2px\5\f\7\2qx\5\30\r\2rx\5\32\16\2sx\5\34"+
		"\17\2tx\5&\24\2ux\5\66\34\2vx\58\35\2wo\3\2\2\2wp\3\2\2\2wq\3\2\2\2wr"+
		"\3\2\2\2ws\3\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\t\3\2\2\2yz\t\2\2\2"+
		"z{\7\4\2\2{|\5\f\7\2|}\7\5\2\2}\13\3\2\2\2~\u0082\5\16\b\2\177\u0082\5"+
		"\20\t\2\u0080\u0082\5\26\f\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\r\3\2\2\2\u0083\u0084\b\b\1\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7\6\2\2\u0086\u0087\t\3\2\2\u0087\u0088\7\4\2\2\u0088\u0089\5\16"+
		"\b\2\u0089\u008a\7\5\2\2\u008a\u0094\3\2\2\2\u008b\u0094\5V,\2\u008c\u008d"+
		"\t\4\2\2\u008d\u0094\5\16\b\13\u008e\u0094\5\22\n\2\u008f\u0090\7\4\2"+
		"\2\u0090\u0091\5\16\b\2\u0091\u0092\7\5\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0083\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008c\3\2\2\2\u0093\u008e\3\2"+
		"\2\2\u0093\u008f\3\2\2\2\u0094\u00ac\3\2\2\2\u0095\u0096\f\f\2\2\u0096"+
		"\u0097\7L\2\2\u0097\u00ab\5\16\b\f\u0098\u0099\f\n\2\2\u0099\u009a\t\5"+
		"\2\2\u009a\u00ab\5\16\b\13\u009b\u009c\f\t\2\2\u009c\u009d\t\6\2\2\u009d"+
		"\u00ab\5\16\b\n\u009e\u009f\f\b\2\2\u009f\u00a0\t\7\2\2\u00a0\u00ab\5"+
		"\16\b\t\u00a1\u00a2\f\7\2\2\u00a2\u00a3\7P\2\2\u00a3\u00ab\5\16\b\b\u00a4"+
		"\u00a5\f\6\2\2\u00a5\u00a6\7O\2\2\u00a6\u00ab\5\16\b\7\u00a7\u00a8\f\5"+
		"\2\2\u00a8\u00a9\7N\2\2\u00a9\u00ab\5\16\b\6\u00aa\u0095\3\2\2\2\u00aa"+
		"\u0098\3\2\2\2\u00aa\u009b\3\2\2\2\u00aa\u009e\3\2\2\2\u00aa\u00a1\3\2"+
		"\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\17\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b0\b\t\1\2\u00b0\u00b1\5\16\b\2\u00b1\u00b2\t\b\2\2\u00b2"+
		"\u00b3\5\16\b\2\u00b3\u00bd\3\2\2\2\u00b4\u00b5\7\60\2\2\u00b5\u00bd\5"+
		"\20\t\b\u00b6\u00bd\7r\2\2\u00b7\u00bd\5\24\13\2\u00b8\u00b9\7\4\2\2\u00b9"+
		"\u00ba\5\20\t\2\u00ba\u00bb\7\5\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00af\3"+
		"\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc"+
		"\u00b8\3\2\2\2\u00bd\u00c6\3\2\2\2\u00be\u00bf\f\7\2\2\u00bf\u00c0\7/"+
		"\2\2\u00c0\u00c5\5\20\t\b\u00c1\u00c2\f\6\2\2\u00c2\u00c3\7.\2\2\u00c3"+
		"\u00c5\5\20\t\7\u00c4\u00be\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3"+
		"\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\21\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7\20\2\2\u00cb\u00cc\7r"+
		"\2\2\u00cc\u010a\7\21\2\2\u00cd\u00d7\7\20\2\2\u00ce\u00cf\5\f\7\2\u00cf"+
		"\u00d0\7\22\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d8\5\f\7\2\u00d7\u00d3\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u010a\7\21\2\2\u00da\u00e3\7\23\2\2\u00db"+
		"\u00dc\7r\2\2\u00dc\u00de\7\22\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e4\7r\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u010a\7\24\2\2\u00e6\u0101\7\23\2\2\u00e7"+
		"\u00e8\7\25\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ee\7\25\2\2\u00ea\u00eb\7"+
		"\26\2\2\u00eb\u00ec\7r\2\2\u00ec\u00ee\7\26\2\2\u00ed\u00e7\3\2\2\2\u00ed"+
		"\u00ea\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7\27\2\2\u00f0\u00f1\7"+
		"r\2\2\u00f1\u00f3\7\22\2\2\u00f2\u00ed\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00fd\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00f8\7\25\2\2\u00f8\u00f9\7r\2\2\u00f9\u00fe\7\25\2\2\u00fa"+
		"\u00fb\7\26\2\2\u00fb\u00fc\7r\2\2\u00fc\u00fe\7\26\2\2\u00fd\u00f7\3"+
		"\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\27\2\2\u0100"+
		"\u0102\7r\2\2\u0101\u00f4\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u010a\7\24\2\2\u0104\u010a\7r\2\2\u0105\u010a\7t\2\2\u0106"+
		"\u010a\7s\2\2\u0107\u010a\5\24\13\2\u0108\u010a\3\2\2\2\u0109\u00c9\3"+
		"\2\2\2\u0109\u00cd\3\2\2\2\u0109\u00da\3\2\2\2\u0109\u00e6\3\2\2\2\u0109"+
		"\u0104\3\2\2\2\u0109\u0105\3\2\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u0108\3\2\2\2\u010a\23\3\2\2\2\u010b\u010c\t\t\2\2\u010c\25"+
		"\3\2\2\2\u010d\u010e\7r\2\2\u010e\u010f\t\n\2\2\u010f\u0110\5\f\7\2\u0110"+
		"\27\3\2\2\2\u0111\u0112\7\67\2\2\u0112\u0113\7r\2\2\u0113\31\3\2\2\2\u0114"+
		"\u0115\78\2\2\u0115\33\3\2\2\2\u0116\u011a\5\36\20\2\u0117\u011a\5 \21"+
		"\2\u0118\u011a\5\"\22\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\35\3\2\2\2\u011b\u011c\7:\2\2\u011c\37\3\2\2\2\u011d"+
		"\u011e\79\2\2\u011e!\3\2\2\2\u011f\u0121\7\33\2\2\u0120\u0122\5$\23\2"+
		"\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122#\3\2\2\2\u0123\u0128\5"+
		"\f\7\2\u0124\u0125\7\22\2\2\u0125\u0127\5\f\7\2\u0126\u0124\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012b\u012d\7\3\2\2\u012c\u012b\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d%\3\2\2\2\u012e\u0131\5(\25\2\u012f\u0131\5*\26\2"+
		"\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131\'\3\2\2\2\u0132\u0133\7"+
		"\36\2\2\u0133\u0134\5\62\32\2\u0134)\3\2\2\2\u0135\u0142\7\35\2\2\u0136"+
		"\u0138\t\13\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3"+
		"\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u0143\5\64\33\2\u013d\u013f\t\13\2\2\u013e\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0139\3\2\2\2\u0142\u013e\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u014b\7\36"+
		"\2\2\u0145\u014c\7E\2\2\u0146\u0147\7\4\2\2\u0147\u0148\5\60\31\2\u0148"+
		"\u0149\7\5\2\2\u0149\u014c\3\2\2\2\u014a\u014c\5\60\31\2\u014b\u0145\3"+
		"\2\2\2\u014b\u0146\3\2\2\2\u014b\u014a\3\2\2\2\u014c+\3\2\2\2\u014d\u0150"+
		"\7r\2\2\u014e\u014f\7\37\2\2\u014f\u0151\7r\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151-\3\2\2\2\u0152\u0155\5\64\33\2\u0153\u0154\7\37\2"+
		"\2\u0154\u0156\7r\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156/\3"+
		"\2\2\2\u0157\u015c\5,\27\2\u0158\u0159\7\22\2\2\u0159\u015b\5,\27\2\u015a"+
		"\u0158\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\7\22\2\2\u0160"+
		"\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\61\3\2\2\2\u0162\u0167\5.\30"+
		"\2\u0163\u0164\7\22\2\2\u0164\u0166\5.\30\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\63\3\2\2"+
		"\2\u0169\u0167\3\2\2\2\u016a\u016f\7r\2\2\u016b\u016c\7\6\2\2\u016c\u016e"+
		"\7r\2\2\u016d\u016b\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\65\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7 \2\2"+
		"\u0173\u0178\7r\2\2\u0174\u0175\7\22\2\2\u0175\u0177\7r\2\2\u0176\u0174"+
		"\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\67\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7!\2\2\u017c\u0181\7r\2\2"+
		"\u017d\u017e\7\22\2\2\u017e\u0180\7r\2\2\u017f\u017d\3\2\2\2\u0180\u0183"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u01829\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u018b\5<\37\2\u0185\u018b\5B\"\2\u0186\u018b\5D#"+
		"\2\u0187\u018b\5H%\2\u0188\u018b\5L\'\2\u0189\u018b\5P)\2\u018a\u0184"+
		"\3\2\2\2\u018a\u0185\3\2\2\2\u018a\u0186\3\2\2\2\u018a\u0187\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b;\3\2\2\2\u018c\u018d\7#\2\2\u018d"+
		"\u018e\5> \2\u018e\u018f\7\27\2\2\u018f\u0197\5@!\2\u0190\u0191\7$\2\2"+
		"\u0191\u0192\5> \2\u0192\u0193\7\27\2\2\u0193\u0194\5@!\2\u0194\u0196"+
		"\3\2\2\2\u0195\u0190\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019d\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7%"+
		"\2\2\u019b\u019c\7\27\2\2\u019c\u019e\5@!\2\u019d\u019a\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e=\3\2\2\2\u019f\u01a2\5\16\b\2\u01a0\u01a2\5\20\t"+
		"\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2?\3\2\2\2\u01a3\u01a5"+
		"\7~\2\2\u01a4\u01a6\5\4\3\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7\177"+
		"\2\2\u01aaA\3\2\2\2\u01ab\u01ac\7&\2\2\u01ac\u01ad\5> \2\u01ad\u01ae\7"+
		"\27\2\2\u01ae\u01af\5@!\2\u01afC\3\2\2\2\u01b0\u01b1\7\'\2\2\u01b1\u01b2"+
		"\5$\23\2\u01b2\u01b3\7(\2\2\u01b3\u01b4\5F$\2\u01b4\u01b5\7\27\2\2\u01b5"+
		"\u01b6\5@!\2\u01b6E\3\2\2\2\u01b7\u01bc\5> \2\u01b8\u01b9\7\22\2\2\u01b9"+
		"\u01bb\5> \2\u01ba\u01b8\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2"+
		"\2\u01bc\u01bd\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c1"+
		"\7\22\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1G\3\2\2\2\u01c2"+
		"\u01c3\7)\2\2\u01c3\u01c4\7\27\2\2\u01c4\u01c9\5@!\2\u01c5\u01c6\5J&\2"+
		"\u01c6\u01c7\7\27\2\2\u01c7\u01c8\5@!\2\u01c8\u01ca\3\2\2\2\u01c9\u01c5"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01d0\3\2\2\2\u01cd\u01ce\7%\2\2\u01ce\u01cf\7\27\2\2\u01cf\u01d1\5@"+
		"!\2\u01d0\u01cd\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d5\3\2\2\2\u01d2"+
		"\u01d3\7*\2\2\u01d3\u01d4\7\27\2\2\u01d4\u01d6\5@!\2\u01d5\u01d2\3\2\2"+
		"\2\u01d5\u01d6\3\2\2\2\u01d6\u01df\3\2\2\2\u01d7\u01d8\7)\2\2\u01d8\u01d9"+
		"\7\27\2\2\u01d9\u01da\5@!\2\u01da\u01db\7*\2\2\u01db\u01dc\7\27\2\2\u01dc"+
		"\u01dd\5@!\2\u01dd\u01df\3\2\2\2\u01de\u01c2\3\2\2\2\u01de\u01d7\3\2\2"+
		"\2\u01dfI\3\2\2\2\u01e0\u01e6\7,\2\2\u01e1\u01e4\5> \2\u01e2\u01e3\7\37"+
		"\2\2\u01e3\u01e5\7r\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01e1\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7K\3\2\2\2"+
		"\u01e8\u01e9\7\32\2\2\u01e9\u01ea\7r\2\2\u01ea\u01ec\7\4\2\2\u01eb\u01ed"+
		"\5N(\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01f1\7\5\2\2\u01ef\u01f0\7g\2\2\u01f0\u01f2\5> \2\u01f1\u01ef\3\2\2"+
		"\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7\27\2\2\u01f4"+
		"\u01f5\5@!\2\u01f5M\3\2\2\2\u01f6\u01f7\7B\2\2\u01f7\u01fd\7r\2\2\u01f8"+
		"\u01f9\7\22\2\2\u01f9\u01fa\7B\2\2\u01fa\u01fc\7r\2\2\u01fb\u01f8\3\2"+
		"\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"O\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7\65\2\2\u0201\u0207\7r\2\2"+
		"\u0202\u0204\7\4\2\2\u0203\u0205\5R*\2\u0204\u0203\3\2\2\2\u0204\u0205"+
		"\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\7\5\2\2\u0207\u0202\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\7\27\2\2\u020a\u020b\5"+
		"@!\2\u020bQ\3\2\2\2\u020c\u0211\5T+\2\u020d\u020e\7\22\2\2\u020e\u0210"+
		"\5T+\2\u020f\u020d\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0216\7\22"+
		"\2\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216S\3\2\2\2\u0217\u0218"+
		"\7r\2\2\u0218U\3\2\2\2\u0219\u021a\7r\2\2\u021a\u021b\7\4\2\2\u021b\u021c"+
		"\5$\23\2\u021c\u021d\7\5\2\2\u021dW\3\2\2\2<[`gkw\u0081\u0093\u00aa\u00ac"+
		"\u00bc\u00c4\u00c6\u00d3\u00d7\u00df\u00e3\u00ed\u00f4\u00fd\u0101\u0109"+
		"\u0119\u0121\u0128\u012c\u0130\u0139\u0140\u0142\u014b\u0150\u0155\u015c"+
		"\u0160\u0167\u016f\u0178\u0181\u018a\u0197\u019d\u01a1\u01a7\u01bc\u01c0"+
		"\u01cb\u01d0\u01d5\u01de\u01e4\u01e6\u01ec\u01f1\u01fd\u0204\u0207\u0211"+
		"\u0215";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}