package esercitazione4;
import java_cup.runtime.Symbol;

%%

%unicode
%line
%cup

/*Whitespaces*/
LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]

/*Commenti*/
Commento = %[^%]*%

/*String literals*/
StringLiteral = \"[^\"]*\"


Identificatore = [A-Za-z] ( [A-Za-z_] | [0-9] )*

IntegerNumber = 0 | [1-9][0-9]*
RealNumber = {IntegerNumber}"."[0-9]+

%%

/*Commenti*/
<YYINITIAL> {Commento}      { /*ignora*/ }

/*Whitespaces*/
<YYINITIAL> {WhiteSpace}      { /*ignora*/ }


<YYINITIAL> "var"              { return new Symbol(sym.VAR); }
<YYINITIAL> ":"              { return new Symbol(sym.COLON); }
<YYINITIAL> "^="              { return new Symbol(sym.ASSIGN); }
<YYINITIAL> ";"              { return new Symbol(sym.SEMI); }
<YYINITIAL>{
    {Identificatore}            { return new Symbol(sym.ID,yytext()); }
}
<YYINITIAL> ","              { return new Symbol(sym.COMMA); }
<YYINITIAL>{
    {RealNumber}               { return new Symbol(sym.REAL_CONST,yytext()); }
    {IntegerNumber}            { return new Symbol(sym.INTEGER_CONST,yytext()); }
    {StringLiteral}            {
                                    String str =  yytext().substring(1,yylength()-1);
                                    return new Symbol(sym.STRING_LITERAL,str);
                                }
}
<YYINITIAL> "true"              { return new Symbol(sym.TRUE); }
<YYINITIAL> "false"              { return new Symbol(sym.FALSE); }
<YYINITIAL> "real"              { return new Symbol(sym.REAL); }
<YYINITIAL> "integer"              { return new Symbol(sym.INTEGER); }
<YYINITIAL> "string"              { return new Symbol(sym.STRING); }
<YYINITIAL> "boolean"              { return new Symbol(sym.BOOLEAN); }
<YYINITIAL> "return"              { return new Symbol(sym.RETURN); }
<YYINITIAL> "func"              { return new Symbol(sym.FUNCTION); }
<YYINITIAL> "->"              { return new Symbol(sym.TYPERETURN); }
<YYINITIAL> "endfunc"              { return new Symbol(sym.ENDFUNCTION); }
<YYINITIAL> "("              { return new Symbol(sym.LPAR); }
<YYINITIAL> ")"              { return new Symbol(sym.RPAR); }
<YYINITIAL> "proc"              { return new Symbol(sym.PROCEDURE); }
<YYINITIAL> "endproc"              { return new Symbol(sym.ENDPROCEDURE); }
<YYINITIAL> "out"              { return new Symbol(sym.OUT); }
<YYINITIAL> "-->"              { return new Symbol(sym.WRITE); }
<YYINITIAL> "-->!"              { return new Symbol(sym.WRITERETURN); }
<YYINITIAL> "$"              { return new Symbol(sym.DOLLARSIGN); }
<YYINITIAL> "<--"              { return new Symbol(sym.READ); }
<YYINITIAL> "if"              { return new Symbol(sym.IF); }
<YYINITIAL> "then"              { return new Symbol(sym.THEN); }
<YYINITIAL> "else"              { return new Symbol(sym.ELSE); }
<YYINITIAL> "endif"              { return new Symbol(sym.ENDIF); }
<YYINITIAL> "elseif"              { return new Symbol(sym.ELIF); }
<YYINITIAL> "while"              { return new Symbol(sym.WHILE); }
<YYINITIAL> "do"              { return new Symbol(sym.DO); }
<YYINITIAL> "endwhile"       { return new Symbol(sym.ENDWHILE); }
<YYINITIAL> "+"              { return new Symbol(sym.PLUS); }
<YYINITIAL> "-"              { return new Symbol(sym.MINUS); }
<YYINITIAL> "*"              { return new Symbol(sym.TIMES); }
<YYINITIAL> "/"              { return new Symbol(sym.DIV); }
<YYINITIAL> "="              { return new Symbol(sym.EQ); }
<YYINITIAL> "<>"              { return new Symbol(sym.NE); }
<YYINITIAL> "<"              { return new Symbol(sym.LT); }
<YYINITIAL> "<="              { return new Symbol(sym.LE); }
<YYINITIAL> ">"              { return new Symbol(sym.GT); }
<YYINITIAL> ">="              { return new Symbol(sym.GE); }
<YYINITIAL> "&&"              { return new Symbol(sym.AND); }
<YYINITIAL> "||"              { return new Symbol(sym.OR); }
<YYINITIAL> "!"              { return new Symbol(sym.NOT); }

<YYINITIAL> "@"              { return new Symbol(sym.REF); }

/* error fallback */

[^]                {return new Symbol(sym.ERROR,"- Carattere non consentito < "+
                    yytext()+" > a riga "+(yyline+1)+"\n" );}
