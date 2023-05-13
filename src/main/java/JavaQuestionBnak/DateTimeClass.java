package JavaQuestionBnak;

import java.sql.SQLOutput;
import java.sql.Time;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeClass {
    public static void main(String[] args) {
        //ex1
        LocalTime now= LocalTime.now();   // bir object urettik  local time sinifindan
        int hour = now.getHour();   //o object ile zzamani aldik
        if(hour>0&&hour<5){
            System.out.println("sleeping time");
        } else if (hour>8&&hour<16) {
            System.out.println("working hour");
        } else if (hour>19&&hour<22) {
            System.out.println("family time");
        }else {
            System.out.println("personal time");
        }
//ex 2
        LocalDateTime timeInJapan= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Local time in Japan"+ " "+ timeInJapan);  // 2023-01-10T20:44:23 yil/ay/gun/saat/dk
        LocalDateTime timeInGermany= LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInGermany); //2023-01-10T12:46:32
        long timeDifference= ChronoUnit.HOURS.between(timeInJapan,timeInGermany);
        System.out.println(timeDifference);
        if (timeDifference<0){
            System.out.println("Local time in Japan is"+ (-1)*timeDifference+" hours ahead of Germany");
        }else{
            System.out.println("Local time in Germay is"+ timeDifference+" hours ahead of Japan");
        }

//ex3
/*
        LocalDateTime dobTimeOfAli =LocalDateTime.of(2015,2,5,10,0,0);
        ZonedDateTime localdobTimeOfAli = dobTimeOfAli.atZone(ZoneId.of("Euro"));
        LocalDateTime dobTimeOfMark = LocalDateTime.of(2015,2,5,12,0,0);
        ZonedDateTime localTimeOfMark= dobTimeOfMark.atZone(ZoneId.of("America/New_York"));
        long differencInHours= ChronoUnit.HOURS.between(localTimeOfMark,localdobTimeOfAli);
*/
//ex4
        LocalDateTime dobAli4= LocalDateTime.of(2015,2,5,10,15,0);
        ZonedDateTime dobAliZoneTime= dobAli4.atZone(ZoneId.of("Europe/Berlin"));
        long aaaa= dobAliZoneTime.getHour();
        ZonedDateTime aqz= dobAliZoneTime.plusHours(23).plusMinutes(35);
        System.out.println(aaaa);   //saat 10
        System.out.println(aqz);  //2015-02-06T09:50+01:00[Europe/Berlin  dogumdan 23saat 125dk sonrasi
        System.out.println(dobAliZoneTime);//2015-02-05T10:15+01:00[Europe/Berlin]
//ex5
        //Mark was born on 2/23/2018 at 3:25 PM in GMT. What is the exact birth date and time of
        //Mark in Japan?
       ZonedDateTime dobMark = LocalDateTime.of(2018,2,23,15,25).atZone(ZoneId.of("GMT"));  //bunuhic kullanmayacam
       LocalDateTime inTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
       LocalDateTime inGmt= LocalDateTime.now(ZoneId.of("GMT"));
       long timedifference= ChronoUnit.HOURS.between(inGmt,inTokyo);//tokyo gmt zaman farki
      LocalDateTime dobMarkInJapan= LocalDateTime.of(2018,2,23,15,25,0).minusHours(timedifference); //mgt zamaninda mark in dogum tatihi saati
        System.out.println(timedifference);
        System.out.println(dobMarkInJapan);  //2018-02-23T06:25   japan saati ile markin dogum saati

        //ex




    }
}
