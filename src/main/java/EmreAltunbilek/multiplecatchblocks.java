package EmreAltunbilek;
// throwable  is the grandparent exception class

public class multiplecatchblocks {
    public static void main(String[] args) {
        String arr[]={"abc","234",null};
        System.out.println(Integer.parseInt(arr[1])); //234
       // System.out.println(Integer.parseInt(arr[0]));  // numberformatexception
      //  System.out.println(Integer.parseInt(arr[2])); //NULLPOINTEREXCEPTION

        for(int i=0;i<arr.length+2;i++){
            try {
               int number = arr[i].length() + Integer.parseInt(arr[i]);  //There will be 2 possible exception occur
            }catch (NumberFormatException e){            // bu kadar exceeption yerine sadce bir kere Exception desek yetiyor
                                                         // bcs all these run time exceptions are child of Exception class
                                                          // catch( Numberformatexception| NullpointerException | ArrayOutOfBoundsException e)   is also possible
                                                           // or  u can use any of child class excption then parent class Exception  is also fine
                System.out.println("non digit charachter can not be converted to an integer");
                System.out.println("tecnical mesaage:  "+e.getMessage());
            }catch (NullPointerException e){
                System.out.println("null elelement can not be converted to an integer");
                System.out.println("tecnical mesaage:  "+e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("array index is exceeded");
                System.out.println("tecnical mesaage :  "+e.getMessage());
            }
        }
        System.out.println("hello");
    }
}
