package lesson3;

import java.util.Scanner;
public class Krestiki_noliki {
    public static void main(String[] args) {
        String game[][] = new String[3][3];
        int movepl11, movepl12, movepl21, movepl22, zero = 1;
        Scanner scan = new Scanner(System.in);
        for ( int i = 0; i<3 ; i++){
            for ( int j = 0; j<3 ; j++){
                game[i][j] = " ";
            }
        }
        System.out.println();
        System.out.println("***Правила игры***");
        System.out.println("Первый игрок начинает игру, для заполнения поля игроком 1 используется символ "+"");
        System.out.println("Сначала вводится вертикальный номер, затем указывается горизонтальный");
        System.out.println("Побеждает игрок, который первый заполнил горизонтальную/вертикальню полосу либо диагональ");
        System.out.println();
        while (true) {
            if ( zero == 1 ) {
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        System.out.print("   0" + " 1" + " 2");
                    }
                    System.out.println();
                    for (int j = 0; j < 3; j++) {
                        if (j == 0) {
                            System.out.print(i + " |");
                        }
                        System.out.print(game[i][j]);
                        System.out.print("|");
                    }
                }
            }// вывод поля пустого
            zero = 0;
            System.out.println();
            System.out.println("Ход первого игрока:");
            movepl11 = scan.nextInt();
            movepl12 = scan.nextInt();
            game[movepl11][movepl12] = "+";
            for (int s = 0; s < 3; s++) {
                if ( s == 0 ){
                    System.out.print("   0"+" 1"+" 2");
                }
                System.out.println();
                for (int f = 0; f < 3; f++) {
                    if ( f == 0 ){
                        System.out.print(s+" |");
                    }
                    System.out.print(game[s][f]);
                    System.out.print("|");
                }
            } // вывод поля
            if ( isWinner(game, "+") ){
                System.out.println();
                System.out.println("победил игрок 1");
                break;
            }
            System.out.println();
            System.out.println("Ход второго игрока:");
            movepl21 = scan.nextInt();
            movepl22 = scan.nextInt();
            game[movepl21][movepl22] = "0";
            for (int s = 0; s < 3; s++) {
                if ( s == 0 ){
                    System.out.print("   0"+" 1"+" 2");
                }
                System.out.println();
                for (int f = 0; f < 3; f++) {
                    if ( f == 0 ){
                        System.out.print(s+" |");
                    }
                    System.out.print(game[s][f]);
                    System.out.print("|");
                }
            } // вывод поля
            if ( isWinner(game, "0")){
                System.out.println();
                System.out.println("победил игрок 2");
                break;
            }
        }
        for (int s = 0; s < 3; s++) {
            if ( s == 0 ){
                System.out.print("   0"+" 1"+" 2");
            }
            System.out.println();
            for (int f = 0; f < 3; f++) {
                if ( f == 0 ){
                    System.out.print(s+" |");
                }
                System.out.print(game[s][f]);
                System.out.print("|");
            }
        }
        System.out.println();
    }
    public static boolean isWinner(String game[][], String symbol){
        return ( (game[0][1] == symbol && game[0][0] == symbol && game[0][2] == symbol) ||
                (game[1][0] == symbol && game[1][1] == symbol && game[1][2] == symbol) ||
                (game[2][0] == symbol && game[2][1] == symbol && game[2][2] == symbol) ||
                (game[0][0] == symbol && game[1][0] == symbol && game[2][0] == symbol) ||
                (game[0][1] == symbol && game[1][1] == symbol && game[2][1] == symbol) ||
                (game[0][2] == symbol && game[1][2] == symbol && game[2][2] == symbol) ||
                (game[0][0] == symbol && game[1][1] == symbol && game[2][2] == symbol) ||
                (game[0][2] == symbol && game[1][1] == symbol && game[2][0] == symbol)
        );
    }
}
