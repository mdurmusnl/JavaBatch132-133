package Batch132.JavaTeachingB132mrSuleyman.day22overridingEncapsulationIntro;
/*
in overriding we dont change the name of construtor of we dont change the parameters   we jsut apdate the code blog
 */
public class AnimalRunner {
    public static void main(String[] args) {
        Cat myCat =new Cat();
        myCat.eat();  //there is no eat method in cat class , we inherit from animal class and we specify into our object

    }

}
