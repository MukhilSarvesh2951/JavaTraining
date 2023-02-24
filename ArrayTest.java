
public class ArrayTest {

	public static void main(String[] args) {
		int teamIndia[]= new int[11];
		teamIndia[0]=89;
		teamIndia[1]=45;
		teamIndia[2]=23;
		teamIndia[3]=67;
		teamIndia[4]=90;
		
		int totalScore=0;
		
		for(int i=0; i<teamIndia.length;i++) {
			System.out.println("batsman:"+teamIndia[i]);
			totalScore=totalScore+teamIndia[i];
		}
		System.out.println("TotalScore:"+totalScore);
		
		// TODO Auto-generated method stub

	}

}
