// Generated from C:/Users/x/IdeaProjects/Compiler/src/antlr/PythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRUEBOOL=1, FALSEBOOL=2, FOR=3, IF=4, ELSE=5, ELIF=6, WHILE=7, BREAK=8, 
		CONTINUE=9, RETURN=10, PRINT=11, TYPE=12, INPUT=13, LEN=14, APPEND=15, 
		INSERT=16, POP=17, CLASS=18, DEF=19, CLS=20, SELF=21, INIT=22, SUPER=23, 
		STR=24, REPR=25, EXIT=26, DEL=27, ENTER=28, NONE=29, SETTER=30, PROPERTY=31, 
		CLASSMETHOD=32, STATICMETHOD=33, DOT=34, COLONE=35, COMMA=36, AT=37, PRIVATE=38, 
		PROTECTED=39, OPENPRAC=40, CLOSEPRAC=41, OPENKPRA=42, CLOSEKPRA=43, OPENSQUER=44, 
		CLOSESQUER=45, RANGE=46, DOUBLEOPENKPRA=47, DOUBLECLOSEKPRA=48, IMPORT=49, 
		FROM=50, FLASKLIB=51, FLASK=52, RENDERTEMPLATE=53, REQUEST=54, URLFOR=55, 
		REDIRECT=56, OS=57, UTILS=58, SEQUREFILENAME=59, NAME=60, CONFIG=61, ROUTE=62, 
		METHODS=63, METHOD=64, FORM=65, FILES=66, GET=67, SAVE=68, PATH=69, JOIN=70, 
		FILENAME=71, RUN=72, DEBUG=73, MAIN=74, UPLOADFOLDER=75, ENDIF=76, ENDFOR=77, 
		OPENCONDITION=78, CLOSECONDITION=79, OPENCOMMENT=80, CLOSECOMMENT=81, 
		TAG_OPEN=82, TAG_OPEN_SLASH=83, SLASH_CLOSE=84, TAG_CLOSE=85, DOCTYPEHTML_TAG=86, 
		HTML_TAG=87, HEAD_TAG=88, BODY_TAG=89, DIV_TAG=90, P_TAG=91, IMG_TAG=92, 
		H1_TAG=93, H2_TAG=94, H3_TAG=95, H4_TAG=96, TITLE=97, BUTTON_TAG=98, UL_TAG=99, 
		LI_TAG=100, A_TAG=101, LABEL_TAG=102, LINK=103, STYLE=104, SRC=105, ALT=106, 
		IDHTML=107, HREF=108, VALUE=109, NAMEHTML=110, PLACEHOLDER=111, REL=112, 
		ENCTYPE=113, RQUIRED=114, SUM=115, SUB=116, MULT=117, DIVISION=118, EQUALS=119, 
		ISEQUALS=120, ISGRATER=121, ISSMALLER=122, POW=123, MOD=124, IFGREATEROREQUALS=125, 
		IFSMALLEROREQUALS=126, INCREMENT=127, DECREMENT=128, OR=129, AND=130, 
		NOT=131, NOTEQUALS=132, IS=133, ISNOT=134, IN=135, NOTIN=136, INT=137, 
		DOUBLE=138, ID=139, ROUTEPATH=140, STRING=141, COMMENT=142, WHSPACE=143, 
		NEWLINE=144;
	public static final int
		RULE_program = 0, RULE_state = 1, RULE_var_decl = 2, RULE_value = 3, RULE_arr = 4, 
		RULE_arr_decl = 5, RULE_while_value = 6, RULE_loops = 7, RULE_for = 8, 
		RULE_while = 9, RULE_exp = 10, RULE_condition = 11, RULE_if = 12, RULE_elif = 13, 
		RULE_else = 14, RULE_func_decl = 15, RULE_paralist = 16, RULE_call_func = 17, 
		RULE_build_in_func = 18, RULE_appendfunc = 19, RULE_appendvar = 20, RULE_appendparlist = 21, 
		RULE_return = 22, RULE_run = 23, RULE_class_decl = 24, RULE_construture_decl = 25, 
		RULE_object = 26, RULE_call_fromclass = 27, RULE_inheritance = 28, RULE_encapsulation = 29, 
		RULE_flask = 30, RULE_flasklib = 31, RULE_flaskfragment = 32, RULE_flasklibrarydecl = 33, 
		RULE_liblist = 34, RULE_libvalue = 35, RULE_osdecl = 36, RULE_utilsdecl = 37, 
		RULE_appdecl = 38, RULE_apprun = 39, RULE_appconfig = 40, RULE_flaskstate = 41, 
		RULE_routdecl = 42, RULE_methods = 43, RULE_routestate = 44, RULE_var_flask_decl = 45, 
		RULE_route_call = 46, RULE_requestcall = 47, RULE_flask_condition = 48, 
		RULE_flask_exp = 49, RULE_flask_func_decl = 50, RULE_falsk_return = 51, 
		RULE_redirect = 52, RULE_rendertemplate = 53, RULE_state_jinja2 = 54, 
		RULE_printinjinja = 55, RULE_condition_jinja2 = 56, RULE_for_jinja2 = 57, 
		RULE_if_jinja2 = 58, RULE_elif_jinja2 = 59, RULE_else_jinja2 = 60, RULE_document = 61, 
		RULE_fullHtmlDocument = 62, RULE_doctypehtml = 63, RULE_htmlOpen = 64, 
		RULE_htmlClose = 65, RULE_headSection = 66, RULE_bodySection = 67, RULE_content = 68, 
		RULE_tagtype = 69, RULE_startTag = 70, RULE_endTag = 71, RULE_attribute = 72, 
		RULE_tagName = 73, RULE_selfClosingtag = 74, RULE_tagsDocument = 75;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "state", "var_decl", "value", "arr", "arr_decl", "while_value", 
			"loops", "for", "while", "exp", "condition", "if", "elif", "else", "func_decl", 
			"paralist", "call_func", "build_in_func", "appendfunc", "appendvar", 
			"appendparlist", "return", "run", "class_decl", "construture_decl", "object", 
			"call_fromclass", "inheritance", "encapsulation", "flask", "flasklib", 
			"flaskfragment", "flasklibrarydecl", "liblist", "libvalue", "osdecl", 
			"utilsdecl", "appdecl", "apprun", "appconfig", "flaskstate", "routdecl", 
			"methods", "routestate", "var_flask_decl", "route_call", "requestcall", 
			"flask_condition", "flask_exp", "flask_func_decl", "falsk_return", "redirect", 
			"rendertemplate", "state_jinja2", "printinjinja", "condition_jinja2", 
			"for_jinja2", "if_jinja2", "elif_jinja2", "else_jinja2", "document", 
			"fullHtmlDocument", "doctypehtml", "htmlOpen", "htmlClose", "headSection", 
			"bodySection", "content", "tagtype", "startTag", "endTag", "attribute", 
			"tagName", "selfClosingtag", "tagsDocument"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'True'", "'False'", "'for'", "'if'", "'else'", "'elif'", "'while'", 
			"'break'", "'continue'", "'return'", "'print'", "'type'", "'input'", 
			"'len'", "'append'", "'insert'", "'pop'", "'class'", "'def'", "'cls'", 
			"'self'", "'__init__'", "'super'", "'str'", "'repr'", "'exit'", "'del'", 
			"'enter'", "'None'", "'setter'", "'property'", "'classmethod'", "'staticmethod'", 
			"'.'", "':'", "','", "'@'", "'__'", "'_'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "'range'", "'{{'", "'}}'", "'import'", "'from'", "'flask'", 
			"'Flask'", "'render_template'", "'request'", "'url_for'", "'redirect'", 
			"'os'", "'werkzeug.utils'", "'secure_filename'", "'__name__'", "'config'", 
			"'route'", "'methods'", "'method'", "'form'", "'files'", "'get'", "'save'", 
			"'path'", "'join'", "'filename'", "'run'", "'debug'", "'__main__'", "'UPLOAD_FOLDER'", 
			"'endif'", "'endfor'", "'{%'", "'%}'", "'{#'", "'#}'", null, "'</'", 
			"'/>'", null, "'!DOCTYPE html'", "'html'", "'head'", "'body'", "'div'", 
			"'p'", "'img'", "'h1'", "'h2'", "'h3'", "'h4'", "'title'", "'button'", 
			"'ul'", "'li'", "'a'", "'label'", "'link'", "'style'", "'src'", "'alt'", 
			"'id'", "'href'", "'value'", "'name'", "'placeholder'", "'rel'", "'enctype'", 
			"'required'", "'+'", "'-'", "'*'", "'/'", "'='", "'=='", null, null, 
			"'**'", "'%'", "'>='", "'<='", "'++'", "'--'", null, null, null, "'!='", 
			"'is'", "'is not'", "'in'", "'not in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRUEBOOL", "FALSEBOOL", "FOR", "IF", "ELSE", "ELIF", "WHILE", 
			"BREAK", "CONTINUE", "RETURN", "PRINT", "TYPE", "INPUT", "LEN", "APPEND", 
			"INSERT", "POP", "CLASS", "DEF", "CLS", "SELF", "INIT", "SUPER", "STR", 
			"REPR", "EXIT", "DEL", "ENTER", "NONE", "SETTER", "PROPERTY", "CLASSMETHOD", 
			"STATICMETHOD", "DOT", "COLONE", "COMMA", "AT", "PRIVATE", "PROTECTED", 
			"OPENPRAC", "CLOSEPRAC", "OPENKPRA", "CLOSEKPRA", "OPENSQUER", "CLOSESQUER", 
			"RANGE", "DOUBLEOPENKPRA", "DOUBLECLOSEKPRA", "IMPORT", "FROM", "FLASKLIB", 
			"FLASK", "RENDERTEMPLATE", "REQUEST", "URLFOR", "REDIRECT", "OS", "UTILS", 
			"SEQUREFILENAME", "NAME", "CONFIG", "ROUTE", "METHODS", "METHOD", "FORM", 
			"FILES", "GET", "SAVE", "PATH", "JOIN", "FILENAME", "RUN", "DEBUG", "MAIN", 
			"UPLOADFOLDER", "ENDIF", "ENDFOR", "OPENCONDITION", "CLOSECONDITION", 
			"OPENCOMMENT", "CLOSECOMMENT", "TAG_OPEN", "TAG_OPEN_SLASH", "SLASH_CLOSE", 
			"TAG_CLOSE", "DOCTYPEHTML_TAG", "HTML_TAG", "HEAD_TAG", "BODY_TAG", "DIV_TAG", 
			"P_TAG", "IMG_TAG", "H1_TAG", "H2_TAG", "H3_TAG", "H4_TAG", "TITLE", 
			"BUTTON_TAG", "UL_TAG", "LI_TAG", "A_TAG", "LABEL_TAG", "LINK", "STYLE", 
			"SRC", "ALT", "IDHTML", "HREF", "VALUE", "NAMEHTML", "PLACEHOLDER", "REL", 
			"ENCTYPE", "RQUIRED", "SUM", "SUB", "MULT", "DIVISION", "EQUALS", "ISEQUALS", 
			"ISGRATER", "ISSMALLER", "POW", "MOD", "IFGREATEROREQUALS", "IFSMALLEROREQUALS", 
			"INCREMENT", "DECREMENT", "OR", "AND", "NOT", "NOTEQUALS", "IS", "ISNOT", 
			"IN", "NOTIN", "INT", "DOUBLE", "ID", "ROUTEPATH", "STRING", "COMMENT", 
			"WHSPACE", "NEWLINE"
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
	public String getGrammarFileName() { return "PythonParser.g4"; }

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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<FlaskContext> flask() {
			return getRuleContexts(FlaskContext.class);
		}
		public FlaskContext flask(int i) {
			return getRuleContext(FlaskContext.class,i);
		}
		public List<DocumentContext> document() {
			return getRuleContexts(DocumentContext.class);
		}
		public DocumentContext document(int i) {
			return getRuleContext(DocumentContext.class,i);
		}
		public List<State_jinja2Context> state_jinja2() {
			return getRuleContexts(State_jinja2Context.class);
		}
		public State_jinja2Context state_jinja2(int i) {
			return getRuleContext(State_jinja2Context.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1847180072515838L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 34817L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 21L) != 0)) {
				{
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(152);
					state();
					}
					break;
				case 2:
					{
					setState(153);
					flask();
					}
					break;
				case 3:
					{
					setState(154);
					document();
					}
					break;
				case 4:
					{
					setState(155);
					state_jinja2();
					}
					break;
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateContext extends ParserRuleContext {
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
	 
		public StateContext() { }
		public void copyFrom(StateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpLableContext extends StateContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpLableContext(StateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExpLable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExpLable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExpLable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjLableContext extends StateContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjLableContext(StateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterObjLable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitObjLable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitObjLable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionLableContext extends StateContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionLableContext(StateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterConditionLable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitConditionLable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitConditionLable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopslableContext extends StateContext {
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public LoopslableContext(StateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLoopslable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLoopslable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLoopslable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclLableContext extends StateContext {
		public Class_declContext class_decl() {
			return getRuleContext(Class_declContext.class,0);
		}
		public ClassDeclLableContext(StateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassDeclLable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassDeclLable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassDeclLable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrdecllableContext extends StateContext {
		public Arr_declContext arr_decl() {
			return getRuleContext(Arr_declContext.class,0);
		}
		public ArrdecllableContext(StateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArrdecllable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArrdecllable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArrdecllable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VardecllableContext extends StateContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public VardecllableContext(StateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterVardecllable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitVardecllable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitVardecllable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncDeclLableContext extends StateContext {
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public FuncDeclLableContext(StateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFuncDeclLable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFuncDeclLable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFuncDeclLable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFromClassLableContext extends StateContext {
		public Call_fromclassContext call_fromclass() {
			return getRuleContext(Call_fromclassContext.class,0);
		}
		public CallFromClassLableContext(StateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCallFromClassLable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCallFromClassLable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCallFromClassLable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InheritLableContext extends StateContext {
		public InheritanceContext inheritance() {
			return getRuleContext(InheritanceContext.class,0);
		}
		public InheritLableContext(StateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterInheritLable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitInheritLable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitInheritLable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFuncLableContext extends StateContext {
		public Call_funcContext call_func() {
			return getRuleContext(Call_funcContext.class,0);
		}
		public CallFuncLableContext(StateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCallFuncLable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCallFuncLable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCallFuncLable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VardecllableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				var_decl();
				}
				break;
			case 2:
				_localctx = new ArrdecllableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				arr_decl();
				}
				break;
			case 3:
				_localctx = new LoopslableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				loops();
				}
				break;
			case 4:
				_localctx = new ExpLableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				exp(0);
				}
				break;
			case 5:
				_localctx = new ConditionLableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				condition();
				}
				break;
			case 6:
				_localctx = new FuncDeclLableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				func_decl();
				}
				break;
			case 7:
				_localctx = new CallFuncLableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				call_func();
				}
				break;
			case 8:
				_localctx = new ClassDeclLableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(170);
				class_decl();
				}
				break;
			case 9:
				_localctx = new ObjLableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(171);
				object();
				}
				break;
			case 10:
				_localctx = new CallFromClassLableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(172);
				call_fromclass();
				}
				break;
			case 11:
				_localctx = new InheritLableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(173);
				inheritance();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(PythonParser.EQUALS, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(176);
				match(ID);
				}
				break;
			case 2:
				{
				setState(177);
				arr();
				}
				break;
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(180);
				match(EQUALS);
				}
			}

			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(183);
				value();
				}
				break;
			case 2:
				{
				setState(184);
				exp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PythonParser.INT, 0); }
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(PythonParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public TerminalNode TRUEBOOL() { return getToken(PythonParser.TRUEBOOL, 0); }
		public TerminalNode FALSEBOOL() { return getToken(PythonParser.FALSEBOOL, 0); }
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				arr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				match(TRUEBOOL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(193);
				match(FALSEBOOL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(194);
				match(NONE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrContext extends ParserRuleContext {
		public TerminalNode OPENSQUER() { return getToken(PythonParser.OPENSQUER, 0); }
		public TerminalNode CLOSESQUER() { return getToken(PythonParser.CLOSESQUER, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(197);
				match(ID);
				}
			}

			setState(200);
			match(OPENSQUER);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592722915334L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 23L) != 0)) {
				{
				{
				setState(201);
				value();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(202);
					match(COMMA);
					setState(203);
					value();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(CLOSESQUER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arr_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(PythonParser.EQUALS, 0); }
		public TerminalNode OPENSQUER() { return getToken(PythonParser.OPENSQUER, 0); }
		public TerminalNode CLOSESQUER() { return getToken(PythonParser.CLOSESQUER, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Arr_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArr_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArr_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArr_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_declContext arr_decl() throws RecognitionException {
		Arr_declContext _localctx = new Arr_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arr_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ID);
			setState(217);
			match(EQUALS);
			setState(218);
			match(OPENSQUER);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592722915334L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 23L) != 0)) {
				{
				{
				setState(219);
				value();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(220);
					match(COMMA);
					setState(221);
					value();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(CLOSESQUER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_valueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PythonParser.INT, 0); }
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(PythonParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode TRUEBOOL() { return getToken(PythonParser.TRUEBOOL, 0); }
		public TerminalNode FALSEBOOL() { return getToken(PythonParser.FALSEBOOL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public While_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWhile_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWhile_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWhile_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_valueContext while_value() throws RecognitionException {
		While_valueContext _localctx = new While_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_value);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(DOUBLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(TRUEBOOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				match(FALSEBOOL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(240);
				exp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopsContext extends ParserRuleContext {
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLoops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLoops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loops);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				for_();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				while_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public TerminalNode COLONE() { return getToken(PythonParser.COLONE, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(PythonParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(PythonParser.CONTINUE, 0); }
		public TerminalNode RANGE() { return getToken(PythonParser.RANGE, 0); }
		public TerminalNode OPENPRAC() { return getToken(PythonParser.OPENPRAC, 0); }
		public TerminalNode CLOSEPRAC() { return getToken(PythonParser.CLOSEPRAC, 0); }
		public TerminalNode INT() { return getToken(PythonParser.INT, 0); }
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(FOR);
			setState(248);
			match(ID);
			setState(249);
			match(IN);
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLONE:
			case RANGE:
				{
				{
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE) {
					{
					setState(250);
					match(RANGE);
					setState(251);
					match(OPENPRAC);
					setState(252);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(253);
					match(CLOSEPRAC);
					}
				}

				}
				}
				break;
			case ID:
				{
				setState(256);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(259);
			match(COLONE);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					state();
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(266);
				_la = _input.LA(1);
				if ( !(_la==BREAK || _la==CONTINUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public While_valueContext while_value() {
			return getRuleContext(While_valueContext.class,0);
		}
		public TerminalNode COLONE() { return getToken(PythonParser.COLONE, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(PythonParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(PythonParser.CONTINUE, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(WHILE);
			setState(270);
			while_value();
			setState(271);
			match(COLONE);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(272);
					state();
					}
					} 
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(278);
				_la = _input.LA(1);
				if ( !(_la==BREAK || _la==CONTINUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PythonParser.INT, 0); }
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public TerminalNode TRUEBOOL() { return getToken(PythonParser.TRUEBOOL, 0); }
		public TerminalNode FALSEBOOL() { return getToken(PythonParser.FALSEBOOL, 0); }
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode POW() { return getToken(PythonParser.POW, 0); }
		public TerminalNode MULT() { return getToken(PythonParser.MULT, 0); }
		public TerminalNode DIVISION() { return getToken(PythonParser.DIVISION, 0); }
		public TerminalNode MOD() { return getToken(PythonParser.MOD, 0); }
		public TerminalNode SUM() { return getToken(PythonParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(PythonParser.SUB, 0); }
		public TerminalNode ISEQUALS() { return getToken(PythonParser.ISEQUALS, 0); }
		public TerminalNode ISGRATER() { return getToken(PythonParser.ISGRATER, 0); }
		public TerminalNode ISSMALLER() { return getToken(PythonParser.ISSMALLER, 0); }
		public TerminalNode IFGREATEROREQUALS() { return getToken(PythonParser.IFGREATEROREQUALS, 0); }
		public TerminalNode IFSMALLEROREQUALS() { return getToken(PythonParser.IFSMALLEROREQUALS, 0); }
		public TerminalNode OR() { return getToken(PythonParser.OR, 0); }
		public TerminalNode AND() { return getToken(PythonParser.AND, 0); }
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(282);
				match(INT);
				}
				break;
			case 2:
				{
				setState(283);
				match(ID);
				}
				break;
			case 3:
				{
				setState(284);
				match(ID);
				setState(285);
				match(DOT);
				setState(286);
				match(ID);
				}
				break;
			case 4:
				{
				setState(287);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(288);
				match(TRUEBOOL);
				}
				break;
			case 6:
				{
				setState(289);
				match(FALSEBOOL);
				}
				break;
			case 7:
				{
				setState(290);
				match(NONE);
				}
				break;
			case 8:
				{
				setState(291);
				arr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(294);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(295);
						match(POW);
						setState(296);
						exp(23);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(297);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(298);
						match(MULT);
						setState(299);
						exp(22);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(300);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(301);
						match(DIVISION);
						setState(302);
						exp(21);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(303);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(304);
						match(MOD);
						setState(305);
						exp(20);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(306);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(307);
						match(SUM);
						setState(308);
						exp(19);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(309);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(310);
						match(SUB);
						setState(311);
						exp(18);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(312);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(313);
						match(ISEQUALS);
						setState(314);
						exp(17);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(315);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(316);
						match(ISGRATER);
						setState(317);
						exp(16);
						}
						break;
					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(318);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(319);
						match(ISSMALLER);
						setState(320);
						exp(15);
						}
						break;
					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(321);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(322);
						match(IFGREATEROREQUALS);
						setState(323);
						exp(14);
						}
						break;
					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(324);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(325);
						match(IFSMALLEROREQUALS);
						setState(326);
						exp(13);
						}
						break;
					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(327);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(328);
						match(OR);
						setState(329);
						exp(12);
						}
						break;
					case 13:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(330);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(331);
						match(AND);
						setState(332);
						exp(11);
						}
						break;
					case 14:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(333);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(334);
						match(IS);
						setState(335);
						exp(10);
						}
						break;
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ElifContext elif() {
			return getRuleContext(ElifContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				if_();
				}
				break;
			case ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				elif();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				else_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode COLONE() { return getToken(PythonParser.COLONE, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(IF);
			setState(347);
			exp(0);
			setState(348);
			match(COLONE);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(349);
					state();
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElifContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(PythonParser.ELIF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode COLONE() { return getToken(PythonParser.COLONE, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public ElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifContext elif() throws RecognitionException {
		ElifContext _localctx = new ElifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elif);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(ELIF);
			setState(356);
			exp(0);
			setState(357);
			match(COLONE);
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					state();
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public TerminalNode COLONE() { return getToken(PythonParser.COLONE, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_else);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(ELSE);
			setState(365);
			match(COLONE);
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(366);
					state();
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_declContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode OPENPRAC() { return getToken(PythonParser.OPENPRAC, 0); }
		public TerminalNode CLOSEPRAC() { return getToken(PythonParser.CLOSEPRAC, 0); }
		public TerminalNode COLONE() { return getToken(PythonParser.COLONE, 0); }
		public ParalistContext paralist() {
			return getRuleContext(ParalistContext.class,0);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFunc_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunc_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(DEF);
			setState(373);
			match(ID);
			setState(374);
			match(OPENPRAC);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592722915334L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 23L) != 0)) {
				{
				setState(375);
				paralist();
				}
			}

			setState(378);
			match(CLOSEPRAC);
			setState(379);
			match(COLONE);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(380);
					state();
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(386);
				return_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParalistContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ParalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paralist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParalist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParalist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParalistContext paralist() throws RecognitionException {
		ParalistContext _localctx = new ParalistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_paralist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(389);
			value();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(390);
				match(COMMA);
				setState(391);
				value();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Call_funcContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode OPENPRAC() { return getToken(PythonParser.OPENPRAC, 0); }
		public TerminalNode CLOSEPRAC() { return getToken(PythonParser.CLOSEPRAC, 0); }
		public ParalistContext paralist() {
			return getRuleContext(ParalistContext.class,0);
		}
		public Build_in_funcContext build_in_func() {
			return getRuleContext(Build_in_funcContext.class,0);
		}
		public AppendfuncContext appendfunc() {
			return getRuleContext(AppendfuncContext.class,0);
		}
		public Call_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCall_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCall_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCall_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_funcContext call_func() throws RecognitionException {
		Call_funcContext _localctx = new Call_funcContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_call_func);
		int _la;
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(ID);
				setState(398);
				match(OPENPRAC);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592722915334L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 23L) != 0)) {
					{
					setState(399);
					paralist();
					}
				}

				setState(402);
				match(CLOSEPRAC);
				}
				break;
			case PRINT:
			case TYPE:
			case INPUT:
			case LEN:
			case POP:
			case GET:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				build_in_func();
				setState(404);
				match(OPENPRAC);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592722915334L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 23L) != 0)) {
					{
					setState(405);
					paralist();
					}
				}

				setState(408);
				match(CLOSEPRAC);
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				appendfunc();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Build_in_funcContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PythonParser.PRINT, 0); }
		public TerminalNode TYPE() { return getToken(PythonParser.TYPE, 0); }
		public TerminalNode INPUT() { return getToken(PythonParser.INPUT, 0); }
		public TerminalNode LEN() { return getToken(PythonParser.LEN, 0); }
		public TerminalNode POP() { return getToken(PythonParser.POP, 0); }
		public TerminalNode GET() { return getToken(PythonParser.GET, 0); }
		public Build_in_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_in_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBuild_in_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBuild_in_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBuild_in_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_in_funcContext build_in_func() throws RecognitionException {
		Build_in_funcContext _localctx = new Build_in_funcContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_build_in_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & 72057594037928015L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AppendfuncContext extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(PythonParser.APPEND, 0); }
		public TerminalNode OPENPRAC() { return getToken(PythonParser.OPENPRAC, 0); }
		public TerminalNode CLOSEPRAC() { return getToken(PythonParser.CLOSEPRAC, 0); }
		public AppendvarContext appendvar() {
			return getRuleContext(AppendvarContext.class,0);
		}
		public AppendfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAppendfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAppendfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAppendfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendfuncContext appendfunc() throws RecognitionException {
		AppendfuncContext _localctx = new AppendfuncContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_appendfunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(APPEND);
			setState(416);
			match(OPENPRAC);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENKPRA) {
				{
				setState(417);
				appendvar();
				}
			}

			setState(420);
			match(CLOSEPRAC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AppendvarContext extends ParserRuleContext {
		public TerminalNode OPENKPRA() { return getToken(PythonParser.OPENKPRA, 0); }
		public TerminalNode CLOSEKPRA() { return getToken(PythonParser.CLOSEKPRA, 0); }
		public List<AppendparlistContext> appendparlist() {
			return getRuleContexts(AppendparlistContext.class);
		}
		public AppendparlistContext appendparlist(int i) {
			return getRuleContext(AppendparlistContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public AppendvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAppendvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAppendvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAppendvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendvarContext appendvar() throws RecognitionException {
		AppendvarContext _localctx = new AppendvarContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_appendvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(OPENKPRA);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(423);
				appendparlist();
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(424);
					match(COMMA);
					setState(425);
					appendparlist();
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(433);
			match(CLOSEKPRA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AppendparlistContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode COLONE() { return getToken(PythonParser.COLONE, 0); }
		public TerminalNode LEN() { return getToken(PythonParser.LEN, 0); }
		public TerminalNode OPENPRAC() { return getToken(PythonParser.OPENPRAC, 0); }
		public TerminalNode CLOSEPRAC() { return getToken(PythonParser.CLOSEPRAC, 0); }
		public AppendparlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendparlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAppendparlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAppendparlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAppendparlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendparlistContext appendparlist() throws RecognitionException {
		AppendparlistContext _localctx = new AppendparlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_appendparlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(ID);
			setState(436);
			match(COLONE);
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(437);
				match(ID);
				}
				break;
			case LEN:
				{
				{
				setState(438);
				match(LEN);
				setState(439);
				match(OPENPRAC);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(440);
					match(ID);
					}
				}

				setState(443);
				match(CLOSEPRAC);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(RETURN);
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(447);
				value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RunContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(PythonParser.RUN, 0); }
		public TerminalNode OPENPRAC() { return getToken(PythonParser.OPENPRAC, 0); }
		public TerminalNode DEBUG() { return getToken(PythonParser.DEBUG, 0); }
		public TerminalNode EQUALS() { return getToken(PythonParser.EQUALS, 0); }
		public TerminalNode TRUEBOOL() { return getToken(PythonParser.TRUEBOOL, 0); }
		public TerminalNode CLOSEPRAC() { return getToken(PythonParser.CLOSEPRAC, 0); }
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_run);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(RUN);
			setState(451);
			match(OPENPRAC);
			setState(452);
			match(DEBUG);
			setState(453);
			match(EQUALS);
			setState(454);
			match(TRUEBOOL);
			setState(455);
			match(CLOSEPRAC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_declContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode COLONE() { return getToken(PythonParser.COLONE, 0); }
		public List<EncapsulationContext> encapsulation() {
			return getRuleContexts(EncapsulationContext.class);
		}
		public EncapsulationContext encapsulation(int i) {
			return getRuleContext(EncapsulationContext.class,i);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<Construture_declContext> construture_decl() {
			return getRuleContexts(Construture_declContext.class);
		}
		public Construture_declContext construture_decl(int i) {
			return getRuleContext(Construture_declContext.class,i);
		}
		public Class_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClass_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClass_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClass_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declContext class_decl() throws RecognitionException {
		Class_declContext _localctx = new Class_declContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_class_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(CLASS);
			setState(458);
			match(ID);
			setState(459);
			match(COLONE);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIVATE || _la==PROTECTED) {
				{
				{
				setState(460);
				encapsulation();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(466);
					state();
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(472);
					construture_decl();
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Construture_declContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode INIT() { return getToken(PythonParser.INIT, 0); }
		public TerminalNode OPENPRAC() { return getToken(PythonParser.OPENPRAC, 0); }
		public TerminalNode CLOSEPRAC() { return getToken(PythonParser.CLOSEPRAC, 0); }
		public TerminalNode COLONE() { return getToken(PythonParser.COLONE, 0); }
		public List<TerminalNode> SELF() { return getTokens(PythonParser.SELF); }
		public TerminalNode SELF(int i) {
			return getToken(PythonParser.SELF, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(PythonParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(PythonParser.EQUALS, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public ParalistContext paralist() {
			return getRuleContext(ParalistContext.class,0);
		}
		public Construture_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construture_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterConstruture_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitConstruture_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitConstruture_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Construture_declContext construture_decl() throws RecognitionException {
		Construture_declContext _localctx = new Construture_declContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_construture_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(DEF);
			setState(479);
			match(INIT);
			setState(480);
			match(OPENPRAC);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELF) {
				{
				setState(481);
				match(SELF);
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(482);
					match(COMMA);
					}
				}

				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592722915334L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 23L) != 0)) {
					{
					setState(485);
					paralist();
					}
				}

				}
			}

			setState(490);
			match(CLOSEPRAC);
			setState(491);
			match(COLONE);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELF) {
				{
				{
				setState(492);
				match(SELF);
				setState(493);
				match(DOT);
				setState(494);
				match(ID);
				setState(495);
				match(EQUALS);
				setState(496);
				value();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(502);
					state();
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(PythonParser.EQUALS, 0); }
		public TerminalNode OPENPRAC() { return getToken(PythonParser.OPENPRAC, 0); }
		public TerminalNode CLOSEPRAC() { return getToken(PythonParser.CLOSEPRAC, 0); }
		public TerminalNode SELF() { return getToken(PythonParser.SELF, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public ParalistContext paralist() {
			return getRuleContext(ParalistContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(ID);
			setState(509);
			match(EQUALS);
			setState(510);
			match(ID);
			setState(511);
			match(OPENPRAC);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELF) {
				{
				setState(512);
				match(SELF);
				}
			}

			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(515);
				match(COMMA);
				}
			}

			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592722915334L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 23L) != 0)) {
				{
				setState(518);
				paralist();
				}
			}

			setState(521);
			match(CLOSEPRAC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Call_fromclassContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public Call_funcContext call_func() {
			return getRuleContext(Call_funcContext.class,0);
		}
		public Call_fromclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_fromclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCall_fromclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCall_fromclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCall_fromclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_fromclassContext call_fromclass() throws RecognitionException {
		Call_fromclassContext _localctx = new Call_fromclassContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_call_fromclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(ID);
			setState(524);
			match(DOT);
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(525);
				call_func();
				}
				break;
			case 2:
				{
				setState(526);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InheritanceContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public List<TerminalNode> OPENPRAC() { return getTokens(PythonParser.OPENPRAC); }
		public TerminalNode OPENPRAC(int i) {
			return getToken(PythonParser.OPENPRAC, i);
		}
		public List<TerminalNode> CLOSEPRAC() { return getTokens(PythonParser.CLOSEPRAC); }
		public TerminalNode CLOSEPRAC(int i) {
			return getToken(PythonParser.CLOSEPRAC, i);
		}
		public TerminalNode COLONE() { return getToken(PythonParser.COLONE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TerminalNode SUPER() { return getToken(PythonParser.SUPER, 0); }
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode INIT() { return getToken(PythonParser.INIT, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public InheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitInheritance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitInheritance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritanceContext inheritance() throws RecognitionException {
		InheritanceContext _localctx = new InheritanceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_inheritance);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(CLASS);
			setState(530);
			match(ID);
			setState(531);
			match(OPENPRAC);
			setState(532);
			match(ID);
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(533);
				match(COMMA);
				setState(534);
				match(ID);
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
			match(CLOSEPRAC);
			setState(541);
			match(COLONE);
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUPER) {
				{
				setState(542);
				match(SUPER);
				setState(543);
				match(DOT);
				setState(544);
				match(INIT);
				setState(545);
				match(OPENPRAC);
				setState(546);
				match(CLOSEPRAC);
				}
			}

			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(549);
					state();
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EncapsulationContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(PythonParser.PRIVATE, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode PROTECTED() { return getToken(PythonParser.PROTECTED, 0); }
		public EncapsulationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encapsulation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEncapsulation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEncapsulation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEncapsulation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncapsulationContext encapsulation() throws RecognitionException {
		EncapsulationContext _localctx = new EncapsulationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_encapsulation);
		try {
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIVATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				match(PRIVATE);
				setState(556);
				var_decl();
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(PROTECTED);
				setState(558);
				var_decl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FlaskContext extends ParserRuleContext {
		public FlaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flask; }
	 
		public FlaskContext() { }
		public void copyFrom(FlaskContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlasklibraryLabelContext extends FlaskContext {
		public FlasklibContext flasklib() {
			return getRuleContext(FlasklibContext.class,0);
		}
		public FlasklibraryLabelContext(FlaskContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlasklibraryLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlasklibraryLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlasklibraryLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlaskfragLabelContext extends FlaskContext {
		public FlaskfragmentContext flaskfragment() {
			return getRuleContext(FlaskfragmentContext.class,0);
		}
		public FlaskfragLabelContext(FlaskContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlaskfragLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlaskfragLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlaskfragLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlaskContext flask() throws RecognitionException {
		FlaskContext _localctx = new FlaskContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_flask);
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new FlasklibraryLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				flasklib();
				}
				break;
			case 2:
				_localctx = new FlaskfragLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				flaskfragment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FlasklibContext extends ParserRuleContext {
		public FlasklibrarydeclContext flasklibrarydecl() {
			return getRuleContext(FlasklibrarydeclContext.class,0);
		}
		public OsdeclContext osdecl() {
			return getRuleContext(OsdeclContext.class,0);
		}
		public UtilsdeclContext utilsdecl() {
			return getRuleContext(UtilsdeclContext.class,0);
		}
		public FlasklibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flasklib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlasklib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlasklib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlasklib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlasklibContext flasklib() throws RecognitionException {
		FlasklibContext _localctx = new FlasklibContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_flasklib);
		try {
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				flasklibrarydecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				osdecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(567);
				utilsdecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FlaskfragmentContext extends ParserRuleContext {
		public FlasklibrarydeclContext flasklibrarydecl() {
			return getRuleContext(FlasklibrarydeclContext.class,0);
		}
		public AppdeclContext appdecl() {
			return getRuleContext(AppdeclContext.class,0);
		}
		public ApprunContext apprun() {
			return getRuleContext(ApprunContext.class,0);
		}
		public FlaskstateContext flaskstate() {
			return getRuleContext(FlaskstateContext.class,0);
		}
		public FlaskfragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flaskfragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlaskfragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlaskfragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlaskfragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlaskfragmentContext flaskfragment() throws RecognitionException {
		FlaskfragmentContext _localctx = new FlaskfragmentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_flaskfragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			flasklibrarydecl();
			setState(571);
			appdecl();
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(572);
				flaskstate();
				}
				break;
			}
			setState(575);
			apprun();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FlasklibrarydeclContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public TerminalNode FLASKLIB() { return getToken(PythonParser.FLASKLIB, 0); }
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public LiblistContext liblist() {
			return getRuleContext(LiblistContext.class,0);
		}
		public FlasklibContext flasklib() {
			return getRuleContext(FlasklibContext.class,0);
		}
		public FlasklibrarydeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flasklibrarydecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlasklibrarydecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlasklibrarydecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlasklibrarydecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlasklibrarydeclContext flasklibrarydecl() throws RecognitionException {
		FlasklibrarydeclContext _localctx = new FlasklibrarydeclContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_flasklibrarydecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(FROM);
			setState(578);
			match(FLASKLIB);
			setState(579);
			match(IMPORT);
			{
			setState(580);
			liblist();
			}
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(581);
				flasklib();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiblistContext extends ParserRuleContext {
		public List<LibvalueContext> libvalue() {
			return getRuleContexts(LibvalueContext.class);
		}
		public LibvalueContext libvalue(int i) {
			return getRuleContext(LibvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public LiblistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liblist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLiblist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLiblist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLiblist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiblistContext liblist() throws RecognitionException {
		LiblistContext _localctx = new LiblistContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_liblist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(584);
			libvalue();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(585);
				match(COMMA);
				setState(586);
				libvalue();
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LibvalueContext extends ParserRuleContext {
		public TerminalNode FLASK() { return getToken(PythonParser.FLASK, 0); }
		public TerminalNode RENDERTEMPLATE() { return getToken(PythonParser.RENDERTEMPLATE, 0); }
		public TerminalNode REQUEST() { return getToken(PythonParser.REQUEST, 0); }
		public TerminalNode URLFOR() { return getToken(PythonParser.URLFOR, 0); }
		public LibvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLibvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLibvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLibvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibvalueContext libvalue() throws RecognitionException {
		LibvalueContext _localctx = new LibvalueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_libvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67553994410557440L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OsdeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public TerminalNode OS() { return getToken(PythonParser.OS, 0); }
		public FlasklibContext flasklib() {
			return getRuleContext(FlasklibContext.class,0);
		}
		public OsdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_osdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterOsdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitOsdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitOsdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OsdeclContext osdecl() throws RecognitionException {
		OsdeclContext _localctx = new OsdeclContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_osdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(IMPORT);
			setState(595);
			match(OS);
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(596);
				flasklib();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UtilsdeclContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public TerminalNode UTILS() { return getToken(PythonParser.UTILS, 0); }
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public TerminalNode SEQUREFILENAME() { return getToken(PythonParser.SEQUREFILENAME, 0); }
		public FlasklibContext flasklib() {
			return getRuleContext(FlasklibContext.class,0);
		}
		public UtilsdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utilsdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterUtilsdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitUtilsdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitUtilsdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UtilsdeclContext utilsdecl() throws RecognitionException {
		UtilsdeclContext _localctx = new UtilsdeclContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_utilsdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(FROM);
			setState(600);
			match(UTILS);
			setState(601);
			match(IMPORT);
			setState(602);
			match(SEQUREFILENAME);
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(603);
				flasklib();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AppdeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(PythonParser.EQUALS, 0); }
		public TerminalNode FLASK() { return getToken(PythonParser.FLASK, 0); }
		public TerminalNode OPENPRAC() { return getToken(PythonParser.OPENPRAC, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode CLOSEPRAC() { return getToken(PythonParser.CLOSEPRAC, 0); }
		public AppdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAppdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAppdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAppdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppdeclContext appdecl() throws RecognitionException {
		AppdeclContext _localctx = new AppdeclContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_appdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(ID);
			setState(607);
			match(EQUALS);
			setState(608);
			match(FLASK);
			setState(609);
			match(OPENPRAC);
			setState(610);
			match(NAME);
			setState(611);
			match(CLOSEPRAC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ApprunContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode ISEQUALS() { return getToken(PythonParser.ISEQUALS, 0); }
		public TerminalNode MAIN() { return getToken(PythonParser.MAIN, 0); }
		public TerminalNode COLONE() { return getToken(PythonParser.COLONE, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public RunContext run() {
			return getRuleContext(RunContext.class,0);
		}
		public ApprunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apprun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterApprun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitApprun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitApprun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApprunContext apprun() throws RecognitionException {
		ApprunContext _localctx = new ApprunContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_apprun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(IF);
			setState(614);
			match(NAME);
			setState(615);
			match(ISEQUALS);
			setState(616);
			match(MAIN);
			setState(617);
			match(COLONE);
			setState(618);
			match(ID);
			setState(619);
			match(DOT);
			setState(620);
			run();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AppconfigContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode CONFIG() { return getToken(PythonParser.CONFIG, 0); }
		public TerminalNode OPENSQUER() { return getToken(PythonParser.OPENSQUER, 0); }
		public TerminalNode UPLOADFOLDER() { return getToken(PythonParser.UPLOADFOLDER, 0); }
		public TerminalNode CLOSESQUER() { return getToken(PythonParser.CLOSESQUER, 0); }
		public TerminalNode EQUALS() { return getToken(PythonParser.EQUALS, 0); }
		public AppconfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appconfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAppconfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAppconfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAppconfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppconfigContext appconfig() throws RecognitionException {
		AppconfigContext _localctx = new AppconfigContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_appconfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(ID);
			setState(623);
			match(DOT);
			setState(624);
			match(CONFIG);
			setState(625);
			match(OPENSQUER);
			setState(626);
			match(UPLOADFOLDER);
			setState(627);
			match(CLOSESQUER);
			setState(628);
			match(EQUALS);
			setState(629);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FlaskstateContext extends ParserRuleContext {
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<RoutdeclContext> routdecl() {
			return getRuleContexts(RoutdeclContext.class);
		}
		public RoutdeclContext routdecl(int i) {
			return getRuleContext(RoutdeclContext.class,i);
		}
		public List<AppconfigContext> appconfig() {
			return getRuleContexts(AppconfigContext.class);
		}
		public AppconfigContext appconfig(int i) {
			return getRuleContext(AppconfigContext.class,i);
		}
		public FlaskstateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flaskstate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlaskstate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlaskstate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlaskstate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlaskstateContext flaskstate() throws RecognitionException {
		FlaskstateContext _localctx = new FlaskstateContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_flaskstate);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(634); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(634);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(631);
						state();
						}
						break;
					case 2:
						{
						setState(632);
						routdecl();
						}
						break;
					case 3:
						{
						setState(633);
						appconfig();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(636); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoutdeclContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public TerminalNode ID() { return getToken(PythonParser.ID, 0); }
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode ROUTE() { return getToken(PythonParser.ROUTE, 0); }
		public TerminalNode OPENPRAC() { return getToken(PythonParser.OPENPRAC, 0); }
		public TerminalNode ROUTEPATH() { return getToken(PythonParser.ROUTEPATH, 0); }
		public TerminalNode CLOSEPRAC() { return getToken(PythonParser.CLOSEPRAC, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public List<RoutestateContext> routestate() {
			return getRuleContexts(RoutestateContext.class);
		}
		public RoutestateContext routestate(int i) {
			return getRuleContext(RoutestateContext.class,i);
		}
		public RoutdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRoutdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRoutdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRoutdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutdeclContext routdecl() throws RecognitionException {
		RoutdeclContext _localctx = new RoutdeclContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_routdecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(AT);
			setState(639);
			match(ID);
			setState(640);
			match(DOT);
			setState(641);
			match(ROUTE);
			setState(642);
			match(OPENPRAC);
			setState(643);
			match(ROUTEPATH);
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(644);
				match(COMMA);
				setState(645);
				methods();
				}
			}

			setState(648);
			match(CLOSEPRAC);
			setState(652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(649);
					routestate();
					}
					} 
				}
				setState(654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodsContext extends ParserRuleContext {
		public TerminalNode METHODS() { return getToken(PythonParser.METHODS, 0); }
		public TerminalNode EQUALS() { return getToken(PythonParser.EQUALS, 0); }
		public TerminalNode OPENSQUER() { return getToken(PythonParser.OPENSQUER, 0); }
		public TerminalNode CLOSESQUER() { return getToken(PythonParser.CLOSESQUER, 0); }
		public List<TerminalNode> STRING() { return getTokens(PythonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PythonParser.STRING, i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_methods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(METHODS);
			setState(656);
			match(EQUALS);
			setState(657);
			match(OPENSQUER);
			{
			setState(658);
			match(STRING);
			setState(659);
			match(COMMA);
			setState(660);
			match(STRING);
			}
			setState(662);
			match(CLOSESQUER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoutestateContext extends ParserRuleContext {
		public Var_flask_declContext var_flask_decl() {
			return getRuleContext(Var_flask_declContext.class,0);
		}
		public Arr_declContext arr_decl() {
			return getRuleContext(Arr_declContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public Flask_expContext flask_exp() {
			return getRuleContext(Flask_expContext.class,0);
		}
		public Flask_conditionContext flask_condition() {
			return getRuleContext(Flask_conditionContext.class,0);
		}
		public Flask_func_declContext flask_func_decl() {
			return getRuleContext(Flask_func_declContext.class,0);
		}
		public Call_funcContext call_func() {
			return getRuleContext(Call_funcContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Call_fromclassContext call_fromclass() {
			return getRuleContext(Call_fromclassContext.class,0);
		}
		public Falsk_returnContext falsk_return() {
			return getRuleContext(Falsk_returnContext.class,0);
		}
		public RoutestateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routestate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRoutestate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRoutestate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRoutestate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutestateContext routestate() throws RecognitionException {
		RoutestateContext _localctx = new RoutestateContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_routestate);
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				var_flask_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				arr_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(666);
				loops();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(667);
				flask_exp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(668);
				flask_condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(669);
				flask_func_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(670);
				call_func();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(671);
				object();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(672);
				call_fromclass();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(673);
				falsk_return();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_flask_declContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(PythonParser.EQUALS, 0); }
		public Route_callContext route_call() {
			return getRuleContext(Route_callContext.class,0);
		}
		public TerminalNode SEQUREFILENAME() { return getToken(PythonParser.SEQUREFILENAME, 0); }
		public TerminalNode OPENPRAC() { return getToken(PythonParser.OPENPRAC, 0); }
		public TerminalNode CLOSEPRAC() { return getToken(PythonParser.CLOSEPRAC, 0); }
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode FILENAME() { return getToken(PythonParser.FILENAME, 0); }
		public Var_flask_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_flask_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterVar_flask_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitVar_flask_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitVar_flask_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_flask_declContext var_flask_decl() throws RecognitionException {
		Var_flask_declContext _localctx = new Var_flask_declContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_var_flask_decl);
		try {
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(677);
				match(ID);
				setState(678);
				match(EQUALS);
				setState(689);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REQUEST:
					{
					setState(679);
					route_call();
					}
					break;
				case SEQUREFILENAME:
					{
					setState(680);
					match(SEQUREFILENAME);
					setState(681);
					match(OPENPRAC);
					setState(686);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						{
						setState(682);
						match(ID);
						setState(683);
						match(DOT);
						setState(684);
						match(FILENAME);
						}
						}
						break;
					case STRING:
						{
						setState(685);
						match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(688);
					match(CLOSEPRAC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Route_callContext extends ParserRuleContext {
		public RequestcallContext requestcall() {
			return getRuleContext(RequestcallContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public Call_funcContext call_func() {
			return getRuleContext(Call_funcContext.class,0);
		}
		public Route_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_route_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRoute_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRoute_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRoute_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Route_callContext route_call() throws RecognitionException {
		Route_callContext _localctx = new Route_callContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_route_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			requestcall();
			setState(694);
			match(DOT);
			setState(695);
			call_func();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RequestcallContext extends ParserRuleContext {
		public TerminalNode REQUEST() { return getToken(PythonParser.REQUEST, 0); }
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode METHOD() { return getToken(PythonParser.METHOD, 0); }
		public TerminalNode FORM() { return getToken(PythonParser.FORM, 0); }
		public TerminalNode FILES() { return getToken(PythonParser.FILES, 0); }
		public RequestcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRequestcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRequestcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRequestcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequestcallContext requestcall() throws RecognitionException {
		RequestcallContext _localctx = new RequestcallContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_requestcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(REQUEST);
			setState(698);
			match(DOT);
			setState(699);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Flask_conditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public Flask_expContext flask_exp() {
			return getRuleContext(Flask_expContext.class,0);
		}
		public TerminalNode COLONE() { return getToken(PythonParser.COLONE, 0); }
		public List<RoutestateContext> routestate() {
			return getRuleContexts(RoutestateContext.class);
		}
		public RoutestateContext routestate(int i) {
			return getRuleContext(RoutestateContext.class,i);
		}
		public Flask_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flask_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlask_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlask_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlask_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flask_conditionContext flask_condition() throws RecognitionException {
		Flask_conditionContext _localctx = new Flask_conditionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_flask_condition);
		try {
			int _alt;
			setState(711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				match(IF);
				setState(703);
				flask_exp();
				setState(704);
				match(COLONE);
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(705);
						routestate();
						}
						} 
					}
					setState(710);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Flask_expContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode REQUEST() { return getToken(PythonParser.REQUEST, 0); }
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public TerminalNode METHOD() { return getToken(PythonParser.METHOD, 0); }
		public TerminalNode ISEQUALS() { return getToken(PythonParser.ISEQUALS, 0); }
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public Flask_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flask_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlask_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlask_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlask_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flask_expContext flask_exp() throws RecognitionException {
		Flask_expContext _localctx = new Flask_expContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_flask_exp);
		try {
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUEBOOL:
			case FALSEBOOL:
			case NONE:
			case OPENSQUER:
			case INT:
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				exp(0);
				}
				break;
			case REQUEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				match(REQUEST);
				setState(715);
				match(DOT);
				setState(716);
				match(METHOD);
				setState(717);
				match(ISEQUALS);
				setState(718);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Flask_func_declContext extends ParserRuleContext {
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public List<RoutestateContext> routestate() {
			return getRuleContexts(RoutestateContext.class);
		}
		public RoutestateContext routestate(int i) {
			return getRuleContext(RoutestateContext.class,i);
		}
		public Falsk_returnContext falsk_return() {
			return getRuleContext(Falsk_returnContext.class,0);
		}
		public Flask_func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flask_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFlask_func_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFlask_func_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFlask_func_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flask_func_declContext flask_func_decl() throws RecognitionException {
		Flask_func_declContext _localctx = new Flask_func_declContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_flask_func_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			func_decl();
			setState(725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(722);
					routestate();
					}
					} 
				}
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(728);
				falsk_return();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Falsk_returnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public RedirectContext redirect() {
			return getRuleContext(RedirectContext.class,0);
		}
		public RendertemplateContext rendertemplate() {
			return getRuleContext(RendertemplateContext.class,0);
		}
		public Falsk_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falsk_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFalsk_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFalsk_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFalsk_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Falsk_returnContext falsk_return() throws RecognitionException {
		Falsk_returnContext _localctx = new Falsk_returnContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_falsk_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(RETURN);
			setState(734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REDIRECT:
				{
				setState(732);
				redirect();
				}
				break;
			case RENDERTEMPLATE:
				{
				setState(733);
				rendertemplate();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RedirectContext extends ParserRuleContext {
		public TerminalNode REDIRECT() { return getToken(PythonParser.REDIRECT, 0); }
		public List<TerminalNode> OPENPRAC() { return getTokens(PythonParser.OPENPRAC); }
		public TerminalNode OPENPRAC(int i) {
			return getToken(PythonParser.OPENPRAC, i);
		}
		public List<TerminalNode> CLOSEPRAC() { return getTokens(PythonParser.CLOSEPRAC); }
		public TerminalNode CLOSEPRAC(int i) {
			return getToken(PythonParser.CLOSEPRAC, i);
		}
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public TerminalNode URLFOR() { return getToken(PythonParser.URLFOR, 0); }
		public RedirectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRedirect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRedirect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRedirect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedirectContext redirect() throws RecognitionException {
		RedirectContext _localctx = new RedirectContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_redirect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(REDIRECT);
			setState(737);
			match(OPENPRAC);
			setState(743);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(738);
				match(STRING);
				}
				break;
			case URLFOR:
				{
				{
				setState(739);
				match(URLFOR);
				setState(740);
				match(OPENPRAC);
				setState(741);
				match(STRING);
				setState(742);
				match(CLOSEPRAC);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(745);
			match(CLOSEPRAC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RendertemplateContext extends ParserRuleContext {
		public TerminalNode RENDERTEMPLATE() { return getToken(PythonParser.RENDERTEMPLATE, 0); }
		public List<TerminalNode> OPENPRAC() { return getTokens(PythonParser.OPENPRAC); }
		public TerminalNode OPENPRAC(int i) {
			return getToken(PythonParser.OPENPRAC, i);
		}
		public List<TerminalNode> CLOSEPRAC() { return getTokens(PythonParser.CLOSEPRAC); }
		public TerminalNode CLOSEPRAC(int i) {
			return getToken(PythonParser.CLOSEPRAC, i);
		}
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(PythonParser.EQUALS, 0); }
		public TerminalNode URLFOR() { return getToken(PythonParser.URLFOR, 0); }
		public RendertemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rendertemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRendertemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRendertemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRendertemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RendertemplateContext rendertemplate() throws RecognitionException {
		RendertemplateContext _localctx = new RendertemplateContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_rendertemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(RENDERTEMPLATE);
			setState(748);
			match(OPENPRAC);
			{
			setState(754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(749);
				match(STRING);
				}
				break;
			case URLFOR:
				{
				{
				setState(750);
				match(URLFOR);
				setState(751);
				match(OPENPRAC);
				setState(752);
				match(STRING);
				setState(753);
				match(CLOSEPRAC);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(756);
				match(COMMA);
				setState(757);
				match(ID);
				setState(758);
				match(EQUALS);
				setState(759);
				match(ID);
				}
			}

			}
			setState(762);
			match(CLOSEPRAC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class State_jinja2Context extends ParserRuleContext {
		public List<PrintinjinjaContext> printinjinja() {
			return getRuleContexts(PrintinjinjaContext.class);
		}
		public PrintinjinjaContext printinjinja(int i) {
			return getRuleContext(PrintinjinjaContext.class,i);
		}
		public List<Condition_jinja2Context> condition_jinja2() {
			return getRuleContexts(Condition_jinja2Context.class);
		}
		public Condition_jinja2Context condition_jinja2(int i) {
			return getRuleContext(Condition_jinja2Context.class,i);
		}
		public List<TagsDocumentContext> tagsDocument() {
			return getRuleContexts(TagsDocumentContext.class);
		}
		public TagsDocumentContext tagsDocument(int i) {
			return getRuleContext(TagsDocumentContext.class,i);
		}
		public State_jinja2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_jinja2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterState_jinja2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitState_jinja2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitState_jinja2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_jinja2Context state_jinja2() throws RecognitionException {
		State_jinja2Context _localctx = new State_jinja2Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_state_jinja2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(767); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(767);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOUBLEOPENKPRA:
						{
						setState(764);
						printinjinja();
						}
						break;
					case OPENCONDITION:
						{
						setState(765);
						condition_jinja2();
						}
						break;
					case TAG_OPEN:
					case ID:
						{
						setState(766);
						tagsDocument();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(769); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintinjinjaContext extends ParserRuleContext {
		public TerminalNode DOUBLEOPENKPRA() { return getToken(PythonParser.DOUBLEOPENKPRA, 0); }
		public TerminalNode DOUBLECLOSEKPRA() { return getToken(PythonParser.DOUBLECLOSEKPRA, 0); }
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public PrintinjinjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printinjinja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPrintinjinja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPrintinjinja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPrintinjinja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintinjinjaContext printinjinja() throws RecognitionException {
		PrintinjinjaContext _localctx = new PrintinjinjaContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_printinjinja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(DOUBLEOPENKPRA);
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(772);
				match(ID);
				}
				break;
			case 2:
				{
				{
				setState(773);
				match(ID);
				setState(774);
				match(DOT);
				setState(775);
				match(ID);
				}
				}
				break;
			}
			setState(778);
			match(DOUBLECLOSEKPRA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Condition_jinja2Context extends ParserRuleContext {
		public Condition_jinja2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_jinja2; }
	 
		public Condition_jinja2Context() { }
		public void copyFrom(Condition_jinja2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Else_jContext extends Condition_jinja2Context {
		public Else_jinja2Context else_jinja2() {
			return getRuleContext(Else_jinja2Context.class,0);
		}
		public Else_jContext(Condition_jinja2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElse_j(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElse_j(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElse_j(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class For_jContext extends Condition_jinja2Context {
		public For_jinja2Context for_jinja2() {
			return getRuleContext(For_jinja2Context.class,0);
		}
		public For_jContext(Condition_jinja2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFor_j(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFor_j(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFor_j(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class If_jContext extends Condition_jinja2Context {
		public If_jinja2Context if_jinja2() {
			return getRuleContext(If_jinja2Context.class,0);
		}
		public If_jContext(Condition_jinja2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIf_j(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIf_j(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIf_j(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Elif_jContext extends Condition_jinja2Context {
		public Elif_jinja2Context elif_jinja2() {
			return getRuleContext(Elif_jinja2Context.class,0);
		}
		public Elif_jContext(Condition_jinja2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElif_j(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElif_j(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElif_j(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_jinja2Context condition_jinja2() throws RecognitionException {
		Condition_jinja2Context _localctx = new Condition_jinja2Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_condition_jinja2);
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				_localctx = new For_jContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				for_jinja2();
				}
				break;
			case 2:
				_localctx = new If_jContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				if_jinja2();
				}
				break;
			case 3:
				_localctx = new Else_jContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(782);
				else_jinja2();
				}
				break;
			case 4:
				_localctx = new Elif_jContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(783);
				elif_jinja2();
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_jinja2Context extends ParserRuleContext {
		public List<TerminalNode> OPENCONDITION() { return getTokens(PythonParser.OPENCONDITION); }
		public TerminalNode OPENCONDITION(int i) {
			return getToken(PythonParser.OPENCONDITION, i);
		}
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public List<TerminalNode> CLOSECONDITION() { return getTokens(PythonParser.CLOSECONDITION); }
		public TerminalNode CLOSECONDITION(int i) {
			return getToken(PythonParser.CLOSECONDITION, i);
		}
		public TerminalNode ENDFOR() { return getToken(PythonParser.ENDFOR, 0); }
		public TerminalNode INT() { return getToken(PythonParser.INT, 0); }
		public List<State_jinja2Context> state_jinja2() {
			return getRuleContexts(State_jinja2Context.class);
		}
		public State_jinja2Context state_jinja2(int i) {
			return getRuleContext(State_jinja2Context.class,i);
		}
		public For_jinja2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_jinja2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFor_jinja2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFor_jinja2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFor_jinja2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_jinja2Context for_jinja2() throws RecognitionException {
		For_jinja2Context _localctx = new For_jinja2Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_for_jinja2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(OPENCONDITION);
			setState(787);
			match(FOR);
			setState(788);
			match(ID);
			setState(789);
			match(IN);
			setState(790);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(791);
			match(CLOSECONDITION);
			setState(795);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(792);
					state_jinja2();
					}
					} 
				}
				setState(797);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(798);
			match(OPENCONDITION);
			setState(799);
			match(ENDFOR);
			setState(800);
			match(CLOSECONDITION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_jinja2Context extends ParserRuleContext {
		public List<TerminalNode> OPENCONDITION() { return getTokens(PythonParser.OPENCONDITION); }
		public TerminalNode OPENCONDITION(int i) {
			return getToken(PythonParser.OPENCONDITION, i);
		}
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public List<TerminalNode> CLOSECONDITION() { return getTokens(PythonParser.CLOSECONDITION); }
		public TerminalNode CLOSECONDITION(int i) {
			return getToken(PythonParser.CLOSECONDITION, i);
		}
		public TerminalNode ENDIF() { return getToken(PythonParser.ENDIF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<State_jinja2Context> state_jinja2() {
			return getRuleContexts(State_jinja2Context.class);
		}
		public State_jinja2Context state_jinja2(int i) {
			return getRuleContext(State_jinja2Context.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public If_jinja2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_jinja2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIf_jinja2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIf_jinja2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIf_jinja2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_jinja2Context if_jinja2() throws RecognitionException {
		If_jinja2Context _localctx = new If_jinja2Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_if_jinja2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(OPENCONDITION);
			setState(803);
			match(IF);
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(804);
				exp(0);
				}
				break;
			case 2:
				{
				{
				setState(805);
				match(ID);
				setState(806);
				match(DOT);
				setState(807);
				match(ID);
				}
				}
				break;
			}
			setState(810);
			match(CLOSECONDITION);
			setState(814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(811);
					state_jinja2();
					}
					} 
				}
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			}
			setState(817);
			match(OPENCONDITION);
			setState(818);
			match(ENDIF);
			setState(819);
			match(CLOSECONDITION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Elif_jinja2Context extends ParserRuleContext {
		public TerminalNode OPENCONDITION() { return getToken(PythonParser.OPENCONDITION, 0); }
		public TerminalNode ELIF() { return getToken(PythonParser.ELIF, 0); }
		public TerminalNode CLOSECONDITION() { return getToken(PythonParser.CLOSECONDITION, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<State_jinja2Context> state_jinja2() {
			return getRuleContexts(State_jinja2Context.class);
		}
		public State_jinja2Context state_jinja2(int i) {
			return getRuleContext(State_jinja2Context.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public Elif_jinja2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_jinja2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElif_jinja2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElif_jinja2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElif_jinja2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_jinja2Context elif_jinja2() throws RecognitionException {
		Elif_jinja2Context _localctx = new Elif_jinja2Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_elif_jinja2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(OPENCONDITION);
			setState(822);
			match(ELIF);
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(823);
				exp(0);
				}
				break;
			case 2:
				{
				{
				setState(824);
				match(ID);
				setState(825);
				match(DOT);
				setState(826);
				match(ID);
				}
				}
				break;
			}
			setState(829);
			match(CLOSECONDITION);
			setState(833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(830);
					state_jinja2();
					}
					} 
				}
				setState(835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_jinja2Context extends ParserRuleContext {
		public TerminalNode OPENCONDITION() { return getToken(PythonParser.OPENCONDITION, 0); }
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public TerminalNode CLOSECONDITION() { return getToken(PythonParser.CLOSECONDITION, 0); }
		public Else_jinja2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_jinja2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElse_jinja2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElse_jinja2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElse_jinja2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_jinja2Context else_jinja2() throws RecognitionException {
		Else_jinja2Context _localctx = new Else_jinja2Context(_ctx, getState());
		enterRule(_localctx, 120, RULE_else_jinja2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(OPENCONDITION);
			setState(837);
			match(ELSE);
			setState(838);
			match(CLOSECONDITION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	 
		public DocumentContext() { }
		public void copyFrom(DocumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FullHtmlDocumentLabelContext extends DocumentContext {
		public FullHtmlDocumentContext fullHtmlDocument() {
			return getRuleContext(FullHtmlDocumentContext.class,0);
		}
		public FullHtmlDocumentLabelContext(DocumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFullHtmlDocumentLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFullHtmlDocumentLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFullHtmlDocumentLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagsDocumentLabelContext extends DocumentContext {
		public TagsDocumentContext tagsDocument() {
			return getRuleContext(TagsDocumentContext.class,0);
		}
		public TagsDocumentLabelContext(DocumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTagsDocumentLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTagsDocumentLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTagsDocumentLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_document);
		try {
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				_localctx = new FullHtmlDocumentLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				fullHtmlDocument();
				}
				break;
			case 2:
				_localctx = new TagsDocumentLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				tagsDocument();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FullHtmlDocumentContext extends ParserRuleContext {
		public DoctypehtmlContext doctypehtml() {
			return getRuleContext(DoctypehtmlContext.class,0);
		}
		public HtmlOpenContext htmlOpen() {
			return getRuleContext(HtmlOpenContext.class,0);
		}
		public HeadSectionContext headSection() {
			return getRuleContext(HeadSectionContext.class,0);
		}
		public BodySectionContext bodySection() {
			return getRuleContext(BodySectionContext.class,0);
		}
		public HtmlCloseContext htmlClose() {
			return getRuleContext(HtmlCloseContext.class,0);
		}
		public FullHtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullHtmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFullHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFullHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFullHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullHtmlDocumentContext fullHtmlDocument() throws RecognitionException {
		FullHtmlDocumentContext _localctx = new FullHtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_fullHtmlDocument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			doctypehtml();
			setState(845);
			htmlOpen();
			setState(846);
			headSection();
			setState(847);
			bodySection();
			setState(848);
			htmlClose();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoctypehtmlContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(PythonParser.TAG_OPEN, 0); }
		public TerminalNode DOCTYPEHTML_TAG() { return getToken(PythonParser.DOCTYPEHTML_TAG, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(PythonParser.TAG_CLOSE, 0); }
		public DoctypehtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doctypehtml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoctypehtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoctypehtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoctypehtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoctypehtmlContext doctypehtml() throws RecognitionException {
		DoctypehtmlContext _localctx = new DoctypehtmlContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_doctypehtml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(TAG_OPEN);
			setState(851);
			match(DOCTYPEHTML_TAG);
			setState(852);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlOpenContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(PythonParser.TAG_OPEN, 0); }
		public TerminalNode HTML_TAG() { return getToken(PythonParser.HTML_TAG, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(PythonParser.TAG_CLOSE, 0); }
		public HtmlOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterHtmlOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitHtmlOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitHtmlOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlOpenContext htmlOpen() throws RecognitionException {
		HtmlOpenContext _localctx = new HtmlOpenContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_htmlOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(TAG_OPEN);
			setState(855);
			match(HTML_TAG);
			setState(856);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCloseContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN_SLASH() { return getToken(PythonParser.TAG_OPEN_SLASH, 0); }
		public TerminalNode HTML_TAG() { return getToken(PythonParser.HTML_TAG, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(PythonParser.TAG_CLOSE, 0); }
		public HtmlCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterHtmlClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitHtmlClose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitHtmlClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCloseContext htmlClose() throws RecognitionException {
		HtmlCloseContext _localctx = new HtmlCloseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_htmlClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(TAG_OPEN_SLASH);
			setState(859);
			match(HTML_TAG);
			setState(860);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HeadSectionContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(PythonParser.TAG_OPEN, 0); }
		public List<TerminalNode> HEAD_TAG() { return getTokens(PythonParser.HEAD_TAG); }
		public TerminalNode HEAD_TAG(int i) {
			return getToken(PythonParser.HEAD_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(PythonParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(PythonParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_OPEN_SLASH() { return getToken(PythonParser.TAG_OPEN_SLASH, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public HeadSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterHeadSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitHeadSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitHeadSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadSectionContext headSection() throws RecognitionException {
		HeadSectionContext _localctx = new HeadSectionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_headSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(TAG_OPEN);
			setState(863);
			match(HEAD_TAG);
			setState(864);
			match(TAG_CLOSE);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLEOPENKPRA || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 2305843009213693969L) != 0)) {
				{
				setState(865);
				content();
				}
			}

			setState(868);
			match(TAG_OPEN_SLASH);
			setState(869);
			match(HEAD_TAG);
			setState(870);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodySectionContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(PythonParser.TAG_OPEN, 0); }
		public List<TerminalNode> BODY_TAG() { return getTokens(PythonParser.BODY_TAG); }
		public TerminalNode BODY_TAG(int i) {
			return getToken(PythonParser.BODY_TAG, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(PythonParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(PythonParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_OPEN_SLASH() { return getToken(PythonParser.TAG_OPEN_SLASH, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public BodySectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodySection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBodySection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBodySection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBodySection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodySectionContext bodySection() throws RecognitionException {
		BodySectionContext _localctx = new BodySectionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_bodySection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(TAG_OPEN);
			setState(873);
			match(BODY_TAG);
			setState(874);
			match(TAG_CLOSE);
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLEOPENKPRA || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 2305843009213693969L) != 0)) {
				{
				setState(875);
				content();
				}
			}

			setState(878);
			match(TAG_OPEN_SLASH);
			setState(879);
			match(BODY_TAG);
			setState(880);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public List<TagtypeContext> tagtype() {
			return getRuleContexts(TagtypeContext.class);
		}
		public TagtypeContext tagtype(int i) {
			return getRuleContext(TagtypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public List<State_jinja2Context> state_jinja2() {
			return getRuleContexts(State_jinja2Context.class);
		}
		public State_jinja2Context state_jinja2(int i) {
			return getRuleContext(State_jinja2Context.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(882);
					tagtype();
					}
					break;
				case 2:
					{
					setState(883);
					match(ID);
					}
					break;
				case 3:
					{
					setState(884);
					state_jinja2();
					}
					break;
				}
				}
				setState(887); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOUBLEOPENKPRA || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 2305843009213693969L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagtypeContext extends ParserRuleContext {
		public StartTagContext startTag() {
			return getRuleContext(StartTagContext.class,0);
		}
		public EndTagContext endTag() {
			return getRuleContext(EndTagContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public SelfClosingtagContext selfClosingtag() {
			return getRuleContext(SelfClosingtagContext.class,0);
		}
		public TagtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTagtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTagtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTagtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagtypeContext tagtype() throws RecognitionException {
		TagtypeContext _localctx = new TagtypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_tagtype);
		int _la;
		try {
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				startTag();
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLEOPENKPRA || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 2305843009213693969L) != 0)) {
					{
					setState(890);
					content();
					}
				}

				setState(893);
				endTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				selfClosingtag();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StartTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(PythonParser.TAG_OPEN, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode TAG_CLOSE() { return getToken(PythonParser.TAG_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public StartTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStartTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStartTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStartTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartTagContext startTag() throws RecognitionException {
		StartTagContext _localctx = new StartTagContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_startTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(TAG_OPEN);
			setState(899);
			tagName();
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE || _la==CLASS || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2250700302057473L) != 0)) {
				{
				{
				setState(900);
				attribute();
				}
				}
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(906);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EndTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN_SLASH() { return getToken(PythonParser.TAG_OPEN_SLASH, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode TAG_CLOSE() { return getToken(PythonParser.TAG_CLOSE, 0); }
		public EndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEndTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEndTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEndTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndTagContext endTag() throws RecognitionException {
		EndTagContext _localctx = new EndTagContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_endTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(TAG_OPEN_SLASH);
			setState(909);
			tagName();
			setState(910);
			match(TAG_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public TerminalNode IDHTML() { return getToken(PythonParser.IDHTML, 0); }
		public TerminalNode STYLE() { return getToken(PythonParser.STYLE, 0); }
		public TerminalNode SRC() { return getToken(PythonParser.SRC, 0); }
		public TerminalNode ALT() { return getToken(PythonParser.ALT, 0); }
		public TerminalNode TYPE() { return getToken(PythonParser.TYPE, 0); }
		public TerminalNode HREF() { return getToken(PythonParser.HREF, 0); }
		public TerminalNode VALUE() { return getToken(PythonParser.VALUE, 0); }
		public TerminalNode PLACEHOLDER() { return getToken(PythonParser.PLACEHOLDER, 0); }
		public TerminalNode NAMEHTML() { return getToken(PythonParser.NAMEHTML, 0); }
		public TerminalNode REL() { return getToken(PythonParser.REL, 0); }
		public TerminalNode METHOD() { return getToken(PythonParser.METHOD, 0); }
		public TerminalNode ENCTYPE() { return getToken(PythonParser.ENCTYPE, 0); }
		public TerminalNode RQUIRED() { return getToken(PythonParser.RQUIRED, 0); }
		public TerminalNode EQUALS() { return getToken(PythonParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			_la = _input.LA(1);
			if ( !(_la==TYPE || _la==CLASS || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2250700302057473L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(913);
				match(EQUALS);
				setState(914);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode DIV_TAG() { return getToken(PythonParser.DIV_TAG, 0); }
		public TerminalNode P_TAG() { return getToken(PythonParser.P_TAG, 0); }
		public TerminalNode H1_TAG() { return getToken(PythonParser.H1_TAG, 0); }
		public TerminalNode H2_TAG() { return getToken(PythonParser.H2_TAG, 0); }
		public TerminalNode H3_TAG() { return getToken(PythonParser.H3_TAG, 0); }
		public TerminalNode H4_TAG() { return getToken(PythonParser.H4_TAG, 0); }
		public TerminalNode TITLE() { return getToken(PythonParser.TITLE, 0); }
		public TerminalNode BUTTON_TAG() { return getToken(PythonParser.BUTTON_TAG, 0); }
		public TerminalNode UL_TAG() { return getToken(PythonParser.UL_TAG, 0); }
		public TerminalNode LI_TAG() { return getToken(PythonParser.LI_TAG, 0); }
		public TerminalNode A_TAG() { return getToken(PythonParser.A_TAG, 0); }
		public TerminalNode FORM() { return getToken(PythonParser.FORM, 0); }
		public TerminalNode LABEL_TAG() { return getToken(PythonParser.LABEL_TAG, 0); }
		public TerminalNode LINK() { return getToken(PythonParser.LINK, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_tagName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 549588041729L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingtagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(PythonParser.TAG_OPEN, 0); }
		public TerminalNode IMG_TAG() { return getToken(PythonParser.IMG_TAG, 0); }
		public TerminalNode INPUT() { return getToken(PythonParser.INPUT, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode SLASH_CLOSE() { return getToken(PythonParser.SLASH_CLOSE, 0); }
		public SelfClosingtagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingtag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSelfClosingtag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSelfClosingtag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSelfClosingtag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingtagContext selfClosingtag() throws RecognitionException {
		SelfClosingtagContext _localctx = new SelfClosingtagContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_selfClosingtag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(TAG_OPEN);
			setState(920);
			_la = _input.LA(1);
			if ( !(_la==INPUT || _la==IMG_TAG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(921);
					attribute();
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH_CLOSE) {
				{
				setState(927);
				match(SLASH_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagsDocumentContext extends ParserRuleContext {
		public List<TagtypeContext> tagtype() {
			return getRuleContexts(TagtypeContext.class);
		}
		public TagtypeContext tagtype(int i) {
			return getRuleContext(TagtypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PythonParser.ID, i);
		}
		public TagsDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagsDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTagsDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTagsDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTagsDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagsDocumentContext tagsDocument() throws RecognitionException {
		TagsDocumentContext _localctx = new TagsDocumentContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_tagsDocument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(932); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(932);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_OPEN:
						{
						setState(930);
						tagtype();
						}
						break;
					case ID:
						{
						setState(931);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(934); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		case 10:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 11);
		case 12:
			return precpred(_ctx, 10);
		case 13:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0090\u03a9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u009d\b\u0000\n\u0000\f\u0000\u00a0\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u00af\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u00b3\b\u0002\u0001"+
		"\u0002\u0003\u0002\u00b6\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00ba"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00c4\b\u0003\u0001\u0004\u0003"+
		"\u0004\u00c7\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00cd\b\u0004\n\u0004\f\u0004\u00d0\t\u0004\u0005\u0004\u00d2\b"+
		"\u0004\n\u0004\f\u0004\u00d5\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00df\b\u0005\n\u0005\f\u0005\u00e2\t\u0005\u0005\u0005\u00e4\b\u0005"+
		"\n\u0005\f\u0005\u00e7\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00f2\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00f6\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ff"+
		"\b\b\u0001\b\u0003\b\u0102\b\b\u0001\b\u0001\b\u0005\b\u0106\b\b\n\b\f"+
		"\b\u0109\t\b\u0001\b\u0003\b\u010c\b\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0005\t\u0112\b\t\n\t\f\t\u0115\t\t\u0001\t\u0003\t\u0118\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0125\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u0151\b\n\n\n\f\n\u0154\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0159\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u015f"+
		"\b\f\n\f\f\f\u0162\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0168\b"+
		"\r\n\r\f\r\u016b\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0170"+
		"\b\u000e\n\u000e\f\u000e\u0173\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0179\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u017e\b\u000f\n\u000f\f\u000f\u0181\t\u000f\u0001\u000f\u0003"+
		"\u000f\u0184\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0189"+
		"\b\u0010\n\u0010\f\u0010\u018c\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0191\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0197\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u019c\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u01a3\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u01ab\b\u0014\n\u0014\f\u0014\u01ae"+
		"\t\u0014\u0003\u0014\u01b0\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01ba\b\u0015\u0001\u0015\u0003\u0015\u01bd\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u01c1\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u01ce\b\u0018\n\u0018\f\u0018\u01d1\t\u0018"+
		"\u0001\u0018\u0005\u0018\u01d4\b\u0018\n\u0018\f\u0018\u01d7\t\u0018\u0001"+
		"\u0018\u0005\u0018\u01da\b\u0018\n\u0018\f\u0018\u01dd\t\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01e4\b\u0019"+
		"\u0001\u0019\u0003\u0019\u01e7\b\u0019\u0003\u0019\u01e9\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u01f2\b\u0019\n\u0019\f\u0019\u01f5\t\u0019\u0001\u0019"+
		"\u0005\u0019\u01f8\b\u0019\n\u0019\f\u0019\u01fb\t\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0202\b\u001a\u0001"+
		"\u001a\u0003\u001a\u0205\b\u001a\u0001\u001a\u0003\u001a\u0208\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0210\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u0218\b\u001c\n\u001c\f\u001c\u021b"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0224\b\u001c\u0001\u001c\u0005\u001c\u0227"+
		"\b\u001c\n\u001c\f\u001c\u022a\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0230\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0234\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0239\b"+
		"\u001f\u0001 \u0001 \u0001 \u0003 \u023e\b \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u0247\b!\u0001\"\u0001\"\u0001\"\u0005\""+
		"\u024c\b\"\n\"\f\"\u024f\t\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0003"+
		"$\u0256\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u025d\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0004)\u027b\b)\u000b"+
		")\f)\u027c\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u0287\b*\u0001*\u0001*\u0005*\u028b\b*\n*\f*\u028e\t*\u0001+\u0001+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u02a3\b,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u02af\b-\u0001-\u0003-\u02b2\b-\u0003-\u02b4\b-\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00050\u02c3\b0\n0\f0\u02c6\t0\u00030\u02c8\b0\u00011\u00011\u00011"+
		"\u00011\u00011\u00011\u00031\u02d0\b1\u00012\u00012\u00052\u02d4\b2\n"+
		"2\f2\u02d7\t2\u00012\u00032\u02da\b2\u00013\u00013\u00013\u00033\u02df"+
		"\b3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u02e8\b4\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u02f3"+
		"\b5\u00015\u00015\u00015\u00015\u00035\u02f9\b5\u00015\u00015\u00016\u0001"+
		"6\u00016\u00046\u0300\b6\u000b6\f6\u0301\u00017\u00017\u00017\u00017\u0001"+
		"7\u00037\u0309\b7\u00017\u00017\u00018\u00018\u00018\u00018\u00038\u0311"+
		"\b8\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00059\u031a\b9\n"+
		"9\f9\u031d\t9\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:"+
		"\u0001:\u0001:\u0003:\u0329\b:\u0001:\u0001:\u0005:\u032d\b:\n:\f:\u0330"+
		"\t:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0003;\u033c\b;\u0001;\u0001;\u0005;\u0340\b;\n;\f;\u0343\t;\u0001<"+
		"\u0001<\u0001<\u0001<\u0001=\u0001=\u0003=\u034b\b=\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0003"+
		"B\u0363\bB\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0003"+
		"C\u036d\bC\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0004D\u0376"+
		"\bD\u000bD\fD\u0377\u0001E\u0001E\u0003E\u037c\bE\u0001E\u0001E\u0001"+
		"E\u0003E\u0381\bE\u0001F\u0001F\u0001F\u0005F\u0386\bF\nF\fF\u0389\tF"+
		"\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0003"+
		"H\u0394\bH\u0001I\u0001I\u0001J\u0001J\u0001J\u0005J\u039b\bJ\nJ\fJ\u039e"+
		"\tJ\u0001J\u0003J\u03a1\bJ\u0001K\u0001K\u0004K\u03a5\bK\u000bK\fK\u03a6"+
		"\u0001K\u0000\u0001\u0014L\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0000\b\u0002\u0000\u0089\u0089\u008b\u008b\u0001\u0000"+
		"\b\t\u0003\u0000\u000b\u000e\u0011\u0011CC\u0001\u000047\u0001\u0000@"+
		"B\u0004\u0000\f\f\u0012\u0012@@hr\u0003\u0000AAZ[]g\u0002\u0000\r\r\\"+
		"\\\u03fb\u0000\u009e\u0001\u0000\u0000\u0000\u0002\u00ae\u0001\u0000\u0000"+
		"\u0000\u0004\u00b2\u0001\u0000\u0000\u0000\u0006\u00c3\u0001\u0000\u0000"+
		"\u0000\b\u00c6\u0001\u0000\u0000\u0000\n\u00d8\u0001\u0000\u0000\u0000"+
		"\f\u00f1\u0001\u0000\u0000\u0000\u000e\u00f5\u0001\u0000\u0000\u0000\u0010"+
		"\u00f7\u0001\u0000\u0000\u0000\u0012\u010d\u0001\u0000\u0000\u0000\u0014"+
		"\u0124\u0001\u0000\u0000\u0000\u0016\u0158\u0001\u0000\u0000\u0000\u0018"+
		"\u015a\u0001\u0000\u0000\u0000\u001a\u0163\u0001\u0000\u0000\u0000\u001c"+
		"\u016c\u0001\u0000\u0000\u0000\u001e\u0174\u0001\u0000\u0000\u0000 \u0185"+
		"\u0001\u0000\u0000\u0000\"\u019b\u0001\u0000\u0000\u0000$\u019d\u0001"+
		"\u0000\u0000\u0000&\u019f\u0001\u0000\u0000\u0000(\u01a6\u0001\u0000\u0000"+
		"\u0000*\u01b3\u0001\u0000\u0000\u0000,\u01be\u0001\u0000\u0000\u0000."+
		"\u01c2\u0001\u0000\u0000\u00000\u01c9\u0001\u0000\u0000\u00002\u01de\u0001"+
		"\u0000\u0000\u00004\u01fc\u0001\u0000\u0000\u00006\u020b\u0001\u0000\u0000"+
		"\u00008\u0211\u0001\u0000\u0000\u0000:\u022f\u0001\u0000\u0000\u0000<"+
		"\u0233\u0001\u0000\u0000\u0000>\u0238\u0001\u0000\u0000\u0000@\u023a\u0001"+
		"\u0000\u0000\u0000B\u0241\u0001\u0000\u0000\u0000D\u0248\u0001\u0000\u0000"+
		"\u0000F\u0250\u0001\u0000\u0000\u0000H\u0252\u0001\u0000\u0000\u0000J"+
		"\u0257\u0001\u0000\u0000\u0000L\u025e\u0001\u0000\u0000\u0000N\u0265\u0001"+
		"\u0000\u0000\u0000P\u026e\u0001\u0000\u0000\u0000R\u027a\u0001\u0000\u0000"+
		"\u0000T\u027e\u0001\u0000\u0000\u0000V\u028f\u0001\u0000\u0000\u0000X"+
		"\u02a2\u0001\u0000\u0000\u0000Z\u02b3\u0001\u0000\u0000\u0000\\\u02b5"+
		"\u0001\u0000\u0000\u0000^\u02b9\u0001\u0000\u0000\u0000`\u02c7\u0001\u0000"+
		"\u0000\u0000b\u02cf\u0001\u0000\u0000\u0000d\u02d1\u0001\u0000\u0000\u0000"+
		"f\u02db\u0001\u0000\u0000\u0000h\u02e0\u0001\u0000\u0000\u0000j\u02eb"+
		"\u0001\u0000\u0000\u0000l\u02ff\u0001\u0000\u0000\u0000n\u0303\u0001\u0000"+
		"\u0000\u0000p\u0310\u0001\u0000\u0000\u0000r\u0312\u0001\u0000\u0000\u0000"+
		"t\u0322\u0001\u0000\u0000\u0000v\u0335\u0001\u0000\u0000\u0000x\u0344"+
		"\u0001\u0000\u0000\u0000z\u034a\u0001\u0000\u0000\u0000|\u034c\u0001\u0000"+
		"\u0000\u0000~\u0352\u0001\u0000\u0000\u0000\u0080\u0356\u0001\u0000\u0000"+
		"\u0000\u0082\u035a\u0001\u0000\u0000\u0000\u0084\u035e\u0001\u0000\u0000"+
		"\u0000\u0086\u0368\u0001\u0000\u0000\u0000\u0088\u0375\u0001\u0000\u0000"+
		"\u0000\u008a\u0380\u0001\u0000\u0000\u0000\u008c\u0382\u0001\u0000\u0000"+
		"\u0000\u008e\u038c\u0001\u0000\u0000\u0000\u0090\u0390\u0001\u0000\u0000"+
		"\u0000\u0092\u0395\u0001\u0000\u0000\u0000\u0094\u0397\u0001\u0000\u0000"+
		"\u0000\u0096\u03a4\u0001\u0000\u0000\u0000\u0098\u009d\u0003\u0002\u0001"+
		"\u0000\u0099\u009d\u0003<\u001e\u0000\u009a\u009d\u0003z=\u0000\u009b"+
		"\u009d\u0003l6\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u0099\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005"+
		"\u0000\u0000\u0001\u00a2\u0001\u0001\u0000\u0000\u0000\u00a3\u00af\u0003"+
		"\u0004\u0002\u0000\u00a4\u00af\u0003\n\u0005\u0000\u00a5\u00af\u0003\u000e"+
		"\u0007\u0000\u00a6\u00af\u0003\u0014\n\u0000\u00a7\u00af\u0003\u0016\u000b"+
		"\u0000\u00a8\u00af\u0003\u001e\u000f\u0000\u00a9\u00af\u0003\"\u0011\u0000"+
		"\u00aa\u00af\u00030\u0018\u0000\u00ab\u00af\u00034\u001a\u0000\u00ac\u00af"+
		"\u00036\u001b\u0000\u00ad\u00af\u00038\u001c\u0000\u00ae\u00a3\u0001\u0000"+
		"\u0000\u0000\u00ae\u00a4\u0001\u0000\u0000\u0000\u00ae\u00a5\u0001\u0000"+
		"\u0000\u0000\u00ae\u00a6\u0001\u0000\u0000\u0000\u00ae\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ae\u00a8\u0001\u0000\u0000\u0000\u00ae\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00ae\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u0003\u0001\u0000\u0000\u0000\u00b0\u00b3\u0005\u008b"+
		"\u0000\u0000\u00b1\u00b3\u0003\b\u0004\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b6\u0005w\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ba\u0003\u0006\u0003\u0000\u00b8\u00ba\u0003\u0014\n\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u0005\u0001\u0000\u0000\u0000\u00bb\u00c4\u0005\u0089\u0000\u0000\u00bc"+
		"\u00c4\u0005\u008d\u0000\u0000\u00bd\u00c4\u0005\u008a\u0000\u0000\u00be"+
		"\u00c4\u0005\u008b\u0000\u0000\u00bf\u00c4\u0003\b\u0004\u0000\u00c0\u00c4"+
		"\u0005\u0001\u0000\u0000\u00c1\u00c4\u0005\u0002\u0000\u0000\u00c2\u00c4"+
		"\u0005\u001d\u0000\u0000\u00c3\u00bb\u0001\u0000\u0000\u0000\u00c3\u00bc"+
		"\u0001\u0000\u0000\u0000\u00c3\u00bd\u0001\u0000\u0000\u0000\u00c3\u00be"+
		"\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u0007\u0001\u0000\u0000\u0000\u00c5\u00c7"+
		"\u0005\u008b\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00d3"+
		"\u0005,\u0000\u0000\u00c9\u00ce\u0003\u0006\u0003\u0000\u00ca\u00cb\u0005"+
		"$\u0000\u0000\u00cb\u00cd\u0003\u0006\u0003\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00c9\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005-\u0000"+
		"\u0000\u00d7\t\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u008b\u0000\u0000"+
		"\u00d9\u00da\u0005w\u0000\u0000\u00da\u00e5\u0005,\u0000\u0000\u00db\u00e0"+
		"\u0003\u0006\u0003\u0000\u00dc\u00dd\u0005$\u0000\u0000\u00dd\u00df\u0003"+
		"\u0006\u0003\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e3\u00db\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005-\u0000\u0000\u00e9\u000b\u0001\u0000"+
		"\u0000\u0000\u00ea\u00f2\u0005\u0089\u0000\u0000\u00eb\u00f2\u0005\u008d"+
		"\u0000\u0000\u00ec\u00f2\u0005\u008a\u0000\u0000\u00ed\u00f2\u0005\u008b"+
		"\u0000\u0000\u00ee\u00f2\u0005\u0001\u0000\u0000\u00ef\u00f2\u0005\u0002"+
		"\u0000\u0000\u00f0\u00f2\u0003\u0014\n\u0000\u00f1\u00ea\u0001\u0000\u0000"+
		"\u0000\u00f1\u00eb\u0001\u0000\u0000\u0000\u00f1\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f1\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\r\u0001\u0000\u0000\u0000\u00f3\u00f6\u0003\u0010\b\u0000"+
		"\u00f4\u00f6\u0003\u0012\t\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f6\u000f\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005\u0003\u0000\u0000\u00f8\u00f9\u0005\u008b\u0000\u0000\u00f9"+
		"\u0101\u0005\u0087\u0000\u0000\u00fa\u00fb\u0005.\u0000\u0000\u00fb\u00fc"+
		"\u0005(\u0000\u0000\u00fc\u00fd\u0007\u0000\u0000\u0000\u00fd\u00ff\u0005"+
		")\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u0102\u0005\u008b"+
		"\u0000\u0000\u0101\u00fe\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0107\u0005#\u0000"+
		"\u0000\u0104\u0106\u0003\u0002\u0001\u0000\u0105\u0104\u0001\u0000\u0000"+
		"\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010c\u0007\u0001\u0000"+
		"\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u0011\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0007\u0000"+
		"\u0000\u010e\u010f\u0003\f\u0006\u0000\u010f\u0113\u0005#\u0000\u0000"+
		"\u0110\u0112\u0003\u0002\u0001\u0000\u0111\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000"+
		"\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0118\u0007\u0001\u0000\u0000"+
		"\u0117\u0116\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000"+
		"\u0118\u0013\u0001\u0000\u0000\u0000\u0119\u011a\u0006\n\uffff\uffff\u0000"+
		"\u011a\u0125\u0005\u0089\u0000\u0000\u011b\u0125\u0005\u008b\u0000\u0000"+
		"\u011c\u011d\u0005\u008b\u0000\u0000\u011d\u011e\u0005\"\u0000\u0000\u011e"+
		"\u0125\u0005\u008b\u0000\u0000\u011f\u0125\u0005\u008d\u0000\u0000\u0120"+
		"\u0125\u0005\u0001\u0000\u0000\u0121\u0125\u0005\u0002\u0000\u0000\u0122"+
		"\u0125\u0005\u001d\u0000\u0000\u0123\u0125\u0003\b\u0004\u0000\u0124\u0119"+
		"\u0001\u0000\u0000\u0000\u0124\u011b\u0001\u0000\u0000\u0000\u0124\u011c"+
		"\u0001\u0000\u0000\u0000\u0124\u011f\u0001\u0000\u0000\u0000\u0124\u0120"+
		"\u0001\u0000\u0000\u0000\u0124\u0121\u0001\u0000\u0000\u0000\u0124\u0122"+
		"\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0152"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\n\u0016\u0000\u0000\u0127\u0128\u0005"+
		"{\u0000\u0000\u0128\u0151\u0003\u0014\n\u0017\u0129\u012a\n\u0015\u0000"+
		"\u0000\u012a\u012b\u0005u\u0000\u0000\u012b\u0151\u0003\u0014\n\u0016"+
		"\u012c\u012d\n\u0014\u0000\u0000\u012d\u012e\u0005v\u0000\u0000\u012e"+
		"\u0151\u0003\u0014\n\u0015\u012f\u0130\n\u0013\u0000\u0000\u0130\u0131"+
		"\u0005|\u0000\u0000\u0131\u0151\u0003\u0014\n\u0014\u0132\u0133\n\u0012"+
		"\u0000\u0000\u0133\u0134\u0005s\u0000\u0000\u0134\u0151\u0003\u0014\n"+
		"\u0013\u0135\u0136\n\u0011\u0000\u0000\u0136\u0137\u0005t\u0000\u0000"+
		"\u0137\u0151\u0003\u0014\n\u0012\u0138\u0139\n\u0010\u0000\u0000\u0139"+
		"\u013a\u0005x\u0000\u0000\u013a\u0151\u0003\u0014\n\u0011\u013b\u013c"+
		"\n\u000f\u0000\u0000\u013c\u013d\u0005y\u0000\u0000\u013d\u0151\u0003"+
		"\u0014\n\u0010\u013e\u013f\n\u000e\u0000\u0000\u013f\u0140\u0005z\u0000"+
		"\u0000\u0140\u0151\u0003\u0014\n\u000f\u0141\u0142\n\r\u0000\u0000\u0142"+
		"\u0143\u0005}\u0000\u0000\u0143\u0151\u0003\u0014\n\u000e\u0144\u0145"+
		"\n\f\u0000\u0000\u0145\u0146\u0005~\u0000\u0000\u0146\u0151\u0003\u0014"+
		"\n\r\u0147\u0148\n\u000b\u0000\u0000\u0148\u0149\u0005\u0081\u0000\u0000"+
		"\u0149\u0151\u0003\u0014\n\f\u014a\u014b\n\n\u0000\u0000\u014b\u014c\u0005"+
		"\u0082\u0000\u0000\u014c\u0151\u0003\u0014\n\u000b\u014d\u014e\n\t\u0000"+
		"\u0000\u014e\u014f\u0005\u0085\u0000\u0000\u014f\u0151\u0003\u0014\n\n"+
		"\u0150\u0126\u0001\u0000\u0000\u0000\u0150\u0129\u0001\u0000\u0000\u0000"+
		"\u0150\u012c\u0001\u0000\u0000\u0000\u0150\u012f\u0001\u0000\u0000\u0000"+
		"\u0150\u0132\u0001\u0000\u0000\u0000\u0150\u0135\u0001\u0000\u0000\u0000"+
		"\u0150\u0138\u0001\u0000\u0000\u0000\u0150\u013b\u0001\u0000\u0000\u0000"+
		"\u0150\u013e\u0001\u0000\u0000\u0000\u0150\u0141\u0001\u0000\u0000\u0000"+
		"\u0150\u0144\u0001\u0000\u0000\u0000\u0150\u0147\u0001\u0000\u0000\u0000"+
		"\u0150\u014a\u0001\u0000\u0000\u0000\u0150\u014d\u0001\u0000\u0000\u0000"+
		"\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0015\u0001\u0000\u0000\u0000"+
		"\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0159\u0003\u0018\f\u0000\u0156"+
		"\u0159\u0003\u001a\r\u0000\u0157\u0159\u0003\u001c\u000e\u0000\u0158\u0155"+
		"\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0157"+
		"\u0001\u0000\u0000\u0000\u0159\u0017\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0005\u0004\u0000\u0000\u015b\u015c\u0003\u0014\n\u0000\u015c\u0160\u0005"+
		"#\u0000\u0000\u015d\u015f\u0003\u0002\u0001\u0000\u015e\u015d\u0001\u0000"+
		"\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000"+
		"\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0019\u0001\u0000"+
		"\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u0006"+
		"\u0000\u0000\u0164\u0165\u0003\u0014\n\u0000\u0165\u0169\u0005#\u0000"+
		"\u0000\u0166\u0168\u0003\u0002\u0001\u0000\u0167\u0166\u0001\u0000\u0000"+
		"\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u001b\u0001\u0000\u0000"+
		"\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u0005\u0000"+
		"\u0000\u016d\u0171\u0005#\u0000\u0000\u016e\u0170\u0003\u0002\u0001\u0000"+
		"\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000"+
		"\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000"+
		"\u0172\u001d\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0005\u0013\u0000\u0000\u0175\u0176\u0005\u008b\u0000\u0000"+
		"\u0176\u0178\u0005(\u0000\u0000\u0177\u0179\u0003 \u0010\u0000\u0178\u0177"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0001\u0000\u0000\u0000\u017a\u017b\u0005)\u0000\u0000\u017b\u017f\u0005"+
		"#\u0000\u0000\u017c\u017e\u0003\u0002\u0001\u0000\u017d\u017c\u0001\u0000"+
		"\u0000\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000"+
		"\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u0184\u0003,\u0016"+
		"\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u0184\u001f\u0001\u0000\u0000\u0000\u0185\u018a\u0003\u0006\u0003"+
		"\u0000\u0186\u0187\u0005$\u0000\u0000\u0187\u0189\u0003\u0006\u0003\u0000"+
		"\u0188\u0186\u0001\u0000\u0000\u0000\u0189\u018c\u0001\u0000\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b!\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0005\u008b\u0000\u0000\u018e\u0190\u0005(\u0000\u0000\u018f\u0191"+
		"\u0003 \u0010\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u019c\u0005"+
		")\u0000\u0000\u0193\u0194\u0003$\u0012\u0000\u0194\u0196\u0005(\u0000"+
		"\u0000\u0195\u0197\u0003 \u0010\u0000\u0196\u0195\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0005)\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a"+
		"\u019c\u0003&\u0013\u0000\u019b\u018d\u0001\u0000\u0000\u0000\u019b\u0193"+
		"\u0001\u0000\u0000\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c#\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0007\u0002\u0000\u0000\u019e%\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0005\u000f\u0000\u0000\u01a0\u01a2\u0005(\u0000"+
		"\u0000\u01a1\u01a3\u0003(\u0014\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0005)\u0000\u0000\u01a5\'\u0001\u0000\u0000\u0000\u01a6"+
		"\u01af\u0005*\u0000\u0000\u01a7\u01ac\u0003*\u0015\u0000\u01a8\u01a9\u0005"+
		"$\u0000\u0000\u01a9\u01ab\u0003*\u0015\u0000\u01aa\u01a8\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000"+
		"\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01a7\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0005+\u0000\u0000\u01b2)\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0005\u008b\u0000\u0000\u01b4\u01bc\u0005#\u0000\u0000\u01b5\u01bd"+
		"\u0005\u008b\u0000\u0000\u01b6\u01b7\u0005\u000e\u0000\u0000\u01b7\u01b9"+
		"\u0005(\u0000\u0000\u01b8\u01ba\u0005\u008b\u0000\u0000\u01b9\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bd\u0005)\u0000\u0000\u01bc\u01b5\u0001\u0000"+
		"\u0000\u0000\u01bc\u01b6\u0001\u0000\u0000\u0000\u01bd+\u0001\u0000\u0000"+
		"\u0000\u01be\u01c0\u0005\n\u0000\u0000\u01bf\u01c1\u0003\u0006\u0003\u0000"+
		"\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c1-\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005H\u0000\u0000\u01c3\u01c4"+
		"\u0005(\u0000\u0000\u01c4\u01c5\u0005I\u0000\u0000\u01c5\u01c6\u0005w"+
		"\u0000\u0000\u01c6\u01c7\u0005\u0001\u0000\u0000\u01c7\u01c8\u0005)\u0000"+
		"\u0000\u01c8/\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\u0012\u0000\u0000"+
		"\u01ca\u01cb\u0005\u008b\u0000\u0000\u01cb\u01cf\u0005#\u0000\u0000\u01cc"+
		"\u01ce\u0003:\u001d\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce\u01d1"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d5\u0001\u0000\u0000\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d4\u0003\u0002\u0001\u0000\u01d3\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01db"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01da"+
		"\u00032\u0019\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01da\u01dd\u0001"+
		"\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001"+
		"\u0000\u0000\u0000\u01dc1\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0005\u0013\u0000\u0000\u01df\u01e0\u0005\u0016"+
		"\u0000\u0000\u01e0\u01e8\u0005(\u0000\u0000\u01e1\u01e3\u0005\u0015\u0000"+
		"\u0000\u01e2\u01e4\u0005$\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e7\u0003 \u0010\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005)\u0000\u0000\u01eb\u01f3"+
		"\u0005#\u0000\u0000\u01ec\u01ed\u0005\u0015\u0000\u0000\u01ed\u01ee\u0005"+
		"\"\u0000\u0000\u01ee\u01ef\u0005\u008b\u0000\u0000\u01ef\u01f0\u0005w"+
		"\u0000\u0000\u01f0\u01f2\u0003\u0006\u0003\u0000\u01f1\u01ec\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f9\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f8\u0003\u0002"+
		"\u0001\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000"+
		"\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fa3\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0005\u008b\u0000\u0000\u01fd\u01fe\u0005w\u0000\u0000"+
		"\u01fe\u01ff\u0005\u008b\u0000\u0000\u01ff\u0201\u0005(\u0000\u0000\u0200"+
		"\u0202\u0005\u0015\u0000\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0201"+
		"\u0202\u0001\u0000\u0000\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203"+
		"\u0205\u0005$\u0000\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\u0001\u0000\u0000\u0000\u0205\u0207\u0001\u0000\u0000\u0000\u0206\u0208"+
		"\u0003 \u0010\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0207\u0208\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u0005"+
		")\u0000\u0000\u020a5\u0001\u0000\u0000\u0000\u020b\u020c\u0005\u008b\u0000"+
		"\u0000\u020c\u020f\u0005\"\u0000\u0000\u020d\u0210\u0003\"\u0011\u0000"+
		"\u020e\u0210\u0005\u008b\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000"+
		"\u020f\u020e\u0001\u0000\u0000\u0000\u02107\u0001\u0000\u0000\u0000\u0211"+
		"\u0212\u0005\u0012\u0000\u0000\u0212\u0213\u0005\u008b\u0000\u0000\u0213"+
		"\u0214\u0005(\u0000\u0000\u0214\u0219\u0005\u008b\u0000\u0000\u0215\u0216"+
		"\u0005$\u0000\u0000\u0216\u0218\u0005\u008b\u0000\u0000\u0217\u0215\u0001"+
		"\u0000\u0000\u0000\u0218\u021b\u0001\u0000\u0000\u0000\u0219\u0217\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021c\u0001"+
		"\u0000\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021c\u021d\u0005"+
		")\u0000\u0000\u021d\u0223\u0005#\u0000\u0000\u021e\u021f\u0005\u0017\u0000"+
		"\u0000\u021f\u0220\u0005\"\u0000\u0000\u0220\u0221\u0005\u0016\u0000\u0000"+
		"\u0221\u0222\u0005(\u0000\u0000\u0222\u0224\u0005)\u0000\u0000\u0223\u021e"+
		"\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0228"+
		"\u0001\u0000\u0000\u0000\u0225\u0227\u0003\u0002\u0001\u0000\u0226\u0225"+
		"\u0001\u0000\u0000\u0000\u0227\u022a\u0001\u0000\u0000\u0000\u0228\u0226"+
		"\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u02299\u0001"+
		"\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b\u022c\u0005"+
		"&\u0000\u0000\u022c\u0230\u0003\u0004\u0002\u0000\u022d\u022e\u0005\'"+
		"\u0000\u0000\u022e\u0230\u0003\u0004\u0002\u0000\u022f\u022b\u0001\u0000"+
		"\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u0230;\u0001\u0000\u0000"+
		"\u0000\u0231\u0234\u0003>\u001f\u0000\u0232\u0234\u0003@ \u0000\u0233"+
		"\u0231\u0001\u0000\u0000\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0234"+
		"=\u0001\u0000\u0000\u0000\u0235\u0239\u0003B!\u0000\u0236\u0239\u0003"+
		"H$\u0000\u0237\u0239\u0003J%\u0000\u0238\u0235\u0001\u0000\u0000\u0000"+
		"\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0237\u0001\u0000\u0000\u0000"+
		"\u0239?\u0001\u0000\u0000\u0000\u023a\u023b\u0003B!\u0000\u023b\u023d"+
		"\u0003L&\u0000\u023c\u023e\u0003R)\u0000\u023d\u023c\u0001\u0000\u0000"+
		"\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000"+
		"\u0000\u023f\u0240\u0003N\'\u0000\u0240A\u0001\u0000\u0000\u0000\u0241"+
		"\u0242\u00052\u0000\u0000\u0242\u0243\u00053\u0000\u0000\u0243\u0244\u0005"+
		"1\u0000\u0000\u0244\u0246\u0003D\"\u0000\u0245\u0247\u0003>\u001f\u0000"+
		"\u0246\u0245\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000"+
		"\u0247C\u0001\u0000\u0000\u0000\u0248\u024d\u0003F#\u0000\u0249\u024a"+
		"\u0005$\u0000\u0000\u024a\u024c\u0003F#\u0000\u024b\u0249\u0001\u0000"+
		"\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024eE\u0001\u0000\u0000"+
		"\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u0250\u0251\u0007\u0003\u0000"+
		"\u0000\u0251G\u0001\u0000\u0000\u0000\u0252\u0253\u00051\u0000\u0000\u0253"+
		"\u0255\u00059\u0000\u0000\u0254\u0256\u0003>\u001f\u0000\u0255\u0254\u0001"+
		"\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256I\u0001\u0000"+
		"\u0000\u0000\u0257\u0258\u00052\u0000\u0000\u0258\u0259\u0005:\u0000\u0000"+
		"\u0259\u025a\u00051\u0000\u0000\u025a\u025c\u0005;\u0000\u0000\u025b\u025d"+
		"\u0003>\u001f\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025c\u025d\u0001"+
		"\u0000\u0000\u0000\u025dK\u0001\u0000\u0000\u0000\u025e\u025f\u0005\u008b"+
		"\u0000\u0000\u025f\u0260\u0005w\u0000\u0000\u0260\u0261\u00054\u0000\u0000"+
		"\u0261\u0262\u0005(\u0000\u0000\u0262\u0263\u0005<\u0000\u0000\u0263\u0264"+
		"\u0005)\u0000\u0000\u0264M\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u0004"+
		"\u0000\u0000\u0266\u0267\u0005<\u0000\u0000\u0267\u0268\u0005x\u0000\u0000"+
		"\u0268\u0269\u0005J\u0000\u0000\u0269\u026a\u0005#\u0000\u0000\u026a\u026b"+
		"\u0005\u008b\u0000\u0000\u026b\u026c\u0005\"\u0000\u0000\u026c\u026d\u0003"+
		".\u0017\u0000\u026dO\u0001\u0000\u0000\u0000\u026e\u026f\u0005\u008b\u0000"+
		"\u0000\u026f\u0270\u0005\"\u0000\u0000\u0270\u0271\u0005=\u0000\u0000"+
		"\u0271\u0272\u0005,\u0000\u0000\u0272\u0273\u0005K\u0000\u0000\u0273\u0274"+
		"\u0005-\u0000\u0000\u0274\u0275\u0005w\u0000\u0000\u0275\u0276\u0005\u008b"+
		"\u0000\u0000\u0276Q\u0001\u0000\u0000\u0000\u0277\u027b\u0003\u0002\u0001"+
		"\u0000\u0278\u027b\u0003T*\u0000\u0279\u027b\u0003P(\u0000\u027a\u0277"+
		"\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027a\u0279"+
		"\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027a"+
		"\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027dS\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0005%\u0000\u0000\u027f\u0280\u0005\u008b"+
		"\u0000\u0000\u0280\u0281\u0005\"\u0000\u0000\u0281\u0282\u0005>\u0000"+
		"\u0000\u0282\u0283\u0005(\u0000\u0000\u0283\u0286\u0005\u008c\u0000\u0000"+
		"\u0284\u0285\u0005$\u0000\u0000\u0285\u0287\u0003V+\u0000\u0286\u0284"+
		"\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0288"+
		"\u0001\u0000\u0000\u0000\u0288\u028c\u0005)\u0000\u0000\u0289\u028b\u0003"+
		"X,\u0000\u028a\u0289\u0001\u0000\u0000\u0000\u028b\u028e\u0001\u0000\u0000"+
		"\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000"+
		"\u0000\u028dU\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000"+
		"\u028f\u0290\u0005?\u0000\u0000\u0290\u0291\u0005w\u0000\u0000\u0291\u0292"+
		"\u0005,\u0000\u0000\u0292\u0293\u0005\u008d\u0000\u0000\u0293\u0294\u0005"+
		"$\u0000\u0000\u0294\u0295\u0005\u008d\u0000\u0000\u0295\u0296\u0001\u0000"+
		"\u0000\u0000\u0296\u0297\u0005-\u0000\u0000\u0297W\u0001\u0000\u0000\u0000"+
		"\u0298\u02a3\u0003Z-\u0000\u0299\u02a3\u0003\n\u0005\u0000\u029a\u02a3"+
		"\u0003\u000e\u0007\u0000\u029b\u02a3\u0003b1\u0000\u029c\u02a3\u0003`"+
		"0\u0000\u029d\u02a3\u0003d2\u0000\u029e\u02a3\u0003\"\u0011\u0000\u029f"+
		"\u02a3\u00034\u001a\u0000\u02a0\u02a3\u00036\u001b\u0000\u02a1\u02a3\u0003"+
		"f3\u0000\u02a2\u0298\u0001\u0000\u0000\u0000\u02a2\u0299\u0001\u0000\u0000"+
		"\u0000\u02a2\u029a\u0001\u0000\u0000\u0000\u02a2\u029b\u0001\u0000\u0000"+
		"\u0000\u02a2\u029c\u0001\u0000\u0000\u0000\u02a2\u029d\u0001\u0000\u0000"+
		"\u0000\u02a2\u029e\u0001\u0000\u0000\u0000\u02a2\u029f\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a1\u0001\u0000\u0000"+
		"\u0000\u02a3Y\u0001\u0000\u0000\u0000\u02a4\u02b4\u0003\u0004\u0002\u0000"+
		"\u02a5\u02a6\u0005\u008b\u0000\u0000\u02a6\u02b1\u0005w\u0000\u0000\u02a7"+
		"\u02b2\u0003\\.\u0000\u02a8\u02a9\u0005;\u0000\u0000\u02a9\u02ae\u0005"+
		"(\u0000\u0000\u02aa\u02ab\u0005\u008b\u0000\u0000\u02ab\u02ac\u0005\""+
		"\u0000\u0000\u02ac\u02af\u0005G\u0000\u0000\u02ad\u02af\u0005\u008d\u0000"+
		"\u0000\u02ae\u02aa\u0001\u0000\u0000\u0000\u02ae\u02ad\u0001\u0000\u0000"+
		"\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b2\u0005)\u0000\u0000"+
		"\u02b1\u02a7\u0001\u0000\u0000\u0000\u02b1\u02a8\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b4\u0001\u0000\u0000\u0000\u02b3\u02a4\u0001\u0000\u0000\u0000"+
		"\u02b3\u02a5\u0001\u0000\u0000\u0000\u02b4[\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b6\u0003^/\u0000\u02b6\u02b7\u0005\"\u0000\u0000\u02b7\u02b8\u0003"+
		"\"\u0011\u0000\u02b8]\u0001\u0000\u0000\u0000\u02b9\u02ba\u00056\u0000"+
		"\u0000\u02ba\u02bb\u0005\"\u0000\u0000\u02bb\u02bc\u0007\u0004\u0000\u0000"+
		"\u02bc_\u0001\u0000\u0000\u0000\u02bd\u02c8\u0003\u0016\u000b\u0000\u02be"+
		"\u02bf\u0005\u0004\u0000\u0000\u02bf\u02c0\u0003b1\u0000\u02c0\u02c4\u0005"+
		"#\u0000\u0000\u02c1\u02c3\u0003X,\u0000\u02c2\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c6\u0001\u0000\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c8\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c7\u02bd\u0001\u0000\u0000"+
		"\u0000\u02c7\u02be\u0001\u0000\u0000\u0000\u02c8a\u0001\u0000\u0000\u0000"+
		"\u02c9\u02d0\u0003\u0014\n\u0000\u02ca\u02cb\u00056\u0000\u0000\u02cb"+
		"\u02cc\u0005\"\u0000\u0000\u02cc\u02cd\u0005@\u0000\u0000\u02cd\u02ce"+
		"\u0005x\u0000\u0000\u02ce\u02d0\u0005\u008d\u0000\u0000\u02cf\u02c9\u0001"+
		"\u0000\u0000\u0000\u02cf\u02ca\u0001\u0000\u0000\u0000\u02d0c\u0001\u0000"+
		"\u0000\u0000\u02d1\u02d5\u0003\u001e\u000f\u0000\u02d2\u02d4\u0003X,\u0000"+
		"\u02d3\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d7\u0001\u0000\u0000\u0000"+
		"\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d6\u02d9\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d8\u02da\u0003f3\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02d9\u02da"+
		"\u0001\u0000\u0000\u0000\u02dae\u0001\u0000\u0000\u0000\u02db\u02de\u0005"+
		"\n\u0000\u0000\u02dc\u02df\u0003h4\u0000\u02dd\u02df\u0003j5\u0000\u02de"+
		"\u02dc\u0001\u0000\u0000\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02df"+
		"g\u0001\u0000\u0000\u0000\u02e0\u02e1\u00058\u0000\u0000\u02e1\u02e7\u0005"+
		"(\u0000\u0000\u02e2\u02e8\u0005\u008d\u0000\u0000\u02e3\u02e4\u00057\u0000"+
		"\u0000\u02e4\u02e5\u0005(\u0000\u0000\u02e5\u02e6\u0005\u008d\u0000\u0000"+
		"\u02e6\u02e8\u0005)\u0000\u0000\u02e7\u02e2\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9"+
		"\u02ea\u0005)\u0000\u0000\u02eai\u0001\u0000\u0000\u0000\u02eb\u02ec\u0005"+
		"5\u0000\u0000\u02ec\u02f2\u0005(\u0000\u0000\u02ed\u02f3\u0005\u008d\u0000"+
		"\u0000\u02ee\u02ef\u00057\u0000\u0000\u02ef\u02f0\u0005(\u0000\u0000\u02f0"+
		"\u02f1\u0005\u008d\u0000\u0000\u02f1\u02f3\u0005)\u0000\u0000\u02f2\u02ed"+
		"\u0001\u0000\u0000\u0000\u02f2\u02ee\u0001\u0000\u0000\u0000\u02f3\u02f8"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f5\u0005$\u0000\u0000\u02f5\u02f6\u0005"+
		"\u008b\u0000\u0000\u02f6\u02f7\u0005w\u0000\u0000\u02f7\u02f9\u0005\u008b"+
		"\u0000\u0000\u02f8\u02f4\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000"+
		"\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005)\u0000"+
		"\u0000\u02fbk\u0001\u0000\u0000\u0000\u02fc\u0300\u0003n7\u0000\u02fd"+
		"\u0300\u0003p8\u0000\u02fe\u0300\u0003\u0096K\u0000\u02ff\u02fc\u0001"+
		"\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u02ff\u02fe\u0001"+
		"\u0000\u0000\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301\u02ff\u0001"+
		"\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302m\u0001\u0000"+
		"\u0000\u0000\u0303\u0308\u0005/\u0000\u0000\u0304\u0309\u0005\u008b\u0000"+
		"\u0000\u0305\u0306\u0005\u008b\u0000\u0000\u0306\u0307\u0005\"\u0000\u0000"+
		"\u0307\u0309\u0005\u008b\u0000\u0000\u0308\u0304\u0001\u0000\u0000\u0000"+
		"\u0308\u0305\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000"+
		"\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u030b\u00050\u0000\u0000\u030b"+
		"o\u0001\u0000\u0000\u0000\u030c\u0311\u0003r9\u0000\u030d\u0311\u0003"+
		"t:\u0000\u030e\u0311\u0003x<\u0000\u030f\u0311\u0003v;\u0000\u0310\u030c"+
		"\u0001\u0000\u0000\u0000\u0310\u030d\u0001\u0000\u0000\u0000\u0310\u030e"+
		"\u0001\u0000\u0000\u0000\u0310\u030f\u0001\u0000\u0000\u0000\u0311q\u0001"+
		"\u0000\u0000\u0000\u0312\u0313\u0005N\u0000\u0000\u0313\u0314\u0005\u0003"+
		"\u0000\u0000\u0314\u0315\u0005\u008b\u0000\u0000\u0315\u0316\u0005\u0087"+
		"\u0000\u0000\u0316\u0317\u0007\u0000\u0000\u0000\u0317\u031b\u0005O\u0000"+
		"\u0000\u0318\u031a\u0003l6\u0000\u0319\u0318\u0001\u0000\u0000\u0000\u031a"+
		"\u031d\u0001\u0000\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031b"+
		"\u031c\u0001\u0000\u0000\u0000\u031c\u031e\u0001\u0000\u0000\u0000\u031d"+
		"\u031b\u0001\u0000\u0000\u0000\u031e\u031f\u0005N\u0000\u0000\u031f\u0320"+
		"\u0005M\u0000\u0000\u0320\u0321\u0005O\u0000\u0000\u0321s\u0001\u0000"+
		"\u0000\u0000\u0322\u0323\u0005N\u0000\u0000\u0323\u0328\u0005\u0004\u0000"+
		"\u0000\u0324\u0329\u0003\u0014\n\u0000\u0325\u0326\u0005\u008b\u0000\u0000"+
		"\u0326\u0327\u0005\"\u0000\u0000\u0327\u0329\u0005\u008b\u0000\u0000\u0328"+
		"\u0324\u0001\u0000\u0000\u0000\u0328\u0325\u0001\u0000\u0000\u0000\u0329"+
		"\u032a\u0001\u0000\u0000\u0000\u032a\u032e\u0005O\u0000\u0000\u032b\u032d"+
		"\u0003l6\u0000\u032c\u032b\u0001\u0000\u0000\u0000\u032d\u0330\u0001\u0000"+
		"\u0000\u0000\u032e\u032c\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000"+
		"\u0000\u0000\u032f\u0331\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000"+
		"\u0000\u0000\u0331\u0332\u0005N\u0000\u0000\u0332\u0333\u0005L\u0000\u0000"+
		"\u0333\u0334\u0005O\u0000\u0000\u0334u\u0001\u0000\u0000\u0000\u0335\u0336"+
		"\u0005N\u0000\u0000\u0336\u033b\u0005\u0006\u0000\u0000\u0337\u033c\u0003"+
		"\u0014\n\u0000\u0338\u0339\u0005\u008b\u0000\u0000\u0339\u033a\u0005\""+
		"\u0000\u0000\u033a\u033c\u0005\u008b\u0000\u0000\u033b\u0337\u0001\u0000"+
		"\u0000\u0000\u033b\u0338\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000"+
		"\u0000\u0000\u033d\u0341\u0005O\u0000\u0000\u033e\u0340\u0003l6\u0000"+
		"\u033f\u033e\u0001\u0000\u0000\u0000\u0340\u0343\u0001\u0000\u0000\u0000"+
		"\u0341\u033f\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000\u0000\u0000"+
		"\u0342w\u0001\u0000\u0000\u0000\u0343\u0341\u0001\u0000\u0000\u0000\u0344"+
		"\u0345\u0005N\u0000\u0000\u0345\u0346\u0005\u0005\u0000\u0000\u0346\u0347"+
		"\u0005O\u0000\u0000\u0347y\u0001\u0000\u0000\u0000\u0348\u034b\u0003|"+
		">\u0000\u0349\u034b\u0003\u0096K\u0000\u034a\u0348\u0001\u0000\u0000\u0000"+
		"\u034a\u0349\u0001\u0000\u0000\u0000\u034b{\u0001\u0000\u0000\u0000\u034c"+
		"\u034d\u0003~?\u0000\u034d\u034e\u0003\u0080@\u0000\u034e\u034f\u0003"+
		"\u0084B\u0000\u034f\u0350\u0003\u0086C\u0000\u0350\u0351\u0003\u0082A"+
		"\u0000\u0351}\u0001\u0000\u0000\u0000\u0352\u0353\u0005R\u0000\u0000\u0353"+
		"\u0354\u0005V\u0000\u0000\u0354\u0355\u0005U\u0000\u0000\u0355\u007f\u0001"+
		"\u0000\u0000\u0000\u0356\u0357\u0005R\u0000\u0000\u0357\u0358\u0005W\u0000"+
		"\u0000\u0358\u0359\u0005U\u0000\u0000\u0359\u0081\u0001\u0000\u0000\u0000"+
		"\u035a\u035b\u0005S\u0000\u0000\u035b\u035c\u0005W\u0000\u0000\u035c\u035d"+
		"\u0005U\u0000\u0000\u035d\u0083\u0001\u0000\u0000\u0000\u035e\u035f\u0005"+
		"R\u0000\u0000\u035f\u0360\u0005X\u0000\u0000\u0360\u0362\u0005U\u0000"+
		"\u0000\u0361\u0363\u0003\u0088D\u0000\u0362\u0361\u0001\u0000\u0000\u0000"+
		"\u0362\u0363\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000\u0000"+
		"\u0364\u0365\u0005S\u0000\u0000\u0365\u0366\u0005X\u0000\u0000\u0366\u0367"+
		"\u0005U\u0000\u0000\u0367\u0085\u0001\u0000\u0000\u0000\u0368\u0369\u0005"+
		"R\u0000\u0000\u0369\u036a\u0005Y\u0000\u0000\u036a\u036c\u0005U\u0000"+
		"\u0000\u036b\u036d\u0003\u0088D\u0000\u036c\u036b\u0001\u0000\u0000\u0000"+
		"\u036c\u036d\u0001\u0000\u0000\u0000\u036d\u036e\u0001\u0000\u0000\u0000"+
		"\u036e\u036f\u0005S\u0000\u0000\u036f\u0370\u0005Y\u0000\u0000\u0370\u0371"+
		"\u0005U\u0000\u0000\u0371\u0087\u0001\u0000\u0000\u0000\u0372\u0376\u0003"+
		"\u008aE\u0000\u0373\u0376\u0005\u008b\u0000\u0000\u0374\u0376\u0003l6"+
		"\u0000\u0375\u0372\u0001\u0000\u0000\u0000\u0375\u0373\u0001\u0000\u0000"+
		"\u0000\u0375\u0374\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000"+
		"\u0000\u0377\u0375\u0001\u0000\u0000\u0000\u0377\u0378\u0001\u0000\u0000"+
		"\u0000\u0378\u0089\u0001\u0000\u0000\u0000\u0379\u037b\u0003\u008cF\u0000"+
		"\u037a\u037c\u0003\u0088D\u0000\u037b\u037a\u0001\u0000\u0000\u0000\u037b"+
		"\u037c\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d"+
		"\u037e\u0003\u008eG\u0000\u037e\u0381\u0001\u0000\u0000\u0000\u037f\u0381"+
		"\u0003\u0094J\u0000\u0380\u0379\u0001\u0000\u0000\u0000\u0380\u037f\u0001"+
		"\u0000\u0000\u0000\u0381\u008b\u0001\u0000\u0000\u0000\u0382\u0383\u0005"+
		"R\u0000\u0000\u0383\u0387\u0003\u0092I\u0000\u0384\u0386\u0003\u0090H"+
		"\u0000\u0385\u0384\u0001\u0000\u0000\u0000\u0386\u0389\u0001\u0000\u0000"+
		"\u0000\u0387\u0385\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000"+
		"\u0000\u0388\u038a\u0001\u0000\u0000\u0000\u0389\u0387\u0001\u0000\u0000"+
		"\u0000\u038a\u038b\u0005U\u0000\u0000\u038b\u008d\u0001\u0000\u0000\u0000"+
		"\u038c\u038d\u0005S\u0000\u0000\u038d\u038e\u0003\u0092I\u0000\u038e\u038f"+
		"\u0005U\u0000\u0000\u038f\u008f\u0001\u0000\u0000\u0000\u0390\u0393\u0007"+
		"\u0005\u0000\u0000\u0391\u0392\u0005w\u0000\u0000\u0392\u0394\u0005\u008d"+
		"\u0000\u0000\u0393\u0391\u0001\u0000\u0000\u0000\u0393\u0394\u0001\u0000"+
		"\u0000\u0000\u0394\u0091\u0001\u0000\u0000\u0000\u0395\u0396\u0007\u0006"+
		"\u0000\u0000\u0396\u0093\u0001\u0000\u0000\u0000\u0397\u0398\u0005R\u0000"+
		"\u0000\u0398\u039c\u0007\u0007\u0000\u0000\u0399\u039b\u0003\u0090H\u0000"+
		"\u039a\u0399\u0001\u0000\u0000\u0000\u039b\u039e\u0001\u0000\u0000\u0000"+
		"\u039c\u039a\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000\u0000"+
		"\u039d\u03a0\u0001\u0000\u0000\u0000\u039e\u039c\u0001\u0000\u0000\u0000"+
		"\u039f\u03a1\u0005T\u0000\u0000\u03a0\u039f\u0001\u0000\u0000\u0000\u03a0"+
		"\u03a1\u0001\u0000\u0000\u0000\u03a1\u0095\u0001\u0000\u0000\u0000\u03a2"+
		"\u03a5\u0003\u008aE\u0000\u03a3\u03a5\u0005\u008b\u0000\u0000\u03a4\u03a2"+
		"\u0001\u0000\u0000\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a5\u03a6"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a4\u0001\u0000\u0000\u0000\u03a6\u03a7"+
		"\u0001\u0000\u0000\u0000\u03a7\u0097\u0001\u0000\u0000\u0000f\u009c\u009e"+
		"\u00ae\u00b2\u00b5\u00b9\u00c3\u00c6\u00ce\u00d3\u00e0\u00e5\u00f1\u00f5"+
		"\u00fe\u0101\u0107\u010b\u0113\u0117\u0124\u0150\u0152\u0158\u0160\u0169"+
		"\u0171\u0178\u017f\u0183\u018a\u0190\u0196\u019b\u01a2\u01ac\u01af\u01b9"+
		"\u01bc\u01c0\u01cf\u01d5\u01db\u01e3\u01e6\u01e8\u01f3\u01f9\u0201\u0204"+
		"\u0207\u020f\u0219\u0223\u0228\u022f\u0233\u0238\u023d\u0246\u024d\u0255"+
		"\u025c\u027a\u027c\u0286\u028c\u02a2\u02ae\u02b1\u02b3\u02c4\u02c7\u02cf"+
		"\u02d5\u02d9\u02de\u02e7\u02f2\u02f8\u02ff\u0301\u0308\u0310\u031b\u0328"+
		"\u032e\u033b\u0341\u034a\u0362\u036c\u0375\u0377\u037b\u0380\u0387\u0393"+
		"\u039c\u03a0\u03a4\u03a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}