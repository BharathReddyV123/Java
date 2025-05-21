////example for HasSet
//
////package Day_9;
////import java.util.*;
////public class sets {
////
////	public static void main(String[] args) {
////		Set<Integer> q1=new HashSet<Integer>();
////		q1.add(12);
////		q1.add(89);
////		q1.add(null);
////		q1.add(89);
////		q1.add(null);
////		System.out.println(q1);
////		// TODO Auto-generated method stub
////
////	}
////
////}
//////---------------------------------------------------------------------------
//// example for LinkedHasSet
//
//package Day_9;
//import java.util.*;
//public class sets {
//
//	public static void main(String[] args) {
//		Set<Integer> q1=new LinkedHashSet<Integer>();
//		q1.add(12);
//		q1.add(89);
//		q1.add(null);
//		q1.add(89);
//		q1.add(null);
//		System.out.println(q1);
//		// TODO Auto-generated method stub
//
//	}
//
//}

//---------------------------------------------------------------------------
// example for treeset
//tree set does not all the null values

package Day_9;
import java.util.*;
public class sets {

	public static void main(String[] args) {
		Set<Integer> q1=new TreeSet<Integer>();
		q1.add(12);
		q1.add(89);
		q1.add(18);
		q1.add(15);
		q1.add(89);
		System.out.println(q1);
		// TODO Auto-generated method stub

	}

}






