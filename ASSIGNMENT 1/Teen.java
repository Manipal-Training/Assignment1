import java.util.*;
public class Teen{
   public static void main(String args[]){
     int a,b;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      if(a >=13 && a<=19 || b >=13 && b <= 19)
         System.out.println("teenSum : 19");
      else
         System.out.println("teenSum : "+(a+b));
}
}

      