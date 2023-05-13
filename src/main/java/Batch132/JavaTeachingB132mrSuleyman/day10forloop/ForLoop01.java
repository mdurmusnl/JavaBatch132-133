package Batch132.JavaTeachingB132mrSuleyman.day10forloop;

public class ForLoop01 {
    public static void main(String[] args) {
        //ex1  type a code to calculate multiplication of integers from 3 to 6
        int product= 1;
        for(int i=3;i<7;i++){
            product*=i;
        }
        System.out.println(product);
        System.out.println();
        //ex2 type a code to find the sum of digits in a given integer
        int a= -578;
       a= Math.abs(a);
        int sum = 0;
        for(int i=a;i>0;i=i/10){     //  (i=i/10)son kisim her islemden sonra ne yapacagimiz kisim    herdefasinda on a bolucegiz
            sum=sum+i%10;

        }
        System.out.println("the sum of digits is  "+sum);
        System.out.println();
        //    *** palindrom ==>  itself and reverse are equal  ***
        //ex3    type a code to check if a string is a palindrome or not?   *** palindrom ==>  itself and reverse are equal  ***
       //1st step is to find reverse
        String s= "civic";
        String reverse ="";
        for(int i=s.length()-1;i>=0;i--){
            char ch= s.charAt(i);
            reverse=reverse+ch;
        }     //2ns step is to schect if reverse equal to itself or not
        System.out.println(reverse);
        if(s.equals(reverse)){
            System.out.println("the string  "+ s+ "  is a palindome ");
        }else {
            System.out.println("not palindrome");
        }


    }
}
