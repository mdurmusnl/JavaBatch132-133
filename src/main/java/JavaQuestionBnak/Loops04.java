package JavaQuestionBnak;
//ex 17  page 207
public class Loops04 {
    public static void main(String[] args) {
        /*  ex 17
        Type code to find the sum of the digits in an integer
         */
        int num = -753;
        num=Math.abs(num);
        String numS= String.valueOf(num);
        int sum= 0;
        for(int i=num;i>0;i=i/10){    //    i>=0   yazarsan sonsuz dongu olusur
            sum+=i%10;
        }
        System.out.println(sum);
        System.out.println();
        System.out.println("ex17 with while loop");
        int q= -754;
        q=Math.abs(q);
        int summ= 0;
        int i=q;
        while (i>0){
            summ+=i%10;
            i=i/10;
        }
        System.out.println(summ);
        System.out.println();
        /*   ex 18
        Type code to print unique characters in a String. For example; Hello ==> Heo
         */
String s= "Hello";
for(int j =0;j<s.length();j++){
    char ch= s.charAt(j);
    if(s.indexOf(ch)==s.lastIndexOf(ch)){
        System.out.print(ch);
    }
}
        System.out.println();
        System.out.println("2ns d way ");
        String ss= "Hello";
String a="";
        int z=0;
        while (z<ss.length()){
            String ch=ss.substring(z,z+1);
            if(ss.indexOf(ch)==ss.lastIndexOf(ch)){
            a+=ch;
            }
            z++;
        }
        System.out.println(a);
/*   ex 19
Find the total number of characters different from space and punctuation marks in a String
 */
String qq= "Java is a sttong typed, objected-orientedprogramming language.";
qq=qq.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(qq.length());;
        System.out.println();
//ex20   Type code to draw the following image by using a for loop.
  //* * * * * *
  //* * * * *
  //* * * *
  //* * *
  //*
// *
        System.out.println("first way");
  int row =6;
        for(int k =row;k>=1;k--){
            for(int j=k;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2nd way of ex20");
        int term=6;
        String str="";
        for(int k=1;k<=term;k++){
            for(int j=term;j>=k;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
  /*
  my example
*
**
***
****
*****
******

   */

int rows= 6;
    for(int k =1;k<=rows;k++){
        for(int j=k;j>=1;j--){
            System.out.print("*");

        }
        System.out.println();
    }
        System.out.println("^^^^^^^^^^^^");
/*
Type code to find the sum of the unique digits of an integer
Example: 12133455 ==> 2+4=6
 */
int p = 12133455;
String strP=String.valueOf(p);  //  "12133455"
int summm=0;
for(int k=0;k<strP.length();k++){
    String ch= strP.substring(k,k+1);
    if(strP.indexOf(ch)==strP.lastIndexOf(ch)){
        summm+=Integer.valueOf(ch);
    }
}
        System.out.println(summm);
        System.out.println("$$$$$$$$$$$$$$$$$$$");
/*
ex22    type a code to print intehers from 3 t o9 except 5
 */
for(int y= 3;y<10;y++){
    if(y==5){
        continue;
    }else{
        System.out.print(y+" ");
    }
}



    }
}
