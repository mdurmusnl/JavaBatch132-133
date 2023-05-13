package practices02dt;

import java.sql.SQLOutput;

public class JavaQuestionBank {
    public static void main(String[] args) {
        String cityName= "  mIAMi  ";
        String updatedCityName= cityName.trim().toLowerCase().substring(0,1).toUpperCase();
         String updatedCityName1= cityName.trim().toLowerCase().substring(1);  // her karakteri kucultup 1. indexten baslatiyor
         String updatedCityName2=  updatedCityName+updatedCityName1;
        System.out.println(updatedCityName2);
/*
        Create a short variable and convert it to an int variable.
        short age = 12;
        int newAge = age;
  */
        System.out.println("###########");
  /*wHRAPPER CLASS
        Type a code to convert “103” String to byte and to convert “2351” String to short then print
the difference on the console. */
byte first = Byte.valueOf("13");
short second = Short.valueOf("23");
System.out.println(second - first);

/*
Create 3 String variables for people's names. Print the sum of the number of characters in
all the 3 names except space characters.
Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.*/
String name1 = "Ali Can";
String name2 = "Aliye Canan";
String name3 = "Aliyev Can Cananov";
//int c1= name1.replaceAll("[^a-zA-Z]","").length();
int c1 = name1.replaceAll("\\s","").length();// harf rakam haricindeki seyler silmek istyetince   yani isretler bosluk silmek isteyince
int c2= name2.replaceAll("[^a-zA-Z]","").length();

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("@#@#@#@#@#@#");
/*
Create a String variable, print the total number of alphabetical and numeric characters in
the String on the console.
Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console
 */
        String s = " Miami 33018!!! ";
        int s1= s.trim().replaceAll("[^a-zA-Z0-9]","").length();

        System.out.println(s1);
/*
Create a String variable, print the number of non-digit characters in the String on the
console.
Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console
 */
        String sss = "2a3B4?-!5";
        int sss1 = s.replaceAll("[^0-9]","").length();
        System.out.println(sss1);
/*
Create a String variable and print just the last non-space character on the console for any
String.
Example: For ‘Ali Can’ you should print n
For ‘Miami ’ you should print i et
 */
        String ss = "Miami ";

        String ss1= ss.trim();
      //  char ss2= ss1.charAt(ss1.length()-1);
      String  aaa= ss1.substring(ss1.length()-1,ss1.length());  // bir ust saturdaki ss2 de ayni isi goruyor
        System.out.println(aaa);

        /*
        Create a String variable and find the sum of the ASCII values of the first and the last
characters of the String.
         */
        String q1= "Java";
        int q2 = q1.charAt(0);         // charArt  ascii value veriyor
       String  q3= q1.substring(0,1);// substring ise o karakteri veriyor
        int q4 = q1.charAt(q1.length()-1);
        System.out.println(q4);
        System.out.println(q2);
        System.out.println(q3);
 /*
 Example 7  page157
  */

    }
}
