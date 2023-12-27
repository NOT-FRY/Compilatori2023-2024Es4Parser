package esercitazione4;
import java_cup.runtime.Symbol;

public class sym {

    public static final int ERROR=-1;
    public static final int EOF=0;

    public static final int VAR=1;
    public static final int COLON=2;
    public static final int ASSIGN=3;
    public static final int SEMI=4;
    public static final int ID=5;
    public static final int COMMA=6;
    public static final int REAL_CONST=7;
    public static final int INTEGER_CONST=8;
    public static final int STRING_LITERAL=9;
    public static final int TRUE=10;
    public static final int FALSE=11;
    public static final int REAL=12;
    public static final int INTEGER=13;
    public static final int STRING=14;
    public static final int BOOLEAN=15;
    public static final int RETURN=16;
    public static final int FUNCTION=17;
    public static final int TYPERETURN=18;
    public static final int ENDFUNCTION=19;
    public static final int LPAR=22;
    public static final int RPAR=23;
    public static final int PROCEDURE=24;
    public static final int ENDPROCEDURE=25;
    public static final int OUT=26;
    public static final int WRITE=27;
    public static final int WRITERETURN=28;
    public static final int DOLLARSIGN=29;
    public static final int READ=30;
    public static final int IF=31;
    public static final int THEN=32;
    public static final int ELSE=33;
    public static final int ENDIF=34;
    public static final int ELIF=35;
    public static final int WHILE=36;
    public static final int DO=37;
    public static final int ENDWHILE=38;
    public static final int PLUS=39;
    public static final int MINUS=40;
    public static final int TIMES=41;
    public static final int DIV=42;
    public static final int EQ=43;
    public static final int NE=44;
    public static final int LT=45;
    public static final int LE=46;
    public static final int GT=47;
    public static final int GE=48;
    public static final int AND=49;
    public static final int OR=50;
    public static final int NOT=51;
    public static final int REF=52;

    public static final String[] terminalNames = new String[] {
            "EOF",
            "ERROR",
            "VAR",
            "COLON",
            "ASSIGN",
            "SEMI",
            "COMMA",
            "TRUE",
            "FALSE",
            "REAL",
            "INTEGER",
            "STRING",
            "BOOLEAN",
            "RETURN",
            "FUNCTION",
            "TYPERETURN",
            "ENDFUNCTION",
            "LPAR",
            "RPAR",
            "PROCEDURE",
            "ENDPROCEDURE",
            "OUT",
            "WRITE",
            "WRITERETURN",
            "DOLLARSIGN",
            "READ",
            "IF",
            "THEN",
            "ELSE",
            "ENDIF",
            "ELIF",
            "WHILE",
            "DO",
            "ENDWHILE",
            "PLUS",
            "MINUS",
            "TIMES",
            "DIV",
            "EQ",
            "NE",
            "LT",
            "LE",
            "GT",
            "GE",
            "AND",
            "OR",
            "NOT",
            "ENDVAR",
            "REF",
            "ID",
            "REAL_CONST",
            "INTEGER_CONST",
            "STRING_CONST"
    };
}
