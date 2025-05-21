      // multi path inheritance

package Day_5;
class Fruits{
	void benifits() {
		System.out.println("health");
	}
}
class Apple extends Fruits{
	void Color()
	{
		System.out.println(" apple is red in color");
	}
}
class Mango extends Fruits{
	void Prices() {
		System.out.println(" it has more cost");
	}
}
class Banana extends Fruits{
	void Taste() {
		System.out.println(" Banana is more sweet");
	}
}
public class inheritance2 {

	public static void main(String[] args) {
		Apple a1=new Apple();
		Mango m1=new Mango();
		Banana b1=new Banana();
		//a1.benifits();
		a1.Color();
		//b1.benifits();
		b1.Taste();
		//m1.benifits();
		m1.Prices();
		// TODO Auto-generated method stub

	}

}
