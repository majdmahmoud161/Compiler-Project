// Generated from C:/Users/x/IdeaProjects/Compiler/src/antlr/PythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PythonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vardecllable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecllable(PythonParser.VardecllableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arrdecllable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrdecllable(PythonParser.ArrdecllableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Loopslable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopslable(PythonParser.LoopslableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLable(PythonParser.ExpLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionLable(PythonParser.ConditionLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDeclLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclLable(PythonParser.FuncDeclLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallFuncLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFuncLable(PythonParser.CallFuncLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclLable(PythonParser.ClassDeclLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjLable(PythonParser.ObjLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallFromClassLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFromClassLable(PythonParser.CallFromClassLableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InheritLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritLable(PythonParser.InheritLableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(PythonParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(PythonParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(PythonParser.ArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#arr_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_decl(PythonParser.Arr_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#while_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_value(PythonParser.While_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops(PythonParser.LoopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(PythonParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(PythonParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(PythonParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PythonParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(PythonParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif(PythonParser.ElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(PythonParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl(PythonParser.Func_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#paralist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParalist(PythonParser.ParalistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#call_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_func(PythonParser.Call_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#build_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_in_func(PythonParser.Build_in_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#appendfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendfunc(PythonParser.AppendfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#appendvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendvar(PythonParser.AppendvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#appendparlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendparlist(PythonParser.AppendparlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(PythonParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#run}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun(PythonParser.RunContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#class_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_decl(PythonParser.Class_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#construture_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstruture_decl(PythonParser.Construture_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(PythonParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#call_fromclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_fromclass(PythonParser.Call_fromclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritance(PythonParser.InheritanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#encapsulation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncapsulation(PythonParser.EncapsulationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlasklibraryLabel}
	 * labeled alternative in {@link PythonParser#flask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlasklibraryLabel(PythonParser.FlasklibraryLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlaskfragLabel}
	 * labeled alternative in {@link PythonParser#flask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskfragLabel(PythonParser.FlaskfragLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#flasklib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlasklib(PythonParser.FlasklibContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#flaskfragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskfragment(PythonParser.FlaskfragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#flasklibrarydecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlasklibrarydecl(PythonParser.FlasklibrarydeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#liblist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiblist(PythonParser.LiblistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#libvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibvalue(PythonParser.LibvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#osdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOsdecl(PythonParser.OsdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#utilsdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtilsdecl(PythonParser.UtilsdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#appdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppdecl(PythonParser.AppdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#apprun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApprun(PythonParser.ApprunContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#appconfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppconfig(PythonParser.AppconfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#flaskstate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlaskstate(PythonParser.FlaskstateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#routdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutdecl(PythonParser.RoutdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethods(PythonParser.MethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#routestate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutestate(PythonParser.RoutestateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#var_flask_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_flask_decl(PythonParser.Var_flask_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#route_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoute_call(PythonParser.Route_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#requestcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequestcall(PythonParser.RequestcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#flask_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlask_condition(PythonParser.Flask_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#flask_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlask_exp(PythonParser.Flask_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#flask_func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlask_func_decl(PythonParser.Flask_func_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#falsk_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalsk_return(PythonParser.Falsk_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#redirect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirect(PythonParser.RedirectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#rendertemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRendertemplate(PythonParser.RendertemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#state_jinja2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_jinja2(PythonParser.State_jinja2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#printinjinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintinjinja(PythonParser.PrintinjinjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For_j}
	 * labeled alternative in {@link PythonParser#condition_jinja2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_j(PythonParser.For_jContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If_j}
	 * labeled alternative in {@link PythonParser#condition_jinja2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_j(PythonParser.If_jContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Else_j}
	 * labeled alternative in {@link PythonParser#condition_jinja2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_j(PythonParser.Else_jContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Elif_j}
	 * labeled alternative in {@link PythonParser#condition_jinja2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_j(PythonParser.Elif_jContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#for_jinja2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_jinja2(PythonParser.For_jinja2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#if_jinja2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_jinja2(PythonParser.If_jinja2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elif_jinja2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_jinja2(PythonParser.Elif_jinja2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#else_jinja2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_jinja2(PythonParser.Else_jinja2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code FullHtmlDocumentLabel}
	 * labeled alternative in {@link PythonParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullHtmlDocumentLabel(PythonParser.FullHtmlDocumentLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagsDocumentLabel}
	 * labeled alternative in {@link PythonParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagsDocumentLabel(PythonParser.TagsDocumentLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#fullHtmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullHtmlDocument(PythonParser.FullHtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#doctypehtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctypehtml(PythonParser.DoctypehtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#htmlOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlOpen(PythonParser.HtmlOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#htmlClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlClose(PythonParser.HtmlCloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#headSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadSection(PythonParser.HeadSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#bodySection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodySection(PythonParser.BodySectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(PythonParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#tagtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagtype(PythonParser.TagtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#startTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTag(PythonParser.StartTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#endTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndTag(PythonParser.EndTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(PythonParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(PythonParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#selfClosingtag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingtag(PythonParser.SelfClosingtagContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#tagsDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagsDocument(PythonParser.TagsDocumentContext ctx);
}