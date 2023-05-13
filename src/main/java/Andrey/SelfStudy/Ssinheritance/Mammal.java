package Andrey.SelfStudy.Ssinheritance;

public class Mammal extends Animal {
    public String name="rasha";
    public void drink(){
        System.out.println("Mammals drink..");
    }


    public Mammal() {
        super();
        System.out.println("Mammal class constructor works..");
    }
    public Mammal(int age){
        this();
        System.out.println("a mammal has an age");
    }
}
