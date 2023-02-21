
public class FinalTest {

	
		public static void main (String[] args) {
			Test test=new Test();
			test.OpenAccount();
		}
		// TODO Auto-generated constructor stub
	}


class Test{
	final String q1="What is your Name?";
	final String q2="What is your Employee ID?";
	final String q3="What is your Passcode?";
	void OpenAccount(){
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		
	}
}
