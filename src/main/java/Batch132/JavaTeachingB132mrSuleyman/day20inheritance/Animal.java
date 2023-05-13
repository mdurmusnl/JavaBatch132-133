package Batch132.JavaTeachingB132mrSuleyman.day20inheritance;
/*    parent class  = super    child clas= sub
    1) inheritance prevents following issues
        repetation
        difficulty in updating codes
        difficulty in fixing codes
        prevents atomic structure
    2) child classes can use method or variables from parent classes buttttt parent classes can not use methods or varibles or child classes
    3) for [ublic and protected access modifier there is no issue in inheritance
    4) for default access modifier if the object and the parent class are in same package then inheritance is possible if different package then inheritance is impossible
    5) for private access modifier inheritance is impossible
    6)  has a means parent to child   animal has a cat class
    is a means child to parent      cat is ana animal      java support single inheritance*** multi level inheritance is possible   child > parent > grandparent

        inheritance in java   summarize
        1 multilevel inheritnce
        2 hierarchicalinheritacne
        3 multiple inhertance in not supported
        4 single inheritance is supported
 */
public class Animal {
    public  void eat(){
        System.out.println("animals eat");
    }
    public  void drink (){
        System.out.println("animals drink ..");
    }
}

