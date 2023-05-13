package Andrey.SelfStudy.Ssencapsulation.studywithmrertugrul;

public class Animal {
    public int age=200;
    public String name="ANDREY";
    public boolean isPrime=false;
    public Animal(){   //default construction
        super();// go to Object class
        System.out.println("hey this is Animal class non parameter construction ");
    }
    public void drink(){
        System.out.println("ANIMAL DRINK");
    }
    public void breath(){ /// non parameter method
        System.out.println("every animals breath");
    }
    public Animal(boolean speak){
        this();
        System.out.println("animals do not speak");
    }

}
