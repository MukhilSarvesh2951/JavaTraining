
public class WatchTest{

	public WatchTest() {
		// TODO Auto-generated constructor stub
		Clock c= new Clock(12,24,44);
		c.printClock();
		Watch w=new Watch(12,24,33,24,12,2022,"Sunday");
		w.printWatch();
		SmartWatch s=new SmartWatch(11,25,3,24,12,2022,"Sunday",1333,99);
		s.printSmartWatch();
		
	}

}
class Clock{
	int Hours;
	int Minutes;
	int Seconds;
	public Clock(int hours, int minutes, int seconds) {
		super();
		Hours = hours;
		Minutes = minutes;
		Seconds = seconds;
	}
	@Override
	public String toString() {
		return "Clock [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ ", Hours=" + Hours + ", Minutes=" + Minutes + ", Seconds=" + Seconds + "]";
	}
	
	void printClock() {
		 
				System.out.println("Hours : "+Hours);
				System.out.println("Minutes   : "+Minutes);
				System.out.println("Seconds    : "+Seconds);

			}
	}
	
	
	

class Watch extends Clock
{
	int date;
	int month;
	int year;
	String day;
	public Watch(int hours, int minutes, int seconds, int date, int month, int year, String day) {
		super(hours, minutes, seconds);
		this.date = date;
		this.month = month;
		this.year = year;
		this.day = day;
	}
	@Override
	public String toString() {
		return "Watch [Hours=" + Hours + ", Minutes=" + Minutes + ", Seconds=" + Seconds + ", date=" + date + ", month="
				+ month + ", year=" + year + ", day=" + day + "]";
	}
	
	void printWatch() {
		super.printClock();
		System.out.println("date : "+date);
		System.out.println("month   : "+month);
		System.out.println("year    : "+year);
		System.out.println("day   : "+day);

		
		
	}
	
}
class SmartWatch extends Watch
{
	int NoOfSteps;
	int Pulse;
	public SmartWatch(int hours, int minutes, int seconds, int date, int month, int year, String day, int noOfSteps,
			int pulse) {
		super(hours, minutes, seconds, date, month, year, day);
		NoOfSteps = noOfSteps;
		Pulse = pulse;
	}
	@Override
	public String toString() {
		return "SmartWatch [date=" + date + ", month=" + month + ", year=" + year + ", day=" + day + ", Hours=" + Hours
				+ ", Minutes=" + Minutes + ", Seconds=" + Seconds + ", NoOfSteps=" + NoOfSteps + ", Pulse=" + Pulse
				+ "]";
	}
	void printSmartWatch() {
		super.printWatch();
		System.out.println("Number of Steps : "+NoOfSteps);
		System.out.println("Pulse   : "+Pulse);
		
	}
	
	
}