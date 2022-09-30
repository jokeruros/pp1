// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:15


package rs.ac.bg.etf.pp1.ast;

public class EndOfSwitchCases extends SwitchDecl {

    private SwitchDecl SwitchDecl;
    private OneCase OneCase;

    public EndOfSwitchCases (SwitchDecl SwitchDecl, OneCase OneCase) {
        this.SwitchDecl=SwitchDecl;
        if(SwitchDecl!=null) SwitchDecl.setParent(this);
        this.OneCase=OneCase;
        if(OneCase!=null) OneCase.setParent(this);
    }

    public SwitchDecl getSwitchDecl() {
        return SwitchDecl;
    }

    public void setSwitchDecl(SwitchDecl SwitchDecl) {
        this.SwitchDecl=SwitchDecl;
    }

    public OneCase getOneCase() {
        return OneCase;
    }

    public void setOneCase(OneCase OneCase) {
        this.OneCase=OneCase;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(SwitchDecl!=null) SwitchDecl.accept(visitor);
        if(OneCase!=null) OneCase.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(SwitchDecl!=null) SwitchDecl.traverseTopDown(visitor);
        if(OneCase!=null) OneCase.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(SwitchDecl!=null) SwitchDecl.traverseBottomUp(visitor);
        if(OneCase!=null) OneCase.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("EndOfSwitchCases(\n");

        if(SwitchDecl!=null)
            buffer.append(SwitchDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OneCase!=null)
            buffer.append(OneCase.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [EndOfSwitchCases]");
        return buffer.toString();
    }
}
