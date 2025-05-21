                //exp multiple interface

package Day_5;
interface I3{
	void add();
}
interface I2{
	void sub();
}
public class interface2 implements I3,I2 {
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface2 t1=new interface2();
		t1.add();
		t1.sub();

	}

}
