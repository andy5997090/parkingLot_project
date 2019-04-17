/**
 * @author Chien-Chi Liu
 * Class and Section: CS2336-003
 * Final Project
 * 
 * Motorcycle Class will return the String "M" if Motorcycle park into the space, and it can
 * park at any spot.
 */
public class Motorcycle extends Vehicle{

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("You park a motorcycle");
		
		// park at the large space first 
//		if (LargeSpace > 0 || SmallSpace > 0 || MotorcycleSpace > 0){
//			totalSpace = totalSpace -1;
//			LargeSpace = LargeSpace -1;
//		// if there's no large space then park at small space
//		} else if ((LargeSpace <= 0) && (SmallSpace > 0 || MotorcycleSpace > 0)){
//			totalSpace = totalSpace -1;
//			SmallSpace = SmallSpace -1;
//		// if there's no small space then park at motorcycle space
//		} else if ((LargeSpace <= 0 && SmallSpace <= 0) && (MotorcycleSpace > 0)){
//			totalSpace = totalSpace -1;
//			MotorcycleSpace = MotorcycleSpace -1;
//		}
		
//		System.out.println("total spot: " + totalSpace);
//		System.out.println("large spot: " + LargeSpace);
//		System.out.println("small spot: " + SmallSpace);
//		System.out.println("motorcycle spot: " + MotorcycleSpace);

	}
	
	public void park(){
		
	}

	public String getVehicleSpotType(){
		return "M";
	}
	
	public void setSpotNumber(Spot[] spots){
		this.spots =  spots ;
	}
	
	public int getSpotNumber(){
		return 1;
	}
	
//	public boolean canFit() {
//		if (spots[0].getSpotSize() == "m" ){
//			return true;
//		} else {
//			return false;
//		}
//		
//	}
}
