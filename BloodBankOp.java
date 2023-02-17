
import java.time.LocalDate;

/*public class BloodBankOp {
	public static void main(String[] args) {
			
		BloodBank P1 = new BloodBank();
		BloodBank P2 = new BloodBank();
		BloodBank P3 = new BloodBank();
		
	
		P1.setPatient(400,"Ram","B+", LocalDate.of(2022, 5, 9));
		P2.setPatient(600,"Raj","A+", LocalDate.of(2022, 5, 10));
		P3.setPatient(500,"Rag","O+",  LocalDate.of(2022, 3, 12));
		
		P1.printPatient();
		P2.printPatient();
		P3.printPatient();
		System.out.println("--------------------");
		
		System.out.println("P1 is stored in..."+P1);
		System.out.println("P2 is stored in..."+P2);
		System.out.println("P3 is stored in..."+P3);
		System.out.println("--------------------");
		
		BloodBank D1 = new BloodBank();
		BloodBank D2 = new BloodBank();
		BloodBank D3 = new BloodBank();
		
	
		D1.setDonor(400,"Kevin","B+", LocalDate.of(2022, 5, 11),false);
		D2.setDonor(600,"Raj","A+", LocalDate.of(2022, 5, 13),false);
		D3.setDonor(500,"Rag","O+",  LocalDate.of(2022, 5,15),false);
		
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
/*class BloodBank 
{
	float Volume; //FILEDS / data member
	String PatientName;
	String BloodGroup;
	LocalDate PatientDate;
	float DonorVolume;
	boolean DonorHistory;
	LocalDate DonorDate;
	String DonorName;
	String DonorBloodGroup;
	
 
	
	//METHODS / member functions
	public void setPatient(float a, String b, String c, LocalDate e) 
	{
		System.out.println("setting inital Patient details....");
		Volume=a;
		PatientName=b;
		BloodGroup=c;
		PatientDate=e;
	}
	
	public void printPatient(){	
		System.out.println("--------------------");
		System.out.println("Patient Name  : "+PatientName);
		System.out.println("Patient Blood Group    : "+BloodGroup);
		System.out.println("Volume of Blood Needed  : "+Volume);
		System.out.println("Published on : "+PatientDate);
		System.out.println("--------------------");
	}
	public void setDonor(float a, String b, String c, LocalDate e,boolean f) 
	{
		System.out.println("--------------------");
		System.out.println("setting inital Donor details....");
		DonorVolume=a;
		DonorName=b;
		DonorBloodGroup=c;
		DonorDate=e;
		DonorHistory=f;
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
	} */
	
	
