package Andrey.SelfStudy.ssconstruction;

public class StudentRunner {
    public static void main(String[] args) {
        Student std1= new Student();
        System.out.println(std1.name);
        Student std2= new Student("peter",13);
        System.out.println(std2.name); //peter
        System.out.println(std2.age);  //13
        System.out.println(std2.gender);  // null
        System.out.println("******");
        std2.toString();
    }
}
