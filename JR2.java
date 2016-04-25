//package ccc2016jr;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int[][] square = new int[4][4];

		boolean isMagic = true;
		int sum = 0;
		int sum2 = 0;

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				square[j][i] = scan.nextInt();

			}
		}

		// rows
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				if (j == 0) {
					sum += square[j][i];
				} else {
					sum2 += square[j][i];
				}

			}

			if (j != 0) {

				if (sum != sum2) {

					isMagic = false;
				}

			}

			sum2 = 0;

		}

		if (isMagic == false) {
			System.out.println("not magic");
		} else {
			System.out.println("magic");
		}
		
		scan.close(); 

	}
}
