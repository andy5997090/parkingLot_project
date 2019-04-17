/**
 * @author Chien-Chi Liu
 * Class and Section: CS2336-003
 * Final Project
 * 
 * Purpose of the class: Spot is the class know exactly the size of the spot, and the number
 * of the spot, and the level, row. 
 * isAvailable will check if the space is available. 
 */
public class Spot {

	private String spot;
	private Level level;
	private int spotNumber;
	private int row;
	Vehicle v;

	public Spot(Level level, String spot_size, int spotNumber, int row) {
		this.spot = spot_size;
		this.level = level;
		this.spotNumber = spotNumber;
		this.row = row;
	}

	// why having print in Spot, Level and ParkingLot?
	// I though just having one print to print the all in Spot is enough
	public String print() {
		return spot;
	}

	public void parkVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		if((v.getVehicleSpotType() == spot) && isAvailable() == true){
			this.v = v;
		}
	}

	public String getSpotSize() {
		return spot;
	}

	public int getNumberSpot() {
		return spotNumber;
	}

	public String getVehicleSize(Vehicle v) {
		return v.getVehicleSpotType();
	}

	public int getNumberSpot(Vehicle v) {
		return v.getSpotNumber();
	}

	public boolean isAvailable() {
		if (spot == "l" || spot == "m"
				|| spot == "c") {
			return true;
		}
		return false;
	}

}
