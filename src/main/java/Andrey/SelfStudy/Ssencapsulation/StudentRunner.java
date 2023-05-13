package Andrey.SelfStudy.Ssencapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student s1=new Student();
     String a=   s1.getPsychologicalIssue();
        System.out.println(a); //depression
        System.out.println(s1.isSuccess());// true
        s1.setPsychologicalIssue("distopia");   //"" quatation mark
        System.out.println(s1.getPsychologicalIssue());//distopia
        //  s1.isSuccess();  //getter
       // s1.setSuccess(false);
       //System.out.println(s1.isSuccess());//false




    }

}
