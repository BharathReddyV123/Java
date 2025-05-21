// my example for  3_1

package Day_5;
class Chocolate{
	void eat() {
		System.out.println("types of chocolates");
	}
}
class Dark extends Chocolate{
	void Taste1() {
		System.out.println("good taste");
	}
}
class Sweet extends  Chocolate{
	void Taste2() {
		System.out.println("good in taste");
	}
}
class Bournvelli extends Dark{
	void cost1() {
		System.out.println("more cost");
	}
}
class Amul extends Dark{
	void cost2() {
		System.out.println("more in cost");
	}
}
class Dairymilk extends Sweet {
	void weight1() {
		System.out.println("more weight");
	}
}
class Kitkat extends Sweet{
	void weight2() {
		System.out.println("more in weight");
	}
}
public class inheritance3_1 {

	public static void main(String[] args) {
		Bournvelli b1=new Bournvelli();
		Amul a1 = new Amul();
		Dairymilk d1= new Dairymilk();
		Kitkat k1 = new Kitkat();
		b1.eat();
		b1.Taste1();
		b1.cost1();
		a1.cost2();
		d1.Taste2();
		d1.weight1();
		k1.weight2();
		// TODO Auto-generated method stub

	}

}
