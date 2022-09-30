// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:14


package rs.ac.bg.etf.pp1.ast;

public class ClassDeclaration extends ClassDecl {

    private ClassNameExtend ClassNameExtend;
    private ClassVarDeclrList ClassVarDeclrList;
    private ClassMethodDecl ClassMethodDecl;

    public ClassDeclaration (ClassNameExtend ClassNameExtend, ClassVarDeclrList ClassVarDeclrList, ClassMethodDecl ClassMethodDecl) {
        this.ClassNameExtend=ClassNameExtend;
        if(ClassNameExtend!=null) ClassNameExtend.setParent(this);
        this.ClassVarDeclrList=ClassVarDeclrList;
        if(ClassVarDeclrList!=null) ClassVarDeclrList.setParent(this);
        this.ClassMethodDecl=ClassMethodDecl;
        if(ClassMethodDecl!=null) ClassMethodDecl.setParent(this);
    }

    public ClassNameExtend getClassNameExtend() {
        return ClassNameExtend;
    }

    public void setClassNameExtend(ClassNameExtend ClassNameExtend) {
        this.ClassNameExtend=ClassNameExtend;
    }

    public ClassVarDeclrList getClassVarDeclrList() {
        return ClassVarDeclrList;
    }

    public void setClassVarDeclrList(ClassVarDeclrList ClassVarDeclrList) {
        this.ClassVarDeclrList=ClassVarDeclrList;
    }

    public ClassMethodDecl getClassMethodDecl() {
        return ClassMethodDecl;
    }

    public void setClassMethodDecl(ClassMethodDecl ClassMethodDecl) {
        this.ClassMethodDecl=ClassMethodDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassNameExtend!=null) ClassNameExtend.accept(visitor);
        if(ClassVarDeclrList!=null) ClassVarDeclrList.accept(visitor);
        if(ClassMethodDecl!=null) ClassMethodDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassNameExtend!=null) ClassNameExtend.traverseTopDown(visitor);
        if(ClassVarDeclrList!=null) ClassVarDeclrList.traverseTopDown(visitor);
        if(ClassMethodDecl!=null) ClassMethodDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassNameExtend!=null) ClassNameExtend.traverseBottomUp(visitor);
        if(ClassVarDeclrList!=null) ClassVarDeclrList.traverseBottomUp(visitor);
        if(ClassMethodDecl!=null) ClassMethodDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDeclaration(\n");

        if(ClassNameExtend!=null)
            buffer.append(ClassNameExtend.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassVarDeclrList!=null)
            buffer.append(ClassVarDeclrList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassMethodDecl!=null)
            buffer.append(ClassMethodDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDeclaration]");
        return buffer.toString();
    }
}
