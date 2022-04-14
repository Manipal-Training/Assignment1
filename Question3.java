package assignment_1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.print("currentNumber: ");
	int currentNumber=sc.nextInt();
	if(currentNumber%2==0) {
		currentNumber=currentNumber/2;
		System.out.print("currentNumber: "+currentNumber);
	}
	else {
		currentNumber=(currentNumber*3)+1;
		System.out.print("currentNumber: "+currentNumber);
	}
	
	}
}
