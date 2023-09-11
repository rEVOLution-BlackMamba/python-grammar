
import java.util.HashMap;
import java.util.Scanner;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import SymbolTable.*;



public class MyPythonVisitor extends PythonBaseVisitor<STNode> {

    private final HashMap<String, ParseTree> userMethods;
    private Scope<STNode> globalScope, actualScope;

    public MyPythonVisitor() {
        userMethods = new HashMap();
        globalScope = actualScope = new Scope<>();
    }

    @Override
    public STNode visitProgram(PythonParser.ProgramContext ctx) {
        //System.out.println("\nIniciando Intérprete...");
        for(PythonParser.StmtContext s: ctx.stmt())
            visit(s);                
       // System.out.println("\nFinalizando Intérprete...");
        return null;
    }

    @Override
    public STNode visitStmt(PythonParser.StmtContext ctx) {
        return ctx.simple_stmt() != null ? visit(ctx.simple_stmt()) : visit(ctx.compound_stmt());
    }

    @Override 
    public STNode visitPrint_stmt(PythonParser.Print_stmtContext ctx) {    
        if(ctx.TK_PRINT() != null){
            if(visit(ctx.expr_stmt()) != null){
                System.out.println(visit(ctx.expr_stmt()).getValue());
            }else{
                System.out.println();
            }
        }                    
        return null;
    }

// vamos a esperar a definir lo de las expresiones aritméticas, OK tati?
	@Override
    public STNode visitExpCall(PythonParser.ExpCallContext ctx) {
        // Get the Method_def Context
        PythonParser.FuncdefContext methodContext = (PythonParser.FuncdefContext) userMethods.get(ctx.funcCall().NAME().getText());
        // Open new scope for the method call
        Scope<STNode> currentScope = actualScope;
        actualScope = new Scope<STNode>(actualScope);
        // Set actual parameters
        int i = 0;
        // !--> chequeo semántico: verificar tipos de param formal y expresión actual
        if (ctx.funcCall().expr_list() != null) {
            for (PythonParser.Expr_stmtContext id : ctx.funcCall().expr_list().expr_stmt()) {
                actualScope.put(methodContext.def_param_list().NAME(i).getText(), new STNode(visit(id).getValue()));
                i++;
            }
        }
        STNode node = visitSuite(methodContext.suite());
        // Restore the scope
        actualScope = currentScope;
        return node;
    }

    @Override  
    public STNode visitExpPot(PythonParser.ExpPotContext ctx) {

        STNode node_0 = visit(ctx.expr_aritm(0));
        STNode node_1 = visit(ctx.expr_aritm(1));

        double base = ((Number) node_0.getValue()).doubleValue();
        double exp = ((Number) node_1.getValue()).doubleValue();

        double res = Math.pow(base, exp);

        // the type of the returning node depends on the types of base and exp
        return (node_0.getType() == STNodeType.DOUBLE || node_1.getType() == STNodeType.DOUBLE) ? new STNode(STNodeType.DOUBLE, res) : new STNode(STNodeType.INT, (int) res);
    }

    @Override
    public STNode visitExpUnario(PythonParser.ExpUnarioContext ctx) { 
        STNode node = visit(ctx.expr_aritm());    
        if(ctx.opUnario.getType() == PythonLexer.ADD)
            return node.getType() == STNodeType.INT ? new STNode(STNodeType.INT, (Integer) node.getValue()) : new STNode(STNodeType.DOUBLE, (Double) node.getValue());
        return node.getType() == STNodeType.INT ? new STNode(STNodeType.INT, -(Integer) node.getValue()) : new STNode(STNodeType.DOUBLE, -(Double) node.getValue());
    }


    @Override
    public STNode visitExpMulDivANDOthers(PythonParser.ExpMulDivANDOthersContext ctx) {
        STNode node_0 = visit(ctx.expr_aritm(0));
        STNode node_1 = visit(ctx.expr_aritm(1));    

        double left = ((Number) node_0.getValue()).doubleValue();
        double right = ((Number) node_1.getValue()).doubleValue();

        double res = 0;;
        //TODO
        switch (ctx.op1.getType()) {
            //multiplicacion
            case PythonLexer.MUL:
                res = left * right;
                break;
            //division
            case PythonLexer.DIV:
                res = left / right;
                break;
            //MOD
            case PythonLexer.MOD:
                res = left % right;
        }
        return (node_0.getType() == STNodeType.DOUBLE || node_1.getType() == STNodeType.DOUBLE) ? new STNode(STNodeType.DOUBLE, res) : new STNode(STNodeType.INT, (int) res);
    }

    @Override
    public STNode visitExpAddSub(PythonParser.ExpAddSubContext ctx) {
        STNode node_0 = visit(ctx.expr_aritm(0));
        STNode node_1 = visit(ctx.expr_aritm(1));
        // if one of the expresisons is a string return the concatenation of them
        if (node_0.getType() == STNodeType.STRING || node_1.getType() == STNodeType.STRING)
            return new STNode(STNodeType.STRING, node_0.getValue().toString() + node_1.getValue().toString());
        // expresions are numeric: add or substract them
        double left = ((Number) node_0.getValue()).doubleValue();
        double right = ((Number) node_1.getValue()).doubleValue();
        
        double res = (ctx.op2.getType() == PythonLexer.ADD) ? (left + right) : (left - right);
        // the type of the returning node depends on the types of the expressions
        return (node_0.getType() == STNodeType.DOUBLE || node_1.getType() == STNodeType.DOUBLE) ?
                new STNode(STNodeType.DOUBLE, res) :
                new STNode(STNodeType.INT, (int) res);
    }
	
    //TODO no he chekeado q los 2 operandos sean enteros
    @Override
    public STNode visitExpShift(PythonParser.ExpShiftContext ctx) {

        STNode node_0 = visit(ctx.expr_aritm(0));
        STNode node_1 = visit(ctx.expr_aritm(1));
              
        int left = ((Number) node_0.getValue()).intValue();
        int right = ((Number) node_1.getValue()).intValue();

       
        int res = (ctx.op3.getType() == PythonLexer.LEFT_SHIFT) ? (left << right) : (left >> right);
        return new STNode(STNodeType.INT, (int) res);

    }

    @Override
    public STNode visitExpANDBits(PythonParser.ExpANDBitsContext ctx) { 
        STNode node_0 = visit(ctx.expr_aritm(0));
        STNode node_1 = visit(ctx.expr_aritm(1));
              
        int left = ((Number) node_0.getValue()).intValue();
        int right = ((Number) node_1.getValue()).intValue();

        int res = left & right ;
     
        return new STNode(STNodeType.INT, (int) res);

    }
	
    @Override 
    public STNode visitExpBitwise(PythonParser.ExpBitwiseContext ctx) {

        STNode node_0 = visit(ctx.expr_aritm(0));
        STNode node_1 = visit(ctx.expr_aritm(1));
              
        int left = ((Number) node_0.getValue()).intValue();
        int right = ((Number) node_1.getValue()).intValue();

        int res = left ^ right ;
     
        return new STNode(STNodeType.INT, (int) res);

    }
	
    @Override 
    public STNode visitExpOrBits(PythonParser.ExpOrBitsContext ctx) {

        STNode node_0 = visit(ctx.expr_aritm(0));
        STNode node_1 = visit(ctx.expr_aritm(1));
              
        int left = ((Number) node_0.getValue()).intValue();
        int right = ((Number) node_1.getValue()).intValue();

        int res = left | right ;
     
        return new STNode(STNodeType.INT, (int) res);
    
    }

    //Creo que la llamada explicita a atom esta por gusto, lo voy a tratar igual q las expresiones o sea no tratandolo
    //como que estan toda sus alternativas etiquetadas las tratare ahi

    // Falta las funciones matematicas (faltan?)


    @Override
    public STNode visitExpBraces(PythonParser.ExpBracesContext ctx) {
        return visit(ctx.expr_aritm());   
    }
	
    //TODO las palabritas en la gramatica ( el is y eso hijo)
    @Override 
    public STNode visitExpRel(PythonParser.ExpRelContext ctx) {
        double left = ((Number) visit(ctx.expr_aritm(0)).getValue()).doubleValue();
        double right = ((Number) visit(ctx.expr_aritm(1)).getValue()).doubleValue();
        boolean res = false;

        switch (ctx.opL1.getType()) {
            case PythonLexer.LESS_THAN:
                res = left < right;
                break;
            case PythonLexer.GREATER_THAN:
                res = left > right;
                break;
            case PythonLexer.LT_EQ:
                res = left <= right;
                break;
            case PythonLexer.GT_EQ:
                res = left >= right;
                break;
            case PythonLexer.EQUALS:
                res = left == right;
                break;
            case PythonLexer.NOT_EQ:
                res = left != right;
                break;
        }
        return new STNode(STNodeType.BOOLEAN, res);
        
    }

    @Override 
    public STNode visitExpNot(PythonParser.ExpNotContext ctx) {
        return new STNode(STNodeType.BOOLEAN, !((Boolean) visit(ctx.expr_log()).getValue()));
    }

    @Override 
    public STNode visitExpAND(PythonParser.ExpANDContext ctx) {

        boolean left = ((Boolean) visit(ctx.expr_log(0)).getValue());
        boolean right = ((Boolean) visit(ctx.expr_log(1)).getValue());        
        return new STNode(STNodeType.BOOLEAN, left && right);

    }

    @Override 
    public STNode visitExpOR(PythonParser.ExpORContext ctx) {

        boolean left = ((Boolean) visit(ctx.expr_log(0)).getValue());
        boolean right = ((Boolean) visit(ctx.expr_log(1)).getValue());        
        return new STNode(STNodeType.BOOLEAN, left || right);
    
    }

    @Override 
    public STNode visitExpNameLog(PythonParser.ExpNameLogContext ctx) {
        return actualScope.get(ctx.getText());
    }

    @Override 
    public STNode visitExpCteLog(PythonParser.ExpCteLogContext ctx) {
        return new STNode(STNodeType.BOOLEAN, ctx.cte_log().TK_TRUE() != null);
    }
	
    @Override 
    public STNode visitExpLogBr(PythonParser.ExpLogBrContext ctx) {
         return visit(ctx.expr_log());
    }

    @Override
    public STNode visitExpr_assign(PythonParser.Expr_assignContext ctx) {
        STNode node = null;        
        STNode exp = visit(ctx.expr_stmt());
        switch (exp.getType()) {
            case INT:
                node = new STNode(STNodeType.INT, STNodeScope.LOCAL, ((Number) exp.getValue()).intValue());
                break;
            case DOUBLE:
                node = new STNode(STNodeType.DOUBLE, STNodeScope.LOCAL, ((Number) exp.getValue()).doubleValue());
                break;
            case STRING:
                node = new STNode(STNodeType.STRING, STNodeScope.LOCAL, (String) exp.getValue());
                break;
            case BOOLEAN:
                node = new STNode(STNodeType.BOOLEAN, STNodeScope.LOCAL, (Boolean) exp.getValue());
                break;
        }
        Scope<STNode> nodeScope = actualScope;
        nodeScope.put(ctx.NAME().getText(), node);
        return node;
    }

    @Override
    public STNode visitFuncdef(PythonParser.FuncdefContext ctx) {
        userMethods.put(ctx.NAME().getText(), ctx);
        return null;
    }

	@Override
    public STNode visitExpFuncionMatematica(PythonParser.ExpFuncionMatematicaContext ctx) {
        double valor = ((Number) visit(ctx.expr_aritm()).getValue()).doubleValue();
        double ans = 0;
        switch(ctx.opFuncMat.getType()){

            case PythonLexer.SQRT: 
                ans =  Math.sqrt(valor);
                break;
            case PythonLexer.SIN: 
                ans = Math.sin(valor);
                break;
            case PythonLexer.COS:
                ans = Math.cos(valor);
        }

        return new STNode(STNodeType.DOUBLE,ans); 
    }
	

    @Override
    public STNode visitAtomArray(PythonParser.AtomArrayContext ctx) {

        for(PythonParser.Expr_stmtContext ex : ctx.expr_stmt()){

        }
        return null;
    }

    @Override public STNode visitAtomName(PythonParser.AtomNameContext ctx) {
        return actualScope.get(ctx.NAME().getText());
    }

	@Override 
    public STNode visitAtomNumber(PythonParser.AtomNumberContext ctx) {
        return new STNode(STNodeType.DOUBLE, Double.parseDouble(ctx.NUMBER().getText()));   
    }

    @Override
    public STNode visitAtomString(PythonParser.AtomStringContext ctx) {
        String str = ctx.STRING().getText();
        return new STNode(STNodeType.STRING, str.substring(1, str.length() - 1));
    }
	
    @Override 
    public STNode visitAtomCteLog(PythonParser.AtomCteLogContext ctx) {
        return new STNode(STNodeType.BOOLEAN, ctx.cte_log().TK_TRUE() != null);
    }

    @Override 
    public STNode visitWhile_stmt(PythonParser.While_stmtContext ctx) { 

        STNode exp = visit(ctx.test());
        while ((exp.getType() == STNodeType.BOOLEAN && (Boolean)exp.getValue() == true) || ((exp.getValue() instanceof Number) && (((Number) exp.getValue()).doubleValue() != 0))) {
            visit(ctx.suite());
            exp = visit(ctx.test());
        }
        return null;

    }

    @Override 
    public STNode visitIf_stmt(PythonParser.If_stmtContext ctx) {
        STNode exp = visit(ctx.test(0));
        if (((exp.getType() == STNodeType.BOOLEAN && (Boolean)exp.getValue() == true) || ((exp.getValue() instanceof Number) && (((Number) exp.getValue()).doubleValue() != 0))) ){
            visit(ctx.suite(0));
        }else{
            int cantElif = ctx.ELIF().size();
            int i;
            for(i = 1; i <= cantElif; i++ ){                       
                exp = visit(ctx.test(i));
                if (((exp.getType() == STNodeType.BOOLEAN && (Boolean)exp.getValue() == true) || ((exp.getValue() instanceof Number) && (((Number) exp.getValue()).doubleValue() != 0))) ){           
                    visit(ctx.suite(i));
                    break;
                }
            }

            if( i == cantElif + 1 && ctx.ELSE() != null){
                visit(ctx.suite(i));              
            }

        }
        
        return null;
    }

  

}

