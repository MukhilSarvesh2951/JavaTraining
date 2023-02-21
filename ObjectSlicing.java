
class MobileShop{
	void enquire(Iphone x, Android y){
		System.out.println("Android is enquired....");
		x.takephoto();
		x.call();
		x.doWork();
		x.takeCurrent();
		System.out.println("............................");
		System.out.println("Iphone is Enquired....");
		y.takephoto();
		y.call();
		y.doWork();
		y .takeCurrent();
	}
	
}
	public class ObjectSlicing {


	public static void main(String args[]) {
		Iphone iphone=new Iphone();
		Android android=new Android();
		Electronics electronics=iphone;
		MobileShop mobileshop=new MobileShop();
		mobileshop.enquire(iphone,android);
		
		
	}

}
class Electronics{
	void takeCurrent() {
		System.out.println("Electronics taking current.....");
	}
	void doWork() {
		System.out.println("Electronics doing some work");
	}
	
}
class Mobile extends Electronics{


	void takeCurrent() {
		// TODO Auto-generated method stub
		System.out.println("Taking current from charger...");
	}

	
	void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Mobile doing some work electronically...");
	}
	void call()
	{
		System.out.println("Mobile is used for calling...");
	}
	void takephoto(){
		System.out.println("Mobile is used for taking photos...");
	}
}
class Laptop extends Electronics{

	@Override
	void takeCurrent() {
		// TODO Auto-generated method stub
		//super.takeCurrent();
		System.out.println("Lapptop taking current from charger...");
	}

	@Override
	void doWork() {
		// TODO Auto-generated method stub
		//super.doWork();
		System.out.println("Laptop doing some work electronically...");
	}
	void coding(){
		System.out.println("Laptop can process code..");
	}
	
}

class Iphone extends Mobile{

	@Override
	void takeCurrent() {
		// TODO Auto-generated method stub
		//super.takeCurrent();
		System.out.println("Iphone taking current from Iphone charger...");
	}

	@Override
	void doWork() {
		// TODO Auto-generated method stub
		//super.doWork();
		System.out.println("Iphone doing work with its IOs processor...");
	}

	@Override
	void call() {
		// TODO Auto-generated method stub
		//super.call();
		System.out.println("Iphone calls...");
	}

	@Override
	void takephoto() {
		// TODO Auto-generated method stub
		//super.takephoto();
		System.out.println("Iphone takes photo with 12 Mp camera");
	}
	void Siri() {
		System.out.println("Iphone has Siri");
	}
	
}
class Android extends Mobile{

	@Override
	void takeCurrent() {
		// TODO Auto-generated method stub
		//super.takeCurrent();
		System.out.println("Androis takes current by 48W charger");
	}

	@Override
	void doWork() {
		// TODO Auto-generated method stub
		//super.doWork();
		System.out.println("Android does work internally using SnapDragon processor..");
	}

	@Override
	void call() {
		// TODO Auto-generated method stub
		//super.call();
		System.out.println("Android calls using Google phone");
	}

	@Override
	void takephoto() {
		// TODO Auto-generated method stub
		//super.takephoto();
		System.out.println("Android takes photo with 48Mp camera");
	}
	void GoogleLens() {
		System.out.println("Android uses GoogleLens");
	}
	
	
}