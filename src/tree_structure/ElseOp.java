package tree_structure;

import java.util.Objects;

public class ElseOp extends Node{

    private BodyOp body;

    public ElseOp(BodyOp body) {
        this.body = body;
    }

    public BodyOp getBody() {
        return body;
    }

    public void setBody(BodyOp body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ElseOp{" +
                "body=" + body +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElseOp elseOp = (ElseOp) o;
        return Objects.equals(body, elseOp.body);
    }

    @Override
    public Object accept(Visitor v) {
        return v.visit(this);
    }
}
