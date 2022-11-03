package collectionEx;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> x = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		for(int i=0;i<y;i++) {
			int c= sc.nextInt();
			x.add(c);
		}
		
			System.out.println(x);
		

	}

}
