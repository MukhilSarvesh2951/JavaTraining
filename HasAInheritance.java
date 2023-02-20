import java.time.LocalDate;

public class HasAInheritance {

	public HasAInheritance() {
		Player player=new Player();
		player.setPlayer("field", "Mukhil", 'M');
		player.personaldetails.setPersonalDetails("4255 5677 8766", "Blore", 29052001, "image.jpg", "9842561871");
		FootballPlayer footballplayer=new FootballPlayer();
		footballplayer.football.setFootball("Adidas", "Red");
		footballplayer.boots.setBoots("Adidas", "Blue");
		footballplayer.boots.lace.setLace(200, "blue");
		footballplayer.medicalhistory.setMedicalHistory(80, 120, "good", 29052001, "no smoke", "no alcohol", "B+", 178, 70);
		
		// TODO Auto-generated constructor stub
	}

}
class Player
{
	String sport;
	String Name;
	char gender;
	PersonalDetails personaldetails=new PersonalDetails();
	public void setPlayer(String sport, String name, char gender) {
		this.sport = sport;
		Name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Player [sport=" + sport + ", Name=" + Name + ", gender=" + gender + "]";
	}
	
	

}
class PersonalDetails
{
	String aadharNumber;
	String address;
	int birthdate;
	String photograph;
	String phoneNumber;
	
	void setPersonalDetails(String aadharNumber, String address, int i, String photograph,
			 String phoneNumber) {
		
		this.aadharNumber = aadharNumber;
		this.address = address;
		this.birthdate = i;
		this.photograph = photograph;
		this.phoneNumber = phoneNumber;
	}
	
	void printAdhaarCardDetails() {
		System.out.println("-------------------------");
		
		System.out.println("Adhaar Number    : "+aadharNumber);
		System.out.println("Address   : "+address);
		System.out.println(" birthdate : "+birthdate);
		System.out.println(" Photo     : "+photograph);
		System.out.println("Phone     : "+phoneNumber);
		System.out.println("-------------------------");
	}
}
	


class FootballPlayer extends Player
{
    PersonalDetails personal=new PersonalDetails();
    Football football=new Football();
    Boots boots=new Boots();
    Jersey jersey=new Jersey();
    MedicalHistory medicalhistory=new MedicalHistory();
    MediKit medicalkit= new MediKit();
    int NoOfGoals;
    String position;
	public void setFootballPlayer(int noOfGoals, String position) {
		NoOfGoals = noOfGoals;
		this.position = position;
	}
	@Override
	public String toString() {
		return "FootballPlayer [sport=" + sport + ", Name=" + Name + ", gender=" + gender + ", NoOfGoals=" + NoOfGoals
				+ ", position=" + position + "]";
	}
	
    
}

class Football{
	String brand;
	String colour;
	public void setFootball(String brand, String colour) {
		this.brand = brand;
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Football [brand=" + brand + ", colour=" + colour + "]";
	}
	
	
	
}
class Boots{
	Lace lace=new Lace();
	String Bootbrand;
	String Bootcolour;
	public  void setBoots(String bootbrand, String bootcolour) {
		
		Bootbrand = bootbrand;
		Bootcolour = bootcolour;
	}
	@Override
	public String toString() {
		return "Boots [Bootbrand=" + Bootbrand + ", Bootcolour=" + Bootcolour + "]";
	}
	
	
}
class Lace{
	int length;
	String colour;
	public void setLace(int length, String i) {
		this.length = length;
		this.colour = i;
	}
	@Override
	public String toString() {
		return "Lace [length=" + length + ", colour=" + colour + "]";
	}
	
	
	
	
}
class Jersey{
	Logo logo=new Logo();
	int ShirtSize;
	int ShortSize;
	
	
}
class Logo{
	String photo;
	String name;
	public void setLogo(String photo, String name) {
		this.photo = photo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Logo [photo=" + photo + ", name=" + name + "]";
	}
	
	
}
class MedicalHistory{
	String bloodPressure; //130/90
	String sugarLevel; //both fasting /pp  140/160
	String eyeSight;
	LocalDate lastDateDiagnosed;
	String smokingHistory;
	String alcoholHistory;
	String bloodGroup;
	int height;
	int weight;
	
	public void setMedicalHistory(int i, int j, String eyeSight, int k,
			String smokingHistory, String alcoholHistory, String bloodGroup, int height, int weight) {
		this.bloodPressure = i;
		this.sugarLevel = j;
		this.eyeSight = eyeSight;
		this.lastDateDiagnosed = k;
		this.smokingHistory = smokingHistory;
		this.alcoholHistory = alcoholHistory;
		this.bloodGroup = bloodGroup;
		this.height = height;
		this.weight = weight;
	
}
@Override
	public String toString() {
		return "MedicalHistory [bloodPressure=" + bloodPressure + ", sugarLevel=" + sugarLevel + ", eyeSight="
				+ eyeSight + ", lastDateDiagnosed=" + lastDateDiagnosed + ", smokingHistory=" + smokingHistory
				+ ", alcoholHistory=" + alcoholHistory + ", bloodGroup=" + bloodGroup + ", height=" + height
				+ ", weight=" + weight + "]";
	}

}
class MediKit{
	Bandage bandage=new Bandage();
	Painkiller painkiller=new Painkiller();
	EnergyDrink energydrink=new EnergyDrink();
	
}
	

class Bandage{
	int length;
	int breadth;
	int quantity;
	public void setBandage(int length, int breadth, int quantity) {
		
		this.length = length;
		this.breadth = breadth;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Bandage [length=" + length + ", breadth=" + breadth + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
class Painkiller{
	Syringe syringe=new Syringe();
	Glucose glucose=new Glucose();
	
}
class Syringe{
	Medicine medicine=new Medicine();
	Needle needle=new Needle();
	String name;
	public void setSyringe(String name) {
		
		this.name = name;
	}
	@Override
	public String toString() {
		return "Syringe [name=" + name + "]";
	}
	
	
	
	
}
class Needle{
	int length;
	int dia;
	public void setNeedle(int length, int dia) {
		
		this.length = length;
		this.dia = dia;
	}
	@Override
	public String toString() {
		return "Needle [length=" + length + ", dia=" + dia + "]";
	}
	
}
class Medicine{
	int dosage;
	int quantity;
	public void setMedicine(int dosage, int quantity) {
		
		this.dosage = dosage;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Medicine [dosage=" + dosage + ", quantity=" + quantity + "]";
	}
	
	
}
class Glucose{
	String name;
	int volume;
	int quantity;
	public void setGlucose(String name, int volume, int quantity) {
		this.name = name;
		this.volume = volume;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Glucose [name=" + name + ", volume=" + volume + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
class EnergyDrink{
	String name;
	int quantity;
	public void setEnergyDrink(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "EnergyDrink [name=" + name + ", quantity=" + quantity + "]";
	}
	
	
}