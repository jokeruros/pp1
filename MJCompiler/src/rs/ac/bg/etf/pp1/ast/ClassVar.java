// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class ClassVar extends ClassVarDeclrList {

    private ClassVarDeclrList ClassVarDeclrList;
    private VarDecl VarDecl;

    public ClassVar (ClassVarDeclrList ClassVarDeclrList, VarDecl VarDecl) {
        this.ClassVarDeclrList=ClassVarDeclrList;
        if(ClassVarDeclrList!=null) ClassVarDeclrList.setParent(this);
        this.VarDecl=VarDecl;
        if(VarDecl!=null) VarDecl.setParent(this);
    }

    public ClassVarDeclrList getClassVarDeclrList() {
        return ClassVarDeclrList;
    }

    public void setClassVarDeclrList(ClassVarDeclrList ClassVarDeclrList) {
        this.ClassVarDeclrList=ClassVarDeclrList;
    }

    public VarDecl getVarDecl() {
        return VarDecl;
    }

    public void setVarDecl(VarDecl VarDecl) {
        this.VarDecl=VarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassVarDeclrList!=null) ClassVarDeclrList.accept(visitor);
        if(VarDecl!=null) VarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassVarDeclrList!=null) ClassVarDeclrList.traverseTopDown(visitor);
        if(VarDecl!=null) VarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassVarDeclrList!=null) ClassVarDeclrList.traverseBottomUp(visitor);
        if(VarDecl!=null) VarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassVar(\n");

        if(ClassVarDeclrList!=null)
            buffer.append(ClassVarDeclrList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDecl!=null)
            buffer.append(VarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassVar]");
        return buffer.toString();
    }
}
