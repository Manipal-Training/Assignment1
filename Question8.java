package assignment_1;

import java.util.Scanner;

public class Question8 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month:");
		int month = sc.nextInt();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.print("Season:Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.print("Season:Summer");
			break;

		case 9:
		case 10:
		case 11:
			System.out.print("Season:Autumn");
			break;
		case 12:
		case 1:
		case 2:
			System.out.print("Season:Winter");
			break;
		default:
			System.out.print("Invalid month");
		}
	}
}
