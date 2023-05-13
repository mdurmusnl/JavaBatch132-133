package JavaPrcatice.JavaPrcatice15feb;

public enum NutritionExercise {
       January("Carrot","Pomogranate",17),
       February("Cabbage","Quince",16),
       March("Aruqula","Banana",19),
       April("Eggplant","Plum",22),
      May("Carrot","Pomogranate",17),
      June("Cabbage","Quince",16),
      July("Aruqula","Banana",19),
      August ("Eggplant","Plum",22),
      September("Carrot","Pomogranate",17),
      October("Cabbage","Quince",16),
      November("Aruqula","Banana",19),
     December("Eggplant","Plum",22);

    final String vegetableOfMonth;
     final String fruitOfMonth;
     final int hoursOfExercie;


    NutritionExercise(String vegetableOfMonth, String fruitOfMonth, int hoursOfExercie) {
        this.vegetableOfMonth = vegetableOfMonth;
        this.fruitOfMonth = fruitOfMonth;
        this.hoursOfExercie = hoursOfExercie;
    }
}
