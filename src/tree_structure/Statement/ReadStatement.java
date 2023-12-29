package tree_structure.Statement;

import tree_structure.Expression.Expression;
import tree_structure.Node;
import tree_structure.Visitor;

import java.util.ArrayList;
import java.util.Objects;

public class ReadStatement extends Node implements Statement {
    private ArrayList<Expression> expressions;

    @Override
    public String toString() {
        return "ReadStatement{" +
                "expressions=" + expressions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReadStatement that)) return false;
        return Objects.equals(getExpressions(), that.getExpressions());
    }


    public ReadStatement(ArrayList<Expression> expressions) {
        this.expressions = expressions;
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(ArrayList<Expression> expressions) {
        this.expressions = expressions;
    }

    public Object accept(Visitor v){
        return v.visit(this);
    }
}