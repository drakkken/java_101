import java.util.*;
class Matrix_Multi
{

 public static void inputElement(int a[][],int row ,int col)
 {
    System.out.println("enter matrix elements one by one");
    Scanner sc = new Scanner(System.in);
    for(int i = 0 ;i < row ; i++)
    {
      for(int j = 0 ; j < col;j++)
      {
        a[i][j] = sc.nextInt();
      }
    }
 }
  public static void dis(int a[][],int row ,int col)
  {
      for(int i = 0 ;i < row ; i++)
      {
      	for(int j = 0 ; j < col;j++)
      	{
        	System.out.print(" "+a[i][j]+" ");
      	}
      	System.out.printf("\n");
      }
  }
 
   public static void main (String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter matrix row1 ");
       int row1 = sc.nextInt();
       System.out.println("enter matrix col1 "); // 3 ,4
       int col1 = sc.nextInt();
       int array1[][] = new int [row1][col1];
       inputElement(array1,row1,col1);
       System.out.println("enter matrix row2 ");
       int row2 = sc.nextInt();
       System.out.println("enter matrix col2 "); 
       int col2 = sc.nextInt();
       int array2[][] = new int[row2][col2];
       inputElement(array2,row2,col2);
       
       if(col1 != row2)
       {
       System.out.println("Matrix multiplication not possible");     // checking if it is possible 
       }else
       {
       int r[][] = new int [row1][col2];
       int sum = 0;
       for(int i = 0 ;i < row1 ; i++)
      {
      	for(int j = 0 ; j < col2;j++)
      	{
      	  sum = 0;
         for(int k = 0 ; k < row2 ; k++)
         {
           sum += array1[i][k]*array2[k][j];
         }
         r[i][j] = sum;
      	}
      	
      }
       
      dis(r,row1,col2);
      }  
       
       
       
       
       
       
   
  }
}
