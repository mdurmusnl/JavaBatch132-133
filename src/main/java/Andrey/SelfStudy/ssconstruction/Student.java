package Andrey.SelfStudy.ssconstruction;

public class Student {
    public String name; //name null
    public int age;  // 0
    public  boolean success;  // false
    public String gender;// null
    public Student(){
        System.out.println("default conts is working");
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Student(int age, boolean success, String gender) {
        this.age = age;
        this.success = success;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", success=" + success +
                ", gender='" + gender + '\'' +
                '}';
    }
}
