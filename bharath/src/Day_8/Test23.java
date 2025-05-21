package Day_8;

public class Test23{

	public static void main(String[] args) {
		// calling anynomous class function
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("task one");
			}
		};
		Runnable r2=new Runnable() {
			public void run() {
				System.out.println("tase two");
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		// TODO Auto-generated method stub

	}
}
//////________________________________________________________________
//public class Test23 extends Thread{
//	public void run() {
//		for(int i=0;i<=10;i++)	{
//			System.out.println(i);
//			if(i==5) {
//				try {
//					Thread.sleep(3000);
//				}catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//	public static void main(String[] args) {
//		Test23 t1=new Test23();
//		for(int i=0;i<=10;i++) {
//			System.out.println(i);
//		}
//		t1.start();
//	}
//}
//_______________________________________________________________________
//  

