import java.util.Scanner;
class Firstnnumber{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find sum of:");
    int num = sc.nextInt();
    int sum = 0 ;
    	for(int i = 0 ; i <= num; i++)
        {
    	 	sum += i;
    	}
    	System.out.println("the sum is "+sum);
  }
}
