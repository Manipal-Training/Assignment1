package assignment_1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Quantity Purchased:");
		int quantity=sc.nextInt();
		System.out.print("Rate per item:");
		double rate=sc.nextDouble();
		double discount=0.1;
		double price=1;
		if(quantity>1000)
		{
			price*=rate*quantity-(rate*quantity*discount);
			System.out.format("Total Expenses: %.6f",price);
		}
		else {
			price*=rate*quantity;
			System.out.format("Total Expenses: %.6f",price);
			
		}
		
	}

}
