package Batch132.JavaTeachingB132mrSuleyman.day21inheritanceandpolymorphismbatch2022;
   // in every constructor there is super conts unvisible

/*
      super ()is used to call constructure from parent class
      super () is in the first line of every constructor body
      super() is invisible as deefault  if you want u can type it explicitly

  */
public class CarRunner {
    public static void main(String[] args) {
        Civic myCivic = new Civic();

        /*  when u run the code  the above print comes up
        car class construction 1
        honda class construtor 1
        civic class contructor 1
         */
       myCivic.hondaMake();  /// honda makes car strong
            Civic d= new Civic(2021);
//Hybrid   in the honda ,we defined the upper class (car class ) to be hybrid
//brand new   in the civic class we defined the upper class (honda) to be brand new
//2021
        Car myCivic2=new Civic();
    }
}
