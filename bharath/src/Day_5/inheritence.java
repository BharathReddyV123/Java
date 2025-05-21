        //single inheritance

package Day_5;
class Animal{
	void sleep() {
		System.out.println("sleeping");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("dog is barking");
	}
}
	
public class inheritence {

	public static void main(String[] args) {
		Dog d1= new Dog();
		d1.sleep();
		d1.bark();
		// TODO Auto-generated method stub

	}

}
