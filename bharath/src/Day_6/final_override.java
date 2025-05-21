//method overriding it prints only 'a' values it not print 'hi'

package Day_6;
class Test1{
	void show() {
		System.out.println("hi");
	}
}
public class final_override extends Test1 {
	void show() {
		int a=89;
		System.out.println(a);
		a=98;
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		final_override f1=new final_override();
		f1.show();
		
	}

}
