// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class MulVarIdent extends VarIdent {

    private VarIdent VarIdent;
    private VarOrErr VarOrErr;

    public MulVarIdent (VarIdent VarIdent, VarOrErr VarOrErr) {
        this.VarIdent=VarIdent;
        if(VarIdent!=null) VarIdent.setParent(this);
        this.VarOrErr=VarOrErr;
        if(VarOrErr!=null) VarOrErr.setParent(this);
    }

    public VarIdent getVarIdent() {
        return VarIdent;
    }

    public void setVarIdent(VarIdent VarIdent) {
        this.VarIdent=VarIdent;
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
        if(VarIdent!=null) VarIdent.accept(visitor);
        if(VarOrErr!=null) VarOrErr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarIdent!=null) VarIdent.traverseTopDown(visitor);
        if(VarOrErr!=null) VarOrErr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarIdent!=null) VarIdent.traverseBottomUp(visitor);
        if(VarOrErr!=null) VarOrErr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MulVarIdent(\n");

        if(VarIdent!=null)
            buffer.append(VarIdent.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarOrErr!=null)
            buffer.append(VarOrErr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MulVarIdent]");
        return buffer.toString();
    }
}
