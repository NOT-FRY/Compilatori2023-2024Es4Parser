package tree_structure;

import java.util.ArrayList;
import java.util.Objects;

public interface Statement {
    Object accept(Visitor v);
}

enum WritingType{
    WRITE,
    WRITE_RETURN
}

class ReadStatement extends Node implements Statement{
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
class WriteStatement extends Node implements Statement{
    private WritingType writingType;
    private ArrayList<Expression> expressions;

    public WriteStatement(WritingType writingType, ArrayList<Expression> expressions) {
        this.writingType = writingType;
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "WriteStatement{" +
                "writingType=" + writingType +
                ", expressions=" + expressions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WriteStatement that)) return false;
        return getWritingType() == that.getWritingType() && Objects.equals(getExpressions(), that.getExpressions());
    }

    public WritingType getWritingType() {
        return writingType;
    }

    public void setWritingType(WritingType writingType) {
        this.writingType = writingType;
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

class AssignStatement extends Node implements Statement{
    private ArrayList<Identifier> identifiers;

    private ArrayList<Expression> expressions;

    public AssignStatement(ArrayList<Identifier> identifiers, ArrayList<Expression> expressions) {
        this.identifiers = identifiers;
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "AssignStatement{" +
                "identifiers=" + identifiers +
                ", expressions=" + expressions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssignStatement that)) return false;
        return Objects.equals(getIdentifiers(), that.getIdentifiers()) && Objects.equals(getExpressions(), that.getExpressions());
    }

    public ArrayList<Identifier> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(ArrayList<Identifier> identifiers) {
        this.identifiers = identifiers;
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

class WhileStatement extends Node implements Statement {
    private Expression expression;

    private BodyOp body;

    public WhileStatement(Expression expression, BodyOp body) {
        this.expression = expression;
        this.body = body;
    }

    @Override
    public String toString() {
        return "WhileStatement{" +
                "expression=" + expression +
                ", body=" + body +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WhileStatement that)) return false;
        return Objects.equals(getExpression(), that.getExpression()) && Objects.equals(getBody(), that.getBody());
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

class IfStatement extends Node implements Statement{
    private Expression expression;
    private BodyOp body;
    private ArrayList<ElifOp> elifList;
    private BodyOp elseBody;

    public IfStatement(Expression expression, BodyOp body, ArrayList<ElifOp> elifList, BodyOp elseBody) {
        this.expression = expression;
        this.body = body;
        this.elifList = elifList;
        this.elseBody = elseBody;
    }

    @Override
    public String toString() {
        return "IfStatement{" +
                "expression=" + expression +
                ", body=" + body +
                ", elifList=" + elifList +
                ", elseBody=" + elseBody +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IfStatement that)) return false;
        return Objects.equals(getExpression(), that.getExpression()) && Objects.equals(getBody(), that.getBody()) && Objects.equals(getElifList(), that.getElifList()) && Objects.equals(getElseBody(), that.getElseBody());
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

    public ArrayList<ElifOp> getElifList() {
        return elifList;
    }

    public void setElifList(ArrayList<ElifOp> elifList) {
        this.elifList = elifList;
    }

    public BodyOp getElseBody() {
        return elseBody;
    }

    public void setElseBody(BodyOp elseBody) {
        this.elseBody = elseBody;
    }

    public Object accept(Visitor v){
        return v.visit(this);
    }
}

class ReturnStatement extends Node implements Statement{
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

