package JavaQuestionBnak;

public class deneme {
    public static void main(String[] args) {
        String q="Ali Can";
        q= q.replaceAll("[^a-z]","");
        System.out.println(q);   //  lian
        for(int i=0;i<q.length();i++){
            char ch=q.charAt(i);
            if(ch>='a'&&ch<='z'){
                System.out.print(ch+"*");
            }
        }

    }
}
