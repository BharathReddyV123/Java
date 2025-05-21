package Day_5;

public class polymorphism {
	void add() {
		System.out.println("good morning");
	}
    void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(double d1, double d2) {
		System.out.println(d1+d2);
	}
	void add(String s1,String s2 ) {
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		polymorphism d1=new polymorphism();
		d1.add();
		d1.add(15, 12);
		d1.add(2.3,2.2);
		d1.add("bharath", "reddy");
		// TODO Auto-generated method stub

	}

}
