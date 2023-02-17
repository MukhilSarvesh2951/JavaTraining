
public class BankTest {

	public static void main(String[] args) {
		
		BankAccount BaObjRef1= new BankAccount();
		BankAccount BaObjRef2= new BankAccount();
		BankAccount BaObjRef3= new BankAccount();
		BankAccount BaObjRef4= new BankAccount();
		
		BaObjRef1.deposit(500);
		BaObjRef2.deposit(1000);
		BaObjRef3.deposit(250);
		BaObjRef4.deposit(250);
		
		BaObjRef1.withdraw(1500);
		
		
	}

}
class BankAccount
{
	int accNumber;
	float balance; //global scope
	void withdraw(float amount)
	{
		System.out.println("withdrawing..."+amount);
	}
	void deposit(float amount)
	{
		System.out.println("depositing...."+amount);
	}
}