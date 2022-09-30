// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class MethVoidName implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Obj obj = null;

    private String methIdent;

    public MethVoidName (String methIdent) {
        this.methIdent=methIdent;
    }

    public String getMethIdent() {
        return methIdent;
    }

    public void setMethIdent(String methIdent) {
        this.methIdent=methIdent;
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
        buffer.append("MethVoidName(\n");

        buffer.append(" "+tab+methIdent);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethVoidName]");
        return buffer.toString();
    }
}
