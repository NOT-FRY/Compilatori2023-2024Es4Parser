package tree_structure;

import tree_structure.Expression.*;
import tree_structure.Statement.*;

public interface Visitor {

    Object visit(AddOp a);
    Object visit(AndOp a);
    Object visit(AssignStatement a);
    Object visit(BodyOp b);
    Object visit(DiffOp d);
    Object visit(DivOp d);
    Object visit(ElifOp e);
    Object visit(EQOp e);
    Object visit(false_const f);
    Object visit(FunCallOp f);
    Object visit(FunctionOp f);
    Object visit(GEOp g);
    Object visit(GTOp g);
    Object visit(IfStatement i);
    Object visit(integer_const i);
    Object visit(LEOp l);
    Object visit(LTOp l);
    Object visit(MulOp m);
    Object visit(NEOp n);
    Object visit(NotOp n);
    Object visit(OrOp o);
    Object visit(ProcFunParamOp p);
    Object visit(ProcedureOp p);
    Object visit(ProgramOp p);
    Object visit(ReadStatement r);
    Object visit(real_const r);
    Object visit(ReturnStatement r);
    Object visit(string_const s);
    Object visit(true_const t);
    Object visit(UminusOp u);
    Object visit(VarDeclOp v);
    Object visit(WhileStatement w);
    Object visit(WriteStatement w);

}
