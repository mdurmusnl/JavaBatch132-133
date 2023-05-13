package Batch132.JavaTeachingB132mrSuleyman.day23EncapsulationAbstraction;
/*
the reasons we use encaplusaltion   why??/
1 to hide a date, to protect update on some data
2 to make java developer works smooth ,  if all unnecessary variable are visible then ist confusion
use private key word to hide a date as encapsulation
3 get method do not use any parameter
  inside the code blod type return and variable name
  *** getter and setter work on objectt    it updates vvalues for object does not updsates c lass values
     no need set or get method for non private variables
  the biggest benefit of Encapsulation is using one object and crrate many other object by using set method
 */

public class StudentRunner {
    public static void main(String[] args) {
        Student myStudent= new Student();
        System.out.println(myStudent.getPsychologicalIssue());
        System.out.println(myStudent.isSuccess()); //true
        myStudent.setSuccess(false);
        System.out.println(myStudent.isSuccess()); //false
        //when we crerate a new object then new object start with the class values
        Student myStudent2 =new Student();
        System.out.println(myStudent2.isSuccess()); //true
    }
}
