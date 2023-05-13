package atmproject.day33Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaForCourseObject {
    public static void main(String[] args) {
        Course courseTurkishDay=new Course("Turkish Day Time",124,"Summer",97.2);
        Course courseTurkishNight=new Course("Turkish Night Time",125,"Winter",98.4);
        Course courseEnglishDay=new Course("English Day Time",138,"Spring",93.8);
        Course courseEnglishNight=new Course("English Night Time",124,"Winter",95);
        //since we mostly use Collections in Functional Programmoing then we will create a list and put those above object into the list to use in Lambda
        // data type of our objects is Course
        List<Course> courses= new ArrayList<>();
           courses.add(courseTurkishDay);
           courses.add(courseTurkishNight);
           courses.add(courseEnglishDay);
           courses.add(courseEnglishNight);
        System.out.println(courses);  //[Course{courseName='Turkish Day Time', numOfStudents=124, season='Summer', averageScore=97.2}, Course{courseName='Turkish Night Time', numOfStudents=125, season='Winter', averageScore=98.4}, Course{courseName='English Day Time', numOfStudents=138, season='Spring', averageScore=93.8}, Course{courseName='English Night Time', numOfStudents=124, season='Winter', averageScore=95.0}]
                           // this Course{courseName='Turkish Day Time', numOfStudents=124, season='Summer', averageScore=97.2} is the format of toString method
                            //***in order to see the object details we needto String() method  ,  u can modify toString method

        System.out.println(checkAvgScoreToBeGreaterThanAnyNumber(courses,91));  //true
        System.out.println(checkAnyWordExist(courses,"Spanish"));  //false
        printHighestScoreCourse(courses); // Course{courseName='Turkish Night Time', numOfStudents=125, season='Winter', averageScore=98.4}
    }
//ex1) create a method to check if all average scores are greater than 91
    public static boolean checkAvgScoreToBeGreaterThanAnyNumber(List<Course> courses,double avg){
        return courses.stream().allMatch(t->t.getAverageScore()>avg);

    }
//ex2) create a method to check if at least one of the courser name contains of "Turkish" word
    public static boolean checkAnyWordExist(List<Course> course, String s){
        return course.stream().anyMatch(t->t.getCourseName().contains(s));
    }
//ex3) create a method to print the course whose score is the highest
    public static void printHighestScoreCourse(List<Course> courses){ //sort the scores then reverse then get the first one
        Course c1 = courses.stream().
                sorted(Comparator.comparing(Course::getAverageScore).
                        reversed()).findFirst().get();
        System.out.println(c1);
    }
    //ex4 create a methot to sort the list elements according to the average score in ascending order and skipp first 2 elements
public static List<Course>  sortElementsAndSkipFirstTwo(List<Course> courses){  //since we will print  multiple lements its List data type   it will return a list
     return    courses.stream().
                sorted(Comparator.comparing(Course::getAverageScore)).  //puts the elements in ascending order
                skip(2).  //skip the first 2 elements in the list
                collect(Collectors.toList());  // puts the other elements in to a list
}
//ex5   create a method to sort the list elements according to yhe number is srudents in descending  order and print just the 3rd element
    public static void printThirdElementAfterDescendinOrder(List<Course> cources){
     List<Course> c2  = cources.stream().
                sorted(Comparator.comparing(Course::getNumOfStudents).// in descending order
                        reversed()).skip(2).  //skip first 2 elements
                limit(1).  //// after skipping first 2 element limit() returns the first one in the others is the 3rd one  that we look for
             collect(Collectors.toList());  //even its single element this method put it into a list
        System.out.println(c2);
    }
}
