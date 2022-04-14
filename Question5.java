package assignment_1;

import java.util.Scanner;

public class Question5 {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the cost of the mobile");
		int cost=sc.nextInt();
		if(cost<=15000) {
			System.out.print("Mobile chosen is within the budget");
		}
		else {
			System.out.print("Mobile chosen is beyond the budget");
		}

	}
}
