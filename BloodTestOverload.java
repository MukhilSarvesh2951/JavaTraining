
import java.time.LocalDate;

public class BloodTestOverload
{
	public static void main(String[] args) {
			
		BloodBank P1 = new BloodBank(400,"Ram","B+", LocalDate.of(2022, 5, 9));
		BloodBank P2 = new BloodBank(600,"Raj","A+", LocalDate.of(2022, 5, 10));
		BloodBank P3 = new BloodBank(500,"Rag","O+",  LocalDate.of(2022, 3, 12));
		
	
		
		P1.printPatient();
		P2.printPatient();
		P3.printPatient();
		System.out.println("--------------------");
		
		System.out.println("P1 is stored in..."+P1);
		System.out.println("P2 is stored in..."+P2);
		System.out.println("P3 is stored in..."+P3);
		System.out.println("--------------------");
		
		BloodBank D1 = new BloodBank(400,"Kevin","B+", LocalDate.of(2022, 5, 11),false);
		BloodBank D2 = new BloodBank(600,"Raj","A+", LocalDate.of(2022, 5, 13),false);
		BloodBank D3 = new BloodBank(500,"Rag","O+",  LocalDate.of(2022, 5,15),false);
		
	
	
		D1.printDonor();
		D2.printDonor();
		D3.printDonor();
		
		D1.Credit();
		D2.Credit();
		D3.Credit();
		System.out.println("--------------------");
		System.out.println("D1 is stored in..."+D1);
		System.out.println("D2 is stored in..."+D2);
		System.out.println("D3 is stored in..."+D3);
		System.out.println("--------------------");
	}
	

}

//class is a design of an object			vs	an object is an instance a class	
class BloodBank 
{
	private float Volume; //FILEDS / data member
	private String PatientName;
	private String BloodGroup;
	private LocalDate PatientDate;
	private float DonorVolume;
	private boolean DonorHistory;
	private LocalDate DonorDate;
	private String DonorName;
	private String DonorBloodGroup;
	
	public BloodBank(float volume, String patientName, String bloodGroup, LocalDate patientDate) {
		super();
		this.Volume = volume;
		this.PatientName = patientName;
		this.BloodGroup = bloodGroup;
		this.PatientDate = patientDate;
	}


	



	
	
	

	public BloodBank(float donorVolume, String donorName, String donorBloodGroup, LocalDate donorDate,
			boolean donorHistory) {
		super();
		this.DonorVolume = donorVolume;
		this.DonorName = donorName;
		this.DonorBloodGroup = donorBloodGroup;
		this.DonorDate = donorDate;
		this.DonorHistory = donorHistory;
	}



	

	//METHODS / member functions
	
	public void printPatient(){	
		System.out.println("--------------------");
		System.out.println("Patient Name  : "+PatientName);
		System.out.println("Patient Blood Group    : "+BloodGroup);
		System.out.println("Volume of Blood Needed  : "+Volume);
		System.out.println("Published on : "+PatientDate);
		System.out.println("--------------------");
	}
	
	
	
	public void printDonor(){	
		System.out.println("--------------------");
		System.out.println("Donor Name  : "+DonorName);
		System.out.println("Donor Blood Group    : "+DonorBloodGroup);
		System.out.println("Volume of Blood Taken  : "+DonorVolume);
		System.out.println("Donated on : "+DonorDate);
	}
	public void Credit() 
	{
		System.out.println(DonorName +" blood tested");
		System.out.println(DonorName +" blood transfered");
		System.out.println(DonorName +" certified");
		
	}

	@Override
	public String toString() {
		return "BloodBank [Volume=" + Volume + ", PatientName=" + PatientName + ", BloodGroup=" + BloodGroup
				+ ", PatientDate=" + PatientDate + ", DonorVolume=" + DonorVolume + ", DonorHistory=" + DonorHistory
				+ ", DonorDate=" + DonorDate + ", DonorName=" + DonorName + ", DonorBloodGroup=" + DonorBloodGroup
				+ "]";
	}
	
	
}