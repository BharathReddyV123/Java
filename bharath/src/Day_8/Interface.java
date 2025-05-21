                   //   runnable
//
//package Day_8;
//
//public class Interface implements Runnable {
//	public void run() {
//		System.out.println("hi");
//	}
//
//	public static void main(String[] args) {
//		Interface i1=new Interface();
//		Thread i2=new Thread(i1);
//		System.out.println("hello");
//		i2.start();
//		// TODO Auto-generated method stub
//
//	}
//
//}


          // creating two threads and calling one method 


package Day_8;

public class Interface implements Runnable {
	public void run() {
		System.out.println("hi");
	} 
	public static void main(String[] args) {
		Interface i1=new Interface();
		Interface i2=new Interface();
		Thread t1=new Thread(i1);
		Thread t2=new Thread(i2);
		
		t1.start();
		t2.start();
	}
}








