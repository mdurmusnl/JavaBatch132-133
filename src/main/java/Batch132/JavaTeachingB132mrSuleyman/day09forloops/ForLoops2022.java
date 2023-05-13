package Batch132.JavaTeachingB132mrSuleyman.day09forloops;

public class ForLoops2022 {
    public static void main(String[] args) {
        String s= "Mustafa Durmus";
        for(int i=s.length()-1;i>=0;i--){
            char ch= s.charAt(i);
            System.out.print(ch);
        }
        System.out.println();
//better way to write in reverse    Mr. suleyman said better way
        String q= "Tom Hanks";
        String reversedName= "";
        for(int i=q.length()-1;i>=0;i--){
            char c= q.charAt(i);
            reversedName=reversedName+c;

        }
        System.out.println(reversedName);
        System.out.println("******");
//type a code to find the sum of 3 to 6
        int sum= 0;
        for(int i=3;i<7;i++){
            sum+=i;

        }
        System.out.println(sum);
        System.out.println("*************");
//ex3  type a code to find the multiplicsation of  integers from 3 to 6
        int product=1;
        for(int i = 3;i<7;i++ ){
            product*=i;
        }
        System.out.println("the product of numbers from 3 to 6 is"+product);
        System.out.println("^^^^^^^^^^");
//ex4   type a code to find the sum of the digits of an integer   *********  vey important question*********
        //first job get last digit with % 10
        //then divede num by 10  get it as a 2 digit number  after getting 2 place number then again % operation to get last digit
        //last digit % by 10 u will get last digit

        int num=  -584;
        num=Math.abs(num);
        int sumOfDigits= 0;
        for(int i=num;i>0; i=i/10  ){   // we did decrement by division
        sumOfDigits+=i%10;
        }
        System.out.println(sumOfDigits);
        System.out.println("***** loop2   ornek 1 den devam ediyoruz*********");
//loop2 sinifinda bir calismaya gecti
//ex1    type a code to print characters except "m" in a string
String str= "Andromeda";
String st= "";
for(int i=0;i<str.length();i++){
 char ch= str.charAt(i);
 if(ch!='m'){   //  diyoruz ki   ch   m  ye esit degil ise prin yap
     System.out.print(ch);
 }
}
        System.out.println("continue methodu ile");
//2ns way   // bir karakteri atlamak skip yapmak icin continue kullan
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
          if(ch=='m'){
              continue;    // anlami: eger ch ==m  olursa java o an islemi yapmiyor ve diger asamaya geciyor  skip gibi birsey yapiyor   diger karaktere incelemeye geciyor
          }
            System.out.print(ch);
        }
        System.out.println();
//ex2   type code to print characters before  m  in a string
        String city= "Luxembourg";
        for(int i= 0;i<city.length();i++ ){
            char ch= city.charAt(i);
                    if(ch=='m'){
                        break;   //diyoruz ki   karakter m  olounca islemi bitir
                    }
            System.out.print(ch);
        }





    }
}
