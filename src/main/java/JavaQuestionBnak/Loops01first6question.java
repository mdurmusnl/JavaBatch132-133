package JavaQuestionBnak;

public class Loops01first6question {
    public static void main(String[] args) {
        //page 188
        //ex1
        //1st way with for loop and if statemnet
        for(int i=120;i>10;i--){
            if(i%4==0&&i%6==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //2ns way  with while loop
       int k=120;
        while (k>10){
          if(k%4==0&&k%6==0){
              System.out.print(k+" ");
          }
            k--;
        }
        System.out.println();
        System.out.println("do-while ile");
int j=120;
        do{
            if(j%4==0&&j%6==0){
                System.out.print(j+" ");
            }
            j--;
        }while (j>10);
        System.out.println();
        //ex2   *************advance
        //  Type code to print repeated characters in a String. For example; accessories ⇒ ces
        System.out.print("for loop ile");
        String s = "accessories";
        String d="";
        for(int i=0;i<s.length();i++){
            String ch= s.substring(i,i+1);
            if(s.indexOf(ch)!=s.lastIndexOf(ch)){
                if(!d.contains(ch)){
                    d= d+ch;
                }
            }
        }
        System.out.print("for loop ile   "+d);
        System.out.println();
        System.out.print("while loop ile");
        String s2 = "accessories";
        String d2="";
        int k2=0;
        while (k2<s2.length()){
            String ch2= s2.substring(k2,k2+1);
            if(s2.indexOf(ch2)!=s2.lastIndexOf(ch2)){
                if(!d2.contains(ch2)){
                    d2=d2+ch2;
                }
            }
            k2++;
        }
        System.out.println();
        System.out.println(d2);
        System.out.println();
        //3rd way  do-while loop
        String s3 = "accessories";
        String d3="";
        int j3=0;
        do{
            String ch3= s3.substring(j3,j3+1);
            if(s3.indexOf(ch3)!=s3.lastIndexOf(ch3)){
                if(!d3.contains(ch3)){
                    d3=d3+ch3;
                }
            }

            j3++;
        }while(j3<s3.length());
        System.out.println("do-while ile");
        System.out.println(d3);
        System.out.println();
        //ex3   *** ADVANCED  ****
      //  Type code to check whether a String is palindrome or not. If a String is the same with its
       // reverse then it is called palindrome. For example; “anna”, “123321” are palindromes
// hint if reverse and itself is equal then its palindrome
        String a= "civic";
        String reverseOfA= "";
        for(int i =a.length()-1;i>=0;i--){
            String ch= a.substring(i,i+1);
            reverseOfA=reverseOfA+ch;
        }
        if(a.equals(reverseOfA)){
            System.out.println("its palindrome");
        }else{
            System.out.println("its not");
        }
        System.out.println("***");
        String a2= "civic";
        String reverseOfA2= "";
        int y=a2.length()-1;
        while (y>=0){
            String ch2= a2.substring(y,y+1);
            reverseOfA2=reverseOfA2+ch2;
            y--;
        }
        if(a2.equals(reverseOfA2)){
            System.out.println("its palindrome");
        }else{
            System.out.println("its not");
        }
        System.out.println("&&&&&&");
        String a3= "civic";
        String reverseOfA3= "";
        int p3= a3.length()-1;
         do{
             String ch3= a3.substring(p3,p3+1);
             reverseOfA3=reverseOfA3+ch3;
             p3--;
         }while (p3>=0);
        if(a3.equals(reverseOfA3)){
            System.out.println("its palindrome");
        }else{
            System.out.println("its not");
        }
        System.out.println("ex4");
        //ex4    Type code to print the unique digits in an integer. Example; 223878 ⇒ 37
        String num= "223878";
        int sum5= 0;
        for(int i=0;i<num.length();i++){
            String ch5=num.substring(i,i+1);
            if(num.indexOf(ch5)==num.lastIndexOf(ch5)){
                sum5=sum5+Integer.valueOf(ch5);
            }
        }
        System.out.println(sum5);

        System.out.println();
        System.out.println("while loop ile");
        String num6= "223878";
        int sum6= 0;
        int h=0;
        while(h<num6.length()){
            String ch6= num6.substring(h,h+1);
            if(num6.indexOf(ch6)==num6.lastIndexOf(ch6)){
                sum6=sum6+Integer.valueOf(ch6);

            }
            h++;
        }
        System.out.println(sum6);
        System.out.println();
        System.out.println("ex 5");
        /*
        Type code to draw the following image by using a for loop.
A A A A A
A A A A A
A A A A A
         */
        int rows= 3;
        int columns=5;
        for(int i=1;i<=rows;i++){
           for(int f=1;f<=columns;f++){
                System.out.print("A");
            }
            System.out.println();   //bu ifade pointeri asagiya aliyor
        }
        System.out.println();
        System.out.println("ex5 with while loop");
       int row=3;
       int column= 5;
       int g=1;
       while(g<=row){
          String ss="";
          for(int i =1;i<=column;i++){
              ss=ss+"A";
          }
           System.out.println(ss);
           g++;
       }
        System.out.println("*****************");
       /*
       Type code to draw the following image by using a for loop.
A
A A
A A A
A A A A
attention   in each row   number of letter is equal to the thr number or row
        */
          int roww= 5;
          for(int i=1;i<=roww;i++){
              for(int jj=1;jj<=i;jj++){
                  System.out.print("A");
              }
              System.out.println();
          }
        System.out.println();
        System.out.println("ex 6 with while loop");
        int r=5;
        int ii=1;
        while(ii<=r){
            for (int jjj=1; jjj<=ii;jjj++){
                System.out.print("A");
            }
            System.out.println();
            ii++;
        }
/*
alternavie way
int rows = 4;
int i=1;
while(i<=rows){
String s = "";
for(int k=1; k<=i; k++){
s = s + "A ";
}
System.out.println(s);
i++;
}
 */








    }
}
