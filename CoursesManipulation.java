package helpdesk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CoursesManipulation {
	static Scanner sc= new Scanner(System.in);		

	public static void main(String[] args) {
	  	//Scanner sc= new Scanner(System.in);	
	  	
	MenuChoose();  	
	System.out.println("Do you wish to continue? (Y/N):");
	String r =  sc.next();
	
	if((r.charAt(0)=='y'||r.charAt(0)=='Y')) {
	MenuChoose(); 
	}else {
		System.out.println("Have a good day!!");		
	}
	sc.close();
        	     
}	
	public static void MenuChoose() {
		  List<Courses> course= new ArrayList<Courses>();
		
			int no;
		
			do {
				System.out.println("1.Add/Choose a Course");
				System.out.println("2.Display Course Details");
				System.out.println("3.Delete a course");
				System.out.println("4.Modify a value");
				System.out.println("5.Search in courses");
				System.out.println("Choose:");
			    no= sc.nextInt();	
			    boolean search;
			
	        switch(no) {
	        case 1:
	        	System.out.print("Enter Course ID:");
	        	int c_No= sc.nextInt();
	        	
	        	System.out.println("Enter Course Name:");
	        	String c_name= sc.next();
	        	
	        	System.out.print("Enter Course Fees:");
	        	double c_fees= sc.nextDouble();
	        	
	        	System.out.print("Enter Course Description:");
	        	String desc= sc.next();
	        	course.add(new Courses(c_No,c_name,c_fees,desc));
	        	System.out.println("----------------------------");
	            break;
	        
			 case 2: Iterator<Courses> it= course.iterator();
			    while(it.hasNext()) {
			    	Courses c= it.next();
			    	System.out.println(c);
			    }
			
			    System.out.println("----------------------------");
		        break;
	        
			    case 3:
			    search=false;	
			    System.out.println("Enter the course ID to delete.");
			    int Cno= sc.nextInt();
			    it= course.iterator();
			    while(it.hasNext()) {
			      Courses c= it.next();
			      if(c.getCourseId()==Cno) {
			    	  it.remove();
			    	  search=true;
			      }
			    }
			    if(!search) {
			    	System.out.println("Record not found.");
			    }
			    else {
			    	System.out.println("Record Deleted Successfully..");
			    }
			    System.out.println("----------------------------");
			    
		            break;
		        
			    case 4: 
			    	search=false;
			    	System.out.println("Enter Customer ID for updating:");
			    	Cno= sc.nextInt();
			    	
			    	ListIterator<Courses> li= course.listIterator();
				    while(li.hasNext()) {
				      Courses c= li.next();
				      
				      if(c.getCourseId()==Cno) {
				    	  System.out.println("Edited course name:");
				    	  String name= sc.next();
				    	  System.out.println("Edited course fees:");
				    	  double fee= sc.nextDouble();
				    	  System.out.println("Edited course description:");
				    	  String desp= sc.next();
				    	  li.set(new Courses(Cno,name,fee,desp));
				    	  search=true;
				      }
				    }
				    if(!search) {
				    	System.out.println("Record not found.");
				    }
				    else {
				    	System.out.println("Record Updated Successfully..");
				    }
				    System.out.println("----------------------------");
			        break;
			    
			    case 5:
			    	search=false;
			    	System.out.println("Enter Customer ID for searching:");
			    	Cno= sc.nextInt();
			    	
			    	li= course.listIterator();
				    while(li.hasNext()) {
				      Courses c= li.next();
				      
				      if(c.getCourseId()==Cno) {
				    	System.out.println(c);
				    	  search=true;
				      }
				    }
				    if(!search) {
				    	System.out.println("Record not found.");
				    }
				    else {
				    	System.out.println("Record Found...");
				    }
				    System.out.println("----------------------------");
			        break;
			    	
			    	
		        
	        }
	   } while(no==1||no==2||no==3||no==4||no==5);
		System.out.println("Choose correctly from the list.");	
	}
	
}
