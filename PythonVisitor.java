// Generated from Python.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PythonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PythonParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(PythonParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(PythonParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(PythonParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(PythonParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpANDBits}
	 * labeled alternative in {@link PythonParser#expr_aritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpANDBits(PythonParser.ExpANDBitsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpFuncionMatematica}
	 * labeled alternative in {@link PythonParser#expr_aritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFuncionMatematica(PythonParser.ExpFuncionMatematicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpBraces}
	 * labeled alternative in {@link PythonParser#expr_aritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBraces(PythonParser.ExpBracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpBitwise}
	 * labeled alternative in {@link PythonParser#expr_aritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBitwise(PythonParser.ExpBitwiseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpAtom}
	 * labeled alternative in {@link PythonParser#expr_aritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAtom(PythonParser.ExpAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpMulDivANDOthers}
	 * labeled alternative in {@link PythonParser#expr_aritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMulDivANDOthers(PythonParser.ExpMulDivANDOthersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpPot}
	 * labeled alternative in {@link PythonParser#expr_aritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPot(PythonParser.ExpPotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpCall}
	 * labeled alternative in {@link PythonParser#expr_aritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCall(PythonParser.ExpCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpShift}
	 * labeled alternative in {@link PythonParser#expr_aritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpShift(PythonParser.ExpShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpOrBits}
	 * labeled alternative in {@link PythonParser#expr_aritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOrBits(PythonParser.ExpOrBitsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpUnario}
	 * labeled alternative in {@link PythonParser#expr_aritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpUnario(PythonParser.ExpUnarioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpAddSub}
	 * labeled alternative in {@link PythonParser#expr_aritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAddSub(PythonParser.ExpAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpRel}
	 * labeled alternative in {@link PythonParser#expr_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRel(PythonParser.ExpRelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpNameLog}
	 * labeled alternative in {@link PythonParser#expr_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNameLog(PythonParser.ExpNameLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpCteLog}
	 * labeled alternative in {@link PythonParser#expr_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCteLog(PythonParser.ExpCteLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpOR}
	 * labeled alternative in {@link PythonParser#expr_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOR(PythonParser.ExpORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpAND}
	 * labeled alternative in {@link PythonParser#expr_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAND(PythonParser.ExpANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpLogBr}
	 * labeled alternative in {@link PythonParser#expr_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLogBr(PythonParser.ExpLogBrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpNot}
	 * labeled alternative in {@link PythonParser#expr_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNot(PythonParser.ExpNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atom1}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom1(PythonParser.Atom1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomArray}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomArray(PythonParser.AtomArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atom3}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom3(PythonParser.Atom3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Atom4}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom4(PythonParser.Atom4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomName}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomName(PythonParser.AtomNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomNumber}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumber(PythonParser.AtomNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomString}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomString(PythonParser.AtomStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomCteLog}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomCteLog(PythonParser.AtomCteLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomEmptyString}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomEmptyString(PythonParser.AtomEmptyStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#cte_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_log(PythonParser.Cte_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#expr_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_assign(PythonParser.Expr_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(PythonParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(PythonParser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(PythonParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(PythonParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link PythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(PythonParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(PythonParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(PythonParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(PythonParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(PythonParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(PythonParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(PythonParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(PythonParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(PythonParser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(PythonParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(PythonParser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(PythonParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(PythonParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(PythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(PythonParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PythonParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(PythonParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(PythonParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(PythonParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(PythonParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(PythonParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(PythonParser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(PythonParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(PythonParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#def_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_param_list(PythonParser.Def_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(PythonParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(PythonParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PythonParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(PythonParser.FuncCallContext ctx);
}