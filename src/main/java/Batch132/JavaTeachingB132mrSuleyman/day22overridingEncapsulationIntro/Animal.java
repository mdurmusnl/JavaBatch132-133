package Batch132.JavaTeachingB132mrSuleyman.day22overridingEncapsulationIntro;

public class Animal {
    /*   overriding= updasting method body, do not touch method signature(method name and method parameters)
    1 we may need to specify an inherited method in the time of we inherit a parent method,
    we dont touch method name and method parameters  (those are called method signature)  we just update the method code blog
    2  the method in parent is alled overridden methods , the method in child class is called overriding method
    3 the chil class overriding method can not have narrover acceess modifier , ex: parent class is public and child class has  protected access mdf is not possible
       child class access modifier can have same or wider access modifier compare to parent class method access modifier
       this is possible    parent class method has protected   chiuld class is protecter or wider like public access modifier
       smt like child can nor restrict the parent  and      parent is suppose to be more free
       4 the method in child class (overriding method) can have same  or wider access modifier than method in parent class
       5  if there is (IS A) relation in overriding  we can change the return type
       *** impoetant detail
       6  in return type changing there must be IS A  relation   for example   IF parent class is Mammal  then  child class return type can be Cat or Mammal at most
      if there is  (IS A) relation between return types of overrided methods then those return types are called as " Covariant Return Types"
      cat and Mammals are covariant return vtypes    Mammal and Animal are covariant return types
if there is no IS A relation u can not change return type in override
  if return types are not covariant then u cant  chance return types
  7  if the return type is void  then there  is no chance in that return type
   8 private method in parent class can not be overrridden   bcs child can notr see and can not override
   9 static method can not be overrided  bcs its for eveyone.    a child clss override it then the uptade is valide for any other all child and so dangerous such a big update which is belong to everyone
   10  ***  final key word
 A  final keu word can be used for variables
   i)    you have to initialize the variable, initialize mean assign a value at the begiinig and never change
   ii) after assigning a value you can not update the value
B  final key word can be used for clasess,  if a calss is defin ed as final then it can not have child class
    final key word is possible to use for method but final method can not be overridden (override means update)
    ***************  important   *******
       main method is also not possible to override bc its also static
what is the difference between method overloading and method overriding
    1  method overriding needs inheritance (no inheritance then chil class can not inherite and cn not use , override is inherit it and update it )
    2  method overloading occurs in a single class no need inhetitance  its not update   its like giving another task by modifing the parameters  under the same method name)
    3  private methods can not be overridden but can be overloaded
    4  we dont touch "method signiture" in method overriding  but  we do change the paramter tpyes in method overloading
    5  we can not override static method  but we can overload static method   bcs   in override we dont touch method signiture  and we touch method signitore in overloading, method overloading makes method totaly smt else
    6   ***  other name of "Method Overloading" is  "static polymorphism"
    7  *** other name of " Method Overriding"  is  " dynamic polymophism"
        ***  other name of "Method Overloading" is  "compile time polymorphism"   bcs when u have a typing mistake intelij notify u there is a mistake
        *** other name of " Method Overriding"  is  " run time polymophism"   bcs  when u have a mistake intelih do not notify
  more explation   if there is no @ overriding anotation  thne java doesnt check overriding rulus during the complie time

       polymophisim = method overloading +method overriding
     */
    public final int age=12;
    public void eat(){  //overridden method
        System.out.println("animal eat" );
    }
    public Animal create(){  // *** attention  Animal is like  String  is a classd and is a data type    it must retunr an animal object
       return new Animal();
    }
    public Integer number(){
        return 123;
    }
    public int num(){
        return 12;
    }

}
