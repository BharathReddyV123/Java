         //"this" keyword

package Day_6;

public class keywords  {
	int a=89;
	void add() {
		int a=89;
		System.out.println(a);
	}
	void sub() {
		System.out.println(this.a);
		this.add();
	}
	

	public static void main(String[] args) {
		keywords k1=new keywords();
		k1.sub();
		
		// TODO Auto-generated method stub

	}

}
