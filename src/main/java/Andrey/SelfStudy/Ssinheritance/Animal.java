package Andrey.SelfStudy.Ssinheritance;

public class Animal {
    public String COLOR="BLUE";
    public void eat(){
        System.out.println("Animal eat...");
    }

    public Animal() {
        super();
        System.out.println("Animal class constructor works..");
    }
    public Animal(String color){
        System.out.println("an animal has a color");
    }
}
