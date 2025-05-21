package Day_6;
class Demo1{
	void show() {
		System.out.println("hi");
	}
}
public class inner_class {
	Demo1 d=new Demo1() {
		void show() {
			System.out.println("hello");
			super.show();
		}
	};

	public static void main(String[] args) {
		inner_class s1=new inner_class();
		
		// TODO Auto-generated method stub

	}

}
