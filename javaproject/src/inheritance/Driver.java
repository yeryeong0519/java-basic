package inheritance;

public class Driver {
	// 운전한다는 메소드
	void drive(Vehicle vehicle) {
		vehicle.run();
		if(vehicle instanceof Bus) {
		Bus bus = (Bus)vehicle;
		bus.checkFare();
	}
	
	if(vehicle instanceof Truck)

	{
		Truck truck = (Truck) vehicle;
		truck.load();
	}
}
}
