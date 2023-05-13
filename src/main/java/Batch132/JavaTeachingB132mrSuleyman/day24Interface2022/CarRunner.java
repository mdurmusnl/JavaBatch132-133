package Batch132.JavaTeachingB132mrSuleyman.day24Interface2022;

public class CarRunner {
    public static void main(String[] args) {
        Honda h1= new Honda();
        System.out.println(Brake.price); // 5400   price int the Brake interface
        System.out.println(Ac.name);// Perfect AC    Its the value in Ac Interface
        System.out.println(Brake.luxury);  // true
        System.out.println(h1.calculate());//1200
        System.out.println(Ac.climate()); //true
        System.out.println(Ac.price);//2300

    }
}
