package Batch132.JavaTeachingB132mrSuleyman.day21inheritanceandpolymorphismbatch2022;

public class Car {
    public static void engine(){

        System.out.println("every car has an engine");
    }
    public Car(){

        System.out.println("car class construction 1");
    }
    public Car(String engineType){

        System.out.println(engineType);
    }
}
