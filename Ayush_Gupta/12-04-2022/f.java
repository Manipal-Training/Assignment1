import java.util.*;

public class Main

{

   public static void main(String args[])

   {

       Scanner Sc = new Scanner(System.in);

       int cost;

       System.out.print("Enter the cost of the mobile : ");

       cost = Sc.nextInt();

       if(cost <= 15000)

       {

           System.out.print("Mobile chosen is within the budget");

       }

       else

       {

           System.out.print("Mobile chosen is beyond the budget");

       }

   }

}