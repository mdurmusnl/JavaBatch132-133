package Batch132.JavaTeachingB132mrSuleyman.day21Inheritance;
/*
   1) every class except Object class has Parent class in Java
   2) Object class is the Parent class of all classes in jaava
   3) just object class has no hany parent class in java sm like prophet ADEM
   no one creates object class  java does it ok mr mustafa :)
   4) java executes constructors from top to bottom by using " super() "
   5)  super() means  call "first level parent class " (one upper level) constructors
   6) super()  exists in every constructor, not visible but you can type explicitly
   7  if u would like to type super() then type it at the top of constructor code blog
   8)  this() is for calling the class default contsructor   not up
      this() and super can not be typed together in a contst  bcs both must be typed at the top of the code blog insdie the constructor
 */


public class Vehicle {

    public void move (){

        System.out.println("all vehicles move...");
    }
public void price(){
    System.out.println("to buy a vehicle you should pay the price...");
}
    public Vehicle() {
        super();// optional    if u type or not it exist in here    must be at the fist line  mustttttt
        System.out.println("vehicle constructor");
    }
    public Vehicle(String name){

        System.out.println("vehicle constructor with a string parameter");
    }
}
