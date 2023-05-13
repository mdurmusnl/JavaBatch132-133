package Batch132.JavaTeachingB132mrSuleyman.day21Inheritance;

public class FierroRunnerExercise {
    public static void main(String[] args) {
   //  Data type  name of object        constructor
       Cat       myCat          =    new Cat();

        System.out.println(myCat.initial);//??

        System.out.println(myCat.age);//

        Animal cat1= new Cat();
        System.out.println(cat1.age);


        Mammal cat2 = new Mammal();
        System.out.println(cat2.age);



        Cat cat3= new Cat();
        System.out.println(cat3.age);


        Civic myCivic=new Civic();


        myCivic.move();




        myCivic.engine();
        myCivic.ecoSystem();




        Civic myCivic2=new Civic(true);


    }
}
