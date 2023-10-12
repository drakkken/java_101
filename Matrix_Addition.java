import java.util.*;
class Matrix_Addition
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
       System.out.println("enter matrix row ");
       int row = sc.nextInt();
       System.out.println("enter matrix col "); 
       int col = sc.nextInt();
       
       System.out.println("for matrix addition rows and columns of both martrix must be equal ");
       
       System.out.println("enter matrix row2 ");
       int row2 = sc.nextInt();
       System.out.println("enter matrix col2 "); 
       int col2 = sc.nextInt();
     if(row2 != row || col2 != col)
      {
       System.out.println("addition not possible cause the matrix is not of same size");
      }else
      {
       int array1[][] = new int[row][col];
       int array2[][] = new int[row][col];
       int r[][] = new int [row][col];
        
       inputElement(array1,row,col);
       inputElement(array2,row,col);
       //addition
       for(int i = 0 ;i < row ; i++)
       {
      		for(int j = 0 ; j < col;j++)
      		{
        		r[i][j] =array1[i][j]+array2[i][j]; 
      		}
       }
       System.out.println("the new matrix is ");
    dis(r,row,col);
     }
  }
}
