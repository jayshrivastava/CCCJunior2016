//package ccc2016jr;

import java.util.Scanner;

public class Main {

	public static boolean palindrome(String s) {

		int size = s.length();
		boolean status = true;

		for (int i = 0; i < size; i++) {

			if (s.charAt(i) != s.charAt(size - i - 1)) {

				status = false;
			}

		}

		return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		int wordSize = word.length();
		int biggestDrome = 0;

		if (word.length() == 1) {
			System.out.println(1);
		} else {

			if (palindrome(word) == true) {
				System.out.println(word.length());
			} else {

				//knocking off the end letters
				for (int i = 0; i < wordSize; i++) {

					if (palindrome(word.substring(i)) == true) {

						if (word.substring(i).length() > biggestDrome) {
							biggestDrome = word.substring(i).length();
						}

					}

				}
				
				//knocking off the beginning letters
				for (int i = wordSize - 1; i > -1; i--) {

					if (palindrome(word.substring(0, i)) == true) {

						if (word.substring(0, i).length() > biggestDrome) {
							biggestDrome = word.substring(0, i).length();
						}

					}

				}
				
				//intervals
				for (int i = 1; i < wordSize; i++) {

					for (int j = 0; j < i; j++)
					if (palindrome(word.substring(j, i)) == true) {

						if (word.substring(j, i).length() > biggestDrome) {
							biggestDrome = word.substring(j, i).length();
						}

					}

				}

				// System.out.println(-1);
				System.out.println(biggestDrome);
			}

		}
		


		scan.close();

	}

}
