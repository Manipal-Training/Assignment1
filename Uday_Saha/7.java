package co.solution;
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color");
		String color=sc.nextLine();
		color=color.toLowerCase();
		switch(color)
		{
		case "red":
			System.out.println("Stop");
			break;
		case "yellow":
			System.out.println("Ready to go");
			break;
		case "green":
			System.out.println("Go");	
			break;
		default:
			System.out.println("Wrong color");
			

	}

}
}
