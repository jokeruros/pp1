// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:15


package rs.ac.bg.etf.pp1.ast;

public class ElemArray extends Designator {

    private Designator Designator;
    private ElemLBracket ElemLBracket;
    private Expr Expr;
    private ElemRBracket ElemRBracket;

    public ElemArray (Designator Designator, ElemLBracket ElemLBracket, Expr Expr, ElemRBracket ElemRBracket) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.ElemLBracket=ElemLBracket;
        if(ElemLBracket!=null) ElemLBracket.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.ElemRBracket=ElemRBracket;
        if(ElemRBracket!=null) ElemRBracket.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public ElemLBracket getElemLBracket() {
        return ElemLBracket;
    }

    public void setElemLBracket(ElemLBracket ElemLBracket) {
        this.ElemLBracket=ElemLBracket;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public ElemRBracket getElemRBracket() {
        return ElemRBracket;
    }

    public void setElemRBracket(ElemRBracket ElemRBracket) {
        this.ElemRBracket=ElemRBracket;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(ElemLBracket!=null) ElemLBracket.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
        if(ElemRBracket!=null) ElemRBracket.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(ElemLBracket!=null) ElemLBracket.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(ElemRBracket!=null) ElemRBracket.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(ElemLBracket!=null) ElemLBracket.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(ElemRBracket!=null) ElemRBracket.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ElemArray(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ElemLBracket!=null)
            buffer.append(ElemLBracket.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ElemRBracket!=null)
            buffer.append(ElemRBracket.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ElemArray]");
        return buffer.toString();
    }
}
