

//package Day_9;
//import java.util.*;
//public class stacks_1 {
//
//	public static void main(String[] args) {
//		Stack<Integer> s1=new Stack<Integer>();
//		s1.push(56);
//		s1.push(89);
//		s1.push(90);
//		System.out.println(s1);
//		System.out.println(s1.peek());
//		System.out.println(s1.pop());
//		// TODO Auto-generated method stub
//
//	}
//
//}
//----------------------------------------------------


//package Day_9;
//import java.util.*;
//public class stacks_1 {
//
//	public static void main(String[] args) {
//		List<Integer> s1=new Stack<Integer>();
//		s1.add(56);
//		s1.add(89);
//		s1.add(90);
//		System.out.println(s1);
//		System.out.println(s1.peek());
//		System.out.println(s1.pop());
//		// TODO Auto-generated method stub
//
//	}
//
//}
//------------------------------------------------------------------


package Day_9;
import java.util.*;
public class stacks_1 {

	public static void main(String[] args) {
		Vector<Integer> l1=new Vector<Integer>();
		l1.add(56);
		l1.add(89);
		l1.add(90);
		System.out.println(l1);
		Enumeration i1=l1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());
			
		}

	}

}
