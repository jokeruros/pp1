// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class MulConstValues extends ConstValue {

    private ConstValue ConstValue;
    private ConstName ConstName;
    private Constant Constant;

    public MulConstValues (ConstValue ConstValue, ConstName ConstName, Constant Constant) {
        this.ConstValue=ConstValue;
        if(ConstValue!=null) ConstValue.setParent(this);
        this.ConstName=ConstName;
        if(ConstName!=null) ConstName.setParent(this);
        this.Constant=Constant;
        if(Constant!=null) Constant.setParent(this);
    }

    public ConstValue getConstValue() {
        return ConstValue;
    }

    public void setConstValue(ConstValue ConstValue) {
        this.ConstValue=ConstValue;
    }

    public ConstName getConstName() {
        return ConstName;
    }

    public void setConstName(ConstName ConstName) {
        this.ConstName=ConstName;
    }

    public Constant getConstant() {
        return Constant;
    }

    public void setConstant(Constant Constant) {
        this.Constant=Constant;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstValue!=null) ConstValue.accept(visitor);
        if(ConstName!=null) ConstName.accept(visitor);
        if(Constant!=null) Constant.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstValue!=null) ConstValue.traverseTopDown(visitor);
        if(ConstName!=null) ConstName.traverseTopDown(visitor);
        if(Constant!=null) Constant.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstValue!=null) ConstValue.traverseBottomUp(visitor);
        if(ConstName!=null) ConstName.traverseBottomUp(visitor);
        if(Constant!=null) Constant.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MulConstValues(\n");

        if(ConstValue!=null)
            buffer.append(ConstValue.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstName!=null)
            buffer.append(ConstName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Constant!=null)
            buffer.append(Constant.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MulConstValues]");
        return buffer.toString();
    }
}
