// generated with ast extension for cup
// version 0.8
// 16/7/2021 21:21:15


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(FormPars FormPars);
    public void visit(CondOrErr CondOrErr);
    public void visit(Factor Factor);
    public void visit(MethVarDecl MethVarDecl);
    public void visit(Statement Statement);
    public void visit(MethodDecl MethodDecl);
    public void visit(CondTermCont CondTermCont);
    public void visit(SwitchExpr SwitchExpr);
    public void visit(DesignatorIdent DesignatorIdent);
    public void visit(SwitchLParen SwitchLParen);
    public void visit(MethodDeclaration MethodDeclaration);
    public void visit(Relop Relop);
    public void visit(ClassMethodDecl ClassMethodDecl);
    public void visit(TermCont TermCont);
    public void visit(Expr Expr);
    public void visit(FormParametars FormParametars);
    public void visit(VarDecl VarDecl);
    public void visit(ActParsCont ActParsCont);
    public void visit(ClassNameExtend ClassNameExtend);
    public void visit(Unmatched Unmatched);
    public void visit(VarOrErr VarOrErr);
    public void visit(Constant Constant);
    public void visit(ExprCont ExprCont);
    public void visit(Condition Condition);
    public void visit(Mulop Mulop);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(BracketsOp BracketsOp);
    public void visit(ClassVarDeclrList ClassVarDeclrList);
    public void visit(CondFactCont CondFactCont);
    public void visit(Addop Addop);
    public void visit(ConstDecl ConstDecl);
    public void visit(ExprTern ExprTern);
    public void visit(Parametar Parametar);
    public void visit(CondTerm CondTerm);
    public void visit(ClassDecl ClassDecl);
    public void visit(ExtendsOrErr ExtendsOrErr);
    public void visit(SwitchDecl SwitchDecl);
    public void visit(ConstValue ConstValue);
    public void visit(VarIdent VarIdent);
    public void visit(ZeroOrMoreStatement ZeroOrMoreStatement);
    public void visit(ActPars ActPars);
    public void visit(Designator Designator);
    public void visit(Matched Matched);
    public void visit(VarDeclList VarDeclList);
    public void visit(CondFact CondFact);
    public void visit(ExprOrErr ExprOrErr);
    public void visit(ExprNonTern ExprNonTern);
    public void visit(PrintStmt PrintStmt);
    public void visit(MulVector MulVector);
    public void visit(ModOperation ModOperation);
    public void visit(DivOperation DivOperation);
    public void visit(MulOperation MulOperation);
    public void visit(LesEqual LesEqual);
    public void visit(Less Less);
    public void visit(GreaterEqual GreaterEqual);
    public void visit(Greater Greater);
    public void visit(NotEqaul NotEqaul);
    public void visit(IsEqual IsEqual);
    public void visit(MinusOperation MinusOperation);
    public void visit(AddOperation AddOperation);
    public void visit(Assignop Assignop);
    public void visit(ActParsContDerived2 ActParsContDerived2);
    public void visit(ActParsContDerived1 ActParsContDerived1);
    public void visit(Arg Arg);
    public void visit(ActParsDerived1 ActParsDerived1);
    public void visit(ExprInParen ExprInParen);
    public void visit(NewTypeExpr NewTypeExpr);
    public void visit(FactorDerived1 FactorDerived1);
    public void visit(CharFactor CharFactor);
    public void visit(BoolFactor BoolFactor);
    public void visit(NumFactor NumFactor);
    public void visit(CallFuncParams1 CallFuncParams1);
    public void visit(CallFuncNoParams1 CallFuncNoParams1);
    public void visit(DesigFactor DesigFactor);
    public void visit(TermContDerived1 TermContDerived1);
    public void visit(TermContMulop TermContMulop);
    public void visit(Term Term);
    public void visit(ExprTernDerived1 ExprTernDerived1);
    public void visit(ExprNonTernNoMinus ExprNonTernNoMinus);
    public void visit(ExprNonTernMinus ExprNonTernMinus);
    public void visit(ExprContDerived1 ExprContDerived1);
    public void visit(ExprCont1 ExprCont1);
    public void visit(SwitchStm SwitchStm);
    public void visit(ExprTern1 ExprTern1);
    public void visit(ExprNonTern1 ExprNonTern1);
    public void visit(ClassField ClassField);
    public void visit(Designator1 Designator1);
    public void visit(ElemRBracket ElemRBracket);
    public void visit(ElemLBracket ElemLBracket);
    public void visit(ElemClass ElemClass);
    public void visit(ElemArray ElemArray);
    public void visit(FuncOrVarName FuncOrVarName);
    public void visit(RelopExprFacts RelopExprFacts);
    public void visit(SingleExprFact SingleExprFact);
    public void visit(AndCond AndCond);
    public void visit(AndCondFacts AndCondFacts);
    public void visit(SingleCondFact SingleCondFact);
    public void visit(OrCond OrCond);
    public void visit(OrCondTerms OrCondTerms);
    public void visit(SingleCondTerm SingleCondTerm);
    public void visit(ExprOrErrDerived1 ExprOrErrDerived1);
    public void visit(Expression Expression);
    public void visit(DesigMinusMinus DesigMinusMinus);
    public void visit(DesigPlusPlus DesigPlusPlus);
    public void visit(CallFuncParams CallFuncParams);
    public void visit(CallFuncNoParams CallFuncNoParams);
    public void visit(DesignAssignopExpr DesignAssignopExpr);
    public void visit(OneCase OneCase);
    public void visit(Default Default);
    public void visit(DefaultCase DefaultCase);
    public void visit(SwitchDeclDerived1 SwitchDeclDerived1);
    public void visit(EndOfSwitchCases EndOfSwitchCases);
    public void visit(CaseNum CaseNum);
    public void visit(Case Case);
    public void visit(If If);
    public void visit(Do Do);
    public void visit(While While);
    public void visit(SwitchEndExpr SwitchEndExpr);
    public void visit(SwitchLStartExpr SwitchLStartExpr);
    public void visit(YieldExpr YieldExpr);
    public void visit(Yield Yield);
    public void visit(MatchedDerived1 MatchedDerived1);
    public void visit(PrintWithParam PrintWithParam);
    public void visit(PrintWithoutParam PrintWithoutParam);
    public void visit(Read Read);
    public void visit(JustReturn JustReturn);
    public void visit(ReturnExpr ReturnExpr);
    public void visit(ContinueStm ContinueStm);
    public void visit(BreakStm BreakStm);
    public void visit(DoWhileStm DoWhileStm);
    public void visit(IfWithElseMatched IfWithElseMatched);
    public void visit(DesignatorSt DesignatorSt);
    public void visit(CondOrErrDerived1 CondOrErrDerived1);
    public void visit(Cond Cond);
    public void visit(Unmt Unmt);
    public void visit(Match Match);
    public void visit(Stm Stm);
    public void visit(Else Else);
    public void visit(IfWithElseUnmatched IfWithElseUnmatched);
    public void visit(IfWithoutElse IfWithoutElse);
    public void visit(UnmStm UnmStm);
    public void visit(MatchStm MatchStm);
    public void visit(ZeroOrMoreStatementDerived2 ZeroOrMoreStatementDerived2);
    public void visit(ZeroOrMoreStatementDerived1 ZeroOrMoreStatementDerived1);
    public void visit(NoMethVarDeclarations NoMethVarDeclarations);
    public void visit(MethVarDeclarations MethVarDeclarations);
    public void visit(ParametarDerived1 ParametarDerived1);
    public void visit(Param Param);
    public void visit(MultipleFormPar MultipleFormPar);
    public void visit(SingleFormPar SingleFormPar);
    public void visit(NoFormParametars NoFormParametars);
    public void visit(ExistFormPar ExistFormPar);
    public void visit(MethTypeName MethTypeName);
    public void visit(MethVoidName MethVoidName);
    public void visit(MethDeclRet MethDeclRet);
    public void visit(MethDeclNoRet MethDeclNoRet);
    public void visit(NoMethodDeclaration NoMethodDeclaration);
    public void visit(MethodDeclarations MethodDeclarations);
    public void visit(NoClassVar NoClassVar);
    public void visit(ClassVar ClassVar);
    public void visit(ClassMethodDeclarations1 ClassMethodDeclarations1);
    public void visit(ClassMethodDeclarations ClassMethodDeclarations);
    public void visit(ExtendsOrErrDerived1 ExtendsOrErrDerived1);
    public void visit(ExtendClassName ExtendClassName);
    public void visit(ClassWithoutExtend ClassWithoutExtend);
    public void visit(ClassWithExtend ClassWithExtend);
    public void visit(ClassDeclaration ClassDeclaration);
    public void visit(NoExBrackets NoExBrackets);
    public void visit(ExBrackets ExBrackets);
    public void visit(VarName VarName);
    public void visit(VarOrErrDerived2 VarOrErrDerived2);
    public void visit(VarOrErrDerived1 VarOrErrDerived1);
    public void visit(MulVarIdent MulVarIdent);
    public void visit(SingleVarIdent SingleVarIdent);
    public void visit(VarDeclrList VarDeclrList);
    public void visit(CharConstant CharConstant);
    public void visit(BoolConstant BoolConstant);
    public void visit(NumConstant NumConstant);
    public void visit(ConstantDerived3 ConstantDerived3);
    public void visit(ConstantDerived2 ConstantDerived2);
    public void visit(ConstantDerived1 ConstantDerived1);
    public void visit(MulConstValues MulConstValues);
    public void visit(SingleConstValue SingleConstValue);
    public void visit(ConstName ConstName);
    public void visit(ConstDeclLists ConstDeclLists);
    public void visit(NoVarDeclList NoVarDeclList);
    public void visit(ClassDeclarations ClassDeclarations);
    public void visit(VarDeclarations VarDeclarations);
    public void visit(ConstDeclarations ConstDeclarations);
    public void visit(Type Type);
    public void visit(ProgName ProgName);
    public void visit(Program Program);

}
