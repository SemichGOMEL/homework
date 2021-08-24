package Ex2;

public class Aircraft extends Air{
    public Aircraft(int capacity, int weight, int passang, double fuelcon, double fuel, String names) {
        super(capacity, weight, passang, fuelcon, fuel, names);
    }
    public void loading(Aircraft aircraft, int two){
        if(aircraft.passang>=two){
            System.out.println("Пассажиры были успешно загружены в "+aircraft.names);
        }else{
            System.out.println("Не хватает "+(two-aircraft.passang)+" мест.");
        }
    }
}
