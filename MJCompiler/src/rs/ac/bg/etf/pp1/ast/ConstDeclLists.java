// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclLists extends ConstDecl {

    private Type Type;
    private ConstName ConstName;
    private ConstValue ConstValue;

    public ConstDeclLists (Type Type, ConstName ConstName, ConstValue ConstValue) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.ConstName=ConstName;
        if(ConstName!=null) ConstName.setParent(this);
        this.ConstValue=ConstValue;
        if(ConstValue!=null) ConstValue.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public ConstName getConstName() {
        return ConstName;
    }

    public void setConstName(ConstName ConstName) {
        this.ConstName=ConstName;
    }

    public ConstValue getConstValue() {
        return ConstValue;
    }

    public void setConstValue(ConstValue ConstValue) {
        this.ConstValue=ConstValue;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(ConstName!=null) ConstName.accept(visitor);
        if(ConstValue!=null) ConstValue.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(ConstName!=null) ConstName.traverseTopDown(visitor);
        if(ConstValue!=null) ConstValue.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(ConstName!=null) ConstName.traverseBottomUp(visitor);
        if(ConstValue!=null) ConstValue.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclLists(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstName!=null)
            buffer.append(ConstName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstValue!=null)
            buffer.append(ConstValue.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclLists]");
        return buffer.toString();
    }
}
