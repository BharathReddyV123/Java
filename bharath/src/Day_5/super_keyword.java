package Day_5;
class sample45{
	public sample45() {
		System.out.println("good morning");
	}
	int x=99;
	void print() {
		System.out.println("hello");
	}
}
public class super_keyword  extends sample45{
	public super_keyword() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}


	public static void main(String[] args) {
		super_keyword t1=new super_keyword();
		t1.show();
		// TODO Auto-generated method stub

	}

}
