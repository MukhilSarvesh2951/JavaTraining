public class ThreadTest {
	public static void main(String[] args) {
	Rain rain =new Rain("\t\tIt is raining...");
    Snow snow=new Snow("It is Snowing...");
    rain.start();
    snow.start();
}
}
class Rain extends Thread{
	String s;

	public Rain(String s) {
		
		this.s = s;
	}
	void raining() {
		for(int i=0;i<200;i++) {
			System.out.println(s+i);
		}
	}
	public void run() {
		raining();
	}
	
}
class Snow extends Thread
{
	String str;

	
	public Snow(String str) {
		
		this.str = str;
	}


	void snowing() {
		for(int i=0;i<200;i++) {
			System.out.println(str+i);
		}
	}
	public void run() {
		snowing();
	}
	
}
