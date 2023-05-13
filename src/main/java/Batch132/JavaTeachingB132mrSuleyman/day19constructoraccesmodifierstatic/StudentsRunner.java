package Batch132.JavaTeachingB132mrSuleyman.day19constructoraccesmodifierstatic;

public class StudentsRunner {




    public static void main(String[] args) {
        Students std1= new Students("Tom",13,true,"male");
        Students std2= new Students("Ali",21,false);
        Students std3= new Students();
        System.out.println(std1.stdName);  //"Tom"
        System.out.println(std2.gender);  //null
        System.out.println(std3.age);// null ,0, false, null// what ever we check for std3  we will get default value
        System.out.println();


    }


}
