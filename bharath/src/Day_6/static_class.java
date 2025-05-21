//static inner class

package Day_6;
class sample26{
	static void show() {
		System.out.println("hi");
	}
	static class Test26 {
		static void print() {
			System.out.println("hello");
			show();
		}
	}
}

public class static_class {

	public static void main(String[] args) {
		sample26.Test26.print();	
	}
}
