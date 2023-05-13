package Andrey.SelfStudy.Ssinheritance;

public class Cat extends Mammal {
    public int age=2;
    public void meow(){
        System.out.println("Cats meow...");
    }
    public Cat(){
        super(12);
        System.out.println("cat class contructor works..");
    }
    public Cat(String name){
        this();
        System.out.println("u can name a cat");
    }


}
