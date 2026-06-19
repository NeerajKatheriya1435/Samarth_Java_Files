import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg); // Parent Exception stores the message
    }

    @Override
    public String getMessage() {
        return "This error of age";
    }
}

public class Day10 {
    public static void main(String[] args) throws Exception {

//        int a=7;
//        int b=0;
//        Scanner sc=new Scanner(System.in);
//        int[] arr=new int[5];
//            arr[10]=90;
//        System.out.println(a/b);
//            int num1=sc.nextInt();

//        int age=-7;
//
//        if(age<0){
////            throw new ArithmeticException("User Age can not be negative");
//            throw new Exception("Custom class with message");
//        }
//        if(age>18){
//            System.out.println("You can drive");
//        }else {
//            System.out.println("You can not drive");
//        }


//        int age=-7;

//        try{
//            if(age<0){
////            throw new ArithmeticException("User Age can not be negative");
//                throw new ArithmeticException("Custom class with message");
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        if(age>18){
//            System.out.println("You can drive");
//        }else {
//            System.out.println("You can not drive");
//        }

//        int simple=0;
//        try {
//            System.out.println(7/8);
//        } catch (Exception e) {
//            System.out.println("Can not divide by zero");
//        }
//        finally {
//            System.out.println("This is very important line");
//        }

//        LinkedList<Integer> linkedList=new LinkedList<Integer>();
//
//        linkedList.add(67);
//        linkedList.add(56);
//        linkedList.add(90);
//
//        linkedList.addFirst(78);
//
//        System.out.println(linkedList.toString());


    }
}
