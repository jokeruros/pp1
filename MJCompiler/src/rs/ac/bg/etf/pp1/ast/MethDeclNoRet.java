// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class MethDeclNoRet extends MethodDeclaration {

    private MethVoidName MethVoidName;
    private FormPars FormPars;
    private MethVarDecl MethVarDecl;
    private ZeroOrMoreStatement ZeroOrMoreStatement;

    public MethDeclNoRet (MethVoidName MethVoidName, FormPars FormPars, MethVarDecl MethVarDecl, ZeroOrMoreStatement ZeroOrMoreStatement) {
        this.MethVoidName=MethVoidName;
        if(MethVoidName!=null) MethVoidName.setParent(this);
        this.FormPars=FormPars;
        if(FormPars!=null) FormPars.setParent(this);
        this.MethVarDecl=MethVarDecl;
        if(MethVarDecl!=null) MethVarDecl.setParent(this);
        this.ZeroOrMoreStatement=ZeroOrMoreStatement;
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.setParent(this);
    }

    public MethVoidName getMethVoidName() {
        return MethVoidName;
    }

    public void setMethVoidName(MethVoidName MethVoidName) {
        this.MethVoidName=MethVoidName;
    }

    public FormPars getFormPars() {
        return FormPars;
    }

    public void setFormPars(FormPars FormPars) {
        this.FormPars=FormPars;
    }

    public MethVarDecl getMethVarDecl() {
        return MethVarDecl;
    }

    public void setMethVarDecl(MethVarDecl MethVarDecl) {
        this.MethVarDecl=MethVarDecl;
    }

    public ZeroOrMoreStatement getZeroOrMoreStatement() {
        return ZeroOrMoreStatement;
    }

    public void setZeroOrMoreStatement(ZeroOrMoreStatement ZeroOrMoreStatement) {
        this.ZeroOrMoreStatement=ZeroOrMoreStatement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethVoidName!=null) MethVoidName.accept(visitor);
        if(FormPars!=null) FormPars.accept(visitor);
        if(MethVarDecl!=null) MethVarDecl.accept(visitor);
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethVoidName!=null) MethVoidName.traverseTopDown(visitor);
        if(FormPars!=null) FormPars.traverseTopDown(visitor);
        if(MethVarDecl!=null) MethVarDecl.traverseTopDown(visitor);
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethVoidName!=null) MethVoidName.traverseBottomUp(visitor);
        if(FormPars!=null) FormPars.traverseBottomUp(visitor);
        if(MethVarDecl!=null) MethVarDecl.traverseBottomUp(visitor);
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethDeclNoRet(\n");

        if(MethVoidName!=null)
            buffer.append(MethVoidName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FormPars!=null)
            buffer.append(FormPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethVarDecl!=null)
            buffer.append(MethVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ZeroOrMoreStatement!=null)
            buffer.append(ZeroOrMoreStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethDeclNoRet]");
        return buffer.toString();
    }
}
