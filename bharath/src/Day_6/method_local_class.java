//method local inner class

package Day_6;

public class method_local_class {
	void show() {
		System.out.println("good afternoon");
		class Test24 {
			void print() {
				System.out.println("hi");
			}
		}
		Test24 t1= new Test24();
		t1.print();
	}

	public static void main(String[] args) {
		method_local_class m1=new method_local_class();
		m1.show();
		// TODO Auto-generated method stub

	}

}
