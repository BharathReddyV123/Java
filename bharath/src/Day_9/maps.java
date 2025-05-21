//// map is an interface it can be implemented by the 4 classes 
////1.hash map== O(n) .
///is contains only unique elements
//// it may have one null key and mutiple null values
//// it maintain the no order.
//
//// 2.linked hash map== time complexity is O(1).
////it mantain the 
//
////3.tree map== O(nlog n).
//// it main the ascending order.
//
////4.hash table== 
///is is array of list and it doesnot have null and key value and it is synchroned nd it is legacy class
//
//
//                            // map class
//package Day_9;
//import java.util.*;
//public class maps {
//
//	public static void main(String[] args) {
//		Map<Integer,String> m1=new HashMap<Integer,String>() ;
//		m1.put(1, "cse");
//		m1.put(2, "ece");
//		m1.put(3, "eee");
//		m1.put(4, "civil");
//		m1.put(5, "ds");
//		m1.put(6, "aiml");
//		System.out.println(m1);
//		
//			
//		}
//		// TODO Auto-generated method stub
//
//	}
//
//-----------------------------------------------------------------------



                            //
//package Day_9;
//import java.util.*;
//public class maps {
//
//	public static void main(String[] args) {
//		Map<Integer,String> m1=new HashMap<Integer,String>() ;
//		m1.put(1, "cse");
//		m1.put(4, "civil");
//		m1.put(5, "ds");
//		m1.put(2, "null");// it allows null value also
//		m1.put(3, "eee");
//		m1.put(6, "aiml");
//		System.out.println(m1);
//		for(Map.Entry<Integer,String> i:m1.entrySet()) {
//			System.out.println(i.getValue());
//			System.out.println(i.getKey());
//		}
//			
//		}
//		// TODO Auto-generated method stub
//
//	}
//---------------------------------------------------------------------
                                //linked hashmap
// it gives not in order
//package Day_9;
//import java.util.*;
//public class maps {
//
//	public static void main(String[] args) {
//		Map<Integer,String> m1=new LinkedHashMap<Integer,String>() ;
//		m1.put(1, "cse");
//		m1.put(4, "civil");
//		m1.put(5, "ds");
//		m1.put(2, "ece");
//		m1.put(3, "eee");
//		m1.put(6, "aiml");
//		System.out.println(m1);
//		for(Map.Entry<Integer,String> i:m1.entrySet()) {
//			System.out.println(i.getValue());
//			System.out.println(i.getKey());
//		}
//			
//		}
//		// TODO Auto-generated method stub
//
//	}
//
//---------------------------------------------------------------------------
                           // Tree map

package Day_9;
import java.util.*;
public class maps {

	public static void main(String[] args) {
		Map<Integer,String> m1=new TreeMap<Integer,String>() ;
		m1.put(1, "cse");
		m1.put(4, "civil");
	//	m1.put(null, null);
		m1.put(2, "ece");
		m1.put(3, "eee");
		m1.put(6, "aiml");
		System.out.println(m1);
		for(Map.Entry<Integer,String> i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey());
		}
			
		}
		// TODO Auto-generated method stub

	}







