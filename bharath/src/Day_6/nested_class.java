     // nested inner class

package Day_6;

public class nested_class {
	void show() {
		System.out.println("hi");
	}
	class Test1 {
		void print() {
			System.out.println("hello");
		}
	
	}
	
	public static void main(String[] args) {
		nested_class n1=new nested_class();
		n1.show();
		nested_class.Test1 t1=new nested_class().new Test1();
		t1.print();
		// TODO Auto-generated method stub

	}

}
