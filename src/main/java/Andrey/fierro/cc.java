package Andrey.fierro;

public class cc {
    public static void main(String[] args) {
        String[] brr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        String ww="Fierro";
        String www=ww.substring(0,1);
        System.out.println(www);
        String qq=ww.substring(ww.length()-1);
        System.out.println(qq);
        for(String w:brr ){
            String p=w.substring(0,1);  //first letter
            String q=w.substring(w.length()-1); //last character
            if(w.startsWith(p)==w.endsWith(q)){
                System.out.print(w+" ");
            }
        }



    }
}
