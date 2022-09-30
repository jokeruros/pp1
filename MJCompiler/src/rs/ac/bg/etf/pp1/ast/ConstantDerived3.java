// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class ConstantDerived3 extends Constant {

    private CharConstant CharConstant;

    public ConstantDerived3 (CharConstant CharConstant) {
        this.CharConstant=CharConstant;
        if(CharConstant!=null) CharConstant.setParent(this);
    }

    public CharConstant getCharConstant() {
        return CharConstant;
    }

    public void setCharConstant(CharConstant CharConstant) {
        this.CharConstant=CharConstant;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CharConstant!=null) CharConstant.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CharConstant!=null) CharConstant.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CharConstant!=null) CharConstant.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstantDerived3(\n");

        if(CharConstant!=null)
            buffer.append(CharConstant.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstantDerived3]");
        return buffer.toString();
    }
}
