package Andrey.SelfStudy.Ssoverriding;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("dogs bite");
    }
}
