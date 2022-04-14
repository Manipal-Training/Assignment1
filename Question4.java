package assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		List<Integer> teenValues = new ArrayList<>();
		for (int i = 13; i <= 19; i++) {
			teenValues.add(i);

		}
		Scanner sc=new Scanner(System.in);
		System.out.print("a: ");
		int a=sc.nextInt();
		System.out.print("b: ");
		int b=sc.nextInt();
		if(teenValues.contains(a)||teenValues.contains(b)) {
			System.out.print("teenSum: 19");
		}
		else {
			int x=a+b;
			System.out.print("teenSum: "+x);
			
		}
	}
}
