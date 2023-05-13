package atmproject.day33Lambda;
  //  how to work with Object and Text Files in Lambda,  we will create an object by POPJO Class and then we will use the object in Lambda
public class Course {
    /* to create a POJO (Plain Old Java Object) Class, d othe followings
                1) private variable
                2)constructor with all parameters
                3) constructor without parameter
                4) gettters and setters
                5) toString() method
     */
    private  String courseName;
    private int numOfStudents;
    private String season;
    private double averageScore;

      public Course(String courseName, int numOfStudents, String season, double averageScore) {
          this.courseName = courseName;
          this.numOfStudents = numOfStudents;
          this.season = season;
          this.averageScore = averageScore;
      }
      public Course(){            // default constructor

      }

      public String getCourseName() {
          return courseName;
      }

      public void setCourseName(String courseName) {
          this.courseName = courseName;
      }

      public int getNumOfStudents() {
          return numOfStudents;
      }

      public void setNumOfStudents(int numOfStudents) {
          this.numOfStudents = numOfStudents;
      }

      public String getSeason() {
          return season;
      }

      public void setSeason(String season) {
          this.season = season;
      }

      public double getAverageScore() {
          return averageScore;
      }

      public void setAverageScore(double averageScore) {
          this.averageScore = averageScore;
      }

      @Override
      public String toString() {          // whenever we create an object then this method prints the details of that object
          return "Course{" +
                  "courseName='" + courseName + '\'' +
                  ", numOfStudents=" + numOfStudents +
                  ", season='" + season + '\'' +
                  ", averageScore=" + averageScore +
                  '}';
      }
  }
