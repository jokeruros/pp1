// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:15


package rs.ac.bg.etf.pp1.ast;

public class SwitchStm extends Expr {

    private SwitchLParen SwitchLParen;
    private SwitchExpr SwitchExpr;
    private SwitchDecl SwitchDecl;
    private DefaultCase DefaultCase;

    public SwitchStm (SwitchLParen SwitchLParen, SwitchExpr SwitchExpr, SwitchDecl SwitchDecl, DefaultCase DefaultCase) {
        this.SwitchLParen=SwitchLParen;
        if(SwitchLParen!=null) SwitchLParen.setParent(this);
        this.SwitchExpr=SwitchExpr;
        if(SwitchExpr!=null) SwitchExpr.setParent(this);
        this.SwitchDecl=SwitchDecl;
        if(SwitchDecl!=null) SwitchDecl.setParent(this);
        this.DefaultCase=DefaultCase;
        if(DefaultCase!=null) DefaultCase.setParent(this);
    }

    public SwitchLParen getSwitchLParen() {
        return SwitchLParen;
    }

    public void setSwitchLParen(SwitchLParen SwitchLParen) {
        this.SwitchLParen=SwitchLParen;
    }

    public SwitchExpr getSwitchExpr() {
        return SwitchExpr;
    }

    public void setSwitchExpr(SwitchExpr SwitchExpr) {
        this.SwitchExpr=SwitchExpr;
    }

    public SwitchDecl getSwitchDecl() {
        return SwitchDecl;
    }

    public void setSwitchDecl(SwitchDecl SwitchDecl) {
        this.SwitchDecl=SwitchDecl;
    }

    public DefaultCase getDefaultCase() {
        return DefaultCase;
    }

    public void setDefaultCase(DefaultCase DefaultCase) {
        this.DefaultCase=DefaultCase;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(SwitchLParen!=null) SwitchLParen.accept(visitor);
        if(SwitchExpr!=null) SwitchExpr.accept(visitor);
        if(SwitchDecl!=null) SwitchDecl.accept(visitor);
        if(DefaultCase!=null) DefaultCase.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(SwitchLParen!=null) SwitchLParen.traverseTopDown(visitor);
        if(SwitchExpr!=null) SwitchExpr.traverseTopDown(visitor);
        if(SwitchDecl!=null) SwitchDecl.traverseTopDown(visitor);
        if(DefaultCase!=null) DefaultCase.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(SwitchLParen!=null) SwitchLParen.traverseBottomUp(visitor);
        if(SwitchExpr!=null) SwitchExpr.traverseBottomUp(visitor);
        if(SwitchDecl!=null) SwitchDecl.traverseBottomUp(visitor);
        if(DefaultCase!=null) DefaultCase.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SwitchStm(\n");

        if(SwitchLParen!=null)
            buffer.append(SwitchLParen.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(SwitchExpr!=null)
            buffer.append(SwitchExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(SwitchDecl!=null)
            buffer.append(SwitchDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DefaultCase!=null)
            buffer.append(DefaultCase.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SwitchStm]");
        return buffer.toString();
    }
}
