%%

/* 
A linha atual pode ser acessada por yyline 
e a coluna atual com yycolumn. 
*/ 
%line
%column

/* Se quisermos 'interfacear' com um parser gerado pelo sistema CUP
%cup
*/ 

//encoding
%unicode

// faz com que a classe tenha uma função main e torna possivel que a classe gerada seja usada como reconhecedor
%standalone

//nomeia a classe
%class TesteLexer

/* 
Declarações

código dentro de %{ e %}, é copiado para a classe gerada. 
a ideia é utilizar este recurso para declarar atributos e métodos usados nas ações 
*/ 

%{
int qntID=0;
%}


%eof{
    System.out.println("Quantidade de indetificadores encotrados: "+ qntID);
%eof}
/*
padroes nomeados
*/
underline       = [_]
letter          = [A-Za-z]
digit           = [0-9]
integer         = {digit}+
integer_literal = [1-9]digit* | 0
float_literal  = {integer_literal}.{integer}(E [+|-]? {integer_literal})?
alphanumeric    = {underline} | {letter} | {digit}
indentifier     = ({underline} | {letter}) ({alphanumeric})*
eol             = [\r | \n | \r\n]
whitespace      = {eol} | [\t]



/*Comentários alinhandos (um comentário dentro do outro) não são permitidos*/
COMMENT_MULTILINE = "/*" [^*] ~"*/" | "/*" "*"+ "/"
COMMENT_SIMPLELINE = "//" [^\r\n]* {eol}?
COMMENT = {COMMENT_MULTILINE}|{COMMENT_SIMPLELINE}

%%
/* palavras reservadas   */
"class"     { System.out.println("Token class"); }
"public"    { System.out.println("Token public"); }
"extends"   { System.out.println("Token extends"); }
"static"    { System.out.println("Token static"); }
"void"      { System.out.println("Token void"); }
"int"       { System.out.println("Token int"); }
"boolean"   { System.out.println("Token boolean"); }
"while"     { System.out.println("Token while"); }
"if"        { System.out.println("Token if"); }
"else"      { System.out.println("Token else"); }
"return"    { System.out.println("Token return"); }
"false"     { System.out.println("Token false"); }
"true"      { System.out.println("Token true"); }
"this"      { System.out.println("Token this"); }
"new"       { System.out.println("Token new"); }
"System.out.println"    {System.out.println("Token new "System.out.println"); }

/* simbolos reservados*/
"||"        { System.out.println("Token ||"); }
"&&"        { System.out.println("Token &&"); }
"=="        { System.out.println("Token =="); }
"!="        { System.out.println("Token !="); }
"<"         { System.out.println("Token <"); }
"<="        { System.out.println("Token <="); }
">"         { System.out.println("Token >"); }
">="        { System.out.println("Token >="); }
"+"         { System.out.println("Token +"); }
"-"         { System.out.println("Token -"); }
"*"         { System.out.println("Token *"); }
"/"         { System.out.println("Token /"); }
"%"         { System.out.println("Token &"); }
"!"         { System.out.println("Token !"); }


/*indetificadores*/
{indentifier}   {qntID++; System.out.println("Token ID ("+yytext()+")");}

/*literais*/
{integer_literal}   {qntID++; System.out.println("Token INT ("+yytext()+")");}
{float_literal}   {qntID++; System.out.println("Token FLOAT ("+yytext()+")");}

/*whitespace*/
{whitespace}    {/* ignorar whitespaces */}

/*comentario*/
{COMMENT}      {/* ignorar whitespaces */}

. { System.out.println("Illegal char, '" + yytext() + "' AT line: " + yyline + ", column: " + yycolumn); }