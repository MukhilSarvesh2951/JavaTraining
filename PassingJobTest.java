
public class PassingJobTest  {
		public static void main(String[] args) {
			Curd curd=null;
			curd=new Curd("Cow","Sour","White","less",100);
			System.out.println("The curd is "+curd);
			System.out.println("Quantity"+curd.getQuantity());
			System.out.println("Density:"+curd.getDensity());
			System.out.println("Taste is:"+curd.getTaste());
			
		}
		// TODO Auto-generated constructor stub
	}

class Curd{
	String type;
	String taste;
	String colour;
	String density;
	int quantity;
	public Curd(String type, String taste, String colour, String density, int quantity) {
		super();
		this.type = type;
		this.taste = taste;
		this.colour = colour;
		this.density = density;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Curd [type=" + type + ", taste=" + taste + ", colour=" + colour + ", density=" + density + ", quantity="
				+ quantity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

