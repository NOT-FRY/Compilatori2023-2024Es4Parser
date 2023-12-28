package tree_structure;

public class IdentifierExpression {
    private Identifier identifier;
    private Expression exp;

    public IdentifierExpression(Identifier identifier, Expression exp) {
        this.identifier = identifier;
        this.exp = exp;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Expression getExp() {
        return exp;
    }

    public void setExp(Expression exp) {
        this.exp = exp;
    }
}
