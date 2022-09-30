// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:15


package rs.ac.bg.etf.pp1.ast;

public class OneCase implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private Case Case;
    private CaseNum CaseNum;
    private ZeroOrMoreStatement ZeroOrMoreStatement;

    public OneCase (Case Case, CaseNum CaseNum, ZeroOrMoreStatement ZeroOrMoreStatement) {
        this.Case=Case;
        if(Case!=null) Case.setParent(this);
        this.CaseNum=CaseNum;
        if(CaseNum!=null) CaseNum.setParent(this);
        this.ZeroOrMoreStatement=ZeroOrMoreStatement;
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.setParent(this);
    }

    public Case getCase() {
        return Case;
    }

    public void setCase(Case Case) {
        this.Case=Case;
    }

    public CaseNum getCaseNum() {
        return CaseNum;
    }

    public void setCaseNum(CaseNum CaseNum) {
        this.CaseNum=CaseNum;
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
        if(Case!=null) Case.accept(visitor);
        if(CaseNum!=null) CaseNum.accept(visitor);
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Case!=null) Case.traverseTopDown(visitor);
        if(CaseNum!=null) CaseNum.traverseTopDown(visitor);
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Case!=null) Case.traverseBottomUp(visitor);
        if(CaseNum!=null) CaseNum.traverseBottomUp(visitor);
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("OneCase(\n");

        if(Case!=null)
            buffer.append(Case.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CaseNum!=null)
            buffer.append(CaseNum.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ZeroOrMoreStatement!=null)
            buffer.append(ZeroOrMoreStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [OneCase]");
        return buffer.toString();
    }
}
