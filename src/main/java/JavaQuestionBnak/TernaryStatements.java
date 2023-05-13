package JavaQuestionBnak;

public class TernaryStatements {
    public static void main(String[] args) {
        //   String result=num%2==0 ? "even":"odd";    ornekkkkk
        //ex1
        String s= "ac3ds7  ?as  ";
                                                                             //true            //false
        String  result= s.replaceAll("\\s","").length()>7 ? "valid password" : "invalid password";
        System.out.println(result);

   //ex2   *guzel soru****
   int a=5,b=4,c=3;
   //asagidaki kod doyor ki ilk soru dogru ise isosceles degilse ise diger soruys gec    diger soru dogru ise yanidaki cumle dogeu degilse diger cumle
   String result2= (a==b && a!=c)||(a==c&& a!=b)||(b==c&& b!=a) ? "isosceles tringle " : (a==b&&a==c) ? "equilateral triangle" :"neither isosceles nor equilateral";
        System.out.println(result2);

//ex3
        int i= 128;
        String result3= (i%10>=5)? ("round up"+(i/10+1)*10): ("round down"+(i/10)*10);
        System.out.println(result3);

        //ex4
        int year =1903;
        //ilk ana soru dogru ise ilk buyuk parantez degilse ikinci buyuk parantez    her parantez icinde yine ternary var
        String isLeap= (year%100==0) ? ((year%400==0)? "Leap" : "not leap"):((year%4==0)? "leap":"not leap");
        System.out.println(isLeap);
//ex5
        String q= "iggggde42A ?";
        String isQ= (q.length()>8)? (q.startsWith("i")? "valid" : "invalid"):((q.startsWith("K")? "valid" :"invalid"));
        // yukardaki kod diyor ki ilk cumledeki soru yani ana condtion dogri ise buyuk parnateze gir   buyuk parnatezdeki condtion dogru ise ilk string dogru degilse ikinxi string
        //ilk ana condtion yanlis ise ikinci buyuk parnateze gir  ordaki condtiona bak  falan
        System.out.println(isQ);

        //ex6
        int z= -14;
        int isZ= (z<0)? (-1*z):(z);
        System.out.println("the avsolute value of "+ z+" is"+" "+ isZ);
        //ex7
        int m= 12, n= 13;
        int isMin=(m>n)? (n):(m);
        System.out.println(isMin);
        //ex8
        int w= -750;
        String  isThreeDigits= (Math.abs(w)>99 || Math.abs(w)<1000)?("three digit number"):("is not three digits number");
        System.out.println(isThreeDigits);

//ex9
        int r= 12;
        String isR= (r%2==0)?("even"):("odd");
        System.out.println(isR);

        //ex10
        int y= 12;
        String isY= (y>0)?("positive"):("not postive");

    }
}
