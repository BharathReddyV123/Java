package Day_2;

import java.util.Scanner;

public class switch_case {
	public static void main(String[] args) {
		
		String color=args[0];
		
		switch(color) {
		case "red":
			System.out.println("celebrate holi");
			break;
		case "green":
			System.out.println("celebrate ramzan");
			break;
		case "white":
			System.out.println("celebrate cristmas");
			break;
			default:
				System.out.println("no festival");
		}
	}

}
