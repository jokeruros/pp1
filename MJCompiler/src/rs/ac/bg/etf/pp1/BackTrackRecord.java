package rs.ac.bg.etf.pp1;

public class BackTrackRecord {
 public int adr;
 public String relop;
 public boolean isAnd=false;
 public boolean isLastInAnd=false;
 public boolean fixup=false;
 public BackTrackRecord(int adr,String relop) {
	 this.adr=adr;this.relop=relop;
 }
}
