
public class MultiThreadingTest {

	public static void main(String[] args) {
		//Pen pen = new Pen();
		//pen.start();
		
		//System.out.println("----------");
		
		//FountainPen f  = new FountainPen(null);
		//f.start();
		
		//Pen x = new FountainPen();
		//x.start();
		
		//Writeable x = new Chalk();
		//x.write();
		
		Chalk chalk = new Chalk();
		Pen pen = new Pen(chalk);
		pen.start();
		
		
		//Make a pen object, and on calling pen's start
		//it must invoke the chalks's write
	
	}
}

interface Writeable
{
	void write(); //public abstract
}
class Pen implements Writeable
{
	Writeable w;
	Pen(Writeable w){
		this.w=w;
	}
	Pen(){
		w=this;
			}
	
	void start() {
		System.out.println("Lets start to write...");
		System.out.println("Lets take paper");
		System.out.println("Lets take a surface for the paper......");
		w.write();
	}
	public void write() { //MANDATORY OR NOT? YES
		System.out.println("Writing with pen.....");
	}
}

class FountainPen extends Pen //isA
{
	
		FountainPen(Writeable w) {
		super(w);
		// TODO Auto-generated constructor stub
	}

		// TODO Auto-generated constructor stub
	

	public void write() { //IS IT MANDATORY??? NO - overridden
		System.out.println("Writing with fountain pen.....");
	}
}

class Stone
{
		
}
class Chalk extends Stone implements Writeable
{
	public void write() { //mandatory
		System.out.println("Chalk is writing on the blackboard.....");
	}
}