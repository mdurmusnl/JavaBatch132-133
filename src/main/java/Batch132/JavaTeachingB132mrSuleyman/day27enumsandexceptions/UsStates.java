package Batch132.JavaTeachingB132mrSuleyman.day27enumsandexceptions;
 //enum is a storage   it stores constant data which the application needs
public enum UsStates {
/*
 //enum is a storage   it stores constant data which the application needs  such as names of states in usa or names of days or names of zip codes in Amsterdam
 ex,  in an application named " care sale"  you need "car makes" that s why you have to store "car maks" in your app
 that kind of constant data is stored in Enums
 when the application need the country names then those constant datas shall be stored in the app
 in Java in enum a constant data is stored as all capital letters
 */   // in the following list u can put many other info about each state, such as population , lakes ,...
      ALABAMA("Alabama","AL","Montgomery"),   //attention  it is comma
      TEXAS("Texas","TX","Austin"),
      WASHINGTON("Washington","WA","Olimpia");
      private final String stateName;   //encapsulated
      private final String abbreviation;   //encapsulated
      private final String capital; //encapsulated`

      UsStates(String stateName, String abbreviation, String capital) {
           this.stateName = stateName;
           this.abbreviation = abbreviation;
           this.capital = capital;

          }
      //lets create getters to read the private values

     public String getStateName() {
         return stateName;
     }

     public String getAbbreviation() {
         return abbreviation;
     }

     public String getCapital() {
         return capital;
     }
 }

