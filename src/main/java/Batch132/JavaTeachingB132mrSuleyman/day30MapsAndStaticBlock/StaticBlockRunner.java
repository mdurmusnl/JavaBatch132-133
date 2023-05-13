package Batch132.JavaTeachingB132mrSuleyman.day30MapsAndStaticBlock;

public class StaticBlockRunner {
    public static void main(String[] args) {
        System.out.println(StaticBlock01.price);// there is a message in the static block  it is printed first then price =1000;
        StaticBlock01  obj1= new StaticBlock01(); // calls default cont
        StaticBlock01  obj2= new StaticBlock01(2022); // calls parameter const
    }
}
