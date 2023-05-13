package Batch132.JavaTeachingB132mrSuleyman.day17MethodOverloading;

public class MethodCreation {
    public static void main(String[] args) {
        int sum=addTwoINt(5,7);    //5 and 7 are called arguments   real datas
        System.out.println(sum);  //12
 String A= getFirstLastChar("selam");
        System.out.println(A);  //  sm
/*myownself study note
        String w="demal";
        int a=w.charAt(0);   //a=100
        char aa=w.charAt(0);   //  aa=d
      String aaa=""+w.charAt(0);   //aaa= d
  */
    int aqz= getSumOfAsciisOfAllChar("Ajda");
        System.out.println(aqz);  //368



    }
    //ex1   create a method that adds tto int
    public static int addTwoINt(int a,int b){   //a and b are called parameters
        return a+b;
    }
    //ex2   create a method to print the first and the last character of a string
    public static String  getFirstLastChar(String  s){
       return s.substring(0,1)+ s.substring(s.length()-1,s.length());
    //  String result= ""+ s.charAt(0)+s.charAt(s.length()-1);   // *** char+char  is not concatination  its ascci value addition  ****8
       // return result;                                                        // thats why we did ""+
    }
    //ex3  create a method prints the sum of the ascii values of charachters in a string    ????  for each ile dene

   public static int getSumOfAsciisOfAllChar(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i);
        }
        return sum;
    }
}
