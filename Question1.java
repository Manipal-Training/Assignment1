package assignment_1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Code: ");
		int code = scanner.nextInt();
		double sum = 0;
		if (code == 1) {
			System.out.print("X: ");
			double x = scanner.nextDouble();
			System.out.print("Y: ");
			double y = scanner.nextDouble();
			sum += x + y;
		}
		System.out.format("Sum: %.2f", sum);
		scanner.close();
	}

}
