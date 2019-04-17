/**
 * @author Chien-Chi Liu
 * Class and Section: CS2336-003
 * Final Project
 * 
 * Car Class will return the String "C" if car park into the space, and it only require one
 * compact or large spot.
 */
public class Car extends Vehicle{

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("You park a car");

//		totalSpace = totalSpace - 1;
//		if (LargeSpace > 0){
//			LargeSpace = LargeSpace -1;
//		} else if (SmallSpace > 0){
//			SmallSpace = SmallSpace -1;
//		} else {
//			System.out.println("there's no space for car");
//		}
//		System.out.println("total spot: " + totalSpace);
//		System.out.println("large spot: " + LargeSpace);
//		System.out.println("small spot: " + SmallSpace);
//		System.out.println("motorcycle spot: " + MotorcycleSpace);
	}
	
	public void park(){
		
	}
	
	public String getVehicleSpotType(){
		return "C";
	}
	
	public void setSpotNumber(Spot[] spots){
		this.spots  =  spots ;
	}
	
	public int getSpotNumber(){
		return 1;
	}
	
//	public boolean canFit() {
//		if (spots[0].getSpotSize() == "l" || spots[0].getSpotSize() == "c" ){
//			return true;
//		} else {
//			return false;
//		}
//		
//	}
}
