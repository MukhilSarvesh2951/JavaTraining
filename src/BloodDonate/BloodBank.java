package BloodDonate;

public class BloodBank {
	
	
	private String personalDetails="Name:Ram...Name disease: CANCER";
	public String BloodGroup="B+";
	public int BloodToBeTaken=10;
	protected int BloodActuallyNeeded=5;
   void Details() {
	   System.out.println("PersonalDetails:"+personalDetails);
	   System.out.println("BloodGroup:"+BloodGroup);
	   System.out.println("Blood to be taken :"+BloodToBeTaken);
	   System.out.println("Blood what actualy is needed...:"+BloodActuallyNeeded);
   }
}
