             //inheritance heirarchical

package Day_5;
class Movie{
	void genre() {
		System.out.println("crime and thriller  movie");
	}
}
class Hit extends Movie{
	void action() {
		System.out.println("it is about investigation movie");
	}
}
class Hero extends Hit{
	void name() {
		System.out.println("hero name : nani");
	}
}
class Heroin extends Hit{
	void acting() {
		System.out.println("heroin performence is excelent");
	}
}
public class inheritance3 {

	public static void main(String[] args) {
		Hero a1=new Hero();
		Heroin m1=new Heroin();
		a1.action();
		a1.genre();
		a1.name();
		m1.acting();
		// TODO Auto-generated method stub

	}

}
