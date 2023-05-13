package Batch132.JavaTeachingB132mrSuleyman.day23EncapsulationAbstraction;
//a method withoud body is called abstract  for ex    public void eat();   thats it
//  abstract = no code in the method body
public class Cat extends Animal{


    @Override
    public void eat() {  //since its an implementation of abstract method
                         // the method body is mety as u see and u can fill
        System.out.println("cats eat");  //after implementation we did typed
    }
}
