
//class  Human{
//
//    String name="Abhinay";
//
//    void laugh(){
//        System.out.println("Human is Laughing");
//    }
//    void run(){
//        System.out.println("Human is Running");
//    }
//}
//
//class  Player extends Human{
//    void game(){
//        System.out.println("Good in Hocky");
//    }
//}

class Std{
    String name;
    int id;
    Std(String name,int id){
        this.name=name;
        this.id=id;
    }

    void displayDetails(){
        System.out.println("My name is: "+name);
        System.out.println("My id is: "+id);
    }
}
class Result extends Std{
    int hindi;
    int english;
    protected int rank;
    Result(String name,int id,int hindi,int english){
        super(name,id);
        this.hindi=hindi;
        this.english=english;
    }
    void avergae(){
        double avg=(hindi+english)/2;
        System.out.println("Average marks is: "+avg);
    }
}

class Topper extends Result{

    Topper(String name,int id,int hindi,int english,int rank){
        super(name,id,hindi,english);
        this.rank=rank;
    }

    void ranker(){
        super.displayDetails();
        super.avergae();
        System.out.println("My rank is: "+this.rank);

    }
}






public class Day6 {
    public static void main(String[] args) {

//        Human h1=new Human();
//        h1.laugh();
//        h1.run();

//        Player p1=new Player();
//        p1.run();
//        p1.game();
//        System.out.println(p1.name);

//        Std s1=new Std("Rohan",78);
//        System.out.println(s1.name);
//        System.out.println(s1.id);
//
//        Std s2=new Std("Rohit",45);
//        System.out.println(s2.name);
//        System.out.println(s2.id);
//
//        Result r1=new Result("Suman",101);
//        r1.run();

//        Result r1=new Result("John",101,45,34);
        Topper r1=new Topper("John",101,45,34,2);
//        Result r1=new Result("John",101,45,34);

//        r1.displayDetails();
//        r1.avergae();
//        r1.ranker();
//        System.out.println(r1.rank);
        r1.ranker();

    }
}
