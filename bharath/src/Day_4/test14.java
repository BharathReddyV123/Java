        //exmp copped constructor

package Day_4;

public class test14 {
	int x;
	int y;
	public test14(int x,int y) {
	this.x=x;
	this.y=y;
	System.out.println(x+y);
	}
	public test14(test14 t1) {
		this.x=t1.x;
		this.y=t1.y;
		System.out.println(x-y);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test14 t1=new test14(67,8);
		test14 t2=new test14(t1);
		
		
		
	}

}
