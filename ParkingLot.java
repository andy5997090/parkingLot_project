/**
 * @author Chien-Chi Liu
 * Class and Section: CS2336-003
 * Final Project
 * 
 * Purpose of this class: This is the class that create the parking lot, constructor will
 * create five levels, and in the print methods will have a for loop to print out the title.
 * parkVehicle will call the parkVehicle methods in Level class.
 * 
 */
public class ParkingLot {
	private Level []levels = new Level[5];
	
	public ParkingLot() {
		// Create Five Level
		Level[] level = new Level[5];
		for (int i = 0; i < 5; i++) {
			level[i] = new Level(i, 30);
			// i is the levelNumber and 30 is the number of spots per level
			this.levels[i] = level[i];
		}
	}

	// print the state of the parking
	public void print() {
		// print out available space
		for (int i = 0; i < 5 ; i++){
			System.out.print("level" + i + "  ");
			levels[i].print();
			System.out.println();
		}

	}

	public void parkVehicle(Vehicle v) {
		for (int i = 0; i < 5; i++) {
			levels[i].parkVehicle(v);
		}
		
	}

}
