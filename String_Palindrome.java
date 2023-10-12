import java.util.*;
class String_Palindrome{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a string to check palindorme");
     String s = sc.nextLine();
     boolean pal = true;
     for(int i = 0 ; i < (s.length())/2;i++){
        if(s.charAt(i) != s.charAt(s.length()-1-i))   
         pal = false;
     }
    
    if(pal == true)
    System.out.println("the string is palindrome");
    else
    System.out.println("the string is not palindrome");
  
  }

}
