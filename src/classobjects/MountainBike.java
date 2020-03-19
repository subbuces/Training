/**
 * 
 */
package classobjects;

/**
 * @author subbaraop
 *
 */
public class MountainBike extends Bicycle {
	public static int seatHeight;
	/**
	 * @param startCadence
	 * @param startSpeed
	 * @param startGear
	 */
	public MountainBike(int startHeight,int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		seatHeight = startHeight;
		// TODO Auto-generated constructor stub
	}
	
	public static void setHeight(int newValue) {
        seatHeight = newValue;
        System.out.println(seatHeight);
        
    }
	
	public static void main(String[] args) {
		Bicycle myBike = new Bicycle(12,23,2);
		setHeight(20);
		
	}

}
