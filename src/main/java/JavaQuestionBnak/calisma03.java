package JavaQuestionBnak;
//  ex27   page215
public class calisma03 {
    public static void main(String[] args) {
/*
The correct code should be as;
I changed the "j<arr.length-1" code part as  "j<arr.length" in the inner loop
I changed the "i++" code part as "j++" in the inner loop
 */
        Integer arr[] = {4, 6, 5, -10, 8, 5, 20};
        int num = 10;
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + num);   //4+6     5+5     -10+20
                }
            }
        }







    }
}
