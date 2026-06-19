
//class Task1 implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 1; i <= 225; i++) {
//            System.out.println("Chatting with Rohan");
//        }
//    }
//}

//class Task2 implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 1; i <= 225; i++) {
//            System.out.println("Cooking the food");
//        }
//    }
//}

class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 225; i++) {
            System.out.println("Chatting with Rohan"+getName());
        }
    }
}

//import java.util.Scanner;



public class Day9 {

//     static int divideNum(){
//        Scanner sc=new Scanner(System.in);
////
//        System.out.println("Enter num1: ");
//        int a=sc.nextInt();
//
//        System.out.println("Enter num2: ");
//        int b=sc.nextInt();
////         System.out.println(5/0);
//        return  (a/b);
//    }
    public static void main(String[] args) throws ArithmeticException {

//        Task1 t1=new Task1();
//        Task2 t2=new Task2();

//        for (int i = 1; i <= 225; i++) {
//            System.out.println("Chatting with Rohan111111");
//        }

//        Thread thread1=new Thread(t1);
//        Thread thread2=new Thread(t2);

//
//        thread1.start();
//        thread1.join();
//        thread2.start();
//        for (int i = 1; i <= 225; i++) {
//            System.out.println("Chatting with Rohan111111");
//        }

//        MyThread thread=new MyThread("FirstThread");
//        thread.start();

//        MyThread t1 = new MyThread("Thread1");
//        MyThread t2 = new MyThread("Thread2");
//        MyThread t3 = new MyThread("Thread3");
//        t1.setPriority(Thread.MIN_PRIORITY); // 1
//        t2.setPriority(Thread.NORM_PRIORITY); // 5
//        t3.setPriority(Thread.MAX_PRIORITY); // 10
//
//        t1.start();
//        t2.start();
//        t3.start();

//        Thread t = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName() + " is running...");
//        });
//        t.start();
//        Thread thread=new Thread(()->{
//            System.out.println("Hello good");
//        });
//        thread.start();
//        try {
//            System.out.println(divideNum());
//        } catch (Exception e) {
//            System.out.println("Can not divide by Zero");
//        }
//        System.out.println("This is very very important");
    }
}
