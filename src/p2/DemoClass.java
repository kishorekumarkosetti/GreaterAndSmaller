package p2;
import p1.*;
import java.util.*;
public class DemoClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value1:");
		int v1 = s.nextInt();
		System.out.println("Enter the value2:");
		int v2 = s.nextInt();
		System.out.println("****Choice****");
		System.out.println("\t1GREATER NUMBER"+"\n\t2SMALLER NUMBER");
		int choice = s.nextInt();
		IgreaterAndsmaller ob = Access.getRef(choice);
		if(ob==null) {
			System.out.println("Invalid choice...");
		}
		else
		{
			int r = ob.compareTo(v1,v2);
			System.out.println("RESULT IS:"+r);
		}
		s.close();
	}
}
