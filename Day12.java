import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Day12 {
    public static void main(String[] args) {

//        Date d1=new Date();
////        System.out.println("The current date is: "+d1);
//        System.out.println("The current date is: "+d1.getTime());
//        System.out.println("The current date is: "+"346558768454656");
//        Date d2=new Date(346558768454656l);
//        System.out.println(d1.after(d2));

//        Calendar calendar=Calendar.getInstance();
//
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH+1));
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.HOUR));
//        System.out.println(calendar.get(Calendar.MINUTE));
//        System.out.println(calendar.get(Calendar.SECOND));

        LocalDate localDate=LocalDate.now();
//        LocalDate newValue=localDate.plusDays(5);
//        LocalDate newValue=localDate.plusDays(5);
//        System.out.println(localDate);
//        System.out.println(newValue);
//        LocalTime localTime=LocalTime.now();
//        System.out.println(localTime);
//        LocalDateTime localDateTime=LocalDateTime.now();
//        System.out.println(localDateTime);
//        ZonedDateTime zonedDateTime=ZonedDateTime.now();
//        System.out.println(zonedDateTime);

        LocalDate t1=LocalDate.now();
//        System.out.println(t1.format(DateTimeFormatter.ISO_DATE));
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/YY");
        System.out.println(t1.format(dt));


    }
}
