package tree_structure;

import java.beans.Expression;
import java.util.ArrayList;

public interface Statement {
}

enum WritingType{
    WRITE,
    WRITE_RETURN
}

class ReadStatement extends Node implements Statement{
    private ArrayList<Expression> expressions;

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

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Object accept(Visitor v) { return v.visit(this);}
}

