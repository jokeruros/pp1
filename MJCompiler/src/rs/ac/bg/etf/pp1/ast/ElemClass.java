// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:15


package rs.ac.bg.etf.pp1.ast;

public class ElemClass extends Designator {

    private Designator Designator;
    private ClassField ClassField;

    public ElemClass (Designator Designator, ClassField ClassField) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.ClassField=ClassField;
        if(ClassField!=null) ClassField.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public ClassField getClassField() {
        return ClassField;
    }

    public void setClassField(ClassField ClassField) {
        this.ClassField=ClassField;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(ClassField!=null) ClassField.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(ClassField!=null) ClassField.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(ClassField!=null) ClassField.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ElemClass(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassField!=null)
            buffer.append(ClassField.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ElemClass]");
        return buffer.toString();
    }
}
