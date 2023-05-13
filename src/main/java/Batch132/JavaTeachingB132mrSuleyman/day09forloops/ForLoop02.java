package Batch132.JavaTeachingB132mrSuleyman.day09forloops;

public class ForLoop02 {
    public static void main(String[] args) {
        //ex 1    put * between 2 consecutive characters and to the end ina string
        //for example  Java ==> J*a*v*a*
        char ch = 109;  //  'm'
        int number = 'm';   //109
        String s = "Java";
        String b = "";
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + "*");

        }
        //ex   type code tp print unique characters in a stirng
        // Hello ==> H e o
        String t = "Hello";

        //t.indexOf(t.charAt(i) = i. inci indexteki harfin ilk gorunme indeksini soyler
        //t.lastIndexOf(t.charAt(i))  = i. inci indekteki karakterin son gorundugu indexi soyler
        for (int i = 0; i<t.length();i++){
            char chr= t.charAt(i);  //i. indekteki karakteri
            if( t.indexOf(ch)==t.lastIndexOf(ch)) {
                System.out.print(chr+" * ");
            }
        }
        System.out.println();
        //*****&&&&&  interview question***********************
        //ex3   type a code to print a String in reverse.
        //for example "Ali Can" ==> "naC ilA"        sonuncu karakteri aliyor  ilk harf yapiyor ssssondan basliyoruz
        String w = "Ali Can";
    for(int i= w.length()-1;i>=0;i--){
        char ch1= w.charAt(i);
        System.out.print(ch1);
    }
        System.out.println();
//ex4
        //ytpe a code to find the sum of integers from 3 to 7
        int sum=0;
        for(int i=3;i<8;i++){
            sum+=i;
        }
        System.out.print("toplam"+sum);






    }
}
