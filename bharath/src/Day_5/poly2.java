package Day_5;
class Test2{
	void add() {
		System.out.println("hi");
	}
}
public class poly2 extends Test2{
	void add() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		poly2 d1=new poly2();
		d1.add();
		// TODO Auto-generated method stub

	}

}
