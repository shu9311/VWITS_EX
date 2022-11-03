package customException;
import java.util.*;
import java.lang.*;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Account,Integer> v = new HashMap<Account,Integer>();
		v.put(new Account("Bhuvanyu",23,10020), 10020);
		v.put(new Account("Priyanka",32,123321), 123321);
		v.put(new Account("Anoop Singh",12,12344321),12344321);
		v.put(new Account("Narendar",9,213321),213321);
		System.out.println(v);
		
		

	}

}
