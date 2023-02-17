
public class FunctionOverloadingTest {

	public static void main(String[] args) {
		Phone myPhone = new Phone();

		myPhone.dial();
		myPhone.dial("Abishek");
		myPhone.dial(9842561711L);

		byte interComm = 120;
		myPhone.dial(interComm);

		byte CountryCode = +91;
		myPhone.dial(CountryCode, 9842561871L);
		myPhone.dial(942561781L, CountryCode);

		// TODO Auto-generated method stub

	}

}

class Phone {
	void dial() {
		System.out.println("dial() nowhere");
	}

	void dial(byte intercommNumber) {
		System.out.println("dial(byte): dial intercomm:" + intercommNumber);
	}

	void dial(String name) {
		System.out.println("dial(String):dialing by Name:" + name);

	}

	void dial(long MobileNumber) {
		System.out.println("dial(long):dialing by mobile:" + MobileNumber);
	}

	void dial(byte CountryCode, long MobileNumber) {
		System.out.println("dial(byte,long): dialing by country code and mobile number:" + CountryCode + MobileNumber);
	}

	void dial(long MobileNumber, byte CountryCode) {
		System.out.println("dial(byte,long): dialing by country code and mobile number:" + CountryCode + MobileNumber);
	}
}