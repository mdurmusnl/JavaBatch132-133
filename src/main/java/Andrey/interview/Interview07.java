package Andrey.interview;

import java.util.*;

public class Interview07 {
    public static void main(String[] args) throws IllegalGradeException {



        List<String > myList= new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);  // [Tom, Jim, Clara, Angie, Mark]
        //can u please print
        // Hi Tom,Hi Jim, Hi Clara,Hi Angie,Hi Mark
        Iterator<String> a=myList.iterator();
        while (a.hasNext()){
           String s= a.next();
            System.out.println("Hi"+s);
        }

//Q2
        List<String > yourList= new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");

        System.out.println(yourList);  // [Tom, Jim, Clara, Angie, Mark]

        //can u please print
        // Mark!... Angie!... Clara!... Jim!... Tom!...
        // on the console

        //answer
                ListIterator<String > yourListItr=yourList.listIterator();
        while(yourListItr.hasNext()){
            yourListItr.next();
        }
        //now the pointer is at the end  now yourlist is ready to work from end to beginning
        while (yourListItr.hasPrevious()){
            String element=yourListItr.previous();
            System.out.print(element+"!... ");   //Mark!... Angie!... Clara!... Jim!... Tom!...
        }



//create a method that prints the student grade
// and then how can you handle the issue below with a custom Compile Time Exception  .
// a teacher should not input a score such as 980 into the system , that increase the student average super fast
// (a student grade should be between 0 and 100)
        //printGrade(980);



        //Q3
//difference between throw and throws

        //Q4   can u talk about Map structure
        /*
        is a key value structure
        keys are unique  value can be dublicated
        Map elements are called entry
        Map is called entry sety
        there are 3 types
        hashMap accepts only one null as a key
         */

   //Q5
        HashMap<String ,Integer> cp= new HashMap<>();
        cp.put("USA",400000000);
        cp.put("Germany",83000000);
        cp.put("Albania",30000000);
        cp.put(null,23000000);
        cp.put("Albania",35000000);
        //Type code to print country names in the given Map
        Set<String > keys=cp.keySet();
        System.out.println(keys);
       // cp.replace("USA",500);
        cp.put("USA",500);

        //Q6
    //type a code to find the number of characters used in the keys in the above Map
        int sum=0;
        for(String w:keys){
            if(w!=null){
                sum+=w.length();
            }
        }
        System.out.println(sum);


        //Q7 \how can u get the population of USA
        Integer popOfUsa=cp.get("USA");

        //Q8
        //how to update USA population by 410 000000
        cp.replace("USA",410);


        //Q9
        //how to find number of entries
        int sumOfEntries=cp.size();


        //Q10
        //getOrDefault(key,value) does 2 action   if the key exist it return the value from  the map  if it doesnt exist then ot return the value
   //if the key doesnt exist and if u use get value then it ruents null  and null value can create issue
  cp.getOrDefault("ABC",0); //RETURNS 0 Because ABC does not exist


        //Q11
          cp.putIfAbsent("USA",400000000); //DOES NOTHING BCS USA EXISTS
        cp.putIfAbsent("BELGIUM",13000000);//  IT PUTS Belgium bcs belgium is absent





    }
    public static void printGrade(int grade) throws IllegalGradeException {
        if(grade<0||grade>100){
           throw new IllegalGradeException("no such grade");

        }else{
            System.out.println(grade);
        }
    }
}
