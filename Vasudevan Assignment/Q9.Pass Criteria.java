import java.util.Scanner;
class Main {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n>=9 && n<=10)
		{
			System.out.println("Excellent");
		}
		else if(n>=7 && n<=8 )
		{
			System.out.println("Notable");
		}
		else if(n==6 )
		{
			System.out.println("Good");
		}
		else if(n==5 )
		{
			System.out.println("Approved");
		}
		else if(n>=1 && n<=4 )
		{
			System.out.println("Fail");
		}
		else if(n>=1 && n<=4 )
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}
}