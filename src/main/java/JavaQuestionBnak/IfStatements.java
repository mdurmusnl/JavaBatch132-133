package JavaQuestionBnak;

import java.awt.desktop.AboutEvent;
import java.sql.SQLOutput;

public class IfStatements {
    public static void main(String[] args) {
        // page 167
        //ex1
        String mName = "december";
        if (mName.equals("december") || mName.equals("Jannuary") || mName.equals("february")) {
            System.out.println("its winter");
        } else if (mName.equals("March") || mName.equals("April") || mName.equals("May")) {
            System.out.println("its spring");
        } else if (mName.equals("june") || mName.equals("july") || mName.equals("august")) {
            System.out.println("Summer");
        } else if (mName.equals("september") || mName.equals("october") || mName.equals("november")) {
            System.out.println("Fall");
        } else {
            System.out.println("Invalid month name");
        }

//ex2     \p{Punct}
        String pwd = " a1b ? ?!!!2c3 d4";
        String pwd1 = pwd.replaceAll("\\p{Punct}", "");
        System.out.println(pwd1); //  a1b  2c3 d4
        String pwd2 = pwd1.replaceAll("\\s", "");   //removes all spaces  alllll   amaaaa kucuk "s" HARFI ILE OLACAK
        System.out.println(pwd2); //a1b2c3d4
        //       \\s   space siliyor      \\S  SPACE HARICI HERSEYI SILIYOR
        String ps = "  a1b2c3d4";
        int p1 = ps.replaceAll("\\S", "").length();
        System.out.println(p1);   //2
        if (ps.replaceAll("\\S", "").length() > 0) {   //spcace sildikten sonra uzunluk sifirdan buyuk ise space kullanilmis dmeketir
            System.out.println("please deo not use space charachter");
        } else if (ps.replaceAll("\\s", "").length() > 7) {
            System.out.println("valid password");
        } else {
            System.out.println("invalid password");
        }
        //ex3
        int i = 127;
        if (i % 10 >= 5) {
            System.out.println(((i / 10) + 1) * 10);
        } else {
            System.out.println((i / 10) * 10);
        }
//ex4
        //cok basit

        //ex5
        int a = 4;
        int b = 3;
        int c = 3;
        if (a == b && a == c) {
            System.out.println("equilateral tringale");
        } else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            System.out.println("isosceles trinagle");
        } else {
            System.out.println("niether isosceles or equilateral trinagle");
        }

        //ex6
        double mile = 10;
        double seconds = 7200;
        double fahrenheit = 83;

        String operator = "miletokm";
        if (operator.equals("miletokm")) {
            System.out.println(mile * 1.6);
        } else if (operator.equals("sesondstoHours")) {
            System.out.println(seconds / 3600);
        } else if (operator.equals("fahrenheitToCelsius")) {
            System.out.println((fahrenheit - 32) * 5 / 9);
        }
//ex7
        /*
       String fullName = "ali Can?";
       String initialOfFirstName =fullName.trim().substring(0,1);   //ilk harf
       int indexOfSpace= fullName.trim().indexOf(' '); //3. index i verir   *****************
        String initialOfLastName= fullName.substring(indexOfSpace+1,indexOfSpace+2);  //4.index i yazdiri  5.index haric
        System.out.println(initialOfLastName  );   //c harfinin verir
        boolean isFirstInitialUpperCase= (initialOfFirstName.charAt(0)>= 'A' && initialOfFirstName.charAt(0)<='Z');  //diyor ki  ilk harf buyuk harf mi
        boolean isLastNameInitialUppurCase=(initialOfLastName.charAt(0)>='A'&& initialOfLastName.charAt(0)<='Z');
        if(indexOfSpace==-1){
            System.out.println("first name or last name is missed");
        }else if(!isFirstInitialUpperCase||!isLastNameInitialUppurCase){
            System.out.println("error initias");
        }else if(fullName.equals(fullName.toUpperCase())){
            System.out.println("format error");
        }else if(fullName.replaceAll("\\s","").length()==0){   // bosluklari sildigimde uzunluk sifir ise demek ki sadece bosluk varmis
            System.out.println("name was not entered");
        }else if(fullName.replaceAll("\\s","").replaceAll("[a-zA-Z]","").length()>0){
            System.out.println("invalid name");
        }  */
        //ex 7  tekrardan
        String fullName = "ali Can?";
        String initilOfFirstName = fullName.substring(0, 1);   // a
        int indexOfSpace = fullName.trim().indexOf(" ");  //idex of charachter of the first occurance of space
        String initialOfLastName = fullName.substring(indexOfSpace + 1, indexOfSpace + 2);  // C
        Boolean isFirstInitialUpper = (initilOfFirstName.charAt(0) >= 'A' && initilOfFirstName.charAt(0) <= 'Z');
        Boolean isLastInitialUpper = (initialOfLastName.charAt(0) >= 'A' && initialOfLastName.charAt(0) <= 'Z');

        if (indexOfSpace == -1) {
            System.out.println("first name or last name is misssded");
        } else if (!isLastInitialUpper || !isFirstInitialUpper) {
            System.out.println("error in initial");
        } else if (fullName.equals(fullName.toUpperCase())) {
            System.out.println("format error");
        } else if (fullName.replaceAll("\\s", "").length() == 0) {
            System.out.println("name was not entered");
        } else if (fullName.replaceAll("\\s", "").replaceAll("[a-zA-Z]", "").length() > 0) {
            System.out.println("invalid name");
        }
//ex8
        String stateAbbreviation = "ny";

        if (stateAbbreviation.length() > 2) {
            System.out.println("state abbreviation cannot have more than 2 charachters");
        } else if (stateAbbreviation.equals(stateAbbreviation.toLowerCase())) {
            System.out.println("state abbreviations cannot have lower case");
        }else if(stateAbbreviation.replaceAll("[a-zA-Z]","").length()>0){
            System.out.println("state abbreviations cannot ahve charachters different from letters");
        }
        System.out.println("body mass index example");
        //ex9
        //kolay
        //ex10
        double bmi =29.9;
        if(bmi<0){
            System.out.println("invalid bmi value");
        } else if (bmi<18.5) {
            System.out.println("underweight");
        } else if (bmi>=18.5 && bmi<25) {
            System.out.println("normal weight");
        } else if (bmi>=25 && bmi<30) {
            System.out.println("overweight");
        } else if (bmi>=30) {
            System.out.println("obesity");
        }


    }

}

