package JavaQuestionBnak;

import javax.sound.sampled.FloatControl;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateClass {
    public static void main(String[] args) {
        //ex1

        LocalDate birthOfAli= LocalDate.of(2004,8,30);  // gu tarih ay   alinin dogum tarihi
        LocalDate currentDate= LocalDate.now();//bugunun tarihi
        long numberOfDaysAliLived = ChronoUnit.DAYS.between(birthOfAli,currentDate);  ///dogum tarihi ile bugun arasidna gecen zamani belitiyor
        System.out.println("the number of days i ve lived "+" "+numberOfDaysAliLived);
 LocalDate dateofbirthSafa= LocalDate.of(1993,5,27);
 LocalDate simdikizmana=LocalDate.now();
  long safaninyadadigigunsayisi= ChronoUnit.DAYS.between( dateofbirthSafa,simdikizmana);
        System.out.println("safanin bugune kadar yasadigi gun sayidi"+ " "+safaninyadadigigunsayisi);

  //ex2
      LocalDate birthOfMustafa= LocalDate.of(1981,2,6);
      LocalDate simdikizmaan= LocalDate.now();
      long numberOfMonths =ChronoUnit.MONTHS.between(birthOfMustafa,simdikizmaan);
        System.out.println(numberOfMonths);

        //ex3
        LocalDate birthOfAli3=LocalDate.of(1997,7,4);
        LocalDate exactDate =birthOfAli3.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println(exactDate);

        //ex4
        LocalDate birthOfVeli4= LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);
        LocalDate birthOfAli4= LocalDate.of(1923,10,5).plusYears(45).plusMonths(8).plusDays(5);
        boolean q1=birthOfAli4.equals(birthOfVeli4);
        System.out.println(q1);  //soyle de yazilabilir   System.out.println(birthOfAli4.equals(birthOfVeli4));

//ex5
LocalDate birthOfAli5= LocalDate.parse("2012-11-24");  //gereksiz gibi     alttaki daha iyi gibi
LocalDate birthOfVeli5= birthOfAli5.plusYears(3).plusDays(11);
        System.out.println(birthOfVeli5);//2015-12-05
        LocalDate Alininyasi= LocalDate.of(2012,11,24);
        LocalDate velininyasi= Alininyasi.plusYears(3).plusDays(11);
        System.out.println(velininyasi);  //2015-12-05
//ex6
        LocalDate myAge= LocalDate.of(1981,2,6);
        LocalDate aydininyasi=LocalDate.of(2004,8,30);
        long gunfarki= ChronoUnit.DAYS.between(myAge,aydininyasi);
        System.out.println(gunfarki);

        //ex7  ***************  guzel soru
        LocalDate curerentdate1= LocalDate.now();
        int aa= curerentdate1.getYear()%100;
        System.out.println(aa);

        //ex8
        LocalDate mydob= LocalDate.of(1980,2,6);
        boolean qq= mydob.isLeapYear();
        System.out.println(qq);
        System.out.println("****");
//2ns way   java duruma ozel bir kod yapmis ise o en iyi olani  en kisa olani   bu ikinci yol tmm guzel ama daha uzun
        boolean qqq= (mydob.getYear()%100==4 || mydob.getYear()%4==0);
        System.out.println(qqq);

        //ex9
        //kolay

        //ex10
        //kolay


    }
}
