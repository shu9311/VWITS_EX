package customException;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Account> c = new ArrayList<Account>();
		c.add(new Account("shubham",200,10000));
		c.add(new Account("Sumit",300,15000));
		c.add(new Account("Rajbala",400,20000));
		c.add(new Account("rajpal",500,30000));
		System.out.println(c); 
		System.out.println(c.get(0));
		c.remove(2);
		System.out.println(c);

	}

}
