// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class ClassWithExtend extends ClassNameExtend {

    private String name;
    private ExtendsOrErr ExtendsOrErr;

    public ClassWithExtend (String name, ExtendsOrErr ExtendsOrErr) {
        this.name=name;
        this.ExtendsOrErr=ExtendsOrErr;
        if(ExtendsOrErr!=null) ExtendsOrErr.setParent(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public ExtendsOrErr getExtendsOrErr() {
        return ExtendsOrErr;
    }

    public void setExtendsOrErr(ExtendsOrErr ExtendsOrErr) {
        this.ExtendsOrErr=ExtendsOrErr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExtendsOrErr!=null) ExtendsOrErr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExtendsOrErr!=null) ExtendsOrErr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExtendsOrErr!=null) ExtendsOrErr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassWithExtend(\n");

        buffer.append(" "+tab+name);
        buffer.append("\n");

        if(ExtendsOrErr!=null)
            buffer.append(ExtendsOrErr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassWithExtend]");
        return buffer.toString();
    }
}
