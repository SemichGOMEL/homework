package lesson2;

public class Num1 {
    public static void main(String[] args){
        double first = 10, sum = 10;
        for( int i = 1; i<7; i++ ){
            first = ((first*0.1)+first);
            sum = first+sum;
        }
        System.out.println(sum);
    }
}
