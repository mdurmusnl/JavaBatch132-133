package JavaPrcatice.abstraction;

public class Runner {
    // type a code to calculate the area of a rectangle and a triangle(use abstraction)
    public static void main(String[] args) {
        Triangle t1= new Triangle();
        System.out.println(t1.calculateArea(4,6));//12
        Rectangle r1= new Rectangle();
        System.out.println(r1.calculateArea(4,6));//24


    }
}
