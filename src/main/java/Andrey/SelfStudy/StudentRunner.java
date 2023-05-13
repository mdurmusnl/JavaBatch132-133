package Andrey.SelfStudy;

public class StudentRunner {
    public static void main(String[] args) {

        Student st1=new Student("Tom",13,true,"male");  //std1 has access to 4 variables
        Student std2 = new Student("Ali",21,false);  ////std1 has access to 3 variables, can not access gender variable
        Student std3= new Student(); //std1 has access no acess
//in the time of creation of varibles, they are all default   Sting =null   int=0  boolean =false
        System.out.println(st1.stdName); //"Tom"
        System.out.println(std2.success);// false
        System.out.println(std3.age);  //default 0           bcs has no access
        System.out.println(std3.success); //default false    bcs has no access
        System.out.println(std2.gender);  // default null     bcs has no access




    }
}
