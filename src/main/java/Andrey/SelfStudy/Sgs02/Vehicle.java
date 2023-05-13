package Andrey.SelfStudy.Sgs02;

public class Vehicle {
    public void move(){
        System.out.println("a vehicle moves at a speed");
    }
    public void price(){
        System.out.println("a vehicle has a price very to brand ");

    }

    public Vehicle() {
        System.out.println("vehicle default construction");
    }
    public Vehicle(String type){
        System.out.println("vehicle parameter construction is active");
    }
}
