package Batch132.JavaTeachingB132mrSuleyman.day09forloops;

/*
*********************  in coding standart repeation is not smart and not recommended
     i=i+3;     and   i+=3;   are both same but second code has no repetation          m=m/6  yerine   m/=6; yaz

 */
public class ForLoop01 {
    public static void main(String[] args) {
        //ex   type all integers from 11 to 44 in the same Line with a space between consecutive integers
        //    11 12 13 14.....44
        for(int i=11; i<45;i++){
            System.out.print(i+" ");
        }

        //ex2   type even integers from 11 to 44 in the same line between spaces
        System.out.println("*************");
        for(int i= 11;i<45;i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
            System.out.println("^^^^^^^^^^^^^");
           //ex type odd integers from 68 to 13 in the same line with a space bewtween consecutive integers
            for(int i=68;i>12;i--){
                if(i%2!=0){
                    System.out.print(i+" ");
                }
            }
        System.out.println("*************");
            //ex  type a code to print the letters from 'c'  to  'u'
        //c  ,d, e, f ..... u
        for (char i='c' ; i<'v';i++){
            System.out.print(i+" ");
        }
// ex    type a code to print integers from 0 to 100 without using any number in your code
        System.out.println();
        for (int i='a'-'a'; i<'e';i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int a= 'e';  //101   *********  cok onemli
        char a1= 'e';   // e
        System.out.println(a);  //101
        System.out.println(a1);//  e

        // we can use int as data type char data

    }
}
