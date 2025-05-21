//exmp  for contructor

package Day_4;

public class test7_1 {
	int a;
	int b;
	public test7_1(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test7_1 t1=new test7_1(78,34);
		t1.add();

	}

}
