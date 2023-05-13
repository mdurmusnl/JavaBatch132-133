package Batch132.JavaTeachingB132mrSuleyman.day23EncapsulationAbstraction;

public class Student {
    /*
    1  when we type a code we may need to hide some data for some reason
    Encapsulation means  "hiding data"
    2 after encapsulation a date, if u need you may read the value by using "get method" (getter)
    3  in getters"
          i)access modifier is public
          ii) return type mmust be the same with the data type of the variable
         iii) method name shoud have  ( get+ variable name) structure
            note: if the data type of the variable is boolean then use methos name as (is+variable name)
          iv)  method body will have return keyword with the variable name
     4  after encapsulating a data, if u need    you may update the value by using  "set method" (setter)  ***
     5  in setters"
           i) acccess modifier is public
           ii) return type must be void
           iii) method name should have "set+variable name structure
           iv)*** setter use parameters , the parameter will be the same with variable
     6    if u want to create a hidden updatable but not readable variable        ****  important  ****
                 i)make access modifies private
                 ii)create set method  (remmeebr update means set method)
                 iii)  do not create get method
      */

    public String stdName;
    int stdGpa;
    private String psychologicalIssue="Depression";
    private boolean success=true;
    //java naming convantion to create a getter to get a private value
    // public > type of data > name of data   //like a gramatical rule of javaaa language
    
    public String getPsychologicalIssue() {  //we can read the private varibe with the help of this method when we re  in another class
        return psychologicalIssue;
    }

    public boolean isSuccess() {//when the return type is boolesan then do not use get and variable name
        return success;
    }
    public void setSuccess(boolean success){
        this.success=success;
    }
}

