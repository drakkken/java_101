import java.util.*;

class Employee {
    void display() {
        System.out.println("This is Employee Class");
    }

    void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}

 class Engineer extends Employee {
    void display() {
        System.out.println("This is Engineer Class");
        super.display();
    }

    void calcSalary() {
        System.out.println("Salary of employee is 20000");
        super.calcSalary();
    }
}

class Main {
    public static void main(String args[]) {
        Engineer darwin = new Engineer();
        System.out.println("calling display on engineer and employee and printing salary");
        darwin.display();
        darwin.calcSalary();
        
}

 	
  		
