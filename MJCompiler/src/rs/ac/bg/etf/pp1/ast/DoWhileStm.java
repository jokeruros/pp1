// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class DoWhileStm extends Matched {

    private Do Do;
    private Statement Statement;
    private While While;
    private CondOrErr CondOrErr;

    public DoWhileStm (Do Do, Statement Statement, While While, CondOrErr CondOrErr) {
        this.Do=Do;
        if(Do!=null) Do.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
        this.While=While;
        if(While!=null) While.setParent(this);
        this.CondOrErr=CondOrErr;
        if(CondOrErr!=null) CondOrErr.setParent(this);
    }

    public Do getDo() {
        return Do;
    }

    public void setDo(Do Do) {
        this.Do=Do;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public While getWhile() {
        return While;
    }

    public void setWhile(While While) {
        this.While=While;
    }

    public CondOrErr getCondOrErr() {
        return CondOrErr;
    }

    public void setCondOrErr(CondOrErr CondOrErr) {
        this.CondOrErr=CondOrErr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Do!=null) Do.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
        if(While!=null) While.accept(visitor);
        if(CondOrErr!=null) CondOrErr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Do!=null) Do.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
        if(While!=null) While.traverseTopDown(visitor);
        if(CondOrErr!=null) CondOrErr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Do!=null) Do.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        if(While!=null) While.traverseBottomUp(visitor);
        if(CondOrErr!=null) CondOrErr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DoWhileStm(\n");

        if(Do!=null)
            buffer.append(Do.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(While!=null)
            buffer.append(While.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CondOrErr!=null)
            buffer.append(CondOrErr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DoWhileStm]");
        return buffer.toString();
    }
}
