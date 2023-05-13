package Batch132.JavaTeachingB132mrSuleyman.day07ifstatementternarystatement;

public class Personalstudy {
    int a= 12;
    public static void main(String[] args) {
      ;

         Personalstudy obj= new Personalstudy();
        System.out.println(obj.convert(20)+obj.a);
        System.out.println(obj.myMethod('A','b'));
    }
    public double convert (double mile){
        return mile*1.6;
    }
    public int myMethod (char c1, char c2){
        return c1+c2;
    }
}
