package Day_5;
interface I5{
	void add();
}
class Test56{
	void sub() {
		System.out.println("hello");
	}
}
public class interface3 extends Test56 implements I5{
	public void add() {
		System.out.println();
			
		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface3 t1=new interface3();
		t1.add();
		t1.sub();
		
	}

}
