

public class UserDefinedException {

	

	public static void main(String[] args) {
		Footbal f =new Footbal();
		System.out.println("Football Game starts...");
		try {
		f.playgame();
		}
		catch(NoStarPlayerException e){
			System.out.println("Handler 1:"+e);
			
		}
		catch (RedCardException e) {
			System.out.println("Handler 2:"+e);
		}
		System.out.println("Football game ends...");
		// TODO Auto-generated method stub

	}

}
class Footbal{
	void playgame() {
		System.out.println("Game is starting...");
		double d= Math.random()%10;
		if (d<0.1) {
			NoStarPlayerException star= new NoStarPlayerException("No star player.....");
			throw star;
		}
		else if ( d>0.5&&d<0.9)
		{
			RedCardException red=new RedCardException("You got a red card...");
					throw red;
		}
		else {
			System.out.println("Game went without any errors....");
		}
	}
}
class NoStarPlayerException extends RuntimeException
{

	public NoStarPlayerException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
class RedCardException extends RuntimeException{

	public RedCardException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}