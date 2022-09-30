// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:15


package rs.ac.bg.etf.pp1.ast;

public class ExprNonTernNoMinus extends ExprNonTern {

    private Term Term;
    private ExprCont ExprCont;

    public ExprNonTernNoMinus (Term Term, ExprCont ExprCont) {
        this.Term=Term;
        if(Term!=null) Term.setParent(this);
        this.ExprCont=ExprCont;
        if(ExprCont!=null) ExprCont.setParent(this);
    }

    public Term getTerm() {
        return Term;
    }

    public void setTerm(Term Term) {
        this.Term=Term;
    }

    public ExprCont getExprCont() {
        return ExprCont;
    }

    public void setExprCont(ExprCont ExprCont) {
        this.ExprCont=ExprCont;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Term!=null) Term.accept(visitor);
        if(ExprCont!=null) ExprCont.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Term!=null) Term.traverseTopDown(visitor);
        if(ExprCont!=null) ExprCont.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Term!=null) Term.traverseBottomUp(visitor);
        if(ExprCont!=null) ExprCont.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprNonTernNoMinus(\n");

        if(Term!=null)
            buffer.append(Term.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ExprCont!=null)
            buffer.append(ExprCont.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprNonTernNoMinus]");
        return buffer.toString();
    }
}
