//package ccc2016jr;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int question = scan.nextInt();
		int arrayLength = scan.nextInt();
		int[] Dmo = new int[arrayLength];
		int[] Peg = new int[arrayLength];

		int maxSpeed = 0;
		int minSpeed = 0;

		for (int i = 0; i < arrayLength; i++) {

			Dmo[i] = scan.nextInt();
		}

		for (int i = 0; i < arrayLength; i++) {

			Peg[i] = scan.nextInt();
		}

		if (question == 1) {

			Arrays.sort(Dmo);
			Arrays.sort(Peg);

			for (int i = 0; i < arrayLength; i++) {

				if (Peg[i] > Dmo[i]) {

					minSpeed += Peg[i];

				} else {

					minSpeed += Dmo[i];

				}

			}

			System.out.println(minSpeed);

		} else if (question == 2) {

			Arrays.sort(Dmo);

			int temp = 0;

			for (int i = 0; i < arrayLength - 1; i++) {

				for (int j = 1; j < Peg.length - i; j++) {
					if (Peg[j - 1] < Peg[j]) {
						temp = Peg[j - 1];
						Peg[j - 1] = Peg[j];
						Peg[j] = temp;
					}
				}
			}

			for (int i = 0; i < arrayLength; i++) {

				if (Peg[i] > Dmo[i]) {

					maxSpeed += Peg[i];

				} else {

					maxSpeed += Dmo[i];

				}

			}

			System.out.println(maxSpeed);
		}

		scan.close();
	}

}
