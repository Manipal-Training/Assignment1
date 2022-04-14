package assignment_1;

import java.util.Scanner;

public class Question6 {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the car no:");
		int carNum=sc.nextInt();
		int sum=0;
		while(carNum>0) {
			sum+=carNum%10;
			carNum=carNum/10;
			
		}
		if(sum%3==0||sum%5==0||sum%7==0) {
			System.out.print("Lucky Number");
		}
		else {
			System.out.print("Sorry its not my lucky number");
		}

	}

}
