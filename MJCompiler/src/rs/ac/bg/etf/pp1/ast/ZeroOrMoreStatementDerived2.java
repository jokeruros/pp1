// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class ZeroOrMoreStatementDerived2 extends ZeroOrMoreStatement {

    public ZeroOrMoreStatementDerived2 () {
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
        buffer.append("ZeroOrMoreStatementDerived2(\n");

        buffer.append(tab);
        buffer.append(") [ZeroOrMoreStatementDerived2]");
        return buffer.toString();
    }
}
