package JavaQuestionBnak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class calisma {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$8.25");
        myList.add("$54.45");
        List<Double> decimalList = new ArrayList<>();
        int  indx=0;
        for(String w:myList){
            //decimalList.set(indx, Double.valueOf(w.replace("$","")));  //set medthod  just updates
          //  indx++;
            decimalList.add(Double.valueOf(w.replace("$","")));
        }
        System.out.println(decimalList);  //[12.99, 23.6, 8.25, 54.45]
        Collections.sort(myList);
        double smallest= decimalList.get(0);
        double greates= decimalList.get(myList.size()-1);
        System.out.println(smallest+"and"+greates);  //12.99and54.45
    }
}
