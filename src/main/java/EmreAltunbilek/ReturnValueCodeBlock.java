package EmreAltunbilek;

public class ReturnValueCodeBlock {
    public static void main(String[] args) {
        System.out.println(returnString());
    }

    private static String returnString() {
    String s= "Hello";
    try{       ///either try or catch blokc ork  not both
       s+=s+"try";
       return s;
    }catch (Exception e){
        s+=s+"catch";
        return s;
    }finally {
        s+=s+"finally";
    return s;
    }
    }
}
