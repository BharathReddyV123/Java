           // constructor over loading

package Day_4;

public class test15 {
	int x;
	int y;
	int z;
	public test15(){
		System.out.println("hi");
	}
	public test15(int x) {
		this.x=x;
		System.out.println(x);
	}
	public test15(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public test15(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println(x+y+z);
	}
		
	public static void main(String[] args) {
		test15 t1=new test15();
		test15 t2=new test15(23);
		test15 t3=new test15(23,45);
		test15 t4=new test15(23,45,67);
		
	}
		
	}


