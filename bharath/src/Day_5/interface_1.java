     // interface

package Day_5;
interface I1{
	abstract void add();
	void sub();
}
public class interface_1  implements I1{
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}
	public void mul() {
		System.out.println("i am bharath");
	}
	

	public static void main(String[] args) {
		interface_1 t1=new interface_1();
		t1.add();
		t1.sub();
		t1.mul();
		
		// TODO Auto-generated method stub

	}

}
