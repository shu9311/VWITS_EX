package customException;
import java.util.*;

public class ZerobalanceException extends Exception {
	private double currBal;
	private int acctno;
	public ZerobalanceException(double currBal, int acctno) {
		super();
		this.currBal = currBal;
		this.acctno = acctno;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ZeroBalanceAccountException [currBal=" + currBal + ", acctno=" + acctno + "]";
	}
	
}
