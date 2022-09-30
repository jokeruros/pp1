// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:15


package rs.ac.bg.etf.pp1.ast;

public class ActParsContDerived2 extends ActParsCont {

    public ActParsContDerived2 () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ActParsContDerived2(\n");

        buffer.append(tab);
        buffer.append(") [ActParsContDerived2]");
        return buffer.toString();
    }
}
