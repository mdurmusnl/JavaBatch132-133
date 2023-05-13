package Batch132.JavaTeachingB132mrSuleyman.day30MapsAndStaticBlock;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    /*
       1) puts entries in natural order  so it worsk so slow
       2) thread safe and synchorized
       3) accepta null as a value  do not accept as a   keys
     */
    public static void main(String[] args) {
        TreeMap<String,Integer> tm= new TreeMap<>();
        tm.put("USA",400000000);
        tm.put("germany",83000000);
        tm.put("Belgium",12000000);
        tm.put("Albania",30000000);
        tm.put("Turkey",81000000);
        System.out.println(tm); // {Albania=30000000, Belgium=12000000, Turkey=81000000, USA=400000000, germany=83000000}  in natutal order  but wroks slow
// to makes TreeMap fast  first store entries in HahMap  then convert it into TreeMap
        HashMap<String ,Integer> hm= new HashMap<>();  //   HashMap()  is a non parameter contstuctor
        hm.put("USA",400000000);
        hm.put("germany",83000000);
        hm.put("Belgium",12000000);
        hm.put("Albania",30000000);
        hm.put("Turkey",81000000);
  TreeMap <String, Integer> newTm= new TreeMap<>(hm);   // TreeMap(hm)  is a constructor with a parametwer   that cont will create a treemap with hm

    }
}
