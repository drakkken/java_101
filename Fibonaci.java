import java.util.Scanner;

class Fibonaci{

 public static int method(int n ){
  if(n == 1 || n == 2)
  {
   return 1;
  }else
  return(method(n-1)+method(n-2));
  
  
}

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
             System.out.println("enter numberup to which fibonaci has to be printed");
             int num = sc.nextInt();
             System.out.printf("\n");
             
             
             
             for(int i = 1 ; i <= num ; i++)
             {
             int n = method(i);
             System.out.println(n);
             }
	}    
}
