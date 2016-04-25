package ccc2016jr;

import java.util.Scanner;

public class JR4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String leavesAt = scan.nextLine();
		int colon = leavesAt.indexOf(":");

		double twoHours = 2.00000000000000000000000000;

		int hour = Integer.parseInt(leavesAt.substring(0, colon));
		int min = Integer.parseInt(leavesAt.substring(colon + 1));

		int arrivalHour = hour;
		int arrivalMin = min;

		// 2 HOURS
		if (hour < 5 || (hour == 5 && min == 0)) {
			arrivalHour += 2;
		} else if (hour >= 19) {
			arrivalHour += 2;
		} else if (hour >= 10 && (hour < 13 || (hour == 13 && min == 0))) {
			arrivalHour += 2;
		} else {

			// start during rush hour

			if ((arrivalHour >= 7 && arrivalHour < 10) || (arrivalHour >= 15 && arrivalHour < 19)) {

				while ((arrivalHour >= 7 && arrivalHour < 10) || (arrivalHour >= 15 && arrivalHour < 19)) {

					arrivalMin += 10;
					twoHours = twoHours - 0.0833333333333333333333333333333333333333;
					if (arrivalMin == 60) {
						arrivalHour += 1;
						/*
						 * if (arrivalHour == 24) { arrivalHour = 0; }
						 */
						arrivalMin = 00;

					}

					if (twoHours < 0.01) {
						break;
					}

				}

				while (twoHours > 0.01) {

					arrivalMin += 10;
					twoHours = twoHours - 0.166666666666666666666666666666666666;
					if (arrivalMin == 60) {
						arrivalHour += 1;
						arrivalMin = 0;
						/*
						 * if (arrivalHour == 24) { arrivalHour = 0; }
						 */

					}

				}

			} else {
				// start not during rush hour

				while (twoHours > 0.01) {

					arrivalMin += 10;
					twoHours = twoHours - 0.166666666666666666666666666666666666;
					if (arrivalMin == 60) {
						arrivalHour += 1;
						arrivalMin = 0;
						/*
						 * if (arrivalHour == 24) { arrivalHour = 0; }
						 */

					}

					if ((arrivalHour >= 7 && arrivalHour < 10) || (arrivalHour >= 15 && arrivalHour < 19)) {
						break;
					}

				}

				while ((arrivalHour >= 7 && arrivalHour < 10) || (arrivalHour >= 15 && arrivalHour < 19)) {

					arrivalMin += 10;
					twoHours = twoHours - 0.0833333333333333333333333333333333333333;
					if (arrivalMin == 60) {
						arrivalHour += 1;
						/*
						 * if (arrivalHour == 24) { arrivalHour = 0; }
						 */
						arrivalMin = 00;

					}

					if (twoHours < 0.01) {
						break;
					}

				}

			}

			// start not during rush hour

		} // BIG IFF

		if (arrivalHour > 24) {
			arrivalHour = arrivalHour - 24;
		}

		if (arrivalHour == 24) {
			arrivalHour = 0;
		}

		if (arrivalMin == 0) {

			if (arrivalHour < 10) {
				System.out.println("0" + arrivalHour + ":" + arrivalMin + "0");
			} else

				System.out.println(arrivalHour + ":" + arrivalMin + "0");
		} else {

			if (arrivalHour < 10) {
				System.out.println("0" + arrivalHour + ":" + arrivalMin);
			} else {
				System.out.println(arrivalHour + ":" + arrivalMin);
			}
		}
		scan.close();

	}
}
