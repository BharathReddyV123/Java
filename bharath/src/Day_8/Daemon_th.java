package Day_8;

public class Daemon_th  extends Thread{
	String s;
	public Daemon_th (String name) {
		s=name;
		
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(s + "is Daemon Thraed");
		}
		else {
			System.out.println(s + " is user Thread");
		}
	}
	
public static void main(String[] args) {
	Daemon_th dt=new Daemon_th("dt");
	Daemon_th dt1=new Daemon_th("dt1");
	Daemon_th dt2=new Daemon_th("dt2");
	
	dt.setDaemon(true);
	dt.start();
	dt1.start();
	dt2.setDaemon(false);
	dt2.start();
}
}
