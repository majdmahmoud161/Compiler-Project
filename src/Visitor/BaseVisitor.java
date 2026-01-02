package Visitor;

import AST.*;
import SympoleTable.Row;
import SympoleTable.SympoleTableClass;
import antlr.PythonParser;
import antlr.PythonParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

public class BaseVisitor extends PythonParserBaseVisitor {

    int currentLine = 0;
    private final SympoleTableClass sympoleTableClass = new SympoleTableClass();

    private void updateLineNumber(ParserRuleContext ctx) {
        if (ctx.getStart() != null) {
            currentLine = ctx.getStart().getLine();
        }
    }
    @Override
    public Program visitProgram(PythonParser.ProgramContext ctx) {
        Program program = new Program();
        for (int i=0 ; i<ctx.state().size() ; i++){
            if(ctx.state(i) != null){
                program.getStates().add((State) visit(ctx.state(i)));
            }
        }
        for(int i=0 ; i<ctx.flask().size() ; i++){
            if(ctx.flask(i) != null){
                program.getFlasks().add((Flask) visit(ctx.flask(i)));
            }
        }
        for(int i=0 ; i<ctx.state_jinja2().size() ;i++){
            if(ctx.state_jinja2(i) != null){
                program.getStateJinja2s().add(visitState_jinja2(ctx.state_jinja2(i)));
            }
        }
        for(int i=0 ; i<ctx.document().size(); i++){
            if(ctx.document(i) != null){
                program.getDocuments().add( (Document) visit (ctx.document(i)));
            }
        }
        sympoleTableClass.print();
        return program;
    }


    @Override
    public Object visitFlaskfragLabel(PythonParser.FlaskfragLabelContext ctx) {
        return visitFlaskfragment(ctx.flaskfragment());
    }

    @Override
    public Object visitFlasklibraryLabel(PythonParser.FlasklibraryLabelContext ctx) {
        return visitFlasklib(ctx.flasklib());
    }

    @Override
    public FlaskLibrary visitFlasklib(PythonParser.FlasklibContext ctx) {
        FlaskLibrary flaskLibrary = new FlaskLibrary();
        if(ctx.flasklibrarydecl() != null){
            flaskLibrary.setFlaskLibraryDecl(visitFlasklibrarydecl(ctx.flasklibrarydecl()));
        }
        if(ctx.utilsdecl() != null){
            flaskLibrary.setUtilesDecl(visitUtilsdecl(ctx.utilsdecl()));
        }
        if(ctx.osdecl() != null){
            flaskLibrary.setOsDecl(visitOsdecl(ctx.osdecl()));
        }
        return flaskLibrary;
    }

    @Override
    public FlaskFragment visitFlaskfragment(PythonParser.FlaskfragmentContext ctx) {
        FlaskFragment flaskFragment = new FlaskFragment();
        flaskFragment.setFlaskLibraryDecl(visitFlasklibrarydecl(ctx.flasklibrarydecl()));
        flaskFragment.setAppDecl(visitAppdecl(ctx.appdecl()));
        if(ctx.flaskstate() != null){
            flaskFragment.setFlaskState(visitFlaskstate(ctx.flaskstate()));
        }
        flaskFragment.setAppRun(visitApprun(ctx.apprun()));
        return flaskFragment;
    }

    @Override
    public FlaskLibraryDecl visitFlasklibrarydecl(PythonParser.FlasklibrarydeclContext ctx) {
        FlaskLibraryDecl flaskLibraryDecl = new FlaskLibraryDecl();

        Row row = new Row();
        flaskLibraryDecl.setFrom(ctx.FROM().getText());
        row.setRow(ctx.FROM().getSymbol().getLine());
        row.setName("FROM");
        row.setValue(ctx.FROM().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        flaskLibraryDecl.setFlaskLib(ctx.FLASKLIB().getText());
        row1.setRow(ctx.FLASKLIB().getSymbol().getLine());
        row1.setName("FLASKLIB");
        row1.setValue(ctx.FLASKLIB().getText());
        row1.setType("KeyWord");
        sympoleTableClass.getRows().add(row1);

        Row row2 = new Row();
        flaskLibraryDecl.setImport(ctx.IMPORT().getText());
        row2.setRow(ctx.IMPORT().getSymbol().getLine());
        row2.setName("IMPORT");
        row2.setValue(ctx.IMPORT().getText());
        row2.setType("KeyWord");
        sympoleTableClass.getRows().add(row2);

        flaskLibraryDecl.setLibraryList(visitLiblist(ctx.liblist()));
        if(ctx.flasklib() != null){
            flaskLibraryDecl.setFlaskLibrary(visitFlasklib(ctx.flasklib()));
        }
        return flaskLibraryDecl;
    }

    @Override
    public OsDecl visitOsdecl(PythonParser.OsdeclContext ctx) {
        OsDecl osDecl = new OsDecl();

        Row row = new Row();
        osDecl.setImport(ctx.IMPORT().getText());
        row.setRow(ctx.IMPORT().getSymbol().getLine());
        row.setName("IMPORT");
        row.setValue(ctx.IMPORT().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        osDecl.setOs(ctx.OS().getText());
        row1.setRow(ctx.OS().getSymbol().getLine());
        row1.setName("OS");
        row1.setValue(ctx.OS().getText());
        row1.setType("KeyWord");
        sympoleTableClass.getRows().add(row1);

        if(ctx.flasklib() != null){
            osDecl.setFlaskLibrary(visitFlasklib(ctx.flasklib()));
        }
        return osDecl;
    }
    @Override
    public UtilesDecl visitUtilsdecl(PythonParser.UtilsdeclContext ctx) {
        UtilesDecl utilesDecl = new UtilesDecl();

        Row row = new Row();
        utilesDecl.setFrom(ctx.FROM().getText());
        row.setRow(ctx.FROM().getSymbol().getLine());
        row.setName("FROM");
        row.setValue(ctx.FROM().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        utilesDecl.setUtiles(ctx.UTILS().getText());
        row1.setRow(ctx.UTILS().getSymbol().getLine());
        row1.setName("UTILS");
        row1.setValue(ctx.UTILS().getText());
        row1.setType("KeyWord");
        sympoleTableClass.getRows().add(row1);

        Row row2 = new Row();
        utilesDecl.setImport(ctx.IMPORT().getText());
        row2.setRow(ctx.IMPORT().getSymbol().getLine());
        row2.setName("IMPORT");
        row2.setValue(ctx.IMPORT().getText());
        row2.setType("KeyWord");
        sympoleTableClass.getRows().add(row2);

        Row row3 = new Row();
        utilesDecl.setSquerfile(ctx.SEQUREFILENAME().getText());
        row3.setRow(ctx.SEQUREFILENAME().getSymbol().getLine());
        row3.setName("SEQUREFILENAME");
        row3.setValue(ctx.SEQUREFILENAME().getText());
        row3.setType("KeyWord");
        sympoleTableClass.getRows().add(row3);

        if(ctx.flasklib() != null){
            utilesDecl.setFlaskLibrary(visitFlasklib(ctx.flasklib()));
        }

        return utilesDecl;
    }

    @Override
    public LibraryList visitLiblist(PythonParser.LiblistContext ctx) {
        LibraryList libraryList = new LibraryList();
        for(int i=0 ; i<ctx.libvalue().size() ; i++){
            if(ctx.libvalue().get(i) != null){
                libraryList.getLibraryValue().add(visitLibvalue(ctx.libvalue().get(i)));
            }
        }
        for(int i=0 ; i<ctx.COMMA().size() ; i++){
            if(ctx.COMMA().get(i) != null){
                Row row = new Row();
                libraryList.getComma().add(ctx.COMMA().get(i).getText());
                row.setRow(ctx.COMMA(i).getSymbol().getLine());
                row.setName("COMMA");
                row.setValue(ctx.COMMA(i).getText());
                row.setType("Sympole");
                sympoleTableClass.getRows().add(row);
            }
        }
        return libraryList;
    }

    @Override
    public LibraryValue visitLibvalue(PythonParser.LibvalueContext ctx) {
        LibraryValue libraryValue = new LibraryValue();
        if(ctx.FLASK() != null){
            Row row = new Row();
            libraryValue.setFlask(ctx.FLASK().getText());
            row.setRow(ctx.FLASK().getSymbol().getLine());
            row.setName("FLASK");
            row.setValue(ctx.FLASK().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);

        } else if (ctx.RENDERTEMPLATE() != null) {
            Row row = new Row();
            libraryValue.setRenderTemplate(ctx.RENDERTEMPLATE().getText());
            row.setRow(ctx.RENDERTEMPLATE().getSymbol().getLine());
            row.setName("RENDERTEMPLATE");
            row.setValue(ctx.RENDERTEMPLATE().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);

        } else if (ctx.REQUEST() != null) {
            libraryValue.setRequest(ctx.REQUEST().getText());
            Row row = new Row();
            row.setRow(ctx.REQUEST().getSymbol().getLine());
            row.setName("REQUEST");
            row.setValue(ctx.REQUEST().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);

        } else if (ctx.URLFOR() != null) {
            libraryValue.setUrlFor(ctx.URLFOR().getText());
            Row row = new Row();
            row.setRow(ctx.URLFOR().getSymbol().getLine());
            row.setName("URLFOR");
            row.setValue(ctx.URLFOR().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        return  libraryValue;
    }

    @Override
    public AppDecl visitAppdecl(PythonParser.AppdeclContext ctx) {
        AppDecl appDecl = new AppDecl();

        Row row = new Row();
        appDecl.setId(ctx.ID().getText());
        row.setRow(ctx.ID().getSymbol().getLine());
        row.setName("ID");
        row.setValue(ctx.ID().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        appDecl.setEquals(ctx.EQUALS().getText());
        row1.setRow(ctx.EQUALS().getSymbol().getLine());
        row1.setName("EQUALS");
        row1.setValue(ctx.EQUALS().getText());
        row1.setType("Operator");
        sympoleTableClass.getRows().add(row1);

        Row row2 = new Row();
        appDecl.setFlask(ctx.FLASK().getText());
        row2.setRow(ctx.FLASK().getSymbol().getLine());
        row2.setName("FLASK");
        row2.setValue(ctx.FLASK().getText());
        row2.setType("KeyWord");
        sympoleTableClass.getRows().add(row2);

        Row row3 = new Row();
        appDecl.setOpenprac(ctx.OPENPRAC().getText());
        row3.setRow(ctx.OPENPRAC().getSymbol().getLine());
        row3.setName("OPENPRAC");
        row3.setValue(ctx.OPENPRAC().getText());
        row3.setType("Sympole");
        sympoleTableClass.getRows().add(row3);

        Row row4 = new Row();
        appDecl.setName(ctx.NAME().getText());
        row4.setRow(ctx.NAME().getSymbol().getLine());
        row4.setName("NAME");
        row4.setValue(ctx.NAME().getText());
        row4.setType("KeyWord");
        sympoleTableClass.getRows().add(row4);

        Row row5 = new Row();
        appDecl.setCloseprac(ctx.CLOSEPRAC().getText());
        row5.setRow(ctx.CLOSEPRAC().getSymbol().getLine());
        row5.setName("CLOSEPRAC");
        row5.setValue(ctx.CLOSEPRAC().getText());
        row5.setType("Sympole");
        sympoleTableClass.getRows().add(row5);

        return appDecl;
    }

    @Override
    public AppRun visitApprun(PythonParser.ApprunContext ctx) {
        AppRun appRun = new AppRun();

        appRun.setIf(ctx.IF().getText());
        Row row = new Row();
        row.setRow(ctx.IF().getSymbol().getLine());
        row.setName("IF");
        row.setType("KeyWord");
        row.setValue(ctx.IF().getText());
        sympoleTableClass.getRows().add(row);

        appRun.setIsequals(ctx.ISEQUALS().getText());
        Row row2 = new Row();
        row2.setRow(ctx.ISEQUALS().getSymbol().getLine());
        row2.setName("ISEQUALS");
        row2.setType("Operator");
        row2.setValue(ctx.ISEQUALS().getText());
        sympoleTableClass.getRows().add(row2);

        appRun.setMain(ctx.MAIN().getText());
        Row row3 = new Row();
        row3.setRow(ctx.MAIN().getSymbol().getLine());
        row3.setName("MAIN");
        row3.setType("KeyWord");
        row3.setValue(ctx.MAIN().getText());
        sympoleTableClass.getRows().add(row3);

        appRun.setColone(ctx.COLONE().getText());
        Row row4 = new Row();
        row4.setRow(ctx.COLONE().getSymbol().getLine());
        row4.setName("COLONE");
        row4.setType("Sympole");
        row4.setValue(ctx.COLONE().getText());
        sympoleTableClass.getRows().add(row4);


        appRun.setId(ctx.ID().getText());
        Row row5 = new Row();
        row5.setRow(ctx.ID().getSymbol().getLine());
        row5.setName("ID");
        row5.setType("Identifier");
        row5.setValue(ctx.MAIN().getText());
        sympoleTableClass.getRows().add(row5);

        appRun.setDot(ctx.DOT().getText());
        Row row6 = new Row();
        row6.setRow(ctx.DOT().getSymbol().getLine());
        row6.setName("DOT");
        row6.setType("Sympole");
        row6.setValue(ctx.DOT().getText());
        sympoleTableClass.getRows().add(row6);


        appRun.setRun(visitRun(ctx.run()));

        return appRun;
    }

    @Override
    public Run visitRun(PythonParser.RunContext ctx) {
        Run run = new Run();

        Row row = new Row();
        run.setRun(ctx.RUN().getText());
        row.setRow(ctx.RUN().getSymbol().getLine());
        row.setName("RUN");
        row.setType("KeyWord");
        row.setValue(ctx.RUN().getText());
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        run.setOpenprac(ctx.OPENPRAC().getText());
        row1.setRow(ctx.OPENPRAC().getSymbol().getLine());
        row1.setName("OPENPRAC");
        row1.setType("Sympole");
        row1.setValue(ctx.OPENPRAC().getText());
        sympoleTableClass.getRows().add(row1);

        Row row2 = new Row();
        run.setDebug(ctx.DEBUG().getText());
        row2.setRow(ctx.DEBUG().getSymbol().getLine());
        row2.setType("Atribute");
        row2.setName(ctx.DEBUG().getText());
        row2.setValue(ctx.TRUEBOOL().getText());
        sympoleTableClass.getRows().add(row2);

        Row row3 = new Row();
        run.setEquals(ctx.EQUALS().getText());
        row3.setRow(ctx.EQUALS().getSymbol().getLine());
        row3.setType("Operator");
        row3.setName("EQUALS");
        row3.setValue(ctx.EQUALS().getText());
        sympoleTableClass.getRows().add(row3);

        run.setTrueBool(ctx.TRUEBOOL().getText());

        Row row4 = new Row();
        run.setCloseprac(ctx.CLOSEPRAC().getText());
        row4.setRow(ctx.CLOSEPRAC().getSymbol().getLine());
        row4.setName("CLOSEPRAC");
        row4.setType("Sympole");
        row4.setValue(ctx.CLOSEPRAC().getText());
        sympoleTableClass.getRows().add(row4);


        return run;
    }

    @Override
    public AppConfig visitAppconfig(PythonParser.AppconfigContext ctx) {
        AppConfig appConfig = new AppConfig();
        for(int i=0 ; i<ctx.ID().size() ; i++){
            if(ctx.ID().get(i) != null){
                Row row = new Row();
                appConfig.getId().add(ctx.ID().toString());
                row.setRow(ctx.ID(i).getSymbol().getLine());
                row.setName("ID");
                row.setValue(ctx.ID(i).getText());
                row.setType("Identifier");
                sympoleTableClass.getRows().add(row);

            }
        }
        Row row = new Row();
        appConfig.setConfig(ctx.CONFIG().getText());
        row.setRow(ctx.CONFIG().getSymbol().getLine());
        row.setName("CONFIG");
        row.setValue(ctx.CONFIG().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        appConfig.setDot(ctx.DOT().getText());
        row1.setRow(ctx.DOT().getSymbol().getLine());
        row1.setName("DOT");
        row1.setValue(ctx.DOT().getText());
        row1.setType("Sympole");
        sympoleTableClass.getRows().add(row1);

        Row row2 = new Row();
        appConfig.setOpensquer(ctx.OPENSQUER().getText());
        row2.setRow(ctx.OPENSQUER().getSymbol().getLine());
        row2.setName("OPENSQUER");
        row2.setValue(ctx.OPENSQUER().getText());
        row2.setType("Sympole");
        sympoleTableClass.getRows().add(row2);

        appConfig.setUPLOADFOLDER(ctx.UPLOADFOLDER().getText());

        Row row3 = new Row();
        appConfig.setClosesquer(ctx.CLOSESQUER().getText());
        row3.setRow(ctx.CLOSESQUER().getSymbol().getLine());
        row3.setName("CLOSESQUER");
        row3.setValue(ctx.CLOSESQUER().getText());
        row3.setType("Sympole");
        sympoleTableClass.getRows().add(row3);

        Row row4 = new Row();
        appConfig.setEquals(ctx.EQUALS().getText());
        row4.setRow(ctx.EQUALS().getSymbol().getLine());
        row4.setName("EQUALS");
        row4.setValue(ctx.EQUALS().getText());
        row4.setType("Operator");
        sympoleTableClass.getRows().add(row4);


        return appConfig;
    }

    @Override
    public FlaskState visitFlaskstate(PythonParser.FlaskstateContext ctx) {
        FlaskState flaskState = new FlaskState();
        for (int i=0 ; i<ctx.routdecl().size() ; i++){
            if(ctx.routdecl().get(i) != null){
                flaskState.getRoutDecls().add((RoutDecl)visitRoutdecl(ctx.routdecl().get(i)));
            }
        }
        for (int i=0 ; i<ctx.state().size() ; i++){
            if(ctx.state().get(i) != null){
                flaskState.getStates().add((State) visit(ctx.state().get(i)));
            }
        }
        for (int i=0 ; i<ctx.appconfig().size() ; i++){
            if(ctx.appconfig().get(i) != null){
                flaskState.getAppConfigs().add((AppConfig) visitAppconfig(ctx.appconfig().get(i)));
            }
        }
        return flaskState;
    }

    @Override
    public RoutState visitRoutestate(PythonParser.RoutestateContext ctx) {
        RoutState routState = new RoutState();
        if(ctx.var_flask_decl() != null){
            routState.setVarFlaskDecl(visitVar_flask_decl(ctx.var_flask_decl()));
        }
        if(ctx.arr_decl() != null){
            routState.setArrDecl(visitArr_decl(ctx.arr_decl()));
        }
        if(ctx.loops() != null){
            routState.setLoops(visitLoops(ctx.loops()));
        }
        if(ctx.flask_exp() != null){
            routState.setFlaskExp(visitFlask_exp(ctx.flask_exp()));
        }
        if(ctx.flask_condition() != null){
            routState.setFlaskCondition(visitFlask_condition(ctx.flask_condition()));
        }
        if(ctx.flask_func_decl() != null){
            routState.setFlaskFuncDecl(visitFlask_func_decl(ctx.flask_func_decl()));
        }
        if(ctx.call_func() != null){
            routState.setCallFunc(visitCall_func(ctx.call_func()));
        }
        if(ctx.object() != null){
            routState.setfObject(visitObject(ctx.object()));
        }
        if(ctx.call_fromclass() != null){
            routState.setCallFromClass(visitCall_fromclass(ctx.call_fromclass()));
        }
        if(ctx.falsk_return() != null){
            routState.setFlaskReturn(visitFalsk_return(ctx.falsk_return()));
        }

        return routState;
    }

    @Override
    public RoutDecl visitRoutdecl(PythonParser.RoutdeclContext ctx) {
        RoutDecl routDecl = new RoutDecl();

        Row row = new Row();
        routDecl.setAt(ctx.AT().getText());
        row.setRow(ctx.AT().getSymbol().getLine());
        row.setType("KeyWord");
        row.setName("AT");
        row.setValue(ctx.AT().getText());
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        routDecl.setId(ctx.ID().getText());
        row1.setRow(ctx.ID().getSymbol().getLine());
        row1.setType("Identifier");
        row1.setName("ID");
        row1.setValue(ctx.ID().getText());
        sympoleTableClass.getRows().add(row1);

        Row row2 = new Row();
        routDecl.setRoute(ctx.ROUTE().getText());
        row2.setRow(ctx.ROUTE().getSymbol().getLine());
        row2.setType("KeyWord");
        row2.setName("ROUTE");
        row2.setValue(ctx.ROUTE().getText());
        sympoleTableClass.getRows().add(row2);

        Row row3 = new Row();
        routDecl.setOpenprac(ctx.OPENPRAC().getText());
        row3.setRow(ctx.OPENPRAC().getSymbol().getLine());
        row3.setType("Sympole");
        row3.setName("OPENPRAC");
        row3.setValue(ctx.OPENPRAC().getText());
        sympoleTableClass.getRows().add(row3);

        Row row4 = new Row();
        routDecl.setRoutepath(ctx.ROUTEPATH().getText());
        row4.setRow(ctx.ROUTEPATH().getSymbol().getLine());
        row4.setType("Attribute");
        row4.setName("ROUTEPATH");
        row4.setValue(ctx.ROUTEPATH().getText());
        sympoleTableClass.getRows().add(row4);

        if(ctx.COMMA() != null){
            Row row5 = new Row();
            routDecl.setComma(ctx.COMMA().getText());
            row5.setRow(ctx.COMMA().getSymbol().getLine());
            row5.setType("Sympole");
            row5.setName("COMMA");
            row5.setValue(ctx.COMMA().getText());
            sympoleTableClass.getRows().add(row5);
        }
        if (ctx.methods() != null){
            routDecl.setMethods((Methods) visitMethods(ctx.methods()));
        }
        if(ctx.CLOSEPRAC() != null){
            Row row5 = new Row();
            routDecl.setCloseprac(ctx.CLOSEPRAC().getText());
            row5.setRow(ctx.CLOSEPRAC().getSymbol().getLine());
            row5.setType("Sympole");
            row5.setName("CLOSEPRAC");
            row5.setValue(ctx.CLOSEPRAC().getText());
            sympoleTableClass.getRows().add(row5);
        }
        for (int i=0 ; i<ctx.routestate().size() ; i++){
            if(ctx.routestate().get(i) != null){
                routDecl.getRoutStates().add((RoutState) visit(ctx.routestate().get(i)));
            }
        }
        return routDecl;
    }

    @Override
    public Methods visitMethods(PythonParser.MethodsContext ctx) {
        Methods methods = new Methods();

        Row row = new Row();
        methods.setMethods(ctx.METHODS().getText());
        row.setRow(ctx.METHODS().getSymbol().getLine());
        row.setName(ctx.METHODS().getText());
        row.setValue(ctx.STRING().toString());
        row.setType("Attribute");
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        methods.setEqual(ctx.EQUALS().getText());
        row1.setRow(ctx.EQUALS().getSymbol().getLine());
        row1.setName("EQUALS");
        row1.setValue(ctx.EQUALS().toString());
        row1.setType("Operator");
        sympoleTableClass.getRows().add(row1);

        Row row2 = new Row();
        methods.setOpensquer(ctx.OPENSQUER().getText());
        row2.setRow(ctx.OPENSQUER().getSymbol().getLine());
        row2.setName("OPENSQUER");
        row2.setValue(ctx.OPENSQUER().toString());
        row2.setType("Sympole");
        sympoleTableClass.getRows().add(row2);

        for(int i=0 ; i<ctx.STRING().size() ; i++){
            if(ctx.STRING().get(i) != null){
                methods.getString().add(ctx.STRING().toString());
            }
        }
        Row row4 = new Row();
        methods.setComma(ctx.COMMA().getText());
        row4.setRow(ctx.COMMA().getSymbol().getLine());
        row4.setName("COMMA");
        row4.setValue(ctx.COMMA().toString());
        row4.setType("Sympole");
        sympoleTableClass.getRows().add(row4);

        Row row3 = new Row();
        methods.setClosesquer(ctx.CLOSESQUER().getText());
        row3.setRow(ctx.CLOSESQUER().getSymbol().getLine());
        row3.setName("CLOSESQUER");
        row3.setValue(ctx.CLOSESQUER().toString());
        row3.setType("Sympole");
        sympoleTableClass.getRows().add(row3);

        return methods;

    }

    @Override
    public VarFlaskDecl visitVar_flask_decl(PythonParser.Var_flask_declContext ctx) {
        VarFlaskDecl varFlaskDecl = new VarFlaskDecl();
        if(ctx.var_decl() != null){
            varFlaskDecl.setVarDecl(visitVar_decl(ctx.var_decl()));
        }
        for(int i=0 ; i<ctx.ID().size() ; i++) {
            if (ctx.ID().get(i) != null) {
                varFlaskDecl.getId().add(ctx.ID().toString());
                Row row = new Row();
                row.setRow(ctx.ID(i).getSymbol().getLine());
                row.setName("ID");
                row.setValue(ctx.ID(i).getText());
                row.setType("Identifier");
                sympoleTableClass.getRows().add(row);
            }
        }
        if(ctx.EQUALS() != null){
            varFlaskDecl.setEquals(ctx.EQUALS().getText());
            Row row = new Row();
            row.setRow(ctx.EQUALS().getSymbol().getLine());
            row.setName("EQUALS");
            row.setValue(ctx.EQUALS().getText());
            row.setType("Operator");
            sympoleTableClass.getRows().add(row);

        }
        if (ctx.route_call() != null){
            varFlaskDecl.setRouteCall(visitRoute_call(ctx.route_call()));
        }
        if(ctx.SEQUREFILENAME() != null){
            varFlaskDecl.setSquerfilename(ctx.SEQUREFILENAME().getText());
            Row row = new Row();
            row.setRow(ctx.SEQUREFILENAME().getSymbol().getLine());
            row.setName("SEQUREFILENAME");
            row.setValue(ctx.SEQUREFILENAME().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.OPENPRAC() != null){
            varFlaskDecl.setOpenprac(ctx.OPENPRAC().getText());
            Row row = new Row();
            row.setRow(ctx.OPENPRAC().getSymbol().getLine());
            row.setName("OPENPRAC");
            row.setValue(ctx.OPENPRAC().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);

        }
        if(ctx.DOT() != null){
            varFlaskDecl.setDot(ctx.DOT().getText());
            Row row = new Row();
            row.setRow(ctx.DOT().getSymbol().getLine());
            row.setName("DOT");
            row.setValue(ctx.DOT().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);

        }
        if(ctx.FILENAME() != null){
            varFlaskDecl.setFilename(ctx.FILENAME().getText());
            Row row = new Row();
            row.setRow(ctx.FILENAME().getSymbol().getLine());
            row.setName("FILENAME");
            row.setValue(ctx.FILENAME().getText());
            row.setType("Attribute");
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.STRING() != null){
            varFlaskDecl.setString(ctx.STRING().getText());
            Row row = new Row();
            row.setRow(ctx.STRING().getSymbol().getLine());
            row.setName("STRING");
            row.setValue(ctx.STRING().getText());
            row.setType("STRING");
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.CLOSEPRAC() != null){
            varFlaskDecl.setCloseprac(ctx.CLOSEPRAC().getText());
            Row row = new Row();
            row.setRow(ctx.CLOSEPRAC().getSymbol().getLine());
            row.setName("CLOSEPRAC");
            row.setValue(ctx.CLOSEPRAC().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);

        }
        return varFlaskDecl;
    }

    @Override
    public VarDecl visitVardecllable(PythonParser.VardecllableContext ctx) {
        return visitVar_decl(ctx.var_decl());
    }

    @Override
    public RouteCall visitRoute_call(PythonParser.Route_callContext ctx) {
        RouteCall routeCall = new RouteCall();

        routeCall.setRequestCall(visitRequestcall(ctx.requestcall()));
        Row row = new Row();
        routeCall.setDot(ctx.DOT().getText());
        row.setRow(ctx.DOT().getSymbol().getLine());
        row.setName("DOT");
        row.setValue(ctx.DOT().getText());
        row.setType("Symbol");
        sympoleTableClass.getRows().add(row);
        routeCall.setCallFunc(visitCall_func(ctx.call_func()));

        return routeCall;
    }
    @Override
    public RequestCall visitRequestcall(PythonParser.RequestcallContext ctx) {
        RequestCall requestCall = new RequestCall();
        Row row = new Row();

        requestCall.setRequest(ctx.REQUEST().getText());
        Row row1 = new Row();
        row1.setRow(ctx.REQUEST().getSymbol().getLine());
        row1.setName("REQUEST");
        row1.setValue(ctx.REQUEST().getText());
        row1.setType("Keyword");
        sympoleTableClass.getRows().add(row1);

        requestCall.setDot(ctx.DOT().getText());
        row.setRow(ctx.DOT().getSymbol().getLine());
        row.setName("DOT");
        row.setValue(ctx.DOT().getText());
        row.setType("Symbol");
        sympoleTableClass.getRows().add(row);

        if(ctx.METHOD() != null){
            requestCall.setMethod(ctx.METHOD().getText());
            Row row2 = new Row();
            row2.setRow(ctx.METHOD().getSymbol().getLine());
            row2.setName("METHOD");
            row2.setValue(ctx.METHOD().getText());
            row2.setType("Attribute");
            sympoleTableClass.getRows().add(row2);

        }
        if(ctx.FORM() != null){
            requestCall.setForm(ctx.FORM().getText());
            Row row2 = new Row();
            row2.setRow(ctx.FORM().getSymbol().getLine());
            row2.setName("FORM");
            row2.setValue(ctx.FORM().getText());
            row2.setType("Attribute");
            sympoleTableClass.getRows().add(row2);
        }
        if(ctx.FILES() != null){
            requestCall.setFiles(ctx.FILES().getText());
            Row row2 = new Row();
            row2.setRow(ctx.FILES().getSymbol().getLine());
            row2.setName("FILES");
            row2.setValue(ctx.FILES().getText());
            row2.setType("Attribute");
            sympoleTableClass.getRows().add(row2);
        }
        return requestCall;
    }

    @Override
    public FlaskCondition visitFlask_condition(PythonParser.Flask_conditionContext ctx) {
        FlaskCondition flaskCondition = new FlaskCondition();
        if(ctx.condition() != null){
            flaskCondition.setCondition(visitCondition(ctx.condition()));
        }
        if(ctx.IF() != null){
            flaskCondition.setIf(ctx.IF().getText());
            Row row = new Row();
            row.setRow(ctx.IF().getSymbol().getLine());
            row.setName("IF");
            row.setValue(ctx.IF().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.flask_exp() != null){
            flaskCondition.setFlaskExp(visitFlask_exp(ctx.flask_exp()));
        }
        if(ctx.COLONE() != null){
            flaskCondition.setColone(ctx.COLONE().getText());
            Row row = new Row();
            row.setRow(ctx.COLONE().getSymbol().getLine());
            row.setName("COLONE");
            row.setValue(ctx.COLONE().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        for(int i=0 ; i<ctx.routestate().size() ; i++){
            if(ctx.routestate().get(i) != null){
                flaskCondition.getRoutState().add((RoutState) visit(ctx.routestate().get(i)));
            }
        }
        return flaskCondition;
    }
    @Override
    public FlaskExp visitFlask_exp(PythonParser.Flask_expContext ctx) {
        FlaskExp flaskExp = new FlaskExp();
        if(ctx.exp() != null){
            flaskExp.setExp((Exp) visitExp(ctx.exp()));
        }
        if(ctx.REQUEST() != null){
            flaskExp.setRequest(ctx.REQUEST().getText());
            Row row = new Row();
            row.setRow(ctx.REQUEST().getSymbol().getLine());
            row.setName("REQUEST");
            row.setValue(ctx.REQUEST().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.DOT() != null){
            flaskExp.setDot(ctx.DOT().getText());
            Row row = new Row();
            row.setRow(ctx.DOT().getSymbol().getLine());
            row.setName("DOT");
            row.setValue(ctx.DOT().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.METHOD() != null){
            flaskExp.setMethod(ctx.METHOD().getText());
            Row row = new Row();
            row.setRow(ctx.METHOD().getSymbol().getLine());
            row.setName("METHOD");
            row.setValue(ctx.METHOD().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.ISEQUALS() != null){
            flaskExp.setIsEqual(ctx.ISEQUALS().getText());
            Row row = new Row();
            row.setRow(ctx.ISEQUALS().getSymbol().getLine());
            row.setName("ISEQUALS");
            row.setValue(ctx.ISEQUALS().getText());
            row.setType("Operator");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.STRING() != null){
            flaskExp.setString(ctx.STRING().getText());
            Row row = new Row();
            row.setRow(ctx.STRING().getSymbol().getLine());
            row.setName("STRING");
            row.setValue(ctx.STRING().getText());
            row.setType("STRING");
            sympoleTableClass.getRows().add(row);
        }

        return flaskExp;
    }

    @Override
    public FlaskFuncDecl visitFlask_func_decl(PythonParser.Flask_func_declContext ctx) {
        FlaskFuncDecl flaskFuncDecl = new FlaskFuncDecl();
        if (ctx.func_decl() != null){
            flaskFuncDecl.setFunctionDecl(visitFunc_decl(ctx.func_decl()));
        }
        for(int i=0 ; i<ctx.routestate().size() ; i++){
            if(ctx.routestate().get(i) != null){
                flaskFuncDecl.getRoutStates().add((RoutState) visit(ctx.routestate(i)));
            }
        }
        if(ctx.falsk_return() != null){
                flaskFuncDecl.setFlaskReturn(visitFalsk_return(ctx.falsk_return()));
        }
        return flaskFuncDecl;
    }

    @Override
    public FlaskReturn visitFalsk_return(PythonParser.Falsk_returnContext ctx) {
        FlaskReturn  flaskReturn = new FlaskReturn();

        flaskReturn.setReturn(ctx.RETURN().getText());
        Row row = new Row();
        row.setRow(ctx.RETURN().getSymbol().getLine());
        row.setName("RETURN");
        row.setValue(ctx.RETURN().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        if(ctx.redirect() != null){
            flaskReturn.setRedirect(visitRedirect(ctx.redirect()));
        }
        if(ctx.rendertemplate() != null){
            flaskReturn.setRenderTemplate(visitRendertemplate(ctx.rendertemplate()));
        }
    return flaskReturn;
    }

    @Override
    public Redirect visitRedirect(PythonParser.RedirectContext ctx) {
        Redirect redirect = new Redirect();
        redirect.setRedirect(ctx.REDIRECT().getText());
        Row row = new Row();
        row.setRow(ctx.REDIRECT().getSymbol().getLine());
        row.setName("REDIRECT");
        row.setValue(ctx.REDIRECT().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        for(int i=0 ; i<ctx.OPENPRAC().size() ; i++){
            redirect.getOpenprac().add(ctx.OPENPRAC(i).getText());
            Row row2 = new Row();
            row2.setRow(ctx.OPENPRAC(i).getSymbol().getLine());
            row2.setName("OPENPRAC");
            row2.setValue(ctx.OPENPRAC(i).getText());
            row2.setType("Symbol");
            sympoleTableClass.getRows().add(row2);

        }
        if(ctx.STRING() != null){
            redirect.getString().add(ctx.STRING().getText());
            Row row1 = new Row();
            row1.setRow(ctx.STRING().getSymbol().getLine());
            row1.setName("STRING");
            row1.setValue(ctx.STRING().getText());
            row1.setType("STRING");
            sympoleTableClass.getRows().add(row1);
        }
        if(ctx.URLFOR() != null){
            redirect.setUrlfor(ctx.URLFOR().getText());
            Row row1 = new Row();
            row1.setRow(ctx.URLFOR().getSymbol().getLine());
            row1.setName("URLFOR");
            row1.setValue(ctx.URLFOR().getText());
            row1.setType("KeyWord");
            sympoleTableClass.getRows().add(row1);

        }
        for(int i=0 ; i<ctx.CLOSEPRAC().size() ; i++){
            redirect.getCloseprac().add(ctx.CLOSEPRAC(i).getText());
            Row row3 = new Row();
            row3.setRow(ctx.CLOSEPRAC(i).getSymbol().getLine());
            row3.setName("CLOSEPRAC");
            row3.setValue(ctx.CLOSEPRAC(i).getText());
            row3.setType("Symbol");
            sympoleTableClass.getRows().add(row3);
        }
        return redirect;
    }

    @Override
    public RenderTemplate visitRendertemplate(PythonParser.RendertemplateContext ctx) {
        RenderTemplate renderTemplate = new RenderTemplate();
        renderTemplate.setRendertemplate(ctx.RENDERTEMPLATE().getText());
        Row row = new Row();
        row.setRow(ctx.RENDERTEMPLATE().getSymbol().getLine());
        row.setName("RENDERTEMPLATE");
        row.setValue(ctx.RENDERTEMPLATE().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        for (int i=0 ; i<ctx.OPENPRAC().size() ; i++){
            renderTemplate.getOpenprac().add(ctx.OPENPRAC(i).getText());
            Row row2 = new Row();
            row2.setRow(ctx.OPENPRAC(i).getSymbol().getLine());
            row2.setName("OPENPRAC");
            row2.setValue(ctx.OPENPRAC(i).getText());
            row2.setType("Symbol");
            sympoleTableClass.getRows().add(row2);
        }
        if(ctx.STRING() != null){
            renderTemplate.getString().add(ctx.STRING().getText());
            Row row1 = new Row();
            row1.setRow(ctx.STRING().getSymbol().getLine());
            row1.setName("STRING");
            row1.setValue(ctx.STRING().getText());
            row1.setType("STRING");
            sympoleTableClass.getRows().add(row1);
        }
        if(ctx.URLFOR() != null){
            renderTemplate.setUrlfor(ctx.URLFOR().getText());
            Row row1 = new Row();
            row1.setRow(ctx.URLFOR().getSymbol().getLine());
            row1.setName("URLFOR");
            row1.setValue(ctx.URLFOR().getText());
            row1.setType("KeyWord");
            sympoleTableClass.getRows().add(row1);
        }
        if (ctx.COMMA() != null){
            renderTemplate.setComma(ctx.COMMA().getText());
            Row row1 = new Row();
            row1.setRow(ctx.COMMA().getSymbol().getLine());
            row1.setName("COMMA");
            row1.setValue(ctx.COMMA().getText());
            row1.setType("Symbol");
            sympoleTableClass.getRows().add(row1);
        }
        if (ctx.EQUALS() != null){
            renderTemplate.setEquals(ctx.EQUALS().getText());
            Row row1 = new Row();
            row1.setRow(ctx.EQUALS().getSymbol().getLine());
            row1.setName("EQUALS");
            row1.setValue(ctx.EQUALS().getText());
            row1.setType("operator");
            sympoleTableClass.getRows().add(row1);
        }
        for (int i=0 ; i<ctx.ID().size() ; i++){
            renderTemplate.getId().add(ctx.ID(i).getText());
            Row row1 = new Row();
            row.setType("Identifier");
            row.setName("ID");
            row1.setValue(ctx.ID(i).getText());
            sympoleTableClass.getRows().add(row1);
        }
        for (int i=0 ; i<ctx.CLOSEPRAC().size() ; i++){
            renderTemplate.getCloseprac().add(ctx.CLOSEPRAC(i).getText());
            Row row3 = new Row();
            row3.setRow(ctx.CLOSEPRAC(i).getSymbol().getLine());
            row3.setName("CLOSEPRAC");
            row3.setValue(ctx.CLOSEPRAC(i).getText());
            row3.setType("Symbol");
            sympoleTableClass.getRows().add(row3);
        }
        return renderTemplate;
    }



    @Override
    public AppendFunc visitAppendfunc(PythonParser.AppendfuncContext ctx) {
        AppendFunc appendFunc = new AppendFunc();

        Row row = new Row();
        appendFunc.setAppend(ctx.APPEND().getText());
        row.setRow(ctx.APPEND().getSymbol().getLine());
        row.setName("Append");
        row.setValue(ctx.APPEND().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        appendFunc.setOpenprac(ctx.OPENPRAC().getText());
        row1.setRow(ctx.OPENPRAC().getSymbol().getLine());
        row1.setName("OPENPRAC");
        row1.setValue(ctx.OPENPRAC().getText());
        row1.setType("Symbol");
        sympoleTableClass.getRows().add(row1);

        if(ctx.appendvar() != null){
            appendFunc.setAppendvar(visitAppendvar(ctx.appendvar()));
        }
        Row row2 = new Row();
        appendFunc.setCloseprac(ctx.CLOSEPRAC().getText());
        row2.setRow(ctx.CLOSEPRAC().getSymbol().getLine());
        row2.setName("CLOSEPRAC");
        row2.setValue(ctx.CLOSEPRAC().getText());
        row2.setType("Symbol");
        sympoleTableClass.getRows().add(row2);

        return appendFunc;
    }

    @Override
    public AppendVar visitAppendvar(PythonParser.AppendvarContext ctx) {
        AppendVar appendVar = new AppendVar();
        appendVar.setOpenprac(ctx.OPENKPRA().getText());
        Row row = new Row();
        row.setRow(ctx.OPENKPRA().getSymbol().getLine());
        row.setName("OPENKPRA");
        row.setValue(ctx.OPENKPRA().getText());
        row.setType("symbol");
        sympoleTableClass.getRows().add(row);

        for(int i=0 ;i<ctx.appendparlist().size() ; i++){
            if(ctx.appendparlist(i) != null){
                appendVar.getAppendParLists().add(visitAppendparlist(ctx.appendparlist(i)));
            }
        }
        for(int i=0 ;i<ctx.COMMA().size() ; i++){
            if(ctx.COMMA(i) != null){
                appendVar.getComma().add(ctx.COMMA(i).getText());
                Row row1 = new Row();
                row1.setRow(ctx.COMMA(i).getSymbol().getLine());
                row1.setName("COMMA");
                row1.setValue(ctx.COMMA(i).getText());
                row1.setType("symbol");
                sympoleTableClass.getRows().add(row1);
            }
        }
        appendVar.setCloseprac(ctx.CLOSEKPRA().getText());
        Row row2 = new Row();
        row2.setRow(ctx.CLOSEKPRA().getSymbol().getLine());
        row2.setName("CLOSEKPRA");
        row2.setValue(ctx.CLOSEKPRA().getText());
        row2.setType("symbol");
        sympoleTableClass.getRows().add(row2);

        return appendVar;
    }

    @Override
    public AppendParList visitAppendparlist(PythonParser.AppendparlistContext ctx) {
        AppendParList appendParList = new AppendParList();
        for (int i=0 ; i<ctx.ID().size() ; i++){
            if(ctx.ID(i) != null){
                appendParList.getId().add(ctx.ID(i).getText());
                Row row = new Row();
                row.setRow(ctx.ID(i).getSymbol().getLine());
                row.setName("ID");
                row.setType("Identifier");
                row.setValue(ctx.ID(i).getText());
            }
        }
        appendParList.setColone(ctx.COLONE().getText());
        Row row = new Row();
        row.setRow(ctx.COLONE().getSymbol().getLine());
        row.setName("COLONE");
        row.setValue(ctx.COLONE().getText());
        row.setType("symbol");
        sympoleTableClass.getRows().add(row);

        if(ctx.LEN() != null){
            appendParList.setLen(ctx.LEN().getText());
            Row row1 = new Row();
            row1.setRow(ctx.LEN().getSymbol().getLine());
            row1.setName("LEN");
            row1.setValue(ctx.LEN().getText());
            row1.setType("KeyWord");
            sympoleTableClass.getRows().add(row1);
        }
        if(ctx.OPENPRAC() != null){
            appendParList.setOpenprac(ctx.OPENPRAC().getText());
            Row row2 = new Row();
            row2.setRow(ctx.OPENPRAC().getSymbol().getLine());
            row2.setName("OPENKPRA");
            row2.setValue(ctx.OPENPRAC().getText());
            row2.setType("symbol");
            sympoleTableClass.getRows().add(row2);
        }
        if(ctx.CLOSEPRAC() != null){
            appendParList.setCloseprac(ctx.CLOSEPRAC().getText());
            Row row2 = new Row();
            row2.setRow(ctx.CLOSEPRAC().getSymbol().getLine());
            row2.setName("CLOSEPRAC");
            row2.setValue(ctx.CLOSEPRAC().getText());
            row2.setType("symbol");
            sympoleTableClass.getRows().add(row2);
        }
        return appendParList;
    }

//Python

    @Override
    public Object visitFuncDeclLable(PythonParser.FuncDeclLableContext ctx) {
        return visitFunc_decl(ctx.func_decl());
    }

    @Override
    public FunctionDeclrationPython visitFunc_decl(PythonParser.Func_declContext ctx) {
        FunctionDeclrationPython fd= new FunctionDeclrationPython();
        Row row = new Row();
        fd.setDef(ctx.DEF().toString());
        row.setRow(ctx.DEF().getSymbol().getLine());
        row.setName("Def");
        row.setValue(ctx.DEF().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        fd.setId(ctx.ID().toString());
        row1.setRow(ctx.ID().getSymbol().getLine());
        row1.setName("ID");
        row1.setValue(ctx.ID().getText());
        row1.setType("Identifier");
        sympoleTableClass.getRows().add(row1);

        Row row2 = new Row();
        fd.setOpenPrac(ctx.OPENPRAC().toString());
        row2.setRow(ctx.OPENPRAC().getSymbol().getLine());
        row2.setName("OPENPRAC");
        row2.setValue(ctx.OPENPRAC().getText());
        row2.setType("Sympole");
        sympoleTableClass.getRows().add(row2);

        if (ctx.paralist()!=null){
            fd.setParaList(visitParalist(ctx.paralist()));
        }
        Row row3 = new Row();
        fd.setClosePrac(ctx.CLOSEPRAC().toString());
        row3.setRow(ctx.CLOSEPRAC().getSymbol().getLine());
        row3.setName("CLOSEPRAC");
        row3.setValue(ctx.CLOSEPRAC().getText());
        row3.setType("Sympole");
        sympoleTableClass.getRows().add(row3);

        Row row4 = new Row();
        fd.setColone(ctx.COLONE().toString());
        row4.setRow(ctx.COLONE().getSymbol().getLine());
        row4.setName("COLONE");
        row4.setValue(ctx.COLONE().getText());
        row4.setType("Sympole");
        sympoleTableClass.getRows().add(row4);
        for (int i=0;i<ctx.state().size();i++){
            if (ctx.state().get(i) != null){
                fd.getStates().add((State) visit(ctx.state().get(i)));
            }
        }
        if (ctx.return_()!=null){
            fd.setReturnp(visitReturn(ctx.return_()));
        }
        return fd;
    }
    @Override
    public Exp visitExp(PythonParser.ExpContext ctx) {
        Exp e= new Exp();
        if (ctx.POW()!=null){
            e.setPow(ctx.POW().toString());
            Row row = new Row();
            row.setRow(ctx.POW().getSymbol().getLine());
            row.setName("POW");
            row.setType("Operator");
            row.setValue(ctx.POW().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.MULT()!=null){
            e.setMult(ctx.MULT().toString());
            Row row = new Row();
            row.setRow(ctx.MULT().getSymbol().getLine());
            row.setName("MULT");
            row.setType("Operator");
            row.setValue(ctx.MULT().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.DIVISION()!=null){
            e.setDivision(ctx.DIVISION().toString());
            Row row = new Row();
            row.setRow(ctx.DIVISION().getSymbol().getLine());
            row.setName("DIVISION");
            row.setType("Operator");
            row.setValue(ctx.DIVISION().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.MOD()!=null){
            e.setMod(ctx.MOD().toString());
            Row row = new Row();
            row.setRow(ctx.MOD().getSymbol().getLine());
            row.setName("MOD");
            row.setType("Operator");
            row.setValue(ctx.MOD().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.SUM()!=null){
            e.setSum(ctx.SUM().toString());
            Row row = new Row();
            row.setRow(ctx.SUM().getSymbol().getLine());
            row.setName("SUM");
            row.setType("Operator");
            row.setValue(ctx.SUM().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.SUB()!=null){
            e.setSub(ctx.SUB().toString());
            Row row = new Row();
            row.setRow(ctx.SUB().getSymbol().getLine());
            row.setName("SUB");
            row.setType("Operator");
            row.setValue(ctx.SUB().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.ISEQUALS()!=null){
            e.setIsequals(ctx.ISEQUALS().toString());
            Row row = new Row();
            row.setRow(ctx.ISEQUALS().getSymbol().getLine());
            row.setName("ISEQUALS");
            row.setType("Operator");
            row.setValue(ctx.ISEQUALS().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.ISGRATER()!=null){
            e.setIsgrater(ctx.ISGRATER().toString());
            Row row = new Row();
            row.setRow(ctx.ISGRATER().getSymbol().getLine());
            row.setName("ISGRATER");
            row.setType("Operator");
            row.setValue(ctx.ISGRATER().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.ISSMALLER()!=null){
            e.setIssmaller(ctx.ISSMALLER().toString());
            Row row = new Row();
            row.setRow(ctx.ISSMALLER().getSymbol().getLine());
            row.setName("ISSMALLER");
            row.setType("Operator");
            row.setValue(ctx.ISSMALLER().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.OR()!=null){
            e.setOr(ctx.OR().toString());
            Row row = new Row();
            row.setRow(ctx.OR().getSymbol().getLine());
            row.setName("OR");
            row.setType("Operator");
            row.setValue(ctx.OR().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.AND()!=null){
            e.setAnd(ctx.AND().toString());
            Row row = new Row();
            row.setRow(ctx.AND().getSymbol().getLine());
            row.setName("AND");
            row.setType("Operator");
            row.setValue(ctx.AND().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.IS()!=null){
            e.setIs(ctx.IS().toString());
            Row row = new Row();
            row.setRow(ctx.IS().getSymbol().getLine());
            row.setName("IS");
            row.setType("Operator");
            row.setValue(ctx.IS().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.IFGREATEROREQUALS()!=null){
            e.setIfgreaterorequals(ctx.IFGREATEROREQUALS().toString());
            Row row = new Row();
            row.setRow(ctx.IFGREATEROREQUALS().getSymbol().getLine());
            row.setName("IFGREATEROREQUALS");
            row.setType("Operator");
            row.setValue(ctx.IFGREATEROREQUALS().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.IFSMALLEROREQUALS()!=null){
            e.setIfsmallerorequals(ctx.IFSMALLEROREQUALS().toString());
            Row row = new Row();
            row.setRow(ctx.IFSMALLEROREQUALS().getSymbol().getLine());
            row.setName("IFSMALLEROREQUALS");
            row.setType("Operator");
            row.setValue(ctx.IFSMALLEROREQUALS().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.INT()!=null){
            e.setInt(ctx.INT().toString());
            Row row = new Row();
            row.setRow(ctx.INT().getSymbol().getLine());
            row.setName("INT");
            row.setType("Value");
            row.setValue(ctx.INT().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.DOT()!=null){
            e.setDot(ctx.DOT().toString());
            Row row = new Row();
            row.setRow(ctx.DOT().getSymbol().getLine());
            row.setName("DOT");
            row.setType("Symbol");
            row.setValue(ctx.DOT().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.STRING()!=null){
            e.setString(ctx.STRING().toString());
            Row row = new Row();
            row.setRow(ctx.STRING().getSymbol().getLine());
            row.setName("STRING");
            row.setType("value");
            row.setValue(ctx.STRING().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.TRUEBOOL()!=null){
            e.setTruebool(ctx.TRUEBOOL().toString());
            Row row = new Row();
            row.setRow(ctx.TRUEBOOL().getSymbol().getLine());
            row.setName("TRUEBOOL");
            row.setType("value");
            row.setValue(ctx.TRUEBOOL().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.FALSEBOOL()!=null){
            e.setFalsebool(ctx.FALSEBOOL().toString());
            Row row = new Row();
            row.setRow(ctx.FALSEBOOL().getSymbol().getLine());
            row.setName("FALSEBOOL");
            row.setType("value");
            row.setValue(ctx.FALSEBOOL().getText());
            sympoleTableClass.getRows().add(row);
        }
        if (ctx.NONE()!=null){
            e.setNone(ctx.NONE().toString());
            Row row = new Row();
            row.setRow(ctx.NONE().getSymbol().getLine());
            row.setName("NONE");
            row.setType("value");
            row.setValue(ctx.NONE().getText());
            sympoleTableClass.getRows().add(row);
        }
        for (int i=0;i<ctx.ID().size();i++){
            if (ctx.ID().get(i)!= null){
                e.getId().add(ctx.ID().toString());
                Row row = new Row();
                row.setRow(ctx.ID(i).getSymbol().getLine());
                row.setName("ID");
                row.setType("Identifier");
                row.setValue(ctx.ID(i).getText());
                sympoleTableClass.getRows().add(row);
            }
        }
        if(ctx.arr() != null){
            e.setArrayPython(visitArr(ctx.arr()));
        }
        for (int i=0;i<ctx.exp().size();i++){
            if (ctx.exp(i)!=null){
                e.getExp().add(visitExp(ctx.exp(i)));
            }
        }

        return e;
    }

    @Override
    public Condition visitCondition(PythonParser.ConditionContext ctx) {
        Condition condition = new Condition();
        if(ctx.if_() != null){
            condition.setIfPython(visitIf(ctx.if_()));
        }
        if(ctx.elif() != null){
            condition.setElifPython(visitElif(ctx.elif()));
        }
        if(ctx.else_() != null){
            condition.setElsePython(visitElse(ctx.else_()));
        }
        return condition;
    }


    @Override
    public VarDecl visitVar_decl(PythonParser.Var_declContext ctx) {
        Row VarDelRow = new Row();


        updateLineNumber(ctx);
        VarDecl varDecl = new VarDecl();
        updateLineNumber(ctx);

        if(ctx.ID() != null){
            varDecl.setId(ctx.ID().getText());
            VarDelRow.setRow(ctx.ID().getSymbol().getLine());
            VarDelRow.setName(ctx.ID().getText());
            VarDelRow.setType("Identifier");
            sympoleTableClass.getRows().add(VarDelRow);
        }
        if(ctx.arr() != null){
            varDecl.setArr(visitArr(ctx.arr()));
        }
        if(ctx.EQUALS() != null){
            Row VarDelRow2 = new Row();
            varDecl.setEquals(ctx.EQUALS().getText());
            VarDelRow2.setRow(currentLine);
            VarDelRow2.setType("Operator");
            VarDelRow2.setName("Asign");
            VarDelRow2.setValue(ctx.EQUALS().getText());
            sympoleTableClass.getRows().add(VarDelRow2);
        }
        if(ctx.value() != null){
            varDecl.setValue(visitValue(ctx.value()));
            VarDelRow.setValue(ctx.value().getText());
        }
        if(ctx.exp() != null){
            varDecl.setExp(visitExp(ctx.exp()));
            VarDelRow.setValue(ctx.exp().getText());
        }



        return varDecl;
    }

    @Override
    public Value visitValue(PythonParser.ValueContext ctx) {
        Row row = new Row();
        Value value = new Value();
        if(ctx.INT() != null){
            value.setInt(ctx.INT().getText());
            row.setRow(ctx.INT().getSymbol().getLine());
            row.setName("INT");
            row.setValue(ctx.INT().getText());
            row.setType("Integer");
        }
        if(ctx.DOUBLE() != null){
            value.setDouble(ctx.DOUBLE().getText());
            row.setRow(ctx.DOUBLE().getSymbol().getLine());
            row.setName("DOUBLE");
            row.setValue(ctx.DOUBLE().getText());
            row.setType("Double");
        }
        if(ctx.ID() != null){
            value.setId(ctx.ID().getText());
            row.setRow(ctx.ID().getSymbol().getLine());
            row.setName("ID");
            row.setValue(ctx.ID().getText());
            row.setType("Identifier");
        }
        if(ctx.STRING() != null){
            value.setString(ctx.STRING().getText());
            row.setRow(ctx.STRING().getSymbol().getLine());
            row.setName("STRING");
            row.setValue(ctx.STRING().getText());
            row.setType("String");
        }
        if(ctx.arr() != null){
            value.setArr(visitArr(ctx.arr()));
        }
        if(ctx.TRUEBOOL() != null){
            value.setTruebool(ctx.TRUEBOOL().getText());
            row.setRow(ctx.TRUEBOOL().getSymbol().getLine());
            row.setName("TRUEBOOL");
            row.setValue(ctx.TRUEBOOL().getText());
            row.setType("Bool");
        }
        if(ctx.FALSEBOOL() != null){
            value.setFalsebool(ctx.FALSEBOOL().getText());
            row.setRow(ctx.FALSEBOOL().getSymbol().getLine());
            row.setName("FALSEBOOL");
            row.setValue(ctx.FALSEBOOL().getText());
            row.setType("Bool");
        }
        if(ctx.NONE() != null){
            value.setNone(ctx.NONE().getText());
            row.setRow(ctx.NONE().getSymbol().getLine());
            row.setName("NONE");
            row.setValue(ctx.NONE().getText());
            row.setType("None");
        }
        sympoleTableClass.getRows().add(row);
        return value;
    }
    @Override
    public Arr visitArr(PythonParser.ArrContext ctx) {
        Row row = new Row();
        Row row2 = new Row();

        Arr arr = new Arr();

        if(ctx.ID() != null){
            arr.setId(ctx.ID().getText());
        }
        arr.setOpensquer(ctx.OPENSQUER().getText());
        row.setRow(currentLine);
        row.setName("OPENSQUER");
        row.setType("Sympole");
        row.setValue(ctx.OPENSQUER().getText());

        for(int i=0 ; i<ctx.value().size() ; i++){
            arr.getValues().add(visitValue(ctx.value(i)));
        }
        for(int i=0 ; i<ctx.COMMA().size() ; i++){
            Row row3 = new Row();
            arr.getComma().add(ctx.COMMA(i).getText());
            row3.setRow(currentLine);
            row3.setName("Comma");
            row3.setType("Sympole");
            row3.setValue(ctx.COMMA(i).toString());
            sympoleTableClass.getRows().add(row3);
        }


        arr.setClosesquer(ctx.CLOSESQUER().getText());
        row2.setRow(currentLine);
        row2.setName("CLOSESQUER");
        row2.setType("Sympole");
        row2.setValue(ctx.CLOSESQUER().getText());

        sympoleTableClass.getRows().add(row);
        sympoleTableClass.getRows().add(row2);

        return arr;
    }

    @Override
    public Object visitArrdecllable(PythonParser.ArrdecllableContext ctx) {
        return visitArr_decl(ctx.arr_decl());
    }

    @Override
    public ArrDecl visitArr_decl(PythonParser.Arr_declContext ctx) {
        ArrDecl arr = new ArrDecl();

        if(ctx.ID() != null){
            arr.setId(ctx.ID().getText());
        }
        arr.setEquals(ctx.EQUALS().getText());
        arr.setOpensquer(ctx.OPENSQUER().getText());
        for(int i=0 ; i<ctx.value().size() ; i++){
            arr.getValues().add(visitValue(ctx.value(i)));
        }
        for(int i=0 ; i<ctx.COMMA().size() ; i++){
            arr.getComma().add(ctx.COMMA(i).getText());
        }
        arr.setClosesquer(ctx.CLOSESQUER().getText());

        return arr;
    }

    @Override
    public Object visitCallFuncLable(PythonParser.CallFuncLableContext ctx) {
        return visitCall_func(ctx.call_func());
    }

    @Override
    public Callfunction visitCall_func(PythonParser.Call_funcContext ctx) {
        Callfunction callfunction = new Callfunction();
        if(ctx.ID() != null){
            Row row = new Row();
            callfunction.setId(ctx.ID().toString());
            row.setRow(ctx.ID().getSymbol().getLine());
            row.setName("ID");
            row.setValue(ctx.ID().getText());
            row.setType("Identifier");
            sympoleTableClass.getRows().add(row);
        }
        Row row1 = new Row();
        if(ctx.OPENPRAC() != null){
            callfunction.setOpenprac(ctx.OPENPRAC().toString());
            row1.setRow(ctx.OPENPRAC().getSymbol().getLine());
            row1.setName("OPENPRAC");
            row1.setValue(ctx.OPENPRAC().getText());
            row1.setType("Sympole");
            sympoleTableClass.getRows().add(row1);
        }
        if(ctx.CLOSEPRAC() !=null){
            Row row2 = new Row();
            callfunction.setCloseprac(ctx.CLOSEPRAC().toString());
            row2.setRow(ctx.CLOSEPRAC().getSymbol().getLine());
            row2.setName("CLOSEPRAC");
            row2.setValue(ctx.CLOSEPRAC().getText());
            row2.setType("Sympole");
            sympoleTableClass.getRows().add(row2);
        }

        if(ctx.build_in_func() != null){
            callfunction.setBuildinfunc(visitBuild_in_func(ctx.build_in_func()));
        }
        if (ctx.paralist() != null) {
            callfunction.setParaList(visitParalist(ctx.paralist()));
        }
        if (ctx.appendfunc()!=null){
            callfunction.setAppendfunc(visitAppendfunc(ctx.appendfunc()));
        }
        return callfunction;
    }

    @Override
    public ParaList visitParalist(PythonParser.ParalistContext ctx) {
        ParaList paraList = new ParaList();
        for (int i=0 ; i<ctx.value().size() ; i++){
            if(ctx.value(i) != null){
                paraList.getValues().add(visitValue(ctx.value(i)));
            }
        }
        for (int i=0 ;i<ctx.COMMA().size() ;i++){
            Row row = new Row();
            if(ctx.COMMA(i) != null){
                paraList.getComma().add(ctx.COMMA(i).getText());
            }
            row.setRow(ctx.COMMA(i).getSymbol().getLine());
            row.setName("COMMA");
            row.setType("Sympole");
            sympoleTableClass.getRows().add(row);
        }
        return paraList;
    }

    @Override
    public Buildinfunc visitBuild_in_func(PythonParser.Build_in_funcContext ctx) {
        Row row = new Row();
        Buildinfunc buildinfunc= new Buildinfunc();
        if(ctx.GET() != null){
            buildinfunc.setGet(ctx.GET().toString());

            row.setRow(ctx.GET().getSymbol().getLine());
            row.setName("GET");
            row.setValue(ctx.GET().getText());
            row.setType("KeyWord");
        }
        if(ctx.INPUT() != null){
            buildinfunc.setInput(ctx.INPUT().toString());
            row.setRow(ctx.INPUT().getSymbol().getLine());
            row.setName("INPUT");
            row.setValue(ctx.INPUT().getText());
            row.setType("KeyWord");
        }
        if(ctx.LEN() != null){
            buildinfunc.setLen(ctx.LEN().toString());

            row.setRow(ctx.LEN().getSymbol().getLine());
            row.setName("LEN");
            row.setValue(ctx.LEN().getText());
            row.setType("KeyWord");
        }
        if(ctx.POP() != null){
            buildinfunc.setPop(ctx.POP().toString());

            row.setRow(ctx.POP().getSymbol().getLine());
            row.setName("POP");
            row.setValue(ctx.POP().getText());
            row.setType("KeyWord");
        }
        if(ctx.TYPE() != null){
            buildinfunc.setType(ctx.TYPE().toString());

            row.setRow(ctx.TYPE().getSymbol().getLine());
            row.setName("TYPE");
            row.setValue(ctx.TYPE().getText());
            row.setType("KeyWord");
        }
        if(ctx.PRINT() != null){
            buildinfunc.setPrint(ctx.PRINT().toString());

            row.setRow(ctx.PRINT().getSymbol().getLine());
            row.setName("PRINT");
            row.setValue(ctx.PRINT().getText());
            row.setType("KeyWord");
        }
        sympoleTableClass.getRows().add(row);
        return buildinfunc;
    }
    @Override
    public Loops visitLoopslable(PythonParser.LoopslableContext ctx) {
        return visitLoops(ctx.loops());
    }

    @Override
    public WhileValue visitWhile_value(PythonParser.While_valueContext ctx) {
        WhileValue w = new WhileValue();
        if (ctx.INT()!=null){
            w.setInt(ctx.INT().toString());
        }
        if (ctx.DOUBLE()!=null){
            w.setDouble(ctx.DOUBLE().toString());
        }
        if (ctx.ID()!=null){
            w.setId(ctx.ID().toString());
        }
        if (ctx.FALSEBOOL()!=null){
            w.setFalsebool(ctx.FALSEBOOL().toString());
        }
        if (ctx.STRING()!=null){
            w.setString(ctx.STRING().toString());
        }
        if (ctx.TRUEBOOL()!=null){
            w.setTruebool(ctx.TRUEBOOL().toString());
        }
        if(ctx.exp() != null){
            w.setExp((Exp) visitExp(ctx.exp()));
        }
        return w;
    }

    @Override
    public Object visitConditionLable(PythonParser.ConditionLableContext ctx) {
        return visitCondition(ctx.condition());
    }

    @Override
    public Loops visitLoops(PythonParser.LoopsContext ctx) {
        Loops l = new Loops();
        if (ctx.for_()!=null){
            l.setaFor(visitFor(ctx.for_()));}
        if (ctx.while_()!=null){
            l.setaWhile(visitWhile(ctx.while_()));}
        return l;
    }

    @Override
    public For visitFor(PythonParser.ForContext ctx) {
        Row row = new Row();
        Row row2 = new Row();
        Row row9 = new Row();
        For f= new For();
        updateLineNumber(ctx);

        f.setaFor(ctx.FOR().toString());
        row.setName("FOR");
        row.setRow(currentLine);
        row.setValue(ctx.FOR().getText());
        row.setType("KeyWord");

        f.setIn(ctx.IN().toString());
        row2.setName("IN");
        row2.setRow(currentLine);
        row2.setValue(ctx.IN().getText());
        row2.setType("KeyWord");

        f.setColone(ctx.COLONE().toString());
        row9.setName("COLONE");
        row9.setRow(currentLine);
        row9.setValue(ctx.COLONE().getText());
        row9.setType("Symbol");

        if (ctx.RANGE()!=null){
            Row row3 = new Row();
            f.setRange(ctx.RANGE().toString());
            row3.setName("RANGE");
            row3.setRow(currentLine);
            row3.setValue(ctx.RANGE().getText());
            row3.setType("KeyWord");
            sympoleTableClass.getRows().add(row3);

        }
        if (ctx.INT()!=null){
            f.setInt(ctx.INT().toString());
            Row row4 = new Row();
            row4.setName("Value");
            row4.setRow(currentLine);
            row4.setValue(ctx.INT().getText());
            row4.setType("Integer");
            sympoleTableClass.getRows().add(row4);
        }
        if (ctx.OPENPRAC()!=null){
            Row row5 = new Row();
            f.setOpenprac(ctx.OPENPRAC().toString());
            row5.setRow(currentLine);
            row5.setName("OPENPRAC");
            row5.setType("Sympole");
            row5.setValue(ctx.OPENPRAC().getText());
            sympoleTableClass.getRows().add(row5);
        }
        if (ctx.CLOSEPRAC()!=null){
            Row row6 = new Row();
            f.setCloseprac(ctx.CLOSEPRAC().toString());
            row6.setRow(currentLine);
            row6.setName("CLOSEPRAC");
            row6.setType("Sympole");
            row6.setValue(ctx.CLOSEPRAC().getText());
            sympoleTableClass.getRows().add(row6);
        }
        if (ctx.BREAK()!=null){
            Row row7 = new Row();
            f.setaBreak(ctx.BREAK().toString());
            row7.setName("BREAK");
            row7.setRow(ctx.BREAK().getSymbol().getLine());
            row7.setValue(ctx.BREAK().getText());
            row7.setType("KeyWord");
            sympoleTableClass.getRows().add(row7);
        }
        if (ctx.CONTINUE()!=null){
            Row row7 = new Row();
            f.setaCountinue(ctx.CONTINUE().toString());
            row7.setName("CONTINUE");
            row7.setRow(ctx.CONTINUE().getSymbol().getLine());
            row7.setValue(ctx.CONTINUE().getText());
            row7.setType("KeyWord");
            sympoleTableClass.getRows().add(row7);
        }
        for (int i=0;i<ctx.ID().size();i++){
            if (ctx.ID().get(i)!=null){
                Row row8 = new Row();
                f.getId().add(ctx.ID().toString());
                row8.setName("ID");
                row8.setRow(currentLine);
                row8.setValue(ctx.ID().get(i).getText());
                row8.setType("Idenifier");
                sympoleTableClass.getRows().add(row8);
            }
        }
        for (int i=0;i<ctx.state().size();i++){
            if (ctx.state().get(i)!=null){
                f.getStates().add((State) visit(ctx.state().get(i)));

            }
        }
        sympoleTableClass.getRows().add(row);
        sympoleTableClass.getRows().add(row2);
        sympoleTableClass.getRows().add(row9);
        return f;
    }

    @Override
    public While visitWhile(PythonParser.WhileContext ctx) {
        updateLineNumber(ctx);
        While w = new While();
        Row row = new Row();
        w.setaWhile(ctx.WHILE().toString());
        row.setRow(ctx.WHILE().getSymbol().getLine());
        row.setName("While");
        row.setValue(ctx.WHILE().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);
        if (ctx.BREAK()!=null){
            Row row3 = new Row();
            w.setaBreak(ctx.BREAK().toString());
            row3.setName("BREAK");
            row3.setRow(ctx.BREAK().getSymbol().getLine());
            row3.setValue(ctx.BREAK().getText());
            row3.setType("BREAK");
            sympoleTableClass.getRows().add(row3);
        }
        if (ctx.CONTINUE()!=null){
            Row row2 = new Row();
            w.setaCountinue(ctx.CONTINUE().toString());
            row2.setName("CONTINUE");
            row2.setRow(ctx.CONTINUE().getSymbol().getLine());
            row2.setValue(ctx.CONTINUE().getText());
            row2.setType("KeyWord");
            sympoleTableClass.getRows().add(row2);
        }
        for (int i=0;i<ctx.state().size();i++){
            if (ctx.state().get(i)!=null){
                w.getStates().add((State) visit(ctx.state().get(i)));

            }
        }
        Row row4 = new Row();
        w.setWhileValue(visitWhile_value(ctx.while_value()));
        row4.setName("Value");
        row4.setRow(currentLine);
        row4.setValue(ctx.while_value().getText());
        row4.setType("Condition");
        sympoleTableClass.getRows().add(row4);

        Row row5 = new Row();
        w.setColone(ctx.COLONE().getText());
        row5.setName("COLONE");
        row5.setRow(currentLine);
        row5.setValue(ctx.COLONE().getText());
        row5.setType("symbol");

        sympoleTableClass.getRows().add(row5);
        return w;
    }

    @Override
    public IfPython visitIf(PythonParser.IfContext ctx) {
        IfPython ip= new IfPython();
        Row row = new Row();
        ip.setIf(ctx.IF().toString());
        row.setRow(ctx.IF().getSymbol().getLine());
        row.setName("IF");
        row.setValue(ctx.IF().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        ip.setColone(ctx.COLONE().toString());
        row1.setRow(ctx.COLONE().getSymbol().getLine());
        row1.setName("COLONE");
        row1.setValue(ctx.COLONE().getText());
        row1.setType("Symbol");
        sympoleTableClass.getRows().add(row1);

        ip.setExp((Exp) visitExp( ctx.exp()));
        for (int i=0;i<ctx.state().size();i++){
            if (ctx.state().get(i)!=null){
                ip.getStates().add((State) visit(ctx.state().get(i)));
            }
        }
        return ip;
    }

    @Override
    public Object visitClassDeclLable(PythonParser.ClassDeclLableContext ctx) {
        return visitClass_decl(ctx.class_decl());
    }

    @Override
    public ClassDeclrationPython visitClass_decl(PythonParser.Class_declContext ctx) {
        ClassDeclrationPython cp= new ClassDeclrationPython();

        Row row = new Row();
        cp.setClassP(ctx.CLASS().toString());
        row.setRow(ctx.CLASS().getSymbol().getLine());
        row.setName("CLASS");
        row.setValue(ctx.CLASS().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        cp.setId(ctx.ID().toString());
        row1.setRow(ctx.ID().getSymbol().getLine());
        row1.setName("ID");
        row1.setValue(ctx.ID().getText());
        row1.setType("Identifier");
        sympoleTableClass.getRows().add(row1);

        Row row2 = new Row();
        cp.setColone(ctx.COLONE().toString());
        row2.setRow(ctx.COLONE().getSymbol().getLine());
        row2.setName("COLONE");
        row2.setValue(ctx.COLONE().getText());
        row2.setType("Sympole");
        sympoleTableClass.getRows().add(row2);

        for (int i=0;i<ctx.state().size();i++){
            if (ctx.state().get(i)!=null){
                cp.getStates().add((State) visit(ctx.state().get(i)));
            }
        }
        for (int i=0;i<ctx.encapsulation().size();i++){
            if (ctx.encapsulation().get(i)!=null){
                cp.getEncapsulationPythons().add(visitEncapsulation(ctx.encapsulation().get(i)));
            }}
        for (int i=0;i<ctx.construture_decl().size();i++){
            if (ctx.construture_decl().get(i)!=null){
                cp.getConstructorDeclrationPythons().add(visitConstruture_decl(ctx.construture_decl(i)));
            }}
        return cp;
    }

    @Override
    public ConstructorDeclrationPython visitConstruture_decl(PythonParser.Construture_declContext ctx) {
        ConstructorDeclrationPython cp=new ConstructorDeclrationPython();
        Row row = new Row();
        cp.setDef(ctx.DEF().toString());
        row.setRow(ctx.DEF().getSymbol().getLine());
        row.setName("DEF");
        row.setValue(ctx.DEF().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        cp.setInit(ctx.INIT().toString());
        row1.setRow(ctx.INIT().getSymbol().getLine());
        row1.setName("INIT");
        row1.setValue(ctx.INIT().getText());
        row1.setType("KeyWord");
        sympoleTableClass.getRows().add(row1);

        Row row2 = new Row();
        cp.setOpenprac(ctx.OPENPRAC().toString());
        row2.setRow(ctx.OPENPRAC().getSymbol().getLine());
        row2.setName("OPENPRAC");
        row2.setValue(ctx.OPENPRAC().getText());
        row2.setType("Sympole");
        sympoleTableClass.getRows().add(row2);

        Row row3 = new Row();
        cp.setCloseprac(ctx.CLOSEPRAC().toString());
        row3.setRow(ctx.CLOSEPRAC().getSymbol().getLine());
        row3.setName("CLOSEPRAC");
        row3.setValue(ctx.CLOSEPRAC().getText());
        row3.setType("Sympole");
        sympoleTableClass.getRows().add(row3);

        if (ctx.COMMA()!=null){
            Row row4 = new Row();
            cp.setComma(ctx.COMMA().toString());
            row4.setRow(ctx.COMMA().getSymbol().getLine());
            row4.setName("COMMA");
            row4.setValue(ctx.COMMA().toString());
            row4.setType("Sympole");
            sympoleTableClass.getRows().add(row4);
        }
        Row row5 = new Row();
        cp.setColone(ctx.COLONE().toString());
        row5.setRow(ctx.COLONE().getSymbol().getLine());
        row5.setName("COLONE");
        row5.setValue(ctx.COLONE().getText());
        row5.setType("Sympole");
        sympoleTableClass.getRows().add(row5);

        for (int i=0;i<ctx.SELF().size();i++){
            if (ctx.SELF().get(i)!=null){
                Row row4 = new Row();
                cp.getSelf().add(ctx.SELF().toString());
                row4.setRow(ctx.SELF(i).getSymbol().getLine());
                row4.setType("KeyWord");
                row4.setValue(ctx.SELF().toString());
                row4.setName("SELF");
                sympoleTableClass.getRows().add(row4);
            }
        }
        for (int i=0;i<ctx.DOT().size();i++){
            if (ctx.DOT().get(i)!=null){
                Row row4 = new Row();
                cp.getDot().add(ctx.DOT().toString());
                row4.setRow(ctx.DOT(i).getSymbol().getLine());
                row4.setType("Sympole");
                row4.setValue(ctx.DOT().toString());
                row4.setName("DOT");
                sympoleTableClass.getRows().add(row4);
            }
        }
        for (int i=0;i<ctx.ID().size();i++){
            if (ctx.ID().get(i)!=null){
                Row row4 = new Row();
                cp.getId().add(ctx.ID().toString());
                row4.setRow(ctx.ID(i).getSymbol().getLine());
                row4.setType("Identifier");
                row4.setValue(ctx.ID().toString());
                row4.setName("ID");
                sympoleTableClass.getRows().add(row4);
            }
        }
        for (int i=0;i<ctx.EQUALS().size();i++){
            if (ctx.EQUALS().get(i)!=null){
                Row row4 = new Row();
                cp.getEquals().add(ctx.EQUALS().toString());
                row4.setRow(ctx.EQUALS(i).getSymbol().getLine());
                row4.setType("Operator");
                row4.setValue(ctx.EQUALS().toString());
                row4.setName("EQUALS");
                sympoleTableClass.getRows().add(row4);
            }
        }
        if (ctx.paralist()!=null){
            cp.setParaLists(visitParalist(ctx.paralist()));
        }
        for (int i=0;i<ctx.state().size();i++){
            if (ctx.state().get(i)!=null){
                cp.getStates().add((State) visit(ctx.state().get(i)));
            }
        }
        for (int i=0;i<ctx.value().size();i++){
            if (ctx.value().get(i)!=null){
                cp.getValues().add(visitValue(ctx.value().get(i)));
            }
        }

        return cp;
    }

    @Override
    public Object visitObjLable(PythonParser.ObjLableContext ctx) {
        return visitObject(ctx.object());
    }

    @Override
    public ObjectPython visitObject(PythonParser.ObjectContext ctx) {
        ObjectPython op = new ObjectPython();

        Row row = new Row();
        op.setEquals(ctx.EQUALS().toString());
        row.setRow(ctx.EQUALS().getSymbol().getLine());
        row.setType("Operator");
        row.setValue(ctx.EQUALS().getText());
        row.setName("EQUALS");
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        op.setOpenPrac(ctx.OPENPRAC().toString());
        row1.setRow(ctx.OPENPRAC().getSymbol().getLine());
        row1.setType("Sympole");
        row1.setValue(ctx.OPENPRAC().getText());
        row1.setName("OPENPRAC");
        sympoleTableClass.getRows().add(row1);

        Row row2 = new Row();
        op.setClosePrac(ctx.CLOSEPRAC().toString());
        row2.setRow(ctx.CLOSEPRAC().getSymbol().getLine());
        row2.setType("Sympole");
        row2.setValue(ctx.CLOSEPRAC().getText());
        row2.setName("CLOSEPRAC");
        sympoleTableClass.getRows().add(row2);

        if (ctx.SELF()!=null){
            Row row3 = new Row();
            op.setSelf(ctx.SELF().toString());
            row3.setRow(ctx.SELF().getSymbol().getLine());
            row3.setType("Sympole");
            row3.setValue(ctx.SELF().getText());
            row3.setName("SELF");
            sympoleTableClass.getRows().add(row3);
        }
        if (ctx.COMMA()!=null){
            Row row3 = new Row();
            op.setComma(ctx.COMMA().toString());
            row3.setRow(ctx.COMMA().getSymbol().getLine());
            row3.setType("Sympole");
            row3.setValue(ctx.COMMA().getText());
            row3.setName("COMMA");
            sympoleTableClass.getRows().add(row3);
        }
        if (ctx.paralist()!=null){
            op.setParaList(visitParalist(ctx.paralist()));
        }
        for (int i=0;i<ctx.ID().size();i++){
            if (ctx.ID().get(i)!=null){
                Row row3 = new Row();
                op.getId().add(ctx.ID().toString());
                row3.setRow(ctx.ID(i).getSymbol().getLine());
                row3.setType("Identifier");
                row3.setValue(ctx.ID(i).getText());
                row3.setName("ID");
                sympoleTableClass.getRows().add(row3);
            }
        }

        return op;
    }

    @Override
    public Object visitCallFromClassLable(PythonParser.CallFromClassLableContext ctx) {
        return visitCall_fromclass(ctx.call_fromclass());
    }

    @Override
    public CallfromclassPython visitCall_fromclass(PythonParser.Call_fromclassContext ctx) {
        CallfromclassPython c= new CallfromclassPython();
        Row row = new Row();
        c.setDot(ctx.DOT().toString());
        row.setRow(ctx.DOT().getSymbol().getLine());
        row.setName("DOT");
        row.setValue(ctx.DOT().getText());
        row.setType("Sympole");
        sympoleTableClass.getRows().add(row);

        c.setCallFunc(visitCall_func(ctx.call_func()));
        for (int i =0 ;i<ctx.ID().size();i++){
            if (ctx.ID().get(i)!=null){
                Row row1 = new Row();
                c.getId().add(ctx.ID().toString());
                row1.setRow(ctx.ID(i).getSymbol().getLine());
                row1.setName("ID");
                row1.setValue(ctx.ID(i).getText());
                row1.setType("Identifier");
                sympoleTableClass.getRows().add(row1);
            }
        }
        return c;
    }

    @Override
    public Object visitInheritLable(PythonParser.InheritLableContext ctx) {
        return visitInheritance(ctx.inheritance());
    }

    @Override
    public InheritancePython visitInheritance(PythonParser.InheritanceContext ctx) {
        InheritancePython ip= new InheritancePython();
        ip.setClassi(ctx.CLASS().toString());
        ip.setColone(ctx.COLONE().toString());
        if (ctx.SUPER()!=null){
            ip.setSuper(ctx.SUPER().toString());}
        if (ctx.DOT()!=null){
            ip.setDot(ctx.DOT().toString());}
        if (ctx.INIT()!=null){
            ip.setInit(ctx.INIT().toString());}
        for (int i=0;i<ctx.ID().size();i++){
            if (ctx.ID().get(i)!=null){
                ip.getId().add(ctx.ID().toString());
            }
        }
        for (int i=0;i<ctx.OPENPRAC().size();i++){
            if (ctx.OPENPRAC().get(i)!=null){
                ip.getOpenPrac().add(ctx.OPENPRAC().toString());
            }
        }
        for (int i=0;i<ctx.CLOSEPRAC().size();i++){
            if (ctx.CLOSEPRAC().get(i)!=null){
                ip.getClosePrac().add(ctx.CLOSEPRAC().toString());
            }
        }
        for (int i=0;i<ctx.state().size();i++){
            if (ctx.state().get(i)!=null){
                ip.getStates().add((State) visit(ctx.state().get(i)));

            }
        }
        return ip;
    }

    @Override
    public EncapsulationPython visitEncapsulation(PythonParser.EncapsulationContext ctx) {
        Row row = new Row();
        EncapsulationPython ep = new EncapsulationPython();
        if(ctx.PRIVATE() != null){
            ep.setPrivate(ctx.PRIVATE().toString());
            row.setRow(ctx.PRIVATE().getSymbol().getLine());
            row.setType("KeyWord");
            row.setName("Private");
            row.setValue(ctx.PRIVATE().getText());
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.PROTECTED() != null){
            ep.setProtected(ctx.PROTECTED().toString());
            row.setRow(ctx.PROTECTED().getSymbol().getLine());
            row.setType("KeyWord");
            row.setName("PROTECTED");
            row.setValue(ctx.PROTECTED().getText());
            sympoleTableClass.getRows().add(row);
        }
        ep.setVarDeclrationPython(visitVar_decl(ctx.var_decl()));
        return ep;
    }

    @Override
    public ElifPython visitElif(PythonParser.ElifContext ctx) {
        ElifPython ep= new ElifPython();

        Row row = new Row();
        ep.setElIf(ctx.ELIF().toString());
        row.setRow(ctx.ELIF().getSymbol().getLine());
        row.setName("ELIF");
        row.setType("KeyWord");
        row.setValue(ctx.ELIF().getText());
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        ep.setColone(ctx.COLONE().toString());
        row1.setRow(ctx.COLONE().getSymbol().getLine());
        row1.setName("COLONE");
        row1.setType("Sympole");
        row1.setValue(ctx.COLONE().getText());
        sympoleTableClass.getRows().add(row1);

        ep.setExp((Exp) visitExp( ctx.exp()));
        for (int i=0;i<ctx.state().size();i++){
            if (ctx.state().get(i)!=null){
                ep.getStates().add((State) visit(ctx.state().get(i)));
            }
        }
        return ep;
    }

    @Override
    public ElsePython visitElse(PythonParser.ElseContext ctx) {
        ElsePython els= new ElsePython();

        Row row = new Row();
        els.setElse(ctx.ELSE().toString());
        row.setRow(ctx.ELSE().getSymbol().getLine());
        row.setName("ELSE");
        row.setType("KeyWord");
        row.setValue(ctx.ELSE().getText());
        sympoleTableClass.getRows().add(row);

        Row row1 = new Row();
        els.setColone(ctx.COLONE().toString());
        row1.setRow(ctx.COLONE().getSymbol().getLine());
        row1.setName("COLONE");
        row1.setType("Sympole");
        row1.setValue(ctx.COLONE().getText());
        sympoleTableClass.getRows().add(row1);

        for (int i=0;i<ctx.state().size();i++){
            if (ctx.state().get(i)!=null){
                els.getStates().add((State) visit(ctx.state().get(i)));
            }
        }
        return els;
    }

    @Override
    public Return visitReturn(PythonParser.ReturnContext ctx) {
        Row row = new Row();
        Return r = new Return();
        r.setReturnp(ctx.RETURN().toString());
        row.setRow(ctx.RETURN().getSymbol().getLine());
        row.setName("RETURN");
        row.setValue(ctx.RETURN().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);
        r.setValue(visitValue(ctx.value()));
        return r;
    }

    //Jinja
    @Override
    public StateJinja2 visitState_jinja2(PythonParser.State_jinja2Context ctx) {
        StateJinja2 sj = new StateJinja2();
        for(int i=0 ; i<ctx.printinjinja().size() ; i++){
            if(ctx.printinjinja(i) != null){
                sj.getPrintJinja2().add(visitPrintinjinja(ctx.printinjinja(i)));
            }
        }
        for(int i=0 ; i<ctx.condition_jinja2().size() ; i++){
            if(ctx.condition_jinja2(i) != null){
                sj.getConditionJinja2().add((ConditionJinja2) visit(ctx.condition_jinja2(i)));
            }
        }
        for(int i=0 ; i<ctx.tagsDocument().size() ; i++){
            if(ctx.tagsDocument(i) != null){
                sj.getTagTypes().add(visitTagsDocument(ctx.tagsDocument(i)));
            }
        }
        return sj;
    }
    @Override
    public PrintJinja2 visitPrintinjinja(PythonParser.PrintinjinjaContext ctx) {
        PrintJinja2 pj= new PrintJinja2();

        pj.setDoubleOpenkpra(ctx.DOUBLEOPENKPRA().getText());
        Row row = new Row();
        row.setRow(ctx.DOUBLEOPENKPRA().getSymbol().getLine());
        row.setName("DOUBLEOPENKPRA");
        row.setValue(ctx.DOUBLEOPENKPRA().getText());
        row.setType("symbol");
        sympoleTableClass.getRows().add(row);

        if(ctx.DOT() != null){
                pj.setDot(ctx.DOT().getText());
                Row row1 = new Row();
                row1.setRow(ctx.DOT().getSymbol().getLine());
                row1.setName("DOT");
                row1.setValue(ctx.DOT().getText());
                row1.setType("symbol");
                sympoleTableClass.getRows().add(row1);
        }
        pj.setDoubleClosekpra(ctx.toString());
        Row row2 = new Row();
        row2.setRow(ctx.DOUBLEOPENKPRA().getSymbol().getLine());
        row2.setName("DOUBLEOPENKPRA");
        row2.setValue(ctx.DOUBLEOPENKPRA().getText());
        row2.setType("symbol");
        sympoleTableClass.getRows().add(row2);

        for (int i=0;i<ctx.ID().size();i++){
            if (ctx.ID().get(i)!=null){
                pj.getId().add(ctx.ID(i).toString());
                Row row3 = new Row();
                row3.setRow(ctx.ID(i).getSymbol().getLine());
                row3.setType("Identifier");
                row3.setValue(ctx.ID(i).getText());
                row3.setName("ID");
            }}
        return pj;
    }

    @Override
    public Object visitFor_j(PythonParser.For_jContext ctx) {
        return visitFor_jinja2(ctx.for_jinja2());
    }

    @Override
    public Object visitIf_j(PythonParser.If_jContext ctx) {
        return visitIf_jinja2(ctx.if_jinja2());
    }

    @Override
    public Object visitElse_j(PythonParser.Else_jContext ctx) {
        return visitElse_jinja2(ctx.else_jinja2());
    }

    @Override
    public Object visitElif_j(PythonParser.Elif_jContext ctx) {
        return visitElif_jinja2(ctx.elif_jinja2());
    }

    @Override
    public ForJinja2 visitFor_jinja2(PythonParser.For_jinja2Context ctx) {
        ForJinja2 fj= new ForJinja2();

        fj.setFor(ctx.FOR().toString());
        Row row = new Row();
        row.setRow(ctx.FOR().getSymbol().getLine());
        row.setName("FOR");
        row.setValue(ctx.FOR().getText());
        row.setType("KeyWord");
        sympoleTableClass.getRows().add(row);

        fj.setIn(ctx.IN().toString());
        Row row2 = new Row();
        row2.setRow(ctx.IN().getSymbol().getLine());
        row2.setName("IN");
        row2.setValue(ctx.IN().getText());
        row2.setType("KeyWord");
        sympoleTableClass.getRows().add(row2);
        if(ctx.INT() != null){
            fj.setInt(ctx.INT().toString());
            Row row3 = new Row();
            row3.setRow(ctx.INT().getSymbol().getLine());
            row3.setName("INT");
            row3.setValue(ctx.INT().getText());
            row3.setType("Value");
            sympoleTableClass.getRows().add(row3);
        }

        fj.setEndFor(ctx.ENDFOR().toString());
        Row row4 = new Row();
        row4.setRow(ctx.ENDFOR().getSymbol().getLine());
        row4.setName("ENDFOR");
        row4.setValue(ctx.ENDFOR().getText());
        row4.setType("KeyWord");
        sympoleTableClass.getRows().add(row4);

        for (int i=0;i<ctx.OPENCONDITION().size();i++){
            if (ctx.OPENCONDITION().get(i)!=null){
                fj.getOpenCondition().add(ctx.OPENCONDITION().toString());
                Row row1 = new Row();
                row1.setRow(ctx.CLOSECONDITION(i).getSymbol().getLine());
                row1.setName("OPENCONDITION");
                row1.setValue(ctx.OPENCONDITION(i).getText());
                row1.setType("KeyWord");
                sympoleTableClass.getRows().add(row1);
            }
        }
        for (int i=0;i<ctx.CLOSECONDITION().size();i++){
            if (ctx.CLOSECONDITION().get(i)!=null){
                fj.getCloseCondition().add(ctx.CLOSECONDITION().toString());
                Row row1 = new Row();
                row1.setRow(ctx.CLOSECONDITION(i).getSymbol().getLine());
                row1.setName("CLOSECONDITION");
                row1.setValue(ctx.CLOSECONDITION(i).getText());
                row1.setType("KeyWord");
                sympoleTableClass.getRows().add(row1);
            }
        }
        for (int i=0;i<ctx.ID().size();i++){
            if (ctx.ID().get(i)!=null){
                fj.getId().add(ctx.ID().toString());
                Row row1 = new Row();
                row1.setRow(ctx.ID(i).getSymbol().getLine());
                row1.setName("ID");
                row1.setValue(ctx.ID(i).getText());
                row1.setType("Identifier");
                sympoleTableClass.getRows().add(row1);
            }
        }
        for (int i=0;i<ctx.state_jinja2().size();i++){
            if (ctx.state_jinja2().get(i)!=null){
                fj.getStateJinja2().add(visitState_jinja2(ctx.state_jinja2().get(i)));
            }
        }
        return fj;
    }

    @Override
    public IfJinja2 visitIf_jinja2(PythonParser.If_jinja2Context ctx) {
        IfJinja2 ij=new IfJinja2();
        ij.setIf(ctx.IF().toString());
        Row row1 = new Row();
        row1.setRow(ctx.IF().getSymbol().getLine());
        row1.setName("IF");
        row1.setValue(ctx.IF().getText());
        row1.setType("KeyWord");
        sympoleTableClass.getRows().add(row1);

        ij.setEndIf(ctx.ENDIF().toString());
        Row row2 = new Row();
        row2.setRow(ctx.ENDIF().getSymbol().getLine());
        row2.setName("ENDIF");
        row2.setValue(ctx.ENDIF().getText());
        row2.setType("KeyWord");
        sympoleTableClass.getRows().add(row2);

        if(ctx.DOT() != null){
            ij.setDot(ctx.DOT().toString());
            Row row = new Row();
            row.setRow(ctx.DOT().getSymbol().getLine());
            row.setName("DOT");
            row.setValue(ctx.DOT().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.exp() != null){
            ij.setExp(visitExp( ctx.exp()));
        }
        for (int i=0;i<ctx.OPENCONDITION().size();i++){
            if (ctx.OPENCONDITION().get(i)!=null){
                ij.getOpenCondition().add(ctx.OPENCONDITION().toString());
                Row row = new Row();
                row.setRow(ctx.OPENCONDITION(i).getSymbol().getLine());
                row.setName("OPENCONDITION");
                row.setValue(ctx.OPENCONDITION(i).getText());
                row.setType("Symbol");
                sympoleTableClass.getRows().add(row);
            }
        }
        for (int i=0;i<ctx.CLOSECONDITION().size();i++){
            if (ctx.CLOSECONDITION().get(i)!=null){
                ij.getCloseCondition().add(ctx.CLOSECONDITION().toString());
                Row row = new Row();
                row.setRow(ctx.CLOSECONDITION(i).getSymbol().getLine());
                row.setName("CLOSECONDITION");
                row.setValue(ctx.CLOSECONDITION(i).getText());
                row.setType("Symbol");
                sympoleTableClass.getRows().add(row);
            }
        }
        for (int i=0;i<ctx.ID().size();i++){
            if (ctx.ID().get(i)!=null){
                ij.getId().add(ctx.ID().toString());
                Row row = new Row();
                row.setRow(ctx.ID(i).getSymbol().getLine());
                row.setName("ID");
                row.setValue(ctx.ID(i).getText());
                row.setType("Identifier");
                sympoleTableClass.getRows().add(row);
            }
        }
        for (int i=0;i<ctx.state_jinja2().size();i++){
            if (ctx.state_jinja2().get(i)!=null){
                ij.getStateJinja2().add(visitState_jinja2(ctx.state_jinja2().get(i)));
            }
        }
        return ij;
    }

    @Override
    public ElifJinja2 visitElif_jinja2(PythonParser.Elif_jinja2Context ctx) {
        ElifJinja2 ej= new ElifJinja2();

        Row row1 = new Row();
        ej.setOpenCondition(ctx.OPENCONDITION().toString());
        row1.setRow(ctx.OPENCONDITION().getSymbol().getLine());
        row1.setName("OPENCONDITION");
        row1.setType("Symbol");
        row1.setValue(ctx.OPENCONDITION().getText());
        sympoleTableClass.getRows().add(row1);

        Row row2 = new Row();
        ej.setCloseCondition(ctx.CLOSECONDITION().toString());
        row2.setRow(ctx.CLOSECONDITION().getSymbol().getLine());
        row2.setName("CLOSECONDITION");
        row2.setType("Symbol");
        row2.setValue(ctx.CLOSECONDITION().getText());
        sympoleTableClass.getRows().add(row2);

        ej.setElif(ctx.ELIF().toString());
        Row row3 = new Row();
        row3.setRow(ctx.ELIF().getSymbol().getLine());
        row3.setName("ELIF");
        row3.setValue(ctx.ELIF().getText());
        row3.setType("KeyWord");
        sympoleTableClass.getRows().add(row3);

        if(ctx.DOT() != null){
            ej.setDot(ctx.DOT().toString());
            Row row = new Row();
            row.setRow(ctx.DOT().getSymbol().getLine());
            row.setName("DOT");
            row.setValue(ctx.DOT().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.exp() != null){
            ej.setExp(visitExp( ctx.exp()));
        }
        for (int i=0;i<ctx.ID().size();i++){
            if (ctx.ID().get(i)!=null){
                ej.getId().add(ctx.ID().toString());
                Row row = new Row();
                row.setRow(ctx.ID(i).getSymbol().getLine());
                row.setName("ID");
                row.setValue(ctx.ID(i).getText());
                row.setType("Identifier");
                sympoleTableClass.getRows().add(row);
            }
        }
        for (int i=0;i<ctx.state_jinja2().size();i++){
            if (ctx.state_jinja2().get(i)!=null){
                ej.getStateJinja2().add(visitState_jinja2(ctx.state_jinja2().get(i)));
            }
        }
        return ej;
    }

    @Override
    public ElseJinja2 visitElse_jinja2(PythonParser.Else_jinja2Context ctx) {
        ElseJinja2 e= new ElseJinja2();
        e.setElse(ctx.ELSE().toString());
        Row row3 = new Row();
        row3.setRow(ctx.ELSE().getSymbol().getLine());
        row3.setName("ELSE");
        row3.setValue(ctx.ELSE().getText());
        row3.setType("KeyWord");
        sympoleTableClass.getRows().add(row3);

        Row row1 = new Row();
        e.setOpenCondition(ctx.OPENCONDITION().toString());
        row1.setRow(ctx.OPENCONDITION().getSymbol().getLine());
        row1.setName("OPENCONDITION");
        row1.setType("Symbol");
        row1.setValue(ctx.OPENCONDITION().getText());
        sympoleTableClass.getRows().add(row1);

        Row row2 = new Row();
        e.setCloseCondition(ctx.CLOSECONDITION().toString());
        row2.setRow(ctx.CLOSECONDITION().getSymbol().getLine());
        row2.setName("CLOSECONDITION");
        row2.setType("Symbol");
        row2.setValue(ctx.CLOSECONDITION().getText());
        sympoleTableClass.getRows().add(row2);

        return e;
    }

//    HTML

    @Override
    public Object visitFullHtmlDocumentLabel(PythonParser.FullHtmlDocumentLabelContext ctx) {
        return visitFullHtmlDocument(ctx.fullHtmlDocument());
    }

    @Override
    public Object visitTagsDocumentLabel(PythonParser.TagsDocumentLabelContext ctx) {
        return visitTagsDocument(ctx.tagsDocument());
    }

    @Override
    public FullHtmlDocument visitFullHtmlDocument(PythonParser.FullHtmlDocumentContext ctx) {
        FullHtmlDocument fullHtmlDocument = new FullHtmlDocument();
        if(ctx.doctypehtml()!=null){
            fullHtmlDocument.setDoctypehtml(visitDoctypehtml(ctx.doctypehtml()));
        }
        if(ctx.htmlOpen()!=null){
            fullHtmlDocument.setHtmlOpen(visitHtmlOpen(ctx.htmlOpen()));
        }
        if(ctx.headSection()!=null){
            fullHtmlDocument.setHeadSection(visitHeadSection(ctx.headSection()));
        }
        if(ctx.bodySection()!=null){
            fullHtmlDocument.setBodySection(visitBodySection(ctx.bodySection()));
        }
        if(ctx.htmlClose()!=null){
            fullHtmlDocument.setHtmlClose(visitHtmlClose(ctx.htmlClose()));
        }
        return fullHtmlDocument;
    }

    @Override
    public Doctypehtml visitDoctypehtml(PythonParser.DoctypehtmlContext ctx) {
        Doctypehtml doctypehtml= new Doctypehtml();
        if(ctx.TAG_OPEN()!=null){
            doctypehtml.setTAG_OPEN(ctx.TAG_OPEN().getText());
            Row row = new Row();
            row.setRow(ctx.TAG_OPEN().getSymbol().getLine());
            row.setName("TAG_OPEN");
            row.setValue(ctx.TAG_OPEN().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.DOCTYPEHTML_TAG()!=null){
            doctypehtml.setDOCTYPEHTML_TAG(ctx.DOCTYPEHTML_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.DOCTYPEHTML_TAG().getSymbol().getLine());
            row.setName("DOCTYPEHTML_TAG");
            row.setValue(ctx.DOCTYPEHTML_TAG().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.TAG_CLOSE()!=null){
            doctypehtml.setTAG_CLOSE(ctx.TAG_CLOSE().getText());
            Row row = new Row();
            row.setRow(ctx.TAG_CLOSE().getSymbol().getLine());
            row.setName("TAG_CLOSE");
            row.setValue(ctx.TAG_CLOSE().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        return doctypehtml;
    }

    @Override
    public HtmlOpen visitHtmlOpen(PythonParser.HtmlOpenContext ctx) {
        HtmlOpen htmlOpen = new HtmlOpen();
        if(ctx.TAG_OPEN()!=null){
            htmlOpen.setTAG_OPEN(ctx.TAG_OPEN().getText());
            Row row = new Row();
            row.setRow(ctx.TAG_OPEN().getSymbol().getLine());
            row.setName("TAG_OPEN");
            row.setValue(ctx.TAG_OPEN().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.HTML_TAG()!=null){
            htmlOpen.setHTML_TAG(ctx.HTML_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.HTML_TAG().getSymbol().getLine());
            row.setName("HTML_TAG");
            row.setValue(ctx.HTML_TAG().getText());
            row.setType("Tag");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.TAG_CLOSE()!=null){
            htmlOpen.setTAG_CLOSE((ctx.TAG_CLOSE().getText()));
            Row row = new Row();
            row.setRow(ctx.TAG_CLOSE().getSymbol().getLine());
            row.setName("TAG_CLOSE");
            row.setValue(ctx.TAG_CLOSE().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        return htmlOpen;
    }

    @Override
    public HtmlClose visitHtmlClose(PythonParser.HtmlCloseContext ctx) {
        HtmlClose htmlClose = new HtmlClose();
        if(ctx.TAG_OPEN_SLASH()!=null){
            htmlClose.setTAG_OPEN_SLASH(ctx.TAG_OPEN_SLASH().getText());
            Row row = new Row();
            row.setRow(ctx.TAG_OPEN_SLASH().getSymbol().getLine());
            row.setName("TAG_OPEN_SLASH");
            row.setValue(ctx.TAG_OPEN_SLASH().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.HTML_TAG()!=null){
            htmlClose.setHTML_TAG(ctx.HTML_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.HTML_TAG().getSymbol().getLine());
            row.setName("HTML_TAG");
            row.setValue(ctx.HTML_TAG().getText());
            row.setType("Tag");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.TAG_CLOSE()!=null){
            htmlClose.setTAG_CLOSE((ctx.TAG_CLOSE().getText()));
            Row row = new Row();
            row.setRow(ctx.TAG_CLOSE().getSymbol().getLine());
            row.setName("TAG_CLOSE");
            row.setValue(ctx.TAG_CLOSE().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        return htmlClose;
    }

    @Override
    public HeadSection visitHeadSection(PythonParser.HeadSectionContext ctx) {
        HeadSection headSection = new HeadSection();
        if(ctx.TAG_OPEN()!=null){
            headSection.setTAG_OPEN(ctx.TAG_OPEN().getText());
            Row row = new Row();
            row.setRow(ctx.TAG_OPEN().getSymbol().getLine());
            row.setName("TAG_OPEN");
            row.setValue(ctx.TAG_OPEN().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        for(int i =0;i<ctx.HEAD_TAG().size();i++){
            if(ctx.HEAD_TAG().get(i)!=null){
                headSection.getHEAD_TAG().add(ctx.HEAD_TAG(i).getText());
                Row row = new Row();
                row.setRow(ctx.HEAD_TAG(i).getSymbol().getLine());
                row.setName("HEAD_TAG");
                row.setValue(ctx.HEAD_TAG(i).getText());
                row.setType("Tag");
                sympoleTableClass.getRows().add(row);
            }
        }
        for(int j=0;j<ctx.TAG_CLOSE().size();j++){
            if(ctx.TAG_CLOSE().get(j)!=null){
                headSection.getTAG_CLOSE().add(ctx.TAG_CLOSE(j).getText());
                Row row = new Row();
                row.setRow(ctx.TAG_CLOSE(j).getSymbol().getLine());
                row.setName("TAG_CLOSE");
                row.setValue(ctx.TAG_CLOSE(j).getText());
                row.setType("Symbol");
                sympoleTableClass.getRows().add(row);
            }
        }
        if(ctx.content()!=null){
            headSection.setContent(visitContent(ctx.content()));
        }
        if(ctx.TAG_OPEN_SLASH()!=null){
            headSection.setTAG_OPEN_SLASH(ctx.TAG_OPEN_SLASH().getText());
            Row row = new Row();
            row.setRow(ctx.TAG_OPEN_SLASH().getSymbol().getLine());
            row.setName("TAG_OPEN_SLASH");
            row.setValue(ctx.TAG_OPEN_SLASH().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }

        return headSection;
    }

    @Override
    public BodySection visitBodySection(PythonParser.BodySectionContext ctx) {
        BodySection bodySection = new BodySection();
        if(ctx.TAG_OPEN()!=null){
            bodySection.setTAG_OPEN(ctx.TAG_OPEN().getText());
            Row row = new Row();
            row.setRow(ctx.TAG_OPEN().getSymbol().getLine());
            row.setName("TAG_OPEN");
            row.setValue(ctx.TAG_OPEN().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        for(int i =0;i<ctx.BODY_TAG().size();i++){
            if(ctx.BODY_TAG().get(i)!=null){
                bodySection.getBODY_TAG().add(ctx.BODY_TAG(i).getText());
                Row row = new Row();
                row.setRow(ctx.BODY_TAG(i).getSymbol().getLine());
                row.setName("BODY_TAG");
                row.setValue(ctx.BODY_TAG(i).getText());
                row.setType("Tag");
                sympoleTableClass.getRows().add(row);
            }
        }
        for(int j=0;j<ctx.TAG_CLOSE().size();j++){
            if(ctx.TAG_CLOSE().get(j)!=null){
                bodySection.getTAG_CLOSE().add(ctx.TAG_CLOSE(j).getText());
                Row row = new Row();
                row.setRow(ctx.TAG_CLOSE(j).getSymbol().getLine());
                row.setName("TAG_CLOSE");
                row.setValue(ctx.TAG_CLOSE(j).getText());
                row.setType("Symbol");
                sympoleTableClass.getRows().add(row);
            }
        }

        if(ctx.content()!=null){
            bodySection.setContent(visitContent(ctx.content()));
        }
        if(ctx.TAG_OPEN_SLASH()!=null){
            bodySection.setTAG_OPEN_SLASH(ctx.TAG_OPEN_SLASH().getText());
            Row row = new Row();
            row.setRow(ctx.TAG_OPEN_SLASH().getSymbol().getLine());
            row.setName("TAG_OPEN_SLASH");
            row.setValue(ctx.TAG_OPEN_SLASH().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        return bodySection;
    }

    @Override
    public Content visitContent(PythonParser.ContentContext ctx) {
        Content content = new Content();
        for(int i =0;i<ctx.tagtype().size();i++){
            if(ctx.tagtype().get(i)!=null){
                content.getTagTypes().add(visitTagtype(ctx.tagtype().get(i)));
            }
        }
        for(int i =0;i<ctx.ID().size();i++){
            if(ctx.ID().get(i)!=null){
                content.getID().add(ctx.ID(i).getText());
                Row row = new Row();
                row.setRow(ctx.ID(i).getSymbol().getLine());
                row.setName("ID");
                row.setValue(ctx.ID(i).getText());
                row.setType("Identifier");
                sympoleTableClass.getRows().add(row);
            }
        }
        for(int i =0;i<ctx.state_jinja2().size();i++){
            if(ctx.state_jinja2().get(i)!=null){
                content.getStatejinja2s().add(visitState_jinja2(ctx.state_jinja2(i)));
            }
        }
        return content;
    }
    @Override
    public TagType visitTagtype(PythonParser.TagtypeContext ctx) {
//        return super.visitTagtype(ctx);
        TagType tagType = new TagType();
        if(ctx.startTag()!=null){
            tagType.setStartTag(visitStartTag(ctx.startTag()));
        }
        if(ctx.content()!=null){
            tagType.setContent(visitContent(ctx.content()));
        }
        if(ctx.endTag()!=null){
            tagType.setEndTag(visitEndTag(ctx.endTag()));
        }
        if(ctx.selfClosingtag()!=null){
            tagType.setSelfClosingTag(visitSelfClosingtag(ctx.selfClosingtag()));
        }
        return tagType;

    }

    @Override
    public StartTag visitStartTag(PythonParser.StartTagContext ctx) {
        StartTag startTag = new StartTag();
        if(ctx.TAG_OPEN()!=null){
            startTag.setTAG_OPEN(ctx.TAG_OPEN().getText());
            Row row = new Row();
            row.setRow(ctx.TAG_OPEN().getSymbol().getLine());
            row.setName("TAG_OPEN");
            row.setValue(ctx.TAG_OPEN().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.tagName()!=null){
            startTag.setTagName(visitTagName(ctx.tagName()));
        }

        for(int i =0;i<ctx.attribute().size();i++){
            if(ctx.attribute().get(i)!=null){
                startTag.getAttribute().add(visitAttribute(ctx.attribute().get(i)));
            }
        }
        if(ctx.TAG_CLOSE()!=null){
            startTag.setTAG_CLOSE(ctx.TAG_CLOSE().getText());
            Row row = new Row();
            row.setRow(ctx.TAG_CLOSE().getSymbol().getLine());
            row.setName("TAG_CLOSE");
            row.setValue(ctx.TAG_CLOSE().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        return startTag;
    }

    @Override
    public EndTag visitEndTag(PythonParser.EndTagContext ctx) {
        EndTag endTag = new EndTag();

        if(ctx.TAG_OPEN_SLASH()!=null){
            endTag.setTAG_OPEN_SLASH(ctx.TAG_OPEN_SLASH().getText());
            Row row = new Row();
            row.setRow(ctx.TAG_OPEN_SLASH().getSymbol().getLine());
            row.setName("TAG_OPEN_SLASH");
            row.setValue(ctx.TAG_OPEN_SLASH().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.tagName()!=null){
            endTag.setTagName(visitTagName(ctx.tagName()));
        }
        if(ctx.TAG_CLOSE()!=null){
            endTag.setTAG_CLOSE(ctx.TAG_CLOSE().getText());
            Row row = new Row();
            row.setRow(ctx.TAG_CLOSE().getSymbol().getLine());
            row.setName("TAG_CLOSE");
            row.setValue(ctx.TAG_CLOSE().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        return endTag;
    }


    @Override
    public Attribute visitAttribute(PythonParser.AttributeContext ctx) {
        Attribute attribute = new Attribute();
        if(ctx.CLASS()!=null){
            attribute.setCLASS(ctx.CLASS().getText());
            Row row = new Row();
            row.setRow(ctx.CLASS().getSymbol().getLine());
            row.setName("CLASS");
            row.setValue(ctx.CLASS().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.IDHTML()!=null){
            attribute.setIDHTML(ctx.IDHTML().getText());
            Row row = new Row();
            row.setRow(ctx.IDHTML().getSymbol().getLine());
            row.setName("IDHTML");
            row.setValue(ctx.IDHTML().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.STYLE()!=null){
            attribute.setSTYLE(ctx.STYLE().getText());
            Row row = new Row();
            row.setRow(ctx.STYLE().getSymbol().getLine());
            row.setName("STYLE");
            row.setValue(ctx.STYLE().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.SRC()!=null){
            attribute.setSRC(ctx.SRC().getText());
            Row row = new Row();
            row.setRow(ctx.SRC().getSymbol().getLine());
            row.setName("SRC");
            row.setValue(ctx.SRC().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.ALT()!=null){
            attribute.setALT(ctx.ALT().getText());
            Row row = new Row();
            row.setRow(ctx.ALT().getSymbol().getLine());
            row.setName("ALT");
            row.setValue(ctx.ALT().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.TYPE()!=null){
            attribute.setTYPE(ctx.TYPE().getText());
            Row row = new Row();
            row.setRow(ctx.TYPE().getSymbol().getLine());
            row.setName("TYPE");
            row.setValue(ctx.TYPE().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.HREF()!=null){
            attribute.setHREF(ctx.HREF().getText());
            Row row = new Row();
            row.setRow(ctx.HREF().getSymbol().getLine());
            row.setName("HREF");
            row.setValue(ctx.HREF().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.VALUE()!=null){
            attribute.setVALUE(ctx.VALUE().getText());
            Row row = new Row();
            row.setRow(ctx.VALUE().getSymbol().getLine());
            row.setName("VALUE");
            row.setValue(ctx.VALUE().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.PLACEHOLDER()!=null){
            attribute.setPLACEHOLDER(ctx.PLACEHOLDER().getText());
            Row row = new Row();
            row.setRow(ctx.PLACEHOLDER().getSymbol().getLine());
            row.setName("PLACEHOLDER");
            row.setValue(ctx.PLACEHOLDER().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.NAMEHTML()!=null){
            attribute.setNAMEHTML(ctx.NAMEHTML().getText());
            Row row = new Row();
            row.setRow(ctx.NAMEHTML().getSymbol().getLine());
            row.setName("NAMEHTML");
            row.setValue(ctx.NAMEHTML().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.REL()!=null){
            attribute.setREL(ctx.REL().getText());
            Row row = new Row();
            row.setRow(ctx.REL().getSymbol().getLine());
            row.setName("REL");
            row.setValue(ctx.REL().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.EQUALS()!=null){
            attribute.setEQUAL(ctx.EQUALS().getText());
            Row row = new Row();
            row.setRow(ctx.EQUALS().getSymbol().getLine());
            row.setName("EQUALS");
            row.setValue(ctx.EQUALS().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.STRING()!=null){
            attribute.setSTRING(ctx.STRING().getText());
            Row row = new Row();
            row.setRow(ctx.STRING().getSymbol().getLine());
            row.setName("STRING");
            row.setValue(ctx.STRING().getText());
            row.setType("Value");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.ENCTYPE() != null){
            attribute.setENCTYPE(ctx.ENCTYPE().getText());
            Row row = new Row();
            row.setRow(ctx.ENCTYPE().getSymbol().getLine());
            row.setName("ENCTYPE");
            row.setValue(ctx.ENCTYPE().getText());
            row.setType("Attribute");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.RQUIRED() != null){
            attribute.setRQUIRED(ctx.RQUIRED().getText());
            Row row = new Row();
            row.setRow(ctx.RQUIRED().getSymbol().getLine());
            row.setName("REQUIRED");
            row.setValue(ctx.RQUIRED().getText());
            row.setType("Attribute");
            sympoleTableClass.getRows().add(row);
        }
        return attribute;
    }

    @Override
    public TagName visitTagName(PythonParser.TagNameContext ctx) {
//        return super.visitTagName(ctx);
        TagName tagName = new TagName();
        if(ctx.DIV_TAG()!=null){
            tagName.setDIV_TAG(ctx.DIV_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.DIV_TAG().getSymbol().getLine());
            row.setName("DIV_TAG");
            row.setValue(ctx.DIV_TAG().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.P_TAG()!=null){
            tagName.setP_TAG(ctx.P_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.P_TAG().getSymbol().getLine());
            row.setName("P_TAG");
            row.setValue(ctx.P_TAG().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.H1_TAG()!=null){
            tagName.setH1_TAG(ctx.H1_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.H1_TAG().getSymbol().getLine());
            row.setName("H1_TAG");
            row.setValue(ctx.H1_TAG().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.H2_TAG()!=null){
            tagName.setH2_TAG(ctx.H2_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.H2_TAG().getSymbol().getLine());
            row.setName("H2_TAG");
            row.setValue(ctx.H2_TAG().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.H3_TAG()!=null){
            tagName.setH3_TAG(ctx.H3_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.H3_TAG().getSymbol().getLine());
            row.setName("H3_TAG");
            row.setValue(ctx.H3_TAG().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.H4_TAG()!=null){
            tagName.setH4_TAG(ctx.H4_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.H4_TAG().getSymbol().getLine());
            row.setName("H4_TAG");
            row.setValue(ctx.H4_TAG().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.TITLE()!=null){
            tagName.setTITLE(ctx.TITLE().getText());
            Row row = new Row();
            row.setRow(ctx.TITLE().getSymbol().getLine());
            row.setName("TITLE");
            row.setValue(ctx.TITLE().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.BUTTON_TAG()!=null){
            tagName.setBUTTON_TAG(ctx.BUTTON_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.BUTTON_TAG().getSymbol().getLine());
            row.setName("BUTTON_TAG");
            row.setValue(ctx.BUTTON_TAG().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.UL_TAG()!=null){
            tagName.setUL_TAG(ctx.UL_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.UL_TAG().getSymbol().getLine());
            row.setName("UL_TAG");
            row.setValue(ctx.UL_TAG().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.LI_TAG()!=null){
            tagName.setLI_TAG(ctx.LI_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.LI_TAG().getSymbol().getLine());
            row.setName("LI_TAG");
            row.setValue(ctx.LI_TAG().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.A_TAG()!=null){
            tagName.setA_TAG(ctx.A_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.A_TAG().getSymbol().getLine());
            row.setName("A_TAG");
            row.setValue(ctx.A_TAG().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.FORM()!=null){
            tagName.setFORM_TAG(ctx.FORM().getText());
            Row row = new Row();
            row.setRow(ctx.FORM().getSymbol().getLine());
            row.setName("FORM_TAG");
            row.setValue(ctx.FORM().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.LABEL_TAG()!=null){
            tagName.setLABEL_TAG(ctx.LABEL_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.LABEL_TAG().getSymbol().getLine());
            row.setName("LABEL_TAG");
            row.setValue(ctx.LABEL_TAG().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.LINK()!=null){
            tagName.setLI_TAG(ctx.LINK().getText());
            Row row = new Row();
            row.setRow(ctx.LINK().getSymbol().getLine());
            row.setName("LINK");
            row.setValue(ctx.LINK().getText());
            row.setType("Tage");
            sympoleTableClass.getRows().add(row);
        }
        return tagName;
    }


    @Override
    public SelfClosingTag visitSelfClosingtag(PythonParser.SelfClosingtagContext ctx) {
//        return super.visitSelfClosingtag(ctx);
        SelfClosingTag selfClosingTag = new SelfClosingTag();
        if(ctx.TAG_OPEN()!=null){
            selfClosingTag.setTAG_OPEN(ctx.TAG_OPEN().getText());
            Row row = new Row();
            row.setRow(ctx.TAG_OPEN().getSymbol().getLine());
            row.setName("TAG_OPEN");
            row.setValue(ctx.TAG_OPEN().getText());
            row.setType("Symbol");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.IMG_TAG()!=null){
            selfClosingTag.setIMG_TAG(ctx.IMG_TAG().getText());
            Row row = new Row();
            row.setRow(ctx.IMG_TAG().getSymbol().getLine());
            row.setName("IMG_TAG");
            row.setValue(ctx.IMG_TAG().getText());
            row.setType("Tag");
            sympoleTableClass.getRows().add(row);
        }
        if(ctx.INPUT()!=null){
            selfClosingTag.setINPUT_TAG(ctx.INPUT().getText());
            Row row = new Row();
            row.setRow(ctx.INPUT().getSymbol().getLine());
            row.setName("INPUT_TAG");
            row.setValue(ctx.INPUT().getText());
            row.setType("Tag");
            sympoleTableClass.getRows().add(row);
        }
        for(int i =0;i<ctx.attribute().size();i++){
            if(ctx.attribute().get(i)!=null){
                selfClosingTag.getAttribute().add(visitAttribute(ctx.attribute().get(i)));
            }
        }
        if(ctx.SLASH_CLOSE()!=null){
            selfClosingTag.setSLASH_CLOSE(ctx.SLASH_CLOSE().getText());
            Row row = new Row();
            row.setRow(ctx.SLASH_CLOSE().getSymbol().getLine());
            row.setName("SLASH_CLOSE");
            row.setValue(ctx.SLASH_CLOSE().getText());
            row.setType("KeyWord");
            sympoleTableClass.getRows().add(row);
        }
        return selfClosingTag;
    }

    @Override
    public TagsDocument visitTagsDocument(PythonParser.TagsDocumentContext ctx) {
        TagsDocument tagsDocument = new TagsDocument();
        for(int i =0;i<ctx.tagtype().size();i++){
            if(ctx.tagtype().get(i)!=null){
                tagsDocument.getTagTypes().add(visitTagtype(ctx.tagtype().get(i)));
            }
        }
        for(int i=0;i<ctx.ID().size();i++){
            if(ctx.ID().get(i)!=null){
                tagsDocument.getID().add(ctx.ID(i).getText());
            }
        }
        return tagsDocument;

    }


}
