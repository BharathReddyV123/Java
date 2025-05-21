      //simple exmp for constructor

package Day_4;

public class Test5 {
	int a=89;
	public Test5(int b) {
		b=a;
		System.out.println("good morning" + a);
		
	}

	public static void main(String[] args) {
		Test5 t1=new Test5(78);
		Test5 t2=new Test5(87);
		Test5 t3=new Test5(90);
		
	}

}
