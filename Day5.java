
class Student{
    int age;
    String name;
    int salary;

    // Default Constructor
    Student(){};

    // Parmeterzed Constructor
    Student(String stdname,int stdage,int stdsalary){
        name=stdname;
        age=stdage;
        salary=stdsalary;
//        System.out.println("Constructor called");
    }

    public String getName(){
        return name;
    }
    public void setName(String passname){
        if(passname.length()>3){
            name=passname;
        }else{
            System.out.println("Name should be greater the 3 character");
        }
    }
}

public class Day5 {
    public static void main(String[] args) {
        Student s1=new Student("Rohan",56,20000);
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.salary);
        System.out.println("--------------------------");

        Student s2=new Student("Peter",45,27000);
        System.out.println(s2.age);
        System.out.println(s2.name);
        System.out.println(s2.salary);

        Student s3=new Student();
        s3.name="Shubham";
        s3.age=78;
        s3.salary=78000;
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.salary);


//        s1.age=-89;
//        s1.name="John";


//        System.out.println("My name is: "+s1.name);
//        System.out.println("My age is: "+s1.age);
//        System.out.println("My age is: "+s1.getName());
//        s1.setName("Su");
//        System.out.println("My name is: "+s1.getName());

//        Student s2=new Student();
    }
}
