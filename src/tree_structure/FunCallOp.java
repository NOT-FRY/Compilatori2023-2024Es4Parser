package tree_structure;

import java.util.ArrayList;
import java.util.Objects;

public class FunCallOp extends Node{
    Identifier identifier;
    ArrayList<Expression> expressions;

    public FunCallOp(Identifier identifier, ArrayList<Expression> expressions) {
        this.identifier = identifier;
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "FunCallOp{" +
                "identifier=" + identifier +
                ", expressions=" + expressions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FunCallOp funCallOp)) return false;
        return Objects.equals(identifier, funCallOp.identifier) && Objects.equals(expressions, funCallOp.expressions);
    }


    public Object accept(Visitor v){
        return v.visit(this);
    }
}
