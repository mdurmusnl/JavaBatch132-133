package JavaQuestionBnak;

public  abstract class Abstraction {
       public int a=10;
       public abstract void set(int a);
  public void run(){
         System.out.println("concrete method");
  }
  public int get (){
      return a;
  }


}


