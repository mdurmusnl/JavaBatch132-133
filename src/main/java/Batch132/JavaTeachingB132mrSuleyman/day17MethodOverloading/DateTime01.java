package Batch132.JavaTeachingB132mrSuleyman.day17MethodOverloading;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {
        //  type code to get current date
        Date curentDate= new Date();
        System.out.println(curentDate);   //  Thu Jan 26 14:03:04 CET 2023
        System.out.println( curentDate.getTime());   // 1674739275653   since the begining fo difital history started 1 jan 1970
        // type a code to get current time in your local area
        LocalTime myTime= LocalTime.now();  //14:24:39.796933500
        System.out.println(myTime);  //  14:24:39.796933500=current time hr min sec nonoseconds
        //type code to get current date in your local area
        LocalDate myDate= LocalDate.now();
        System.out.println(myDate); //  2023-01-26
        LocalDateTime myDateTime= LocalDateTime.now();
        System.out.println(myDateTime);  //  2023-01-26T14:33:11.295287
        // how to get a specific component from a date and time
        System.out.println(myTime.getHour());  //14
        System.out.println(myDate.getMonth()); //1
        System.out.println(myDateTime.getDayOfWeek());  // thurday
        //how to get time in another zone
        System.out.println( LocalDateTime.now(ZoneId.of("Asia/Baku")));
        System.out.println(myDate.plusYears(3).plusMonths(4).plusDays(12));
        System.out.println(myTime.minusHours(3).minusMinutes(13));
        //hpw to compare two dates
        LocalDate firstKid= LocalDate.of(2005,8,22);
        LocalDate secondKid= LocalDate.of(2011,3,11);
                  boolean isFirstKidAfter=firstKid.isAfter(secondKid);
        System.out.println(isFirstKidAfter);
        // how to format the display
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd:MM:yyyy");
        System.out.println(dtf.format(myDate));  //26:01:2023




    }
}
