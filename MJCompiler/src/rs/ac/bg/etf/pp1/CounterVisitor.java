package rs.ac.bg.etf.pp1;



import rs.ac.bg.etf.pp1.ast.BoolFactor;
import rs.ac.bg.etf.pp1.ast.CharFactor;
import rs.ac.bg.etf.pp1.ast.FormParametars;
import rs.ac.bg.etf.pp1.ast.Mulop;
import rs.ac.bg.etf.pp1.ast.NumFactor;
import rs.ac.bg.etf.pp1.ast.Param;
import rs.ac.bg.etf.pp1.ast.VarName;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;

public class CounterVisitor extends VisitorAdaptor {
		protected int count;
	public int getCount() {
		return count;
	}
	public static class FormParamCounter extends CounterVisitor{
		public void visit(Param param) {
			count++;
		}
	}
	public static class VarCounter extends CounterVisitor{
		public void visit(VarName var) {
			count++;
			
		}
		
	}
}
