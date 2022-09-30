// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class ZeroOrMoreStatementDerived1 extends ZeroOrMoreStatement {

    private ZeroOrMoreStatement ZeroOrMoreStatement;
    private Statement Statement;

    public ZeroOrMoreStatementDerived1 (ZeroOrMoreStatement ZeroOrMoreStatement, Statement Statement) {
        this.ZeroOrMoreStatement=ZeroOrMoreStatement;
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
    }

    public ZeroOrMoreStatement getZeroOrMoreStatement() {
        return ZeroOrMoreStatement;
    }

    public void setZeroOrMoreStatement(ZeroOrMoreStatement ZeroOrMoreStatement) {
        this.ZeroOrMoreStatement=ZeroOrMoreStatement;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ZeroOrMoreStatementDerived1(\n");

        if(ZeroOrMoreStatement!=null)
            buffer.append(ZeroOrMoreStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ZeroOrMoreStatementDerived1]");
        return buffer.toString();
    }
}
