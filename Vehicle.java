/**
 * @author Chien-Chi Liu
 * Class and Section: CS2336-003
 * Final Project
 * 
 * This is a abstract class, basically has the methods that Car, Bus, Motorcycle has.
 * 
 */
public abstract class Vehicle{
	
//	int LargeSpace = 30;
//	int SmallSpace = 90 ;
//	int MotorcycleSpace = 30;
//	int totalSpace = 150;
	int spotNumber;
	Spot [] spots  = new Spot [5] ;
	
	String VehicleSpotType;

	public void print() {

	}
	
	public void park(){
		
	}
	
	public String getVehicleSpotType(){
		return null;
		
	}
	
	public void setSpotNumber(Spot[] spots){
		this.spots = spots;
	}
	
	public int getSpotNumber(){
		return 0;
	}
	
	public boolean canFit() {
		return false;
	}


}
