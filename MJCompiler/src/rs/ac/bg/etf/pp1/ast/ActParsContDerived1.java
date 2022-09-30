// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:15


package rs.ac.bg.etf.pp1.ast;

public class ActParsContDerived1 extends ActParsCont {

    private ActParsCont ActParsCont;
    private Arg Arg;

    public ActParsContDerived1 (ActParsCont ActParsCont, Arg Arg) {
        this.ActParsCont=ActParsCont;
        if(ActParsCont!=null) ActParsCont.setParent(this);
        this.Arg=Arg;
        if(Arg!=null) Arg.setParent(this);
    }

    public ActParsCont getActParsCont() {
        return ActParsCont;
    }

    public void setActParsCont(ActParsCont ActParsCont) {
        this.ActParsCont=ActParsCont;
    }

    public Arg getArg() {
        return Arg;
    }

    public void setArg(Arg Arg) {
        this.Arg=Arg;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ActParsCont!=null) ActParsCont.accept(visitor);
        if(Arg!=null) Arg.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ActParsCont!=null) ActParsCont.traverseTopDown(visitor);
        if(Arg!=null) Arg.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ActParsCont!=null) ActParsCont.traverseBottomUp(visitor);
        if(Arg!=null) Arg.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ActParsContDerived1(\n");

        if(ActParsCont!=null)
            buffer.append(ActParsCont.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Arg!=null)
            buffer.append(Arg.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ActParsContDerived1]");
        return buffer.toString();
    }
}
