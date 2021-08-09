package lesson4;

import java.util.Random;
import java.util.Scanner;

class Computer {
    String cpu, ram, hdd;
    int res, k;

    public void info() {
        System.out.println("Процессор - " + cpu + ". Оперативная память - " + ram + ". Жесткий диск - " + hdd + ".");
    }

    public void turn() {
        Scanner sc = new Scanner(System.in);
        int in;
        while (true) {
            in = sc.nextInt();
            if ((in >= 0) && (in <= 1)) {
                break;
            } else {
                System.out.println("Введите 0 либо 1");
            }
        }
        Random r = new Random();
        int turn = r.nextInt(2);
        if (in == turn) {
            System.out.println("Компьютер запущен.");
            k++;
        } else {
            System.out.println("Компьютер сгорел.");
            System.out.println("error.");
            System.exit(0);
        }
    }

    public void off() {
        Scanner sc = new Scanner(System.in);
        int in;
        while (true) {
            in = sc.nextInt();
            if ((in >= 0) && (in <= 1)) {
                break;
            } else {
                System.out.println("Введите 0 либо 1");
            }
        }
        Random r = new Random();
        int turn = r.nextInt(2);
        if (in == turn) {
            System.out.println("Компьютер выключен.");
            k++;
        } else {
            System.out.println("Компьютер сгорел.");
            System.out.println("error.");
            System.exit(0);
        }
    }

    public Computer(int res) {
        this.res = res;
    }

    public void test() {
        if (this.k >= this.res) {
            System.out.println("Сгорел от перегрева");
            System.out.println("error.");
            System.exit(0);
        }
    }
}