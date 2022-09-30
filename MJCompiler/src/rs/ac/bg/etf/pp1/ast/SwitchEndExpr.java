// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class SwitchEndExpr extends SwitchExpr {

    private ExprOrErr ExprOrErr;

    public SwitchEndExpr (ExprOrErr ExprOrErr) {
        this.ExprOrErr=ExprOrErr;
        if(ExprOrErr!=null) ExprOrErr.setParent(this);
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
        if(ExprOrErr!=null) ExprOrErr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExprOrErr!=null) ExprOrErr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExprOrErr!=null) ExprOrErr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("SwitchEndExpr(\n");

        if(ExprOrErr!=null)
            buffer.append(ExprOrErr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [SwitchEndExpr]");
        return buffer.toString();
    }
}
