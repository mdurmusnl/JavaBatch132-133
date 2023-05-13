package Andrey.SelfStudy.sgs03;

public class Car {
    public void move(){
        System.out.println("a car moves");
    }
    public void price(){
        System.out.println("a car costs a price");
    }
    public Car(){
        System.out.println("car class default const");
    }
    public Car(String name){
        System.out.println("car class parameter const");
    }
}
