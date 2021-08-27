package Temp;

import static java.lang.CharSequence.compare;
import static java.lang.String.join;
import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("gomel-grodno");
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
