// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class ConstantDerived2 extends Constant {

    private BoolConstant BoolConstant;

    public ConstantDerived2 (BoolConstant BoolConstant) {
        this.BoolConstant=BoolConstant;
        if(BoolConstant!=null) BoolConstant.setParent(this);
    }

    public BoolConstant getBoolConstant() {
        return BoolConstant;
    }

    public void setBoolConstant(BoolConstant BoolConstant) {
        this.BoolConstant=BoolConstant;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(BoolConstant!=null) BoolConstant.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(BoolConstant!=null) BoolConstant.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(BoolConstant!=null) BoolConstant.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstantDerived2(\n");

        if(BoolConstant!=null)
            buffer.append(BoolConstant.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstantDerived2]");
        return buffer.toString();
    }
}
