package Day_1;
public class Variables {
	    
	   int x=67,y=89;
	   static int p=45,q=12;
	   void div() {
		   int a=90,b=5;
		   System.out.println(a/b);
	   }

	public static void main(String[] args) {
		Variables v1=new Variables();
		System.out.println(v1.x% v1.y);
		System.out.println(Variables.p * Variables.q);
		v1.div();
		// TODO Auto-generated method stub

	}

}
