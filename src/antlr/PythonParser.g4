parser grammar PythonParser;

options { tokenVocab =PythonLexer;}

program
    : (state
    |  flask
    |  document
    |  state_jinja2)* EOF ;
  state
     : var_decl                     #Vardecllable
     | arr_decl                     #Arrdecllable
     | loops                        #Loopslable
     | exp                          #ExpLable
     | condition                    #ConditionLable
     | func_decl                    #FuncDeclLable
     | call_func                    #CallFuncLable
     | class_decl                   #ClassDeclLable
     | object                       #ObjLable
     | call_fromclass               #CallFromClassLable
     | inheritance                  #InheritLable
     ;
var_decl
    : (ID|arr) (EQUALS)? (value|exp)
    ;
value
    : INT
    | STRING
    | DOUBLE
    | ID
    | arr
    | TRUEBOOL
    | FALSEBOOL
    | NONE
    ;
arr
    : (ID)? OPENSQUER (value(COMMA value)*)* CLOSESQUER
    ;
arr_decl
    : ID EQUALS OPENSQUER (value(COMMA value)*)* CLOSESQUER
    ;

while_value
    : INT
    | STRING
    | DOUBLE
    | ID
    | TRUEBOOL
    | FALSEBOOL
    | exp
    ;
loops
    : for
    | while
    ;
for
    : FOR ID IN (((RANGE OPENPRAC (INT|ID) CLOSEPRAC)?)|ID) COLONE (state)* (BREAK|CONTINUE)?;
while
    : WHILE while_value COLONE (state)* (BREAK|CONTINUE)? ;
exp
    : exp POW exp
    | exp MULT exp
    | exp DIVISION exp
    | exp MOD exp
    | exp SUM exp
    | exp SUB exp
    | exp ISEQUALS exp
    | exp ISGRATER exp
    | exp ISSMALLER exp
    | exp IFGREATEROREQUALS exp
    | exp IFSMALLEROREQUALS exp
    | exp OR exp
    | exp AND exp
    | exp IS exp
    | INT
    | ID
    | ID DOT ID
    | STRING
    | TRUEBOOL
    | FALSEBOOL
    | NONE
    | arr
    ;
condition
    : if
    | elif
    | else
    ;
if
   : IF exp COLONE (state)*
   ;
elif
   : ELIF exp COLONE (state)*
   ;
else
   : ELSE COLONE (state)*
   ;
func_decl
    : DEF ID OPENPRAC (paralist)? CLOSEPRAC COLONE (state)* (return)?
    ;
paralist
    : (value(COMMA value)*)
    ;
call_func
    : ID OPENPRAC (paralist)? CLOSEPRAC
    | build_in_func OPENPRAC (paralist)? CLOSEPRAC
    | appendfunc
    ;
build_in_func
    : PRINT
    | TYPE
    | INPUT
    | LEN
    | POP
    | GET
    ;
appendfunc
    : APPEND OPENPRAC appendvar? CLOSEPRAC
    ;
appendvar
    : OPENKPRA (appendparlist(COMMA appendparlist)*)? CLOSEKPRA
    ;
appendparlist
    : ID COLONE (ID|(LEN OPENPRAC (ID)? CLOSEPRAC))
    ;
return
    : RETURN (value)?
    ;
run
    : RUN OPENPRAC DEBUG EQUALS TRUEBOOL CLOSEPRAC
    ;
class_decl
   :CLASS ID COLONE encapsulation* (state)* construture_decl*
   ;
construture_decl
   : DEF INIT OPENPRAC (SELF (COMMA)? (paralist)?)? CLOSEPRAC COLONE (SELF DOT ID EQUALS value)* state*
   ;
object
   : ID EQUALS ID OPENPRAC (SELF)? (COMMA)? (paralist)? CLOSEPRAC
   ;
call_fromclass
   :ID DOT (call_func|ID)
   ;
inheritance
   : CLASS ID OPENPRAC ID (COMMA ID)* CLOSEPRAC COLONE (SUPER DOT INIT OPENPRAC CLOSEPRAC)? (state)*
   ;
encapsulation
   : PRIVATE var_decl
   | PROTECTED var_decl
   ;

///Flask
flask
    : flasklib              #FlasklibraryLabel
    | flaskfragment         #FlaskfragLabel
    ;
flasklib
    : flasklibrarydecl
    | osdecl
    | utilsdecl
    ;
flaskfragment
    :  flasklibrarydecl appdecl (flaskstate)? apprun
    ;
flasklibrarydecl
    : FROM FLASKLIB IMPORT (liblist) flasklib?
    ;
liblist
    : (libvalue(COMMA libvalue)*)
    ;
libvalue
    : FLASK
    | RENDERTEMPLATE
    | REQUEST
    | URLFOR
    ;
osdecl
    : IMPORT OS flasklib?
    ;
utilsdecl
    : FROM UTILS IMPORT SEQUREFILENAME flasklib?
    ;
appdecl
    : ID EQUALS FLASK OPENPRAC NAME CLOSEPRAC
    ;
apprun
    : IF NAME ISEQUALS MAIN COLONE ID DOT run
    ;
appconfig
    : ID DOT CONFIG OPENSQUER UPLOADFOLDER CLOSESQUER EQUALS ID
    ;
flaskstate
    : (state | routdecl | appconfig)+
    ;
routdecl
    : AT ID DOT ROUTE OPENPRAC ROUTEPATH (COMMA methods)? CLOSEPRAC routestate*
    ;
methods
    : METHODS EQUALS OPENSQUER (STRING COMMA STRING) CLOSESQUER
    ;
routestate
    : var_flask_decl
    | arr_decl
    | loops
    | flask_exp
    | flask_condition
    | flask_func_decl
    | call_func
    | object
    | call_fromclass
    | falsk_return
    ;

var_flask_decl
    : var_decl | (ID EQUALS (route_call|SEQUREFILENAME OPENPRAC ((ID DOT FILENAME)|STRING) CLOSEPRAC))
    ;

route_call
    :  requestcall DOT call_func
    ;
requestcall
    : REQUEST DOT (METHOD | FORM | FILES)
    ;
flask_condition
    : condition
    | IF flask_exp COLONE (routestate)*
    ;
flask_exp
    :   exp |   REQUEST DOT METHOD ISEQUALS STRING
    ;
flask_func_decl
    : func_decl (routestate)* (falsk_return)?
    ;
falsk_return
    :  RETURN (redirect|rendertemplate)
    ;
redirect
    : REDIRECT OPENPRAC (STRING | (URLFOR OPENPRAC STRING CLOSEPRAC)) CLOSEPRAC
    ;
rendertemplate
    : RENDERTEMPLATE OPENPRAC ((STRING | (URLFOR OPENPRAC STRING CLOSEPRAC)) (COMMA ID EQUALS ID)?) CLOSEPRAC
    ;

// JINJA2
state_jinja2
    : (printinjinja
    | condition_jinja2
    | tagsDocument)+
    ;
printinjinja
    : DOUBLEOPENKPRA (ID|(ID DOT ID))? DOUBLECLOSEKPRA
    ;
condition_jinja2
    : for_jinja2            #For_j
    | if_jinja2             #If_j
    | else_jinja2           #Else_j
    | elif_jinja2           #Elif_j

    ;
for_jinja2
   : OPENCONDITION FOR ID IN (INT|ID) CLOSECONDITION  (state_jinja2)* OPENCONDITION ENDFOR CLOSECONDITION
   ;
if_jinja2
   :OPENCONDITION IF (exp |(ID DOT ID)) CLOSECONDITION (state_jinja2)* OPENCONDITION ENDIF CLOSECONDITION
   ;
elif_jinja2
   :OPENCONDITION ELIF (exp |(ID DOT ID))  CLOSECONDITION (state_jinja2)*
   ;
else_jinja2
   : OPENCONDITION ELSE CLOSECONDITION
   ;

//HTML
document
    : fullHtmlDocument      #FullHtmlDocumentLabel
    | tagsDocument          #TagsDocumentLabel
    ;

fullHtmlDocument
    : doctypehtml htmlOpen headSection bodySection htmlClose
    ;

doctypehtml
    : TAG_OPEN DOCTYPEHTML_TAG TAG_CLOSE
    ;

htmlOpen
    :TAG_OPEN HTML_TAG TAG_CLOSE
    ;

htmlClose
    : TAG_OPEN_SLASH HTML_TAG TAG_CLOSE
    ;

headSection
    : TAG_OPEN HEAD_TAG TAG_CLOSE content? TAG_OPEN_SLASH HEAD_TAG TAG_CLOSE
    ;

bodySection
    : TAG_OPEN BODY_TAG TAG_CLOSE content? TAG_OPEN_SLASH BODY_TAG TAG_CLOSE
    ;
content
    : (tagtype
    | ID
    | state_jinja2)+
    ;
tagtype
    : startTag content? endTag
    | selfClosingtag
    ;
startTag
    : TAG_OPEN tagName (attribute)* TAG_CLOSE
    ;
endTag
    : TAG_OPEN_SLASH tagName TAG_CLOSE
    ;
attribute
    :(CLASS
     |IDHTML
     |STYLE
     |SRC
     |ALT
     |TYPE
     |HREF
     |VALUE
     |PLACEHOLDER
     |NAMEHTML
     |REL
     |METHOD
     |ENCTYPE
     |RQUIRED) (EQUALS STRING)?
     ;
tagName
    : DIV_TAG
    | P_TAG
    | H1_TAG
    | H2_TAG
    | H3_TAG
    | H4_TAG
    | TITLE
    | BUTTON_TAG
    | UL_TAG
    | LI_TAG
    | A_TAG
    | FORM
    | LABEL_TAG
    | LINK
    ;
selfClosingtag
    : TAG_OPEN (IMG_TAG | INPUT) attribute* (SLASH_CLOSE)?
    ;
tagsDocument
    : (tagtype
    | ID)+
    ;

