// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class SingleVarIdent extends VarIdent {

    private VarOrErr VarOrErr;

    public SingleVarIdent (VarOrErr VarOrErr) {
        this.VarOrErr=VarOrErr;
        if(VarOrErr!=null) VarOrErr.setParent(this);
    }

    public VarOrErr getVarOrErr() {
        return VarOrErr;
    }

    public void setVarOrErr(VarOrErr VarOrErr) {
        this.VarOrErr=VarOrErr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarOrErr!=null) VarOrErr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarOrErr!=null) VarOrErr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarOrErr!=null) VarOrErr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SingleVarIdent(\n");

        if(VarOrErr!=null)
            buffer.append(VarOrErr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SingleVarIdent]");
        return buffer.toString();
    }
}
