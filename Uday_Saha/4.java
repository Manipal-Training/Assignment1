package co.solution;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		if(a>=13 && a<=19 || b>=13 && b<=19)
		{
			sum=19;
			System.out.println("teenSum : "+sum);
		}
		else {
			sum=a+b;
			System.out.println("teenSum : "+sum);
		}

	}

}
