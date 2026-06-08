
//class Employee{
//    void run(){
//        System.out.println("You can run");
//    }
//}
//
//class Manager extends Employee{
//
//    @Override
//    void run(){
//        System.out.println("Manager can run");
//    }
//}

class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void displayInfo() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }
}
class Manager extends Employee {
    String department;
    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    @Override
    void displayInfo() {
        System.out.println("Manager: " + name + ", Salary: " + salary + ",Department: " + department);
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Employee emp; // reference of parent
//        emp = new Employee("Neeraj", 40000);
//        emp.displayInfo(); // Employee version
//        emp = new Manager("Rahul", 70000, "IT");
//        emp.displayInfo(); // Manager version (child class method)
//    }
//}

public class Day7 {
    public static void main(String[] args) {

//        Employee e1=new Employee();
//        Manager m1=new Manager();
//        e1.run();
//        m1.run();
//        double salary=20000;
        Employee e1=new Employee("John",20000);
//        System.out.println(e1.displayInfo());
        e1.displayInfo();

        Manager m1=new Manager("John",20000,"IT");
//        System.out.println(e1.displayInfo());
        m1.displayInfo();

//        Manager m2=new Employee("Geeta",90000);
//        Employee m2=new Manager("Geeta",90000,"HR");
//        m2.displayInfo();

    }
}
