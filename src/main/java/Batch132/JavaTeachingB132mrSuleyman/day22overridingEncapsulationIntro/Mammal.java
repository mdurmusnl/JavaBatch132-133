package Batch132.JavaTeachingB132mrSuleyman.day22overridingEncapsulationIntro;

public class Mammal extends Animal{
    public void feed(){

        System.out.println("Mammal feed their babies with their milk");
    }
    public Mammal occur(){

        return new Mammal();
    }
}
