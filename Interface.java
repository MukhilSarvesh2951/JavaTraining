
public class Interface {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		useTurbo e=new TDIEngine();
		takeDiesel d=new DieselEngine();
		takePetrol p=new PetrolEngine();
		d.takediesel();
		p.takePetrol();
		CarCompare c= new CarCompare();
		c.compareFuel(d,p);
		
		
		

	}

}

class CarCompare{
	void compareFuel(takeDiesel d,takePetrol p){
		d.takediesel();
		p.takePetrol();
		
	}
	


}

abstract class Engine{
	void takefuel() {
		System.out.println("Engine is taking fuel in...");
	};
	abstract void compress() ;
	abstract void combust();
	abstract void expand();
	abstract void exhaust() ;
}
interface takeDiesel{
	void takediesel() ;
}
interface useTurbo {
	void useTurbo();
}
interface takePetrol{
	void takePetrol() ;
}


class DieselEngine extends Engine implements takeDiesel{
	
	@Override
	public void takediesel() {
		System.out.println("Diesel Engine takes in diesel fuel....");
		// TODO Auto-generated method stub
		
	}

	@Override
	void compress() {
		System.out.println("Diesel Engine Compresses fuel...");
		// TODO Auto-generated method stub
		
	}
	@Override
	void combust() {
		System.out.println("Diesel Engine carries combustion...");
		// TODO Auto-generated method stub
		
	}
	

	@Override
	void expand() {
		System.out.println("Diesel Engine carries out expansion...");
		// TODO Auto-generated method stub
		
	}

	@Override
	void exhaust() {
		System.out.println("Diesel Engine exhausts exhaust gas...");
		// TODO Auto-generated method stub
		
	}
	

	
}
class TDIEngine extends DieselEngine implements takeDiesel,useTurbo{
	
	

	@Override
	public void takediesel() {
		// TODO Auto-generated method stub
		
		System.out.println("Diesel is taken in....");
	}

	@Override
	void compress() {
		// TODO Auto-generated method stub
		System.out.println("Compression in TDI");
	}

	@Override
	void combust() {
		// TODO Auto-generated method stub
		System.out.println("Combustion in TDI...");
	}

	@Override
	void expand() {
		// TODO Auto-generated method stub
		System.out.println("Expansion in TDI engine....");
	}

	@Override
	void exhaust() {
		// TODO Auto-generated method stub
		System.out.println("Exhaust is done....");
	}

	@Override
	public void useTurbo() {
		System.out.println("TDI engine uses turbocharger...");
		// TODO Auto-generated method stub
		
	}

	
}
class PetrolEngine extends Engine implements takePetrol{

	@Override
	void compress() {
		System.out.println("PetrolEngine compresses petrol");
		// TODO Auto-generated method stub
		
	}

	@Override
	void combust() {
		System.out.println("PetrolEngine combustion is high");
		// TODO Auto-generated method stub
		
	}

	@Override
	void expand() {
		System.out.println("PetrolEngine expands lessl");
		// TODO Auto-generated method stub
		
	}

	@Override
	void exhaust() {
		System.out.println("PetrolEngine exhausts less");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takePetrol() {
		System.out.println("PetrolEngine takes petrol");
		// TODO Auto-generated method stub
		
	}
	
}


