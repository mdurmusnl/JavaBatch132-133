package Andrey.SelfStudy.Ssoverriding;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat myCat= new Cat();
        myCat.eat();   // cat animal
        Dog d1= new Dog(); //Animal eat
        d1.eat();  // Animal eat
        Animal mycat =new Cat();
        myCat.eat();  // cat eat
        Animal myCat3=new Cat();
        System.out.println(myCat3.claw);
    }
}
