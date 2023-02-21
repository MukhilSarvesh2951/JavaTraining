class FunctionType{
	private void sysout(String args[])
	{
		int a=10;
	int b=20;
	Calculator c1=new Calculator();
	c1.add();
	int d=c1.subtract(b, a);
	System.out.println(d);
		// TODO Auto-generated method stub

	}
	
		
	
}
class Calculator{
	void add()

	{
		int a=10;
		int b=5;
		System.out.println("The sum is :"+(a+b));
		
	}
	
		int subtract(int j,int k) {
		System.out.println("The difference is:");
        return j-k;
	}
		int multiply() {
			int a=3;
			int b=8;
			return a*b;
			
		}
	void divide(int q, int r) {
	
		System.out.println("The division is:"+(q/r));
}
}
