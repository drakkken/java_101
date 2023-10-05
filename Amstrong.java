import java.util.Scanner;
import java.lang.Math;
class Amstrong{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter a number ot check amstron : ");
   int n = sc.nextInt();
   int num = n;
   int count =0;
   while(n > 0)
   {
    n = n/10;
    count++;
   }
   n = num;
   double sum = 0,base;
   while(n>0)
   {
   base = n%10;
   sum = sum + Math.pow(base,count);
   n =n/10;
   }
   if(sum == num)
   {
   System.out.println("is is amstrong " + " ");
   
   }else
   {
   System.out.format("not amstrong"+" ");   
   }
  
  }
}

