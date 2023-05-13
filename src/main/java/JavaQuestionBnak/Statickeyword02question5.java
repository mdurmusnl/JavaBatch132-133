package JavaQuestionBnak;

import org.w3c.dom.css.Counter;

import java.sql.SQLOutput;

class Statickeyword02question5 {
    int count =0;   // staticdegil   degisiklik gozlemlenemiyor

     Statickeyword02question5() {
        count+=2;
         System.out.println(count);
    }

    String name;
    static String college="UNF";

    Statickeyword02question5(String n, String college) {
        this.name = n;
        this.college=college;
    }

    public static void main(String[] args) {
        Statickeyword02question5 s1= new Statickeyword02question5("Mark","UCF");
        Statickeyword02question5 s2= new Statickeyword02question5("kevin","FIU");
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.college);
        System.out.println(s2.college);
        System.out.println("ex6");
        Statickeyword02question5 c1= new Statickeyword02question5();  //2
        Statickeyword02question5 c2= new Statickeyword02question5(); //2
        Statickeyword02question5 c3= new Statickeyword02question5();  //2

    }
}
