/**
 * @author Chien-Chi Liu
 * Class and Section: CS2336-003
 * Final Project
 * 
 * Purpose of the class: Level class will create 30 empty spots in each level,
 * each level has 6 large spots, 18 compact spots, and 6 motorcycle spots.
 * In the parkVehicle, it will check if it can fit and if there's space available. 
 */
public class Level {
	private int level_num;
	private Spot[] spots = new Spot[30];
	private boolean isAvailable;

	public Level(int level_num, int number_Spots) {

		// l for large spot, m for motorcycle spot, c for compact spot
		int l = 6;
		int c = 18;
		// int m = 6;

		for (int i = 0; i < 30; i++) {
			Spot[] spots = new Spot[30];
			int row = i / 10;
			if (i < l) {
				spots[i] = new Spot(this, "l", i, row);
			} else if (i >= l && i < l + c) {
				spots[i] = new Spot(this, "c", i, row);
			} else {
				spots[i] = new Spot(this, "m", i, row);
			}
			this.spots[i] = spots[i];
		}
		this.level_num = level_num;
		
	}

	public void parkVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++) {
			if (v.canFit() == true && spots[i].isAvailable() == true)
				spots[i].parkVehicle(v);
		}
	}
	
	// for the bus, it require 5 large spots
	public void print() {
		// call the print() in Spot class
		for (int i = 0; i < 30; i++) {
			System.out.print(spots[i].print());
			if (i == 9 || i == 19) {
				System.out.print(" ");
			}
		}
	}
}
