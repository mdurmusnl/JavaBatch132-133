package Andrey.SelfStudy.Ssencapsulation.studywithmrertugrul;

public class Mammal extends Animal{
    public int age=20;
    public String name="mustafa";
    public boolean isPrime=true;
    public Mammal(){   //default construction
        super(); //go to Animal class conts
        System.out.println("hey this is Mammal class non parameter construction ");
    }
    public void drink(){    //method
        System.out.println("Mammals drink...");
    }
    public Mammal(int legs){
        super(false);
        System.out.println("mammals with 4 legs walking");
    }
}
