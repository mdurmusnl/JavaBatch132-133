package Batch132.JavaTeachingB132mrSuleyman.day24Interface2022;
//ABSTRACT class is not fully abstract, it contains concrete and abstract methods both
// interface is a fully abstract,  its not a class   it has no nonstructor  it doesnt create an object
public interface Ac extends BigAc{
    /*
    1) all interface can not have " concrete method"
    2) all methods in an interface are public and abstract as default, u can type abstract key word or not   optional its already defined as abstract since its an interface
         in other wors; in interface, if u type public and abstract or not its is set as default and it exist  better do not declare
         ex   public abstract void digital()  as same as void digital()
    3)  if parent interfaces have methods with same name, overriding just one of them will be enough
    4)  parent interfaces can not have methods with same name and differet nreturn type,   in that case java gives compile time error
     5) variables in interfaces are static as default, so we can access the variable by using the Interface name
     6) when u call a variable from an inteface then call it by usuing the interface name
     7)   in normal coding standards, concrete methods are not allowed in an in terface but  java allows chance to create concrete method in two ways
          i- use " default"  key word     ii- use "static" key word
     8)    ***
           i)  a class extends   another class( inheritance)
          ii)  an interface extends another interface (abstraction)
          iii) a class implements an interface(abstraction)
           an interface can not be child of a normal class      an interface do not implement or extends a normal class
           an interface can have just an interface parent
     9)  an interface may have " public" or "default " access modifier   as same as classes
     10 )  when u create an object u can select any parent as a data type  , cat, Mammal,Animal,object
     */

    void digital();

    public int price =2300;   //public and static as default   its like a moon
    String name ="Perfect AC";  //its public and static as default
    public default int calculate (){  // a concrete method in an interface with "default" key word
        return 1200;
    }
   static boolean climate(){
        return true;
   }
}
