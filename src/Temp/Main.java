package Temp;

import static java.lang.CharSequence.compare;
import static java.lang.String.join;
import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        String b = "hello";
        String l = ",";
        String z = "bye";
        char str2[] = new char[10];
        int k = 31231;
        System.out.println(b.substring(0,2));
        System.out.println(b.replace("h","j"));
        b.getChars(0,5, str2 ,0);
        System.out.println(str2);
        System.out.println(b.concat(z));
        StringBuilder str = new StringBuilder("ABCDEFGHL");
        System.out.println(str.length());
        revers(str);
        System.out.println(str);
    }
    public static void revers(StringBuilder str){
        char c;
        int a = str.length() - 2;
        for(int i = str.length() ; i>0; i--){
            if(a>=0){
                c = str.charAt(a);
                str.append(c);
                str.deleteCharAt(a);
                a = a - 1 ;
            }
        }
    }
}
