// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class IfWithoutElse extends Unmatched {

    private If If;
    private CondOrErr CondOrErr;
    private Statement Statement;

    public IfWithoutElse (If If, CondOrErr CondOrErr, Statement Statement) {
        this.If=If;
        if(If!=null) If.setParent(this);
        this.CondOrErr=CondOrErr;
        if(CondOrErr!=null) CondOrErr.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
    }

    public If getIf() {
        return If;
    }

    public void setIf(If If) {
        this.If=If;
    }

    public CondOrErr getCondOrErr() {
        return CondOrErr;
    }

    public void setCondOrErr(CondOrErr CondOrErr) {
        this.CondOrErr=CondOrErr;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(If!=null) If.accept(visitor);
        if(CondOrErr!=null) CondOrErr.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(If!=null) If.traverseTopDown(visitor);
        if(CondOrErr!=null) CondOrErr.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(If!=null) If.traverseBottomUp(visitor);
        if(CondOrErr!=null) CondOrErr.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("IfWithoutElse(\n");

        if(If!=null)
            buffer.append(If.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CondOrErr!=null)
            buffer.append(CondOrErr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [IfWithoutElse]");
        return buffer.toString();
    }
}
