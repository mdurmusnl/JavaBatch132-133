package Batch132.JavaTeachingB132mrSuleyman.day21Inheritance;

public class Cat extends Mammal{
    public int age=14;
    public String name="A";
    public boolean old =false;
    public double x=2.3;

    public Cat() {     //conts with no parameter
     // super();
       System.out.println(this.age);//   this without paranthesis calles age in the class
        System.out.println(super.age); //super  without paranthesis calls age from the one upper class  parent class Mammal class age =6
    }
    public void meow(){   //methos with no parameter
        System.out.println("Cat meows...");
    }

}
