package rs.ac.bg.etf.pp1;

import org.apache.log4j.Logger;


import rs.ac.bg.etf.pp1.ast.BoolFactor;
import rs.ac.bg.etf.pp1.ast.CharFactor;
import rs.ac.bg.etf.pp1.ast.Mulop;
import rs.ac.bg.etf.pp1.ast.NumFactor;
import rs.ac.bg.etf.pp1.ast.PrintStmt;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;

public class RuleVisitor extends VisitorAdaptor {
	Logger log = Logger.getLogger(this.getClass());
	int printCallCount=0;
	public void visit(PrintStmt PrintStmt) {
		printCallCount++;
		log.info("Prepoznata naredba print!\n");
		}
	
	 

}
