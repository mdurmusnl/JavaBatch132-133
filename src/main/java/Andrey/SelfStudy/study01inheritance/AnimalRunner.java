package Andrey.SelfStudy.study01inheritance;

public class AnimalRunner {
    public static void main(String[] args) {
        //when we wanna call a varible with inferitance   focus on first key word
        Animal cat1= new Cat();
             System.out.println(cat1.age);   //age=4  as a variable of Animal class
        Mammal cat2= new Cat();
        System.out.println(cat2.age); // age=6   variable of Mammal clas
        Cat cat3= new Cat();
        System.out.println(cat3.age); //age=14   variavle of cat class
        //   *** whgen u call cont  please focus on last key word   thats the const
        Animal mammal1=new Mammal();
        mammal1.drink();// this calls method in Mmammals class  >> Mammal drink...
        // mammal1.age; >>= Animal class age variable

    }
}
