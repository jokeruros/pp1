// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class MethDeclRet extends MethodDeclaration {

    private MethTypeName MethTypeName;
    private FormPars FormPars;
    private MethVarDecl MethVarDecl;
    private ZeroOrMoreStatement ZeroOrMoreStatement;

    public MethDeclRet (MethTypeName MethTypeName, FormPars FormPars, MethVarDecl MethVarDecl, ZeroOrMoreStatement ZeroOrMoreStatement) {
        this.MethTypeName=MethTypeName;
        if(MethTypeName!=null) MethTypeName.setParent(this);
        this.FormPars=FormPars;
        if(FormPars!=null) FormPars.setParent(this);
        this.MethVarDecl=MethVarDecl;
        if(MethVarDecl!=null) MethVarDecl.setParent(this);
        this.ZeroOrMoreStatement=ZeroOrMoreStatement;
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.setParent(this);
    }

    public MethTypeName getMethTypeName() {
        return MethTypeName;
    }

    public void setMethTypeName(MethTypeName MethTypeName) {
        this.MethTypeName=MethTypeName;
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
        if(MethTypeName!=null) MethTypeName.accept(visitor);
        if(FormPars!=null) FormPars.accept(visitor);
        if(MethVarDecl!=null) MethVarDecl.accept(visitor);
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethTypeName!=null) MethTypeName.traverseTopDown(visitor);
        if(FormPars!=null) FormPars.traverseTopDown(visitor);
        if(MethVarDecl!=null) MethVarDecl.traverseTopDown(visitor);
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethTypeName!=null) MethTypeName.traverseBottomUp(visitor);
        if(FormPars!=null) FormPars.traverseBottomUp(visitor);
        if(MethVarDecl!=null) MethVarDecl.traverseBottomUp(visitor);
        if(ZeroOrMoreStatement!=null) ZeroOrMoreStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethDeclRet(\n");

        if(MethTypeName!=null)
            buffer.append(MethTypeName.toString("  "+tab));
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
        buffer.append(") [MethDeclRet]");
        return buffer.toString();
    }
}
