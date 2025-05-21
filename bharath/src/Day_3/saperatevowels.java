package Day_3;

public class saperatevowels {

	public static void main(String[] args) {
		String s = "HelloWorld";
		String c = " ";
		String v = " ";
		for (int i=0;i<s.length();i++) {
			char x = s.charAt(i);
			if (x=='a'|| x=='e' || x=='i' || x=='o' || x=='u' || x=='A' ||x=='E' ||x=='I' ||x=='O' ||x=='U') {
				v+=x;
			}
			else {
				c+=x;
			}
		

	}
		System.out.println(v);
		System.out.println(c);

}
}
