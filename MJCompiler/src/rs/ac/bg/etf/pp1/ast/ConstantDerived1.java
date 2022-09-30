// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class ConstantDerived1 extends Constant {

    private NumConstant NumConstant;

    public ConstantDerived1 (NumConstant NumConstant) {
        this.NumConstant=NumConstant;
        if(NumConstant!=null) NumConstant.setParent(this);
    }

    public NumConstant getNumConstant() {
        return NumConstant;
    }

    public void setNumConstant(NumConstant NumConstant) {
        this.NumConstant=NumConstant;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(NumConstant!=null) NumConstant.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(NumConstant!=null) NumConstant.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(NumConstant!=null) NumConstant.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstantDerived1(\n");

        if(NumConstant!=null)
            buffer.append(NumConstant.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstantDerived1]");
        return buffer.toString();
    }
}
