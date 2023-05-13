package Batch132.JavaTeachingB132mrSuleyman.day22overridingEncapsulationIntro;

public class Student {
    /*
    1  when we type a code we may need to hide some data for some reason
    Encapsulation means  "hiding data"
    2 after encapsulation a date, if u need you may read the value by using "get method" (getter)
      */

    public String stdName;
    int stdGpa;
    private String psychologicalIssue="Depression";

    public String getPsychologicalIssue() {  //we can read the private varibe with the help of this method when we re  in another class
        return psychologicalIssue;
    }
}

