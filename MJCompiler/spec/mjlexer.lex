package rs.ac.bg.etf.pp1;
import java_cup.runtime.Symbol;

%%

%cup
%line
%column
%xstate COMMENT

%{

//ukljucivanje informacije o poziciji tokena
private Symbol new_symbol(int type){
	return new Symbol(type,yyline+1,yycolumn);
}

//ukljucivanje informacije o poziciji tokena
private Symbol new_symbol(int type,Object value){
	return new Symbol(type,yyline+1,yycolumn,value);
}	


%}

%eofval{
 return new_symbol(sym.EOF);
%eofval}


%%

" "    { }
"\t"   { }
"\b"   { }
"\r\n" { }
"\f"   { }

"-" {return new_symbol(sym.MINUS,yytext());}
"program" {return new_symbol(sym.PROG,yytext());}
"break" {return new_symbol(sym.BREAK,yytext());}
"class" {return new_symbol(sym.CLASS,yytext());}
"enum" {return new_symbol(sym.ENUM,yytext());}
"else" {return new_symbol(sym.ELSE,yytext());}
"const" {return new_symbol(sym.CONST,yytext());}
"if" {return new_symbol(sym.IF,yytext());}
"switch" {return new_symbol(sym.SWITCH,yytext());}
"do" {return new_symbol(sym.DO,yytext());}
"while" {return new_symbol(sym.WHILE,yytext());}
"new" {return new_symbol(sym.NEW,yytext());}
"read" {return new_symbol(sym.READ,yytext());}
"print" {return new_symbol(sym.PRINT,yytext());}
"return" {return new_symbol(sym.RETURN,yytext());}
"void" {return new_symbol(sym.VOID,yytext());}
"extends" {return new_symbol(sym.EXTENDS,yytext());}
"continue" {return new_symbol(sym.CONTINUE,yytext());}
"case" {return new_symbol(sym.CASE,yytext());}
"true" {return new_symbol(sym.BOOLCONST,yytext());}
"false" {return new_symbol(sym.BOOLCONST,yytext());}
"yield" {return new_symbol(sym.YIELD,yytext());}
"default" {return new_symbol(sym.DEFAULT,yytext());}
"+" {return new_symbol(sym.PLUS,yytext());}
"\"*\"" {return new_symbol(sym.MULVECTOR, yytext());}
"*" {return new_symbol(sym.STAR,yytext());}
"=" {return new_symbol(sym.EQUAL,yytext());}
"==" {return new_symbol(sym.ISEQUAL,yytext());}
"!=" {return new_symbol(sym.NOTEQUAL,yytext());}
">" {return new_symbol(sym.GREATER,yytext());}
"<" {return new_symbol(sym.LESS,yytext());}
">=" {return new_symbol(sym.GREATEREQUAL,yytext());}
"<=" {return new_symbol(sym.LESSEQUAL,yytext());}
"&&" {return new_symbol(sym.AND,yytext());}
"++" {return new_symbol(sym.PLUSPLUS,yytext());}
"--" {return new_symbol(sym.MINUSMINUS,yytext());}
"." {return new_symbol(sym.DOT,yytext());}
"||" {return new_symbol(sym.OR,yytext());}
"/" {return new_symbol(sym.SLASH,yytext());}
"%" {return new_symbol(sym.PERCENT,yytext());}
";" {return new_symbol(sym.SEMI,yytext());}
"," {return new_symbol(sym.COMMA,yytext());}
"[" {return new_symbol(sym.LBRACKET,yytext());}
"]" {return new_symbol(sym.RBRACKET,yytext());}
"(" {return new_symbol(sym.LPAREN,yytext());}
")" {return new_symbol(sym.RPAREN,yytext());}
"{" {return new_symbol(sym.LBRACE,yytext());}
"}" {return new_symbol(sym.RBRACE,yytext());}
"?" {return new_symbol(sym.QUEST,yytext());}
":" {return new_symbol(sym.COLON,yytext());}
'[\x00-\x7F]' {return new_symbol(sym.CHARCONSTANT,yytext());}






"//" {yybegin(COMMENT);}
<COMMENT> . {yybegin(COMMENT);}
<COMMENT> "\r\n" {yybegin(YYINITIAL);}

[0-9]+ { return new_symbol(sym.NUMCONST, new Integer (yytext()));}
([a-z]|[A-Z])[a-z|A-Z|0-9|_]* { return new_symbol(sym.IDENT,yytext());}

. {System.err.println("Leksicka greska (" + yytext() + ") u liniji " + (yyline+1));}




