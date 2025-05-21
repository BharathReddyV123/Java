package Day_2;

public class pattern_in_whileloop {
	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			int j=1;
			while(j<=5) {
				System.out.print(" * ");
				j+=1;
			}
			i+=1;
			System.out.println();
		}
	}

}
