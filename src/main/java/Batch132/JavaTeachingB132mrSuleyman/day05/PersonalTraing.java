package Batch132.JavaTeachingB132mrSuleyman.day05;

public class PersonalTraing {
    public static void main(String[] args) {
        //example1      delete all "y" letters from a givien string
        String s = "Everything is easy if you study hard";
        String s1=s.replace("y","");
        System.out.println(s1);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        //example 2   delete all the digigts in the given string
        String t= " Tom is 13 years old and his GPA is 3.98";
       String t1= t.replaceAll("[0-9]","");
        System.out.println(t1);
        System.out.println("!!!!!!!!!!!!!!");
        //examples 3    delete all vowels from a given string
        String u= "Tom ,are u here";
       String u1= u.replaceAll("[aeiouAEIOU]","");
        System.out.println(u1);
        System.out.println("##################");

        //EXAMPLES 4  COUNT how many letter are there in a string
        //logic; delete all the charecters from the letters
        // count the remaining charachters
        String m= "Tom ,are u here?";
        int m1=m.replaceAll("[^a-zA-Z]","").length();
        System.out.println(m1);
        System.out.println("************************************************************************************");
        //Example 5: Check the user's password according to the given rules
        //           i)Password should have at least 8 characters
        //           ii)Password should not have "space" character
        //           iii)Password should have at least 1 upper case
        //           iv)Password should have at least 1 lower case
        //           v)Password should have at least 1 symbol
        //           vi)Password should have at least 1 digit

        String pwd = "As1?fdes3";

        //i)Password should have at least 8 characters
        boolean pwd1=pwd.length()>7;
        System.out.println("Password should have at least 8 characters"+ " "+pwd1);

        //ii)Password should not have "space" character
        boolean pwd2=pwd.replaceAll("[^ ]","").length()==0;
        System.out.println("Password should not have \"space\" character"+" "+pwd2);

        //iii)Password should have at least 1 upper case
       boolean pwd3= pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("Password should have at least 1 upper case"+" "+pwd3);

          //iv)Password should have at least 1 lower case
        boolean pwd4=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("Password should have at least 1 lower case"+" "+pwd4);

        //v)Password should have at least 1 symbol(Not letter, not digit)
        boolean  pwd5= pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;
        System.out.println("Password should have at least 1 symbol(Not letter, not digit)" +" "+ pwd5);

        //vi)Password should have at least 1 digit
        boolean pwd6=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("Password should have at least 1 digit"+" "+ pwd6);

    }
}
