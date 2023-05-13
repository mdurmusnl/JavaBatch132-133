package Andrey.SelfStudy;
// constructor is  like a cook
// to create abjcet we must have a constructor
//when we create a class java automaticlly create a const in it,bcs java know why we created class  its for  creating object    java jawa knows it
//whne we create a class java puts a conts  its not seen , invisible constructors  are alled default const
  // when we create out own cont java delete the fault const ,  it was free but later its not
//we can create as many const as we want
public class Student {
    /*
    to create a constructor
        i) access modifier
        ii)use class name as conts name
        iii)  put() adn {}
     */

     public Student(){   // This construction is as same as default construction  .  no code inside code bloh  no paramete
         System.out.println("default const");    // when we create this  then java delete the invisible automatic construction which is as same same this
   }
   //lets create a constructor wgich uses variables, we re able to decorate inside the paranteshesis  ,we put any of htose variables
   public String stdName;
    public int age;
    public boolean success;
    public String gender;
    public Student(String stdName,int age,boolean success, String gender){  ////we can create millions of object with different name diffetnt age etc by using this consts
        this.stdName=stdName;          // contsructor with paramters gives us flexibilityin object creation
        this.age=age;
        this.success=success;
        this.gender=gender;
        System.out.println("4parameter conts");
    }
    //lets create a constuctore with some of the variable
     public Student(String stdName, int age, boolean success) {
        this.stdName = stdName;
        this.age = age;
        this.success = success;
         System.out.println("3parameter const");
    }
}
