// Generated from C:/Users/x/IdeaProjects/Compiler/src/antlr/PythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Vardecllable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterVardecllable(PythonParser.VardecllableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Vardecllable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitVardecllable(PythonParser.VardecllableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arrdecllable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterArrdecllable(PythonParser.ArrdecllableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arrdecllable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitArrdecllable(PythonParser.ArrdecllableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Loopslable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterLoopslable(PythonParser.LoopslableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Loopslable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitLoopslable(PythonParser.LoopslableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterExpLable(PythonParser.ExpLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitExpLable(PythonParser.ExpLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterConditionLable(PythonParser.ConditionLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitConditionLable(PythonParser.ConditionLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDeclLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclLable(PythonParser.FuncDeclLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDeclLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclLable(PythonParser.FuncDeclLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallFuncLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterCallFuncLable(PythonParser.CallFuncLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFuncLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitCallFuncLable(PythonParser.CallFuncLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclLable(PythonParser.ClassDeclLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclLable(PythonParser.ClassDeclLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterObjLable(PythonParser.ObjLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitObjLable(PythonParser.ObjLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallFromClassLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterCallFromClassLable(PythonParser.CallFromClassLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFromClassLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitCallFromClassLable(PythonParser.CallFromClassLableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InheritLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void enterInheritLable(PythonParser.InheritLableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InheritLable}
	 * labeled alternative in {@link PythonParser#state}.
	 * @param ctx the parse tree
	 */
	void exitInheritLable(PythonParser.InheritLableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(PythonParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(PythonParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PythonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PythonParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#arr}.
	 * @param ctx the parse tree
	 */
	void enterArr(PythonParser.ArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#arr}.
	 * @param ctx the parse tree
	 */
	void exitArr(PythonParser.ArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#arr_decl}.
	 * @param ctx the parse tree
	 */
	void enterArr_decl(PythonParser.Arr_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#arr_decl}.
	 * @param ctx the parse tree
	 */
	void exitArr_decl(PythonParser.Arr_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#while_value}.
	 * @param ctx the parse tree
	 */
	void enterWhile_value(PythonParser.While_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#while_value}.
	 * @param ctx the parse tree
	 */
	void exitWhile_value(PythonParser.While_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(PythonParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(PythonParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(PythonParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(PythonParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(PythonParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(PythonParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(PythonParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(PythonParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PythonParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PythonParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(PythonParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(PythonParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elif}.
	 * @param ctx the parse tree
	 */
	void enterElif(PythonParser.ElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elif}.
	 * @param ctx the parse tree
	 */
	void exitElif(PythonParser.ElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(PythonParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(PythonParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(PythonParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(PythonParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#paralist}.
	 * @param ctx the parse tree
	 */
	void enterParalist(PythonParser.ParalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#paralist}.
	 * @param ctx the parse tree
	 */
	void exitParalist(PythonParser.ParalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#call_func}.
	 * @param ctx the parse tree
	 */
	void enterCall_func(PythonParser.Call_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#call_func}.
	 * @param ctx the parse tree
	 */
	void exitCall_func(PythonParser.Call_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#build_in_func}.
	 * @param ctx the parse tree
	 */
	void enterBuild_in_func(PythonParser.Build_in_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#build_in_func}.
	 * @param ctx the parse tree
	 */
	void exitBuild_in_func(PythonParser.Build_in_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#appendfunc}.
	 * @param ctx the parse tree
	 */
	void enterAppendfunc(PythonParser.AppendfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#appendfunc}.
	 * @param ctx the parse tree
	 */
	void exitAppendfunc(PythonParser.AppendfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#appendvar}.
	 * @param ctx the parse tree
	 */
	void enterAppendvar(PythonParser.AppendvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#appendvar}.
	 * @param ctx the parse tree
	 */
	void exitAppendvar(PythonParser.AppendvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#appendparlist}.
	 * @param ctx the parse tree
	 */
	void enterAppendparlist(PythonParser.AppendparlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#appendparlist}.
	 * @param ctx the parse tree
	 */
	void exitAppendparlist(PythonParser.AppendparlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(PythonParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(PythonParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#run}.
	 * @param ctx the parse tree
	 */
	void enterRun(PythonParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#run}.
	 * @param ctx the parse tree
	 */
	void exitRun(PythonParser.RunContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void enterClass_decl(PythonParser.Class_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#class_decl}.
	 * @param ctx the parse tree
	 */
	void exitClass_decl(PythonParser.Class_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#construture_decl}.
	 * @param ctx the parse tree
	 */
	void enterConstruture_decl(PythonParser.Construture_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#construture_decl}.
	 * @param ctx the parse tree
	 */
	void exitConstruture_decl(PythonParser.Construture_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(PythonParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(PythonParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#call_fromclass}.
	 * @param ctx the parse tree
	 */
	void enterCall_fromclass(PythonParser.Call_fromclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#call_fromclass}.
	 * @param ctx the parse tree
	 */
	void exitCall_fromclass(PythonParser.Call_fromclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(PythonParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(PythonParser.InheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#encapsulation}.
	 * @param ctx the parse tree
	 */
	void enterEncapsulation(PythonParser.EncapsulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#encapsulation}.
	 * @param ctx the parse tree
	 */
	void exitEncapsulation(PythonParser.EncapsulationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlasklibraryLabel}
	 * labeled alternative in {@link PythonParser#flask}.
	 * @param ctx the parse tree
	 */
	void enterFlasklibraryLabel(PythonParser.FlasklibraryLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlasklibraryLabel}
	 * labeled alternative in {@link PythonParser#flask}.
	 * @param ctx the parse tree
	 */
	void exitFlasklibraryLabel(PythonParser.FlasklibraryLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FlaskfragLabel}
	 * labeled alternative in {@link PythonParser#flask}.
	 * @param ctx the parse tree
	 */
	void enterFlaskfragLabel(PythonParser.FlaskfragLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FlaskfragLabel}
	 * labeled alternative in {@link PythonParser#flask}.
	 * @param ctx the parse tree
	 */
	void exitFlaskfragLabel(PythonParser.FlaskfragLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#flasklib}.
	 * @param ctx the parse tree
	 */
	void enterFlasklib(PythonParser.FlasklibContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#flasklib}.
	 * @param ctx the parse tree
	 */
	void exitFlasklib(PythonParser.FlasklibContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#flaskfragment}.
	 * @param ctx the parse tree
	 */
	void enterFlaskfragment(PythonParser.FlaskfragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#flaskfragment}.
	 * @param ctx the parse tree
	 */
	void exitFlaskfragment(PythonParser.FlaskfragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#flasklibrarydecl}.
	 * @param ctx the parse tree
	 */
	void enterFlasklibrarydecl(PythonParser.FlasklibrarydeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#flasklibrarydecl}.
	 * @param ctx the parse tree
	 */
	void exitFlasklibrarydecl(PythonParser.FlasklibrarydeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#liblist}.
	 * @param ctx the parse tree
	 */
	void enterLiblist(PythonParser.LiblistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#liblist}.
	 * @param ctx the parse tree
	 */
	void exitLiblist(PythonParser.LiblistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#libvalue}.
	 * @param ctx the parse tree
	 */
	void enterLibvalue(PythonParser.LibvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#libvalue}.
	 * @param ctx the parse tree
	 */
	void exitLibvalue(PythonParser.LibvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#osdecl}.
	 * @param ctx the parse tree
	 */
	void enterOsdecl(PythonParser.OsdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#osdecl}.
	 * @param ctx the parse tree
	 */
	void exitOsdecl(PythonParser.OsdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#utilsdecl}.
	 * @param ctx the parse tree
	 */
	void enterUtilsdecl(PythonParser.UtilsdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#utilsdecl}.
	 * @param ctx the parse tree
	 */
	void exitUtilsdecl(PythonParser.UtilsdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#appdecl}.
	 * @param ctx the parse tree
	 */
	void enterAppdecl(PythonParser.AppdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#appdecl}.
	 * @param ctx the parse tree
	 */
	void exitAppdecl(PythonParser.AppdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#apprun}.
	 * @param ctx the parse tree
	 */
	void enterApprun(PythonParser.ApprunContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#apprun}.
	 * @param ctx the parse tree
	 */
	void exitApprun(PythonParser.ApprunContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#appconfig}.
	 * @param ctx the parse tree
	 */
	void enterAppconfig(PythonParser.AppconfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#appconfig}.
	 * @param ctx the parse tree
	 */
	void exitAppconfig(PythonParser.AppconfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#flaskstate}.
	 * @param ctx the parse tree
	 */
	void enterFlaskstate(PythonParser.FlaskstateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#flaskstate}.
	 * @param ctx the parse tree
	 */
	void exitFlaskstate(PythonParser.FlaskstateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#routdecl}.
	 * @param ctx the parse tree
	 */
	void enterRoutdecl(PythonParser.RoutdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#routdecl}.
	 * @param ctx the parse tree
	 */
	void exitRoutdecl(PythonParser.RoutdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethods(PythonParser.MethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethods(PythonParser.MethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#routestate}.
	 * @param ctx the parse tree
	 */
	void enterRoutestate(PythonParser.RoutestateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#routestate}.
	 * @param ctx the parse tree
	 */
	void exitRoutestate(PythonParser.RoutestateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#var_flask_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_flask_decl(PythonParser.Var_flask_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#var_flask_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_flask_decl(PythonParser.Var_flask_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#route_call}.
	 * @param ctx the parse tree
	 */
	void enterRoute_call(PythonParser.Route_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#route_call}.
	 * @param ctx the parse tree
	 */
	void exitRoute_call(PythonParser.Route_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#requestcall}.
	 * @param ctx the parse tree
	 */
	void enterRequestcall(PythonParser.RequestcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#requestcall}.
	 * @param ctx the parse tree
	 */
	void exitRequestcall(PythonParser.RequestcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#flask_condition}.
	 * @param ctx the parse tree
	 */
	void enterFlask_condition(PythonParser.Flask_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#flask_condition}.
	 * @param ctx the parse tree
	 */
	void exitFlask_condition(PythonParser.Flask_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#flask_exp}.
	 * @param ctx the parse tree
	 */
	void enterFlask_exp(PythonParser.Flask_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#flask_exp}.
	 * @param ctx the parse tree
	 */
	void exitFlask_exp(PythonParser.Flask_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#flask_func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFlask_func_decl(PythonParser.Flask_func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#flask_func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFlask_func_decl(PythonParser.Flask_func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#falsk_return}.
	 * @param ctx the parse tree
	 */
	void enterFalsk_return(PythonParser.Falsk_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#falsk_return}.
	 * @param ctx the parse tree
	 */
	void exitFalsk_return(PythonParser.Falsk_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#redirect}.
	 * @param ctx the parse tree
	 */
	void enterRedirect(PythonParser.RedirectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#redirect}.
	 * @param ctx the parse tree
	 */
	void exitRedirect(PythonParser.RedirectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#rendertemplate}.
	 * @param ctx the parse tree
	 */
	void enterRendertemplate(PythonParser.RendertemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#rendertemplate}.
	 * @param ctx the parse tree
	 */
	void exitRendertemplate(PythonParser.RendertemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#state_jinja2}.
	 * @param ctx the parse tree
	 */
	void enterState_jinja2(PythonParser.State_jinja2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#state_jinja2}.
	 * @param ctx the parse tree
	 */
	void exitState_jinja2(PythonParser.State_jinja2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#printinjinja}.
	 * @param ctx the parse tree
	 */
	void enterPrintinjinja(PythonParser.PrintinjinjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#printinjinja}.
	 * @param ctx the parse tree
	 */
	void exitPrintinjinja(PythonParser.PrintinjinjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For_j}
	 * labeled alternative in {@link PythonParser#condition_jinja2}.
	 * @param ctx the parse tree
	 */
	void enterFor_j(PythonParser.For_jContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For_j}
	 * labeled alternative in {@link PythonParser#condition_jinja2}.
	 * @param ctx the parse tree
	 */
	void exitFor_j(PythonParser.For_jContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If_j}
	 * labeled alternative in {@link PythonParser#condition_jinja2}.
	 * @param ctx the parse tree
	 */
	void enterIf_j(PythonParser.If_jContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If_j}
	 * labeled alternative in {@link PythonParser#condition_jinja2}.
	 * @param ctx the parse tree
	 */
	void exitIf_j(PythonParser.If_jContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Else_j}
	 * labeled alternative in {@link PythonParser#condition_jinja2}.
	 * @param ctx the parse tree
	 */
	void enterElse_j(PythonParser.Else_jContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Else_j}
	 * labeled alternative in {@link PythonParser#condition_jinja2}.
	 * @param ctx the parse tree
	 */
	void exitElse_j(PythonParser.Else_jContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Elif_j}
	 * labeled alternative in {@link PythonParser#condition_jinja2}.
	 * @param ctx the parse tree
	 */
	void enterElif_j(PythonParser.Elif_jContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Elif_j}
	 * labeled alternative in {@link PythonParser#condition_jinja2}.
	 * @param ctx the parse tree
	 */
	void exitElif_j(PythonParser.Elif_jContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#for_jinja2}.
	 * @param ctx the parse tree
	 */
	void enterFor_jinja2(PythonParser.For_jinja2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#for_jinja2}.
	 * @param ctx the parse tree
	 */
	void exitFor_jinja2(PythonParser.For_jinja2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#if_jinja2}.
	 * @param ctx the parse tree
	 */
	void enterIf_jinja2(PythonParser.If_jinja2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#if_jinja2}.
	 * @param ctx the parse tree
	 */
	void exitIf_jinja2(PythonParser.If_jinja2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elif_jinja2}.
	 * @param ctx the parse tree
	 */
	void enterElif_jinja2(PythonParser.Elif_jinja2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elif_jinja2}.
	 * @param ctx the parse tree
	 */
	void exitElif_jinja2(PythonParser.Elif_jinja2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#else_jinja2}.
	 * @param ctx the parse tree
	 */
	void enterElse_jinja2(PythonParser.Else_jinja2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#else_jinja2}.
	 * @param ctx the parse tree
	 */
	void exitElse_jinja2(PythonParser.Else_jinja2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code FullHtmlDocumentLabel}
	 * labeled alternative in {@link PythonParser#document}.
	 * @param ctx the parse tree
	 */
	void enterFullHtmlDocumentLabel(PythonParser.FullHtmlDocumentLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullHtmlDocumentLabel}
	 * labeled alternative in {@link PythonParser#document}.
	 * @param ctx the parse tree
	 */
	void exitFullHtmlDocumentLabel(PythonParser.FullHtmlDocumentLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagsDocumentLabel}
	 * labeled alternative in {@link PythonParser#document}.
	 * @param ctx the parse tree
	 */
	void enterTagsDocumentLabel(PythonParser.TagsDocumentLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagsDocumentLabel}
	 * labeled alternative in {@link PythonParser#document}.
	 * @param ctx the parse tree
	 */
	void exitTagsDocumentLabel(PythonParser.TagsDocumentLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#fullHtmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterFullHtmlDocument(PythonParser.FullHtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#fullHtmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitFullHtmlDocument(PythonParser.FullHtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#doctypehtml}.
	 * @param ctx the parse tree
	 */
	void enterDoctypehtml(PythonParser.DoctypehtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#doctypehtml}.
	 * @param ctx the parse tree
	 */
	void exitDoctypehtml(PythonParser.DoctypehtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#htmlOpen}.
	 * @param ctx the parse tree
	 */
	void enterHtmlOpen(PythonParser.HtmlOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#htmlOpen}.
	 * @param ctx the parse tree
	 */
	void exitHtmlOpen(PythonParser.HtmlOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#htmlClose}.
	 * @param ctx the parse tree
	 */
	void enterHtmlClose(PythonParser.HtmlCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#htmlClose}.
	 * @param ctx the parse tree
	 */
	void exitHtmlClose(PythonParser.HtmlCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#headSection}.
	 * @param ctx the parse tree
	 */
	void enterHeadSection(PythonParser.HeadSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#headSection}.
	 * @param ctx the parse tree
	 */
	void exitHeadSection(PythonParser.HeadSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#bodySection}.
	 * @param ctx the parse tree
	 */
	void enterBodySection(PythonParser.BodySectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#bodySection}.
	 * @param ctx the parse tree
	 */
	void exitBodySection(PythonParser.BodySectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(PythonParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(PythonParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#tagtype}.
	 * @param ctx the parse tree
	 */
	void enterTagtype(PythonParser.TagtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#tagtype}.
	 * @param ctx the parse tree
	 */
	void exitTagtype(PythonParser.TagtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#startTag}.
	 * @param ctx the parse tree
	 */
	void enterStartTag(PythonParser.StartTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#startTag}.
	 * @param ctx the parse tree
	 */
	void exitStartTag(PythonParser.StartTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#endTag}.
	 * @param ctx the parse tree
	 */
	void enterEndTag(PythonParser.EndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#endTag}.
	 * @param ctx the parse tree
	 */
	void exitEndTag(PythonParser.EndTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(PythonParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(PythonParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(PythonParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(PythonParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#selfClosingtag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingtag(PythonParser.SelfClosingtagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#selfClosingtag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingtag(PythonParser.SelfClosingtagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#tagsDocument}.
	 * @param ctx the parse tree
	 */
	void enterTagsDocument(PythonParser.TagsDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#tagsDocument}.
	 * @param ctx the parse tree
	 */
	void exitTagsDocument(PythonParser.TagsDocumentContext ctx);
}