package new_Package;
import java.util.Scanner;
public class Rohit_assignment1_9 {

	public static void main(String[] args) {
		System.out.println("Enter the number from 0 - 10");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num==9 || num==10) {
			System.out.println("Excellent");
		}
		else if(num==7 || num==8) {
			System.out.println("Notable");
		}
		else if(num==6) {
			System.out.println("Good");
		}
		else if(num==5) {
			System.out.println("Approved");
		}
		else if(num>=0 && num<=4) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid");
		}

	}

}
