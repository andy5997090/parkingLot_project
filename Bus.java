/**
 * @author Chien-Chi Liu
 * Class and Section: CS2336-003
 * Final Project
 * 
 * Bus Class will return the String "B" if Bus park into the space, and it require five
 * large spots.
 */
public class Bus extends Vehicle{

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("You park a bus");
		
//		if ((isConsecutive = true) && LargeSpace > 5){
//			totalSpace = totalSpace -5;
//			LargeSpace = LargeSpace -5;
//
//		} else {
//			System.out.println("there is no space for Bus");
//		}
		
//		System.out.println("total spot: " + totalSpace);
//		System.out.println("large spot: " + LargeSpace);
//		System.out.println("small spot: " + SmallSpace);
//		System.out.println("motorcycle spot: " + MotorcycleSpace);

	}
	
	public void park (){
		// five large spots and consecutive
		
	}

	public String getVehicleSpotType(){
		return "B";
	}
	
	public void setSpotNumber(Spot[] spots){
		for (int i = 0 ; i < 5 ; i++){
			this.spots  =  spots ;
		}
	}
	
	public int getSpotNumber(){
		return 5;
	}
	
//	public boolean canFit() {
//		int k = 0;
//		while (spots[k].getSpotSize() == "l") {
//			for (int i = 0; i < 5; i++) {
//				if (spots[k + i].getSpotSize() != "l") {
//					return false;
//				}
//			}
//			k++;
//		}
//		return true;
//	}
}
