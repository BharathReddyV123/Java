//package Day_9;
//import java.util.*;
//public class Lists {
//	public static void main(String[] args) {
//		List<Integer> l1=new ArrayList<Integer>();
//		l1.add(12);
//		l1.add(23);
//		l1.add(34);
//		List<Integer> l2=new ArrayList<Integer>(l1);
//		l2.add(12);
//		l2.add(23);
//		l2.add(34);
//		System.out.println(l2);
//		
//		
//	}
//
//}
//_________________________________________________________________________________
//adding AddAll method
//package Day_9;
//import java.util.*;
//public class Lists {
//	public static void main(String[] args) {
//		List<Integer> l1=new ArrayList<Integer>();
//		l1.add(12);
//		l1.add(23);
//		l1.add(34);
//		List<Integer> l2=new ArrayList<Integer>();
//		l2.add(12);
//		l2.add(23);
//		l2.add(34);
//		l1.addAll(l1);
//		System.out.println(l2);
//		
//		
//	}
//
//}
//____________________________________________________________________________
//adding object

//package Day_9;
//import java.util.*;
//public class Lists {
//	public static void main(String[] args) {
//		List<Object> l1=new ArrayList<Object>();
//		l1.add(12);
//		l1.add(23);
//		l1.add(34);
//		List<Object> l2=new ArrayList<Object>();
//		l2.add(12);
//		l2.add(23);
//		l2.add(34);
//		l2.addAll(l1);
//		l2.add(null);
//		
//		System.out.println(l2);
//		
//		
//	}
//}
//______________________________________________________________________________

//
//package Day_9;
//import java.util.*;
//public class Lists {
//	public static void main(String[] args) {
//		List<Object> l1=new ArrayList<Object>();
//		l1.add(12);
//		l1.add(23);
//		l1.add(34);
//		List<Object> l2=new ArrayList<Object>();
//		l2.add(12);
//		l2.add(23);
//		l2.add(34);
//		l2.addAll(l1);
//		l2.add(null);
//		
//		System.out.println(l2);
//		Iterator i1=i2
//		
//		
//	}
//}
//___________________________________________________________________________


//package Day_9;
//import java.util.*;
//public class Lists {
//	public static void main(String[] args) {
//		List<Object> l1=new ArrayList<Object>();
//		l1.add(12);
//		l1.add(23);
//		l1.add(34);
//		l1.add("hi");
//		l1.add("hello");
//		System.out.println(l1);
//		List<Object> extra=Arrays.asList("bharath","Reddy","hi","hello");
//		l1.addAll(extra);
//		System.out.println(l1);
//		
//
//		
//	}
//
//}
//_______________________________________________________________________________


//package Day_9;
//import java.util.*;
//public class Lists {
//	public static void main(String[] args) {
//		List<Object> l1=new ArrayList<Object>();
//		l1.add(12);
//		l1.add(23);
//		l1.add(34);
//		l1.add("hi");
//		l1.add("hello");
//		System.out.println(l1);
//		List<Object> extra=Arrays.asList("bharath","Reddy","hi","hello");
//		l1.addAll(1,extra);
//		System.out.println(l1);
//		
//
//		
//	}
//
//}
//____________________________________________________-----------------____

//package Day_9;
//import java.util.*;
//public class Lists {
//	public static void main(String[] args) {
//		List<Object> l1=new ArrayList<Object>();
//		l1.add(12);
//		l1.add(23);
//		l1.add(34);
//		l1.add("hi");
//		l1.add("hello");
//		System.out.println(l1);
//		List<Object> extra=Arrays.asList("bharath","Reddy","hi","hello");
//		l1.addAll(extra);
//		System.out.println(l1.get(6));
//		
//
//		
//	}
//
//}
//______________________________________________________________________


package Day_9;
import java.util.*;
public class Lists {
	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add(23);
		l1.add(34);
		l1.add(2,67);
		System.out.println(l1);
		List<Object> extra=Arrays.asList(9,89,90);
		l1.addAll(1,extra);
		System.out.println(l1.get(6));
		System.out.println(l1.indexOf(90));
		Object[] arr=l1.toArray();
		for(Object a1:arr) {
		System.out.println(a1);
		}
		

		
	}

}