import java.time.LocalDate;

public class DataTypesTest {

public static void main(String[] args)
{
	byte Jayanagar=127;
	short Bangalore = 9999;
	int SouthIndia= 999999999;
	long India=999999999999L;
	 System.out.println("Cars in Jayanagar...."+Jayanagar);
	

	 System.out.println("Cars in Bangalore...."+Bangalore);

	 System.out.println("Cars in SouthIndia...."+SouthIndia);

	 System.out.println("Cars in India...."+India);
	 
	 float interestRate = 8.45656F;
	 double molecularDistance =10.0009F;
	 System.out.println("interest rate ...."+interestRate);
	 System.out.println("moleular Distance...."+molecularDistance);
	
	 char Gender ='M';
	 System.out.println("Gender is.....:"+Gender);
	 
	 boolean areYouCertified=false;
	System.out.println("Are you ertified?"+areYouCertified); 
	
	String myName="Mukhil Sarvesh";
	String mySurname="Sivaprakash";
	System.out.println("My First name is...."+myName);
	System.out.println("My surname is....."+mySurname);
	
	LocalDate today= LocalDate.now();
	System.out.println("Today is...."+today);
	
}

}
