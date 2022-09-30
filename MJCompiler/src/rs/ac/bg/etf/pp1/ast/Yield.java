// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class Yield extends Matched {

    private YieldExpr YieldExpr;

    public Yield (YieldExpr YieldExpr) {
        this.YieldExpr=YieldExpr;
        if(YieldExpr!=null) YieldExpr.setParent(this);
    }

    public YieldExpr getYieldExpr() {
        return YieldExpr;
    }

    public void setYieldExpr(YieldExpr YieldExpr) {
        this.YieldExpr=YieldExpr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(YieldExpr!=null) YieldExpr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(YieldExpr!=null) YieldExpr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(YieldExpr!=null) YieldExpr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Yield(\n");

        if(YieldExpr!=null)
            buffer.append(YieldExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Yield]");
        return buffer.toString();
    }
}
