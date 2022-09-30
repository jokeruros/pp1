// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:15


package rs.ac.bg.etf.pp1.ast;

public class DefaultCase implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private Default Default;
    private ZeroOrMoreStatement ZeroOrMoreStatement;

    public DefaultCase (Default Default, ZeroOrMoreStatement ZeroOrMoreStatement) {
        this.Default=Default;
        if(Default!=null) Default.setParent(this);
        this.ZeroOrMoreStatement=ZeroOrMoreStatement;
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.setParent(this);
    }

    public Default getDefault() {
        return Default;
    }

    public void setDefault(Default Default) {
        this.Default=Default;
    }

    public ZeroOrMoreStatement getZeroOrMoreStatement() {
        return ZeroOrMoreStatement;
    }

    public void setZeroOrMoreStatement(ZeroOrMoreStatement ZeroOrMoreStatement) {
        this.ZeroOrMoreStatement=ZeroOrMoreStatement;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Default!=null) Default.accept(visitor);
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Default!=null) Default.traverseTopDown(visitor);
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Default!=null) Default.traverseBottomUp(visitor);
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DefaultCase(\n");

        if(Default!=null)
            buffer.append(Default.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ZeroOrMoreStatement!=null)
            buffer.append(ZeroOrMoreStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DefaultCase]");
        return buffer.toString();
    }
}
