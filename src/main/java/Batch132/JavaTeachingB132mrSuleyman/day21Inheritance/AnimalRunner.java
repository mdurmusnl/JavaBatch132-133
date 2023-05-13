package Batch132.JavaTeachingB132mrSuleyman.day21Inheritance;
/*
           this()  calling contstuctore of existing class itself
          super()   calling constructor fron one upper level class

          this without ()  calls variable from the existing class itself
          super without () calls variables from one upper level class ,parent class
 */
public class AnimalRunner {
    public static void main(String[] args) {
        //constr works first
        Cat myCat =new Cat();  // when u create an object then the constructor runs and gives out the work inside the constr code bolg
       //  14    comes from the const
       //6   comes from the const
        System.out.println(myCat.initial); //cat class has no initial varible but object myCat can access initial by the help of inherithance
        System.out.println(myCat.age);// age of class variable 14
    //if  u want to acceess age of Mammal (parent) then go cat class and build constructor

            //***when we cretare an object first we choose the class of variable to use then a name for object then new key words to create a container in the heap then consttuctore
          Animal cat1= new Cat();  //cat1 object uses the varibles in the Animal calls             other meaning > Animal is date type
                 System.out.println(cat1.age); // age varibale in the Animal class
          Mammal cat2 = new Mammal();  ///cat2 object uses the varibles in the Mammal calls       other meaning  >  Mammal is data type
                System.out.println(cat2.age);// age varibale in the Mammal class
          Cat cat3= new Cat(); ///cat3 object uses the varibles in the Cat calls                 other meaning > Cat is data type
                System.out.println(cat3.age);  // age varibale in the Cat class
    //**** very important ******   pleasse attention****
        //when u call a method or cont please pay attention on first type  thats date type
        Animal mammal1=new Mammal();
   // in this object creation  mammal1 calls a variable in Animal class  but
        // in this object creation mammal1 calls a construction in Mammal class *******
        mammal1.drink();  //   Mammal drink... (Mammal class method)
        Animal mammal2= new Mammal();
        mammal2.eat(); // first java check the construction in Mammal class then if there is no then mammal2 is allowed to inherit the const of parent class
                       // It prints Animal eat...

    }
}
