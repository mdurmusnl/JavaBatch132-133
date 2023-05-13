package JavaPrcatice.JavaPrcatice15feb;

import java.util.Arrays;

public class EnumRunner {
    /*
    write a code that includes vegetable and fruit recommendations by month and tells you the total hours of exerci se to be done
    print the months of exercise over 20 hours on the screen

     */
    public static void main(String[] args) {
          String a=NutritionExercise.January.fruitOfMonth;  //a=Pomograte
        int aa=NutritionExercise.valueOf("March").hoursOfExercie;
        System.out.println(aa);
        System.out.println(Arrays.toString(NutritionExercise.values()));  // NutritionExercise.values() is an array
                                    // [January, February, March, April, May, June, July, August, September, October, November, December]
       NutritionExercise.values(); //it is an array
        int aaa=NutritionExercise.values()[5].hoursOfExercie;   //6th months hours of exercise
  for(NutritionExercise w:NutritionExercise.values()){
    // System.out.print(w+" ");                     //January February March April May June July August September October November December
     // System.out.print(w.fruitOfMonth+" ");       //  Pomogranate Quince Banana Plum Pomogranate Quince Banana Plum Pomogranate Quince Banana Plum
      if(w.hoursOfExercie>20){
          System.out.print(w+" ");               //April August December
      }
  }
    }

}
