package JavaQuestionBnak;
// page 37
import java.sql.SQLOutput;

public class StringMethodscoktansecmelisorular {
    public static void main(String[] args) {
        String  str = "Hello World";
        System.out.println(str.length()>str.charAt(6));


        System.out.println(str.length());   //11
        System.out.println(str.charAt(6));  //w =87 ascii
        int a= 'W';
        System.out.println(a);
        System.out.println(str.charAt(2)==str.charAt(9));  //true

        String s= "Hello World";
        Boolean isS=s.contains("E");
        System.out.println(isS);
        System.out.println("**********");
        String q= "Java";
        System.out.println(q.replace('a','i'));  //Jivi
        String qq= "Learn Java earn money";
        System.out.println(qq.replace("earn","?")); //L? Java ? money
      //  bu hatali bir ifade    System.out.println(qq.replace('Larn','?'));   // 'Learn'   hata    bu bir char degil
        String aa= "Teach more learn more";
        System.out.println(aa.replace("more","less"));

        String ss= "Java";
        System.out.println(ss.replace("","/"));  // ==>  /J/a/v/a/
         for(int i=0;i<ss.length();i++){
             System.out.print(ss.charAt(i)+"///");   //J///a///v///a///

         }
        System.out.println();
        System.out.println(ss.replace("a",""));
        System.out.println("$$$$$");
        System.out.println(ss.startsWith("J"));  //TRUE
        System.out.println(ss.startsWith("Ja"));    //true
        System.out.println(ss.startsWith("ja"));   //false     java is case sensitive+
        System.out.println("******************");
        String d= "Thank You";
        System.out.println(d.startsWith("h",1));   //true
        //  System.out.println(d.startsWith(4,"k"));   compile time error
        System.out.println(d.indexOf("Yo"));
        System.out.println(d.indexOf("t"));   //-1   yok
        System.out.println(d.indexOf('h'));   //1
        System.out.println(d.indexOf("Thank"));  // 0
        System.out.println("^^^^^^^^^");
        String f= "Java is Java";
        System.out.println(f.indexOf('a',4));   //  9
        System.out.println(f.indexOf("va",2));   //2
        System.out.println(f.lastIndexOf('v')); //10
        System.out.println("&&&&&&&&&&&&&&&");
        String ww= "Learn";
        String rr= "Java";
        System.out.println(ww+rr.length());   //Learn4
        System.out.println("");
        String c = "Canan Can";
        System.out.println(c.startsWith("a",3));  //3.index a ile basliyor demek   ==>true
        System.out.println("!!!!!!!!!!!");
        String b= "Java is easy";
        System.out.println(b.substring(5)); //5.indexten itibaren yaz
        System.out.println(b.substring(5,9));   //5.indexten basla yaz 9.index yok
        System.out.println(b.substring(8,8));
        System.out.println("&&&&&");
        String n= "Ayhan BEYHAN";
        String n1= n.substring(0,5).toUpperCase();  //AYHAN
        String n2 = n.substring(6).toLowerCase();//beyhan

        System.out.println(n1+n2);

    }
}
