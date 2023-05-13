package Batch132.JavaTeachingB132mrSuleyman.day19constructoraccesmodifierstatic;

public class HondaRunner {
    public static void main(String[] args) {
       //class  object = new constructor
        Honda h1= new Honda();
        System.out.println(h1);
        System.out.println(h1.price);
        Honda h2= new Honda();

        System.out.println(h2.price);
        System.out.println(h2);
    }
}
