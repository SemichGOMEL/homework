package lesson4;

import java.util.Random;
import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        boolean t = true;
        Computer lenovo = new Computer(3);
        lenovo.k = 0;
        while (true){
            lenovo.turn();
            boolean resAreEnded = lenovo.test();
            if (resAreEnded){
                break;
            }
            lenovo.off();
            lenovo.test();
        }
    }
}