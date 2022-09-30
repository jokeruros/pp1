// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class VarOrErrDerived1 extends VarOrErr {

    private VarName VarName;
    private BracketsOp BracketsOp;

    public VarOrErrDerived1 (VarName VarName, BracketsOp BracketsOp) {
        this.VarName=VarName;
        if(VarName!=null) VarName.setParent(this);
        this.BracketsOp=BracketsOp;
        if(BracketsOp!=null) BracketsOp.setParent(this);
    }

    public VarName getVarName() {
        return VarName;
    }

    public void setVarName(VarName VarName) {
        this.VarName=VarName;
    }

    public BracketsOp getBracketsOp() {
        return BracketsOp;
    }

    public void setBracketsOp(BracketsOp BracketsOp) {
        this.BracketsOp=BracketsOp;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarName!=null) VarName.accept(visitor);
        if(BracketsOp!=null) BracketsOp.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarName!=null) VarName.traverseTopDown(visitor);
        if(BracketsOp!=null) BracketsOp.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarName!=null) VarName.traverseBottomUp(visitor);
        if(BracketsOp!=null) BracketsOp.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarOrErrDerived1(\n");

        if(VarName!=null)
            buffer.append(VarName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(BracketsOp!=null)
            buffer.append(BracketsOp.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarOrErrDerived1]");
        return buffer.toString();
    }
}
