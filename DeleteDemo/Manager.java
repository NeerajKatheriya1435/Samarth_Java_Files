
// package hero;
// // package company.employee;
// // package company.department;
// // package company.manager;

// class Students{

//     private String name="Rohan";
//     protected int age=56;
//     String course="Python";
//     public String game="PUBG";

//     void meth1(){
//         System.out.println("My name is: "+name);
//         System.out.println("My age is: "+age);
//         System.out.println("My course is: "+course);
//         System.out.println("My game is: "+game);
//     }
// }

// class Teaecher extends Students {

//         void meth2(){
//             // System.out.println("My name is: "+name);
//             System.out.println("My age is: "+age);
//             System.out.println("My course is: "+course);
//             System.out.println("My game is: "+game);
//         }
// }

// public class Manager {
//     public static void main(String[] args) {
//         System.out.println("Manager Class");

//         Students s1=new Students();
//         // s1.meth1();

//         // System.out.println("My name is: "+s1.name);
//         System.out.println("My age is: "+s1.age);
//         System.out.println("My course is: "+s1.course);
//         System.out.println("My game is: "+s1.game);
//     }
// }

//class Task1 extends Thread {
//
//    public void run() {
//        for (int i = 1; i <= 225; i++) {
//            System.out.println("Chatting With Rohan");
//        }
//    }
//}
//
//class Task2 extends Thread {
//
//    public void run() {
//        for (int i = 1; i <= 225; i++) {
//            System.out.println("Chay Pi Rahe hai");
//        }
//    }
//}

//public class Manager {
//    public static void main(String[] args) {
//        Task1 t1 = new Task1();
//        Task2 t2 = new Task2();
//        t1.start(); // start first thread
//        t2.start(); // start second thread
//    }
//}