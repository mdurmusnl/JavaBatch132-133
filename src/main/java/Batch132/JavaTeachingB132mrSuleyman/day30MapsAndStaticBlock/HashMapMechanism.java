package Batch132.JavaTeachingB132mrSuleyman.day30MapsAndStaticBlock;

public class HashMapMechanism {
    /*
        1) HshMap is not " Thread-safe" and is not "syncronized"  ( multytask with HashMap is not possible)
        2)Learn and explain HashMap mecqanism
                    i) when u create a HashMap , Java creates 16 buckets to stores entries
                    ii)Java indexes every bucket from 0 to 15
                    iii) when you put an entry into the Map
                             a) Java creates a hashod and dives by 16 and remainder is the index of bucket
                   iv) If Java needs tu put multiple entries into a bucket then Java uses LinkedList structure  thats insertion order
                   v) if 75% is the existion buckets is  full, then Java create an new 16 buckets
                   vi) to find an entry Java follows the below steps
                            Bucket --> HasCode-->Key then return the value
     */
    public static void main(String[] args) {

    }
}
