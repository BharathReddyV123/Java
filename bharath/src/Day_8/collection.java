                                   // iterator

//package Day_8;
//import java.util.*;
//public class collection {
//
//	public static void main(String[] args) {
//		List<Integer> l1=new ArrayList<Integer>();
//		l1.add(12);
//		l1.add(45);
//		l1.add(78);
//		System.out.println(l1);
//		Iterator i1=l1.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//		// TODO Auto-generated method stub
//
//	}
//
//}
//__________________________________________________________________________________________________
                                         //list iterator


//package Day_8;import java.util.*;
//public class collection {
//
//	public static void main(String[] args) {
//		List<Integer> l1=new ArrayList<Integer>();
//		l1.add(12);
//	    l1.add(45);
//	    l1.add(78);
//		System.out.println(l1);
//		ListIterator i1=l1.listIterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//		while(i1.hasPrevious()) {
//			System.out.println(i1.previous());
//		}
//		// TODO Auto-generated method stub
//	}
//
//}
//_____________________________________________________________________________________________________
                                                 // Enumerator

package Day_8;
import java.util.*;
public class collection {

	public static void main(String[] args) {
		Vector<Integer> l1=new Vector<Integer>();
		l1.add(12);
	    l1.add(45);
	    l1.add(78);
		System.out.println(l1);
		Enumeration i1=l1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());
		}
		// TODO Auto-generated method stub
	}

}











