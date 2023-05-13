package Andrey.SelfStudy;
//  public  protected  default    private
public class Teacher {
    public String teacherName="Tom Hanks";  //accessable from the entire project
    protected long phone=633820;   //accessable in the same package or accesaable in the other packafe if the class is child class
    int salary=3000;  //default access modifier       default is accessbale inthe thr package
    private String ssn= "301457888";

}
