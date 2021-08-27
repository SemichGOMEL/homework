package lesson3;

public class Num1_1 {
    public static void main(String[] args){
        int[] a = new int[10]; int k=0;
        for(int i = 2; i<21; i = 2 + i){
            a[k] = i;
            k++;
        }
        for (int i = 0; i<10; i++){
            System.out.print(a[i]+" ");
        }
    }
}
