package Batch132.JavaTeachingB132mrSuleyman.day21Inheritance;

public class Honda extends Vehicle {
    public void engine(){
        System.out.println("honda uses long lasting strong engine ");
    }
    public void brake(){
        System.out.println("honda has strong ABS brake system");
    }

    public Honda() {
        super();  // optional    if u type or not it exist in here    must be at the fist line  mustttttt
        System.out.println("Honda constructor");
    }
    public Honda (int year){
        super("Luxury Honda");  //it means go to parent and find the paramete contst and run it in this way "Luxury Honda"
        System.out.println("honda constructor with a string parameter ");
    }
}
