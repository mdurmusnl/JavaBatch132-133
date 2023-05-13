package Andrey.SelfStudy.Ssencapsulation.studywithmrertugrul;

public class Cat extends Mammal{
    public int age=2;
    public String name="Ertufrul";
    public boolean isPrime=false;
    public Cat(){//default construction
         super(4);//go upper claqss conts
       // System.out.println("hey this is cat class non parameter construction ");
        System.out.println(this.age);//2
        System.out.println(super.name);// mustafa  parant class name varibale
    }
    public void meow(){
        System.out.println("cats meow ...");
    }
    public Cat (boolean meat){
        this();
        System.out.println(" cat eat meat");
    }
}
