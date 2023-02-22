
public class TryAndCatchTest {


	public static void main(String[] args) {
		
		Division c=new Division();
		c.divide(3, 0);
		// TODO Auto-generated method stub
		
		Sentence s =new Sentence();
		s.printStatement();

	}

}
class Division{
	void divide(int num1,int num2) {
		try {
			int div=num1/num2;
			System.out.println("The answer is:"+div);
			}
		catch(ArithmeticException e) {
			System.out.println("Not a Number");
		}
		catch(RuntimeException e) {
			System.out.println("Please supply Numbers");
		}
	}
}

class Sentence{
	void printStatement(){
		try {
			String str="Dassault Systemes,7thBlock,Jayanagar,Bangalore";
			System.out.println("Str       :"+str);
			System.out.println("Str cap    :"+str.toUpperCase());
			System.out.println("str low    :"+str.toLowerCase());
			System.out.println("str charAt :"+str.charAt(9));
			System.out.println("str substr  :"+str.substring(9, 15));
		}
		catch(NullPointerException e){
			System.out.println("String is null...");
			
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String is Invalid...");
		}
		
	}
}