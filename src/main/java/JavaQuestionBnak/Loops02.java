package JavaQuestionBnak;
//page 196
public class Loops02 {
    public static void main(String[] args) {
        /*   ex7
        Type code to create multiplication table like
3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
         */
      int n= 3;
      for(int i =1;i<11;i++){
          System.out.print(n+"x"+i+"="+(n*i)+" ");
      }
        System.out.println();
        System.out.println("ex1 with while loop");
        int j=1;
        while(j<11){
            System.out.print(n+"x"+j+"="+(n*j)+" ");
            j++;
        }
//ex8   Type code to print odd integers from 20 to 3 in the same line with a space between two
//consecutive ones.
        for(int i =20;i>2;i--){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
//2nd way with while loop
        System.out.println();
        System.out.println("with while loop");

int k=20;
while(k>2){
    if(k%2!=0){
        System.out.print(k+" ");
    }
    k--;
}
        System.out.println();
        System.out.println("ex 8 wit do-while loop");
String s="";
int d=20;
do{
    if(d%2!=0){
        s=s+d+" ";
    }
    d--;
}while(d>2);
        System.out.print(s);
        System.out.println();
/*
Type code to print all lowercase characters in a String with an asterix.
For example; 'Ali Can?' ==> l*i*a*n*
 */
        System.out.println("lower case ex 9");
String q="Ali Can";
//q=q.replaceAll("[^a-z]]","");  //lian   bunu yazmazsan asagidaki kod isi goruyor
for(int i=0;i<q.length();i++){
    char ch=q.charAt(i);
    if(ch>='a'&&ch<='z'){
        System.out.print(ch+"*");
    }
}
        System.out.println();
        System.out.println("2nd way ex9");
//2ns wsay
        String qa="Ali Can";
        String qt="";
        qa=qa.replaceAll("[^a-z]",""); //lian
for(int i=0;i<qa.length();i++){
String qw=qa.substring(i,i+1);
qt=qt+qw+"*";
}
        System.out.println(qt);   //  l*i*a*n*
        System.out.println();
        System.out.println("ex9 with while loop");
        String z= "Ali Can";
        z=z.replaceAll("[^a-z]","");
        int v=0;
        while(v<z.length()){
            String ch=z.substring(v,v+1);
        // char =ch=z.charAt(v);    boyle de olur
            System.out.print(ch+"*");
            v++;
        }
        System.out.println();
/*
Type code to print digits just in the decimal part of the given decimal number with an
asterix. For example; 75.4238 Ş *4*2*3*8
 */
    String num="75.4238";
    int a= num.indexOf(".");  //2
        num=num.substring(a+1);  //virgulde sonrsasi   4238
       for(int i =0;i<num.length();i++){
           char ch= num.charAt(i);
           System.out.print(ch+"*");
       }
        System.out.println();
        System.out.println("ex10  with while loop with an alternative way");
        double nmm=75.4238;
        String nm=String.valueOf(nmm); //  "75.4238"
        int idxOfComma= nm.indexOf(".");  //2
        String decimalPart= nm.substring(idxOfComma+1);  // virgulden sonrasi  4238
        String t="";
        int h=0;
        while (h<decimalPart.length()){
            String tt= decimalPart.substring(h,h+1);
            t=t+tt+"*";
        h++;
        }
        System.out.println(t);
        System.out.println();

/*
Type code to reverse a String. Example; Mark ==> kraM
 */
        System.out.println("ex11 with for loop");
        String g= "Tom Hanks";
        String rev= "";
        for(int i=g.length()-1;i>=0;i--){
            char ch= g.charAt(i);
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("ex 11 with while loop");
        String gg= "Tom Hanks";
        String reverse= "";
        int kk=gg.length()-1;
        while (kk>=0){
            char ch=gg.charAt(kk);
            reverse=reverse+ch;
            kk--;
        }
        System.out.print(reverse);



    }
}
