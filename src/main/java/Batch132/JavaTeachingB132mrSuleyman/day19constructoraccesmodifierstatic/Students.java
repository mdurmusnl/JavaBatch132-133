package Batch132.JavaTeachingB132mrSuleyman.day19constructoraccesmodifierstatic;
// constructors are like a cook
public class Students {
    /*
        1 we need constructor to cereate an objeck
        2 when we create a class java puts a construction in int automaticaly  its invisivle its called as "default constructor"
        java does it bc java knows class are for creating objet
        3 to create a constructor follw the steps"
          a) use acces modifier mostly we use public acces modifier
          b) use class name as constrcutor name
          c) open close contr paranthesis
          d)open close curlu paranhesis
     4) when u create a cont manulaly than java wil ldelete the default cont
     5- we can create many contst in a class

     what are the differences of method and constructors
     i-  methods have return type   but consturctors have no return type
     ii- methods are for some actions, Contructions are for object creation

     */

    public String stdName;
    public int age;
    public boolean succes;
    public String gender;



    // this below const  is almost default const
    public Students(){   //const with no parameter
    }
//  cerate a const with several variables
    public Students(String stdName,int age,boolean succes,String gender){
           this.stdName=stdName;



    }
    public Students (String stdName,int age,boolean succes){
          this.stdName=stdName;
          this.age=age;
          this.succes=succes;
    }

    public Students(int age, boolean succes) {
        this.age = age;
        this.succes = succes;
    }
}


