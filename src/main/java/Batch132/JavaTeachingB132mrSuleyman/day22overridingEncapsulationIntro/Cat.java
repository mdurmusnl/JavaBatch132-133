package Batch132.JavaTeachingB132mrSuleyman.day22overridingEncapsulationIntro;

public class Cat extends Mammal{
    @Override
    public void eat() {  //overriding method
       // super.eat();  we delete the code of parent class method and we specify it
        System.out.println("cats eat");
    }

    @Override
    public Animal create() {  // since there is (IS A) relation  we can change Animal data type as Cat   and its better
     //   return super.create();   we must delete this code bcs the purpose we override  this methos is to modify ,specify it
        return new Cat();    //sometimes we do not delete super.create()    someyimes we need to use parent method as it is and add some extra
    }

    @Override       // very important note*************
    public Mammal occur() {   //*** here we csan not put Animal data type instead of Mammal  bcs there is no ISa relayion  Animal to mammal ******
       // return super.occur();  i wannto delete this and update my own code
        return new Cat();
    }

    @Override   //888super importatn point
    public Integer number() {   //short or bbyte are smaller but are not child    there is no inhetirance between short and integer
      //  return super.number();     // so u can not narrower Integer
        return 456;    // java didnt created parent child relation between Wrapper classes
    }

    @Override
    public int num() {  // in here u can not chance int into chort or byte bcs there is no IS A relation
       // return super.num();
        return 23;
    }
}
