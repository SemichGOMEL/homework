import java.util.Scanner;

public class pr2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt(), b = inp.nextInt(), c = inp.nextInt();
        if ((a+b > c) & (c+b > a) & (a+c > b)){
            System.out.println("существует");
        } else{
            System.out.println("не существует");
        }
    }
}
