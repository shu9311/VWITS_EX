package customException;
import java.util.*;
import java.lang.*;
public class PriorityQueueAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Account> b = new PriorityQueue<Account>();
		b.add(new Account("Sachin",20,123450));
		b.add(new Account("vaun shah",18,123980));
		b.add(new Account("Nivesh Ahuja",17,23454));
		b.add(new Account("kalpan shah",11,43290));
		System.out.println(b);

	}

}
