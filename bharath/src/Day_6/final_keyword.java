// we don't have any restriction of the constructors

package Day_6;

public class final_keyword {
	void show() {
		int a=45; // or add final ("final int a=45" it gives error ading final
		System.out.println(a);
		 a=23;
		 System.out.println(a);
	}
	

	public static void main(String[] args) {
		final_keyword f=new final_keyword();
		f.show();
		// TODO Auto-generated method stub

	}

}
