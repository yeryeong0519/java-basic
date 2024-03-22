package inheritance;

public class DriverEx01 {

	public static void main(String[] args) {

//		Bus bus_33 = new Bus();
//		Taxi ptaxi = new Taxi();
//		gildong.drive(bus_33);
//		gildong.drive(ptaxi);
	
	Driver gildong = new Driver();
	Truck truck = new Truck();
	gildong.drive(truck);
	}
}
