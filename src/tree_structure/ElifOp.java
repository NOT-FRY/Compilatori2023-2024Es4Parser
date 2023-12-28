package tree_structure;

public class ElifOp extends Node{
    private Expression expression;
    private BodyOp body;

    public ElifOp(Expression expression, BodyOp body) {
        this.expression = expression;
        this.body = body;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public BodyOp getBody() {
        return body;
    }

    public void setBody(BodyOp body) {
        this.body = body;
    }

    public Object accept(Visitor v){
        return v.visit(this);
    }
}
