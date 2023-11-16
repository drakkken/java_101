import java.util.*;
interface Sports{
	float sports = 6.0f;
	public void putWeight();
	
	
}

class Student{
	float rollNo;
	float getNumber()
		{
			return this.rollNo;
		}
	void putNumber(float num)
		{
			this.rollNo = num;
		}	
		
}

class Test  extends Student{

	float term1,term2;
	
	
	void putMarks1(float mark)
		{ 		       
			this.term1= mark;
		}
	void putMark2(float mark)
		{
			this.term2 = mark;
		}	
	float getMark1()
		{
			return term1;
		}
	float getMark2()
		{
			return term2;
		}	
		
		
}

class Results extends Test implements Sports{
      
      public void putWeight()
      
		{
                    	System.out.println("THE WEIGHT IS :"+sports);	 	 
		
		}
	
	public static void main(String args[]){	
	Scanner sc = new Scanner(System.in);
	Results t = new Results();
	System.out.println("Enter student Rollno");
	float rollNo = sc.nextFloat();
	t.putNumber(rollNo);
	System.out.println("Enter student marks obtained for term 1");
	float term1 = sc.nextFloat();
	t.putMarks1(term1);
        System.out.println("Enter student marks obtained for term 2");
        float term2 = sc.nextFloat();
        t.putMark2(term2);
        
        //t.putWeight(x);
        
        System.out.println("///////THE DETAILS OF THE STUDENT IS///// ");
        System.out.println("ROLL NO : " + t.getNumber());
        System.out.println("MARKS OBTAINED");
        System.out.println("TERM 1 : " + t.getMark1());
        System.out.println("TERM 2 :" +t.getMark2());
        
        System.out.println("SPORTS WEIGHTAGE :");
        t.putWeight();
        System.out.println("Total score = "+ (t.term1+t.term2+t.sports));    
       }     	
}
