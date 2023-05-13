package Andrey.SelfStudy;
/*
   1) if u re in a different package , default varibles will be inaccessible
   2) if u re in a different package  and the ojject you crated is not child class then protected variables are inaccessable
   3) summorize:>> public variables have full access
             but child class object in th different package  has access to protected  variables


 */
public class TeacherRunner {
    public static void main(String[] args) {
        Teacher myTeacher= new Teacher();
        //object myTeacher, can have access  teacherName, phone and salary  but cannot acces to privaye ssn
    }
}
