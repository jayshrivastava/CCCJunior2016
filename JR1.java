//package ccc2016jr;

import java.util.Scanner;

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int wins = 0;
		String letter = "";
	
		for (int i = 0; i < 6; i++) {

			letter = scan.next(); 
			
			if (letter.indexOf("W") > -1) {
				wins++;
			} 

		}

		if (wins == 5 || wins == 6) {
			System.out.println(1);
		} else if (wins == 3 || wins == 4) {
			System.out.println(2);
		} else if (wins == 1 || wins == 2) {
			System.out.println(3);
		} else if (wins == 0) {
			System.out.println(-1);
		}
		scan.close(); 

	}

}
