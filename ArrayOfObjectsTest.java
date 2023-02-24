
public class ArrayOfObjectsTest {
	public static void main(String[] args) {
		
		CricketPlayer player1=new CricketPlayer(3,"Sachin",20000,45,42,600,1900,"India",200);
		CricketPlayer player2=new CricketPlayer(4,"Sehwag",6000,50,45,700,250,"India",150);
		CricketPlayer player3=new CricketPlayer(1,"Dravid",14000,5,40,800,2500,"India",100);
		CricketPlayer player4=new CricketPlayer(2,"Kohli",16000,60,33,900,1907,"India",200);
		
		CricketPlayer teamIndia[]=new CricketPlayer[11];
		
		teamIndia[0]= player1;
		teamIndia[1]= player2;
		teamIndia[2]= player3;
		teamIndia[3]= player4;
		try {
		for (int i = 0; i < teamIndia.length; i++) {
			System.out.println(teamIndia[i]);
			teamIndia[i].toString();
			System.out.println("--------------");
			
		}
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
class SportsMan {
	
}
class CricketPlayer extends SportsMan{
	int rank;
	String name;
	int totalRunsMadeTillNow;
	int currentRun;
	int age;
	int totalSix;
	int totalFour;
	String country;
	int StrikeRate;
	
	public CricketPlayer(int rank, String name, int totalRunsMadeTillNow, int currentRun, int age, int totalSix,
			int totalFour, String country, int strikeRate) {
		super();
		this.rank = rank;
		this.name = name;
		this.totalRunsMadeTillNow = totalRunsMadeTillNow;
		this.currentRun = currentRun;
		this.age = age;
		this.totalSix = totalSix;
		this.totalFour = totalFour;
		this.country = country;
		StrikeRate = strikeRate;
	}

	@Override
	public String toString() {
		return "CricketPlayer [rank=" + rank + ", name=" + name + ", totalRunsMadeTillNow=" + totalRunsMadeTillNow
				+ ", currentRun=" + currentRun + ", age=" + age + ", totalSix=" + totalSix + ", totalFour=" + totalFour
				+ ", country=" + country + ", StrikeRate=" + StrikeRate + "]";
	}
	
	
	
	
}