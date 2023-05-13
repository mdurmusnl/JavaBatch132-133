package practices02dt;

public class Q05 {
    public static void main(String[] args) {
        //1.Task: Count the alphabetical characters in a given value.

        String str= "Wow!...Ali is 13 years old and he is a university student!!!";
        int numOfStr=str.replaceAll("[^a-zA-Z]","").length();
        System.out.println(numOfStr);
        System.out.println(str.length());

        //2nd way

    }
}
