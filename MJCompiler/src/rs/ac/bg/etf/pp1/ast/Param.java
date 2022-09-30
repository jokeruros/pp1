// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class Param extends Parametar {

    private Type Type;
    private String ident;
    private BracketsOp BracketsOp;

    public Param (Type Type, String ident, BracketsOp BracketsOp) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.ident=ident;
        this.BracketsOp=BracketsOp;
        if(BracketsOp!=null) BracketsOp.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident=ident;
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
        if(Type!=null) Type.accept(visitor);
        if(BracketsOp!=null) BracketsOp.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(BracketsOp!=null) BracketsOp.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(BracketsOp!=null) BracketsOp.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Param(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+ident);
        buffer.append("\n");

        if(BracketsOp!=null)
            buffer.append(BracketsOp.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Param]");
        return buffer.toString();
    }
}
