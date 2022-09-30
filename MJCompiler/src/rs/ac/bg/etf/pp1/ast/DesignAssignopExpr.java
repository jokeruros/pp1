// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:15


package rs.ac.bg.etf.pp1.ast;

public class DesignAssignopExpr extends DesignatorStatement {

    private Designator Designator;
    private Assignop Assignop;
    private ExprOrErr ExprOrErr;

    public DesignAssignopExpr (Designator Designator, Assignop Assignop, ExprOrErr ExprOrErr) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.Assignop=Assignop;
        if(Assignop!=null) Assignop.setParent(this);
        this.ExprOrErr=ExprOrErr;
        if(ExprOrErr!=null) ExprOrErr.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public Assignop getAssignop() {
        return Assignop;
    }

    public void setAssignop(Assignop Assignop) {
        this.Assignop=Assignop;
    }

    public ExprOrErr getExprOrErr() {
        return ExprOrErr;
    }

    public void setExprOrErr(ExprOrErr ExprOrErr) {
        this.ExprOrErr=ExprOrErr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(Assignop!=null) Assignop.accept(visitor);
        if(ExprOrErr!=null) ExprOrErr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(Assignop!=null) Assignop.traverseTopDown(visitor);
        if(ExprOrErr!=null) ExprOrErr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(Assignop!=null) Assignop.traverseBottomUp(visitor);
        if(ExprOrErr!=null) ExprOrErr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignAssignopExpr(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Assignop!=null)
            buffer.append(Assignop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ExprOrErr!=null)
            buffer.append(ExprOrErr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignAssignopExpr]");
        return buffer.toString();
    }
}
