import java.util.*;

class Emp {
    String name;
    String address;
    int age;
    String phoneNumber;
    int salary;

    void printSalary() {
        System.out.println("Salary is: " + salary);
    }
}

class Officer extends Emp {
    String specialization;

    Officer(String name, String address, int age, String phoneNumber, int salary, String sp) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.specialization = sp;
    }
}

class Manager extends Emp {
    String department;

    
    Manager(String name, String address, int age, String phoneNumber, int salary, String dp) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.department = dp;
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Officer o1 = new Officer("darwin", "kottayam", 19, "9961354280", 100000, "grade 1");
        System.out.println("Details of o1");
        System.out.println("Name: " + o1.name);
        System.out.println("Address: " + o1.address);
        System.out.println("Age: " + o1.age);
        System.out.println("Salary: " + o1.salary);
        System.out.println("Specialization: " + o1.specialization);
        o1.printSalary();


        Manager m1 = new Manager("prathul", "kasargod", 19, "9956485410", 200, "pharmacy");
        System.out.println("Details of m1");
        System.out.println("Name: " + m1.name);
        System.out.println("Address: " + m1.address);
        System.out.println("Age: " + m1.age);
        System.out.println("Salary: " + m1.salary);
        System.out.println("Department: " + m1.department);
	m1.printSalary();
    }
}
