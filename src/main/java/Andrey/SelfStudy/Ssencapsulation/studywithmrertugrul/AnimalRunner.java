package Andrey.SelfStudy.Ssencapsulation.studywithmrertugrul;

/*
       if u want to nevigate amoung constructors in classes related inheritance
       this() calls the presents class const
       super() calls the parent class constructor
       *******
       this.age >>this without () >>calls age of existing class variable
       super.age >> super without () >>calss parent class variable
                                                   remember this and super are key word work in constructions
 */
public class AnimalRunner {
    public static void main(String[] args) {
        //data type  object  = new  conts
           Cat        myCat1 =  new    Cat();
               System.out.println(myCat1.name);
               myCat1.drink();
        System.out.println("&&&&&&&&&&");
          Mammal   myCat2=  new    Cat();
                  System.out.println(myCat2.name);
                   myCat2.drink();   //Mammal drinks  , Animal class also has drink cont but myCat2 use MAMMAL CLASS DRINK METHOD
        System.out.println("************");
          Animal   myCat3=   new    Cat(false);   //1 animals do not speak   2 mammals with 4 legs walking   3  cat eat meat
                  //   myCat3.breath();
    //      Cat cat1= new Cat()
        System.out.println("$$$$$$$$$$");
        Mammal mammal2= new Mammal();
        mammal2.drink();    //Mammal drinks
        System.out.println("(((((((((((((((((");
       // in method call, construction part is important, look at last key word ********************************************************************
        Animal myCat4= new Mammal();
       myCat4.drink();   // Mammal drink...
        myCat4.breath();// every animal breats     there is no breath()method in the MAammals then java goes parent class conts


    }

}
