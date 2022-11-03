package customException;
import java.util.*;
import java.lang.*;

public class TreeSetAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Account> sst = new TreeSet<Account>();
		Account a1= new Account("Shubham",309,20000);
		sst.add(a1);
		Account a2=  new Account("Sumit",318,10000);
		sst.add(a2);
		Account a3= new Account("Rajpal",310,15000);
		sst.add(a3);
		Account a4 = new Account("Rajbala",312,14000);
		sst.add(a4);
		System.out.println(sst);
		Comparator<Account> c = new ComparatorImpAcc();
		SortedSet<Account> ss2 = new TreeSet<Account>(c);
		ss2.add(a1);
		ss2.add(a2);
		ss2.add(a4);
		ss2.add(a3);
		System.out.println(ss2);
		


	}

}
