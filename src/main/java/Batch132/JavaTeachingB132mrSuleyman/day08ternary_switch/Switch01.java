package Batch132.JavaTeachingB132mrSuleyman.day08ternary_switch;

public class Switch01 {
    public static void main(String[] args) {
          /*
        Example 1:For the number of the days, print the day names
                  ... 3==>Tuesday ... 7==>Saturday
     */
        int dayNumber = 3;
        switch (dayNumber){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
break;
            default:
                System.out.println("invalid number of day");
        }




    }
}
