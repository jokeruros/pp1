// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:15


package rs.ac.bg.etf.pp1.ast;

public class ExprNonTern1 extends Expr {

    private ExprNonTern ExprNonTern;

    public ExprNonTern1 (ExprNonTern ExprNonTern) {
        this.ExprNonTern=ExprNonTern;
        if(ExprNonTern!=null) ExprNonTern.setParent(this);
    }

    public ExprNonTern getExprNonTern() {
        return ExprNonTern;
    }

    public void setExprNonTern(ExprNonTern ExprNonTern) {
        this.ExprNonTern=ExprNonTern;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExprNonTern!=null) ExprNonTern.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExprNonTern!=null) ExprNonTern.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExprNonTern!=null) ExprNonTern.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprNonTern1(\n");

        if(ExprNonTern!=null)
            buffer.append(ExprNonTern.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprNonTern1]");
        return buffer.toString();
    }
}
