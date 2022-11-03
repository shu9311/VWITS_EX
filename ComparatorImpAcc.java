package customException;
import java.lang.*;
import java.util.*;
public class ComparatorImpAcc implements Comparator<Account> {
	public int compare(Account e1, Account e2) {
		return e1.getAccountHolderName().compareTo(e2.getAccountHolderName());
	}

}
