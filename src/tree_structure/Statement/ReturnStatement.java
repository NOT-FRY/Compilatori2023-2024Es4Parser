package tree_structure.Statement;

import tree_structure.Expression.Expression;
import tree_structure.Node;
import tree_structure.Visitor;

import java.util.Objects;

public class ReturnStatement extends Node implements Statement {
    private Expression expression;

    @Override
    public String toString() {
        return "ReturnStatement{" +
                "expression=" + expression +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReturnStatement that)) return false;
        return Objects.equals(getExpression(), that.getExpression());
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Object accept(Visitor v) { return v.visit(this);}
}
