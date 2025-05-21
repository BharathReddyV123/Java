// main method can be over loaded can't be over readed

package Day_5;

public class polymorphism1 {
	
	public static void main() {
		System.out.println("hi");
	}
	public static void main (int a) {
		System.out.println(a);
	}
	
	public static void main (int a,int b) {
		System.out.println(a+b);
	}
	public static void main(double d1, double d2) {
		System.out.println(d1+d2);
	}
	public static void main(String s1,String s2 ) {
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		polymorphism p1=new polymorphism();
		main();
		main(15, 12);
		main(2.3,2.2);
		main("bharath", "reddy");
		// TODO Auto-generated method stub

	}
}



