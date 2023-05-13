package Batch132.JavaTeachingB132mrSuleyman.day19constructoraccesmodifierstatic;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher myTeacher= new Teacher();
        //teacherName is public  we can access
        System.out.println(myTeacher.teacherName); // "Tom Hanks"
        //phone variable is protected but we can access it  since phone number and object myTeacher are in the same package
        System.out.println(myTeacher.phoneNumber);// accessable
   //salary variable is default but we can access it  since salary variable and object myTeacher are in the same package
        System.out.println(myTeacher.salary); //accessable.
        // myTeacher object can not access private social security number variable in teacher class
        //private variable can not be accesaable out side the class
        //  if the object is created in a different package
//IN Teacher Class, there is one more variable which is "ssn" but it is private
        //that is why we cannot access to it from TeacherRunner Class

        //Note: A Class can be "public" or "default", do not use "private" and "protected" for the classes



    }
}
