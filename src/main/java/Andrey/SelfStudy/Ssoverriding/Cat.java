package Andrey.SelfStudy.Ssoverriding;

public class Cat extends Mammal{

    @Override
    public void eat() {
        System.out.println("cat eats");
    }


    @Override
    public Mammal create() {
        return new Cat();
    }


    public Cat occur() {
        return new Cat() ;
    }


    public Integer number() {
    return 3;
    }
}
