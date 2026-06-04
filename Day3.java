import java.lang.reflect.Array;
import java.util.Arrays;


//class Student{
//    void run(){
//        System.out.println("I am Running");
//    }
//}


public class Day3 {

    static void greet(){
        System.out.println("Hello Good Morning");
     };

    static float average(float num1,float num2){
        num1=0.5f;
//        System.out.println("Hello Good Morning");
        return (num1+num2)/2;
     };

    public static void main(String[] args) {
//        StringBuffer s1=new StringBuffer("Text Passed");
//        System.out.println(s1);
//
//        StringBuilder sb2 = new StringBuilder("Hello");
//        sb2.append(" Java");
//        System.out.println(sb2);

//        String s1="Neeraj";
//        String s2=s1.toUpperCase();
//        System.out.println(s2);

//        *
//        **
//        ***
//        ****

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        char c = 'A'; // Unicode 65
//        System.out.println(c);
//        int result = c + 1; // 65 + 1
//        System.out.println(result);

//        int[] arr={5,7,9,4,6,3};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        arr.toString();
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        for (int item:arr){
//            System.out.println(item);
//        }
//        int[] arr={7,8,5};
//        int[] arr;
//        arr=new int[10];
//        arr[0]=8;
//        arr[1]=7;
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        int[][] arr={{1,2,3},{5,6,7},{8,9,4}};
//        int[][] arr;
//        arr=new int[3][3];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        int[] arr = {5, 2, 8, 1};
//        Arrays.sort(arr);
//        int index=Arrays.binarySearch(arr,1);
//        System.out.println(index);

//        int[] a1 = {1, 2, 3};
//        int[] a2 = {8, 2, 3};
//        System.out.println(Arrays.equals(a1, a2));

//        int[] arr;
//        arr=new int[5];
//        Arrays.fill(arr, 8);
//        System.out.println(Arrays.toString(arr));

//        int[] arr = {11, 2, 3, 4, 5};
//        int[] copy = Arrays.copyOf(arr, 3); // [1, 2, 3]
////        int[] range = Arrays.copyOfRange(arr, 1, 4); // [2, 3, 4]
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(copy));

            greet();
            float float1=7.6f;
            float float2=9.5f;

         float f1=average(float1,float2);
        System.out.println(float1);
        System.out.println("The average is: "+(f1));

//            Student s1=new Student();
//            s1.run();
//        run();
    }
}
