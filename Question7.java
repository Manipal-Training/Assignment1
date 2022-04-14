package assignment_1;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the color:");
		String color=sc.next();
		
		if(color.equals("red")) {
			System.out.println("Stop");
		}
		else if(color.equals("green")) {
			System.out.println("Go");
		}
		else if(color.equals("yellow")) {
			System.out.println("Proceed with caution");
			
		}
		else {
			System.out.println("prepare to go");
		}
		sc.close();
	}

}
