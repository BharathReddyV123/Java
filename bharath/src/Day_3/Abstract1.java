package Day_3;

abstract class Abstract1{
	abstract void add();
	abstract void sub();
	static void mul(){
		System.out.println("multiplication");
	}
	void div() {
		System.out.println("dividion");
	}
}
    class Abstract extends Abstract1{
    	public void mod() {
    		System.out.println("modulus");
    	}
    	public void add() {
    		System.out.println("addition");
    	}
    	public void sub() {
    		System.out.println("substraction");
    	}
    	public static void main(String[] args) {
    		Abstract a1=new Abstract();
    		a1.add();
    		a1.sub();
    		a1.mul();
    		a1.div();
    		a1.mod();
    	}
    }
