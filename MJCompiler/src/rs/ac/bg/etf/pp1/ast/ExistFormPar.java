// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class ExistFormPar extends FormPars {

    private FormParametars FormParametars;

    public ExistFormPar (FormParametars FormParametars) {
        this.FormParametars=FormParametars;
        if(FormParametars!=null) FormParametars.setParent(this);
    }

    public FormParametars getFormParametars() {
        return FormParametars;
    }

    public void setFormParametars(FormParametars FormParametars) {
        this.FormParametars=FormParametars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormParametars!=null) FormParametars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormParametars!=null) FormParametars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormParametars!=null) FormParametars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExistFormPar(\n");

        if(FormParametars!=null)
            buffer.append(FormParametars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExistFormPar]");
        return buffer.toString();
    }
}
