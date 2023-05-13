package JavaQuestionBnak;

import javax.swing.*;
import java.sql.SQLOutput;

public class StringMnaipulations {
    public static void main(String[] args) {
       //ex1
        String cityName= "  mIAMI";
        String updatedCityName= cityName.trim().toLowerCase();  //miami
                   //bu parca ilk farfi alir yani  m  sonra buyuk harf yapar    bu parca ise 1.indexten itibaren kismi yazdirir
        updatedCityName= updatedCityName.substring(0,1).toUpperCase()+updatedCityName.substring(1);
        System.out.println(updatedCityName);
        System.out.println("*******************");

        //ex2
        String name1= "Ali Can";
        int n1= name1.replaceAll(" ","").length();
        System.out.println(n1);

          String name2= "Aliye Canan";
         int n2= name2.replaceAll(" ","").length();
        System.out.println(n1+n2);
//ex3
        String s= "  Miami33018!!! ";
        int s1= s.trim().replaceAll("[^a-zA-Z0-9]","").length();
        System.out.println(s1);
        //ex 4
        String  a= "2a3B4?-!5";
        int a1= a.replaceAll("[0-9]","").length();
        System.out.println(a1);
        //ex5
        String z= "Miami   ";
        String z3= z.trim();
        String z2= z3.substring(z3.length()-1,z3.length());
        System.out.println(z2);
        //ex6
        String w= "Miami";
        int w1= w.charAt(0);
        int w2= w.charAt(w.length()-1);
        System.out.println(w1+w2);

        //ex7
        String e= "Java";
        String e1 =e.substring(1,e.length());   //  1dahil  uzunluk sayisinin indexi olan sayi  dahil dehil
        System.out.println(e1);   //ava
        String e2= e.substring(1);//1.indexten itibaren yazdirir
        System.out.println(e2);  //ava
//ex8
        String r= "Java";
        String r1= r.substring(0,r.length()-1);  //son karakteri yazdirmiyor  cunku bu methoddaki ust sinir exculuded
        System.out.println(r1);
        //ex9
        String t= "Java";
        String t1= t.substring(1,t.length()-1).toUpperCase();
        System.out.println(t1);
     //   ex10
       String v= "Tom Hanks";
       String v1= v.trim();
       String v2=v.replaceAll("[a-zA-Z0-9]","");
       String v3= v2.replaceAll("\\p{Punct}",""); //removes punctuations
       boolean isV= v3.length()==1;
        System.out.println("is "+v+ " has single space characher?"+ ""+isV);
//Ex11
        String b = " Tom ";
        boolean b1= b.trim().length()==b.length();
        System.out.println(b1);

        //ex12
        String n= "Tom Hanks.";
        char inital= n.charAt(0);
        char lastLetter = n.charAt(n.length()-1);
        boolean n11= (inital>='A' && lastLetter=='.');
        System.out.println(n11);
//ex13
      String  pwd = "!1a23b4?es";
      //1st condition = non space 8 charachters
        String pwd1=pwd.replaceAll(" ","");
String pwd2=pwd1.replaceAll("[a-zA-Z0-9]","");
        boolean pwd3=(pwd1.length()>7 && pwd2.length()>0);
        System.out.println(pwd3);

        //kendi ornegim   *********************************************
        String mm= "hasan can   kemal";
        String mm1= mm.replaceAll("\\s",""); //tum spaceleri siliyor
        System.out.println(mm1);
        //ex 14
        String p= "Java";
        boolean p1=p.contains("v");
        System.out.println(p1);
        //2nd wayy
        boolean p2=p.indexOf("v")!=-1;
        System.out.println(p2);
//ex15
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";
        String  sp= shirtPrice.replaceAll("[$]","");
        String bp= bookPrice.replaceAll("[$]","");
        System.out.println("$ sembolsuz"+sp);
        double x= Double.valueOf(sp);  //string degeri double deger e ceviriyor
        System.out.println("cost of bookas a double data"+x);
        double y= Double.valueOf(bp);
      System.out.println("total price is" +" " + " " +(int)(x+y));

      //ex16
        String name16= "Tom hanks";  //  TH
        String aa=name16.substring(0,1).toUpperCase();  // 0. index yani ilk harf
        int qq=name16.indexOf(" ")+1;  //ikinci bosluktn sonraki ilk harfin indexini buluyor harika ************
       String qq1=name16.substring(qq,qq+1).toUpperCase();   //ikinci ismin ilk harfi
        System.out.println(aa+qq1);
        //2ns way ******acayip onemli  kelime kelime ayirma****************
        String name17= "Tom Hanks ";
        String n17= name17.substring(0,1);  //  metrinn 0.indexteki harfi  =ilk harf
        String  n18= name17.split(" ")[1].substring(0,1).toUpperCase();  //1.indexteki kelimenin 0. indexteki harfi= ikinci kelimenin ilk harfi
        System.out.println(n17+n18);
        //ex17
        String s11= "Wow! Ali is 13 years old but he is a universty student.";
        String s12= s11.replaceAll("\\s",""); //tum spaceleri siliyor
        int s13= s12.replaceAll("[a-zA-Z0-9]","").length();
        System.out.println(s13);





































































    }
}
