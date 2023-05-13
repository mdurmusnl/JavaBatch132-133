package Batch132.JavaTeachingB132mrSuleyman.day23EncapsulationAbstraction;

public abstract class Animal {
     /*
    1  sometime we do not need method to specify the action  we just that action to be done in any way the object wants
    a method with no method body is " abstract method"    ex   public void eat();   thats it   ***
    2  a regular method is with a method body its called " concrete method"   it means  concrete method= method with body
    3  concrete method focus on " how to do"   abstract method focus on " what to do"   ***
    4  the functionalityof the abstract class(action) is mendetory for child class to implement
                               ex>>   car class has abstract method as engine    then honda must have an engine   civic must have an engine
    5  if a function is not mendetory then type it as a concrete method
    6 to make a method abstract
           i) remove method body
           ii) use abstract key word access modifier and return type
           iii)  change the concrete class to abstract class  by using abstract key word
        note ; after creating abstract method then child concrete  class must implement it  must
        *** if u dont want a child class to implement the abstract method then make the concrete child class as abstract class
     7  if child class is an concrete class then abstract method of parent class must be implemented
        if chill class is abstract class then abstract method of parent is is not must to implement    its optional  if u need  then u re free to implement
     8   ***  in an abstract class , concrete method and abstract methdos are both possible to type
        a concrete method in an abstract class is not must to be implemented
    9  final abstract method is not possible  bcs final means con not be apdated  ,can not be orridden but
    abstract means update it implement it
    finalmethod body must have constant method body, but in abstraction, every child class will use abstract method with a different way(UPDATE)
     10  final abstract class is not possible    bcs     we create abstract class for child class to implement it
         but final class must remain as it is
              so abstract class can not be final
    11   Abstract class has abstract methos which are incomplete method(no method body)   so that can createtion by abstract class causes isssue
         so java doesnt let  object creation by an abstract class
    12  every class has a default constructor ,abstract class is also a class so   abstract class also has a default constructor
                but abstract class contructor is blocked by java to prevent object creation
    13   private access modi  fier for an abstract method is not possible  bcs we create abstract method to implement it, child clss must have access and implement it
    14  an abstract method can not be static    bcs  static atteched to class  but we create abstact method for objects to implement (  i didnt understand much)
     */
    public abstract void eat();
    public final  void drink(){
        System.out.println("drink water");
    }
}
