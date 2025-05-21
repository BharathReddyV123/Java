package Day_3;

abstract class demo10{
	abstract void add();
	abstract void sub();
	static void mul(){
		System.out.println("multiplication");
	}
	void div() {
		System.out.println("dividion");
	}
}
    class Test1 extends demo10{
    	public void mod() {
    		System.out.println("modulus");
    	}
    	public void add() {
    		System.out.println("addition");
    	}
    	public void sub() {
    		System.out.println("substraction");
    	}
public class demo9{    	
    	public static void main(String[] args) {
    		Test1 a1=new Test1();
    		a1.add();
    		a1.sub();
    		a1.mul();
    		a1.div();
    		a1.mod();
    	}
    }
}