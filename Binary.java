import java.util.Scanner;
class Binary{

   public static int search(int left,int right,int key,int arr[])
{
 if(left<=right){ 	
     int mid = (left+right)/2;
     if(arr[mid]==key){
        	 return mid;
     	}
     else if(key<arr[mid]){
        	 return search(left,mid-1,key ,arr);
     	}
     else if(key>arr[mid]){
        	 return search(mid+1,right,key,arr);
     	}}

 	return -1;
 
}     
        public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size =sc.nextInt();
        int arr[] = new int[size];
        for(int i =  0; i < size ; i ++)
        	{
        		System.out.println("Enter " + i + "th element in array");
        		arr[i] = sc.nextInt();
        	}
        System.out.println("Enter key element to check");
        int key = sc.nextInt();
        int pos = search(0,arr.length-1,key,arr);
        if(pos!=-1)
        System.out.println("it is present at "+pos);
        else
        System.out.println("ERROR NO KEY ITEM IN ARRAY");
        
   }	
}
