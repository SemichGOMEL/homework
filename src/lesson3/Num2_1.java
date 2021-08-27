package lesson3;

public class Num2_1 {
    public static void main(String[] args){
        int mass[];
        int k = 0;
        for(int i = 1; i<100; i++ ){
            if((i%2)!=0){
              k++;
            }
        }
        mass = new int[k];
        System.out.println(k);
        k = 0;
        for(int i = 1; i<100; i++){
            if((i%2)!=0){
                mass[k] = i;
                System.out.print(mass[k]+" ");
                k++;
            }
        }
        System.out.println();
        for(int i = (k-1); i>=0; i--){
            System.out.print(mass[i]+" ");
        }
    }
}
