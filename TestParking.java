/**
 * @author Chien-Chi Liu
 * Class and Section: CS2336-003
 * Final Project
 * 
 */
public class TestParking {
	public static void main(String[] args) {
//		TODO Auto-generated method stub
		System.out.println("NOTE");
		System.out.println("letter “l” is for large spots");
		System.out.println("letter “c” for compact spots");
		System.out.println("letter “m” for motorcycle spots");
		System.out.println("letter “M” is for Motorcycle");
		System.out.println("letter “B” is for Bus");
		System.out.println("letter “C” is for Car");
		
		// create new ParkingLot 
		ParkingLot p = new ParkingLot();
		p.print();
		
		// create a bus
		Vehicle v = new Car();
		v.print();
		p.parkVehicle(v);

//		if (ParkingLot.parkVehicle(v) == true){
//			System.out.println("you park the vehicle");
//		} else {
//			System.out.println("there's no spot");
//		}
	}
}
