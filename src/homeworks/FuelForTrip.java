package homeworks;

public class FuelForTrip {

    public static void main(String[] args) {

        double fuelPrice = 1.2; // fuel price
        double needFuelForTrip = (8.0/100.0)*120.0; // fuel consumption per trip
        double tripPrice = needFuelForTrip * fuelPrice;

        System.out.println(fuelPrice);
        System.out.println(needFuelForTrip);
        System.out.println("You have to pay for fuel for the trip " +tripPrice+"$");

    }
}