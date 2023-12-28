package tree_structure;

import java.beans.Expression;
import java.util.ArrayList;

public class FunCallOp extends Node{
    Identifier identifier;
    ArrayList<Expression> expressions;

    public FunCallOp(Identifier identifier, ArrayList<Expression> expressions) {
        this.identifier = identifier;
        this.expressions = expressions;
    }

    public Object accept(Visitor v){
        return v.visit(this);
    }
}
