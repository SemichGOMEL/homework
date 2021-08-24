package Ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    static Aircraft[] a = new Aircraft[3];
    public static void main(String[] args) {
        Point flight1 = new Point(0,0);
        Point flight2 = new Point(0,0);
        Map<Country, Point> map = new HashMap<Country, Point>();
        map.put(Country.USA,new Point(12,20));
        map.put(Country.SIRIYA,new Point(18,22));
        map.put(Country.RUSSIA,new Point(33,44));
        map.put(Country.UKRAINE,new Point(5,3));
        map.put(Country.PITER,new Point(4,40));
        a[0] = new Aircraft(350,2000,45,245,5,"Airbus");
        a[1] = new Aircraft(1000,8000,70,600,20,"Ил76");
        a[2] = new Aircraft(3000,12320,99,950,25,"як40");
        a[1].calcrange();
        flight2 = map.get(Country.RUSSIA);
        double rangeflight = sqrt((flight2.x-flight1.x)*(flight2.x-flight1.x)+(flight2.y-flight1.y)*(flight2.y-flight1.y));
        a[0].calcrange();
        if (rangeflight<=a[0].range){
            System.out.println("Полёт в москву доступен!");
            flight1 = flight2;
        }else{
            System.out.println("Полёт в москву не доступен!");
            flight1 = flight2;
        }
        /* System.out.println(a[0]);
        System.out.println("Дальность полёта - "+a[1].range+" км");
        System.out.println("Грузоподъемность и вместимость - "+a[0].allweight());
        a[0].landing();
        System.out.println(a[0].names+" "+a[0].info);
        System.out.println("3... 2... 1...");
        a[0].takeof();
        System.out.println(a[0].names+" "+a[0].info);
        sort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Диапазон горючего(от...до..):");
        int r = sc.nextInt();
        int b = sc.nextInt();
        find(r,b);
        System.out.println("Номер самолёта для загрузки пассажиров и количество пассажиров:");
        int numb = sc.nextInt();
        int pass = sc.nextInt();
        a[0].loading(a[numb],pass);
         */
    }
    public static void sort(){
        double max = 0; int n = 0;
        for( int i = 0; i<3; i++){
            a[i].calcrange();
            if(a[i].range > max){
                max = a[i].range;
                n = i;
            }
        }
        System.out.println(a[n]);
        System.out.println(a[n].range);
    }
    public static void find(int r, int b){
        for(int i = 0; i<3; i++){
            if((a[i].fuel>=r)&&(a[i].fuel<=b)){
                System.out.println("Вам подходит"+a[i]);
            }
        }
    }
}
