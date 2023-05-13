package Batch132.JavaTeachingB132mrSuleyman.day29ExecptionsMaps;

import java.util.*;

public class HashMap01 {
    /*
      1)  Maps have key-value structure
      2) Keys are unique values can be repeated
      3) Map elelemnbts are called "entry"
      4) all map elements are called "entry Set"   bcs each entry is unique
      5) maps are in 3 types
             i) HashMap puts entries in random order  that makes HasMap work fast
                   * HasHmAP accepts null key once
                   *HashMap accept multimpe null value

             ii)HashTree
             iii)
     6)  if u use same key repeatedly in a map then final value will be accpeted in the map  juat like updating
     pu() method with same key but different value then the method updates the value   its not recommended   bcs java has a method to uppdates the values
     summorize: put()method add and also update but do not update by this put method
     put() method same key with different value  overwrites the value   re-writes
     7)

     */
    public static void main(String[] args) {
        HashMap<String ,Integer> cp= new HashMap<>();
        cp.put("USA",400000000);
        cp.put("Germany",83000000);
        cp.put("Albania",30000000);
        cp.put(null,23000000);
        cp.put("Albania",35000000);//if u add another entry with existing key then this value will be final value
        System.out.println(cp); // {USA=400000000, Germany=83000000, Albania=30000000}  seems like insertion order but its not   Maps do not sort
        // how to get just keys
        //ex1 type code to find the number of chacarchters used in the keys
        Set<String > keys= cp.keySet();   // keys will be stored in a set  bcs keys are unique
                                          //keySet() method returs all keys in a Set
        System.out.println(keys);  //[USA, Germany, Albania]   a collection with []
        int numofChar=0;
        for(String w:keys) {
            if (!w.equals(null)){    //    ****  fix the exception
                numofChar += w.length();
        }
        }
        System.out.println(numofChar);
        //ex2  type code to find the total populations of the countries in the map
        //get values by values() method
        Collection<Integer> values=cp.values();  //
        int total=0;
        for(Integer w:values){
            if(w!=null){
                total+=w;
            }
        }
        System.out.println(total);

   //type code to find the population of USA
        // first i should gett the population of usa
   Integer popOfUsa=cp.get("USA");  // 400000000

        // how to update the value
        cp.replace("USA",410000000); //IT UPDATES THE VALUE
        //another way to update a value is replace(key, oldValue,newValue)
        cp.replace("USA",410000000,390000000); // IT UPDATE AFTER DOUBLE CHECK KEY AND VALUE

        cp.size(); //returns the number of entries in the map
        cp.getOrDefault("USA",0);  // if Usa exist as a key then the method returns the actaul value,  it the key doesnt exist then methrod returns zero

          cp.putIfAbsent("USA",500000000);  // the method add the entry if USA  is absent   the name is so clear
         boolean r=cp.containsKey("USA"); //true
         boolean r2=cp.containsValue("350000000");
         //the following methos is a way the get ant specific entry  study carefully
         Set<Map.Entry<String ,Integer>> allEntries= cp.entrySet();    //  entrySet() method returns all entries in a Set whose elements are in Set<Map.Entry<K,V>> data type
//once its set we can get ant element
        System.out.println(allEntries);  //This is for exanple   not real bcs we did alothod methos use upper lines[USA=450000000,KONGO=36000000,GERMANY=83000000]  T
  for(Map.Entry<String ,Integer> w:allEntries){    // Map.Entry<String ,Integer>  is the date type contains two parameter  one is string one is integer  both are single element
      System.out.println(w.getKey()+"-"+w.getValue()); //USA-450000000.......

  }

    }

}
