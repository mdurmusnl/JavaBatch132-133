package Batch132.JavaTeachingB132mrSuleyman.day08ternary_switch;

public class NestedTernary01 {
    public static void main(String[] args) {
          /*
            Type java code by using nested ternary.
            Write a program to check if a year is "leap year" or not.
            i)If the year is divisible by 100 then it must be divisible by 400.==>1600+   1800-
            ii)If a year is not divisible by 100 then it must be divisible by 4.==>2004+  1997-
        */
        int year = 1904;
        String result = (year % 100 == 0) ? ((year % 400 == 0) ? ("leap year") : ("not leap year")) : ((year % 4 == 0) ? ("leap") : ("not leap"));

//ex5
         /*
            Type code to check the password
            If it has more than 8 characters, initial should be 'i'
            If it has no more than 8 characters initial should be 'K'
            Solve the task by using nested-ternary
        */
        String pwd2 = "ia1b3c";
        String r2= (pwd2.length()>8)?(pwd2.startsWith("i")?("valid"):("invalid")):((pwd2.startsWith("K")?("valid"):("invalid")));
        System.out.println(r2);


    }
}