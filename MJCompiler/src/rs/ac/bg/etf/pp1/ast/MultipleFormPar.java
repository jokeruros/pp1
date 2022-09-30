// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class MultipleFormPar extends FormParametars {

    private FormParametars FormParametars;
    private Parametar Parametar;

    public MultipleFormPar (FormParametars FormParametars, Parametar Parametar) {
        this.FormParametars=FormParametars;
        if(FormParametars!=null) FormParametars.setParent(this);
        this.Parametar=Parametar;
        if(Parametar!=null) Parametar.setParent(this);
    }

    public FormParametars getFormParametars() {
        return FormParametars;
    }

    public void setFormParametars(FormParametars FormParametars) {
        this.FormParametars=FormParametars;
    }

    public Parametar getParametar() {
        return Parametar;
    }

    public void setParametar(Parametar Parametar) {
        this.Parametar=Parametar;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormParametars!=null) FormParametars.accept(visitor);
        if(Parametar!=null) Parametar.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormParametars!=null) FormParametars.traverseTopDown(visitor);
        if(Parametar!=null) Parametar.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormParametars!=null) FormParametars.traverseBottomUp(visitor);
        if(Parametar!=null) Parametar.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleFormPar(\n");

        if(FormParametars!=null)
            buffer.append(FormParametars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Parametar!=null)
            buffer.append(Parametar.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleFormPar]");
        return buffer.toString();
    }
}
