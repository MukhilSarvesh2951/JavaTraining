public class AbstractClassExample {
	public static void main(String[] args) {
		
		Guitar x = new Guitar();
		
		x.use();
		x.play();
		x.tuneStrings();
		x.pluck();
		
	}
}

abstract class Instrument
{
	abstract void use();
}
abstract class MusicalInstrument extends Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument {

	@Override
	void tuneStrings() { //mandatory - implemented
		System.out.println("Tuning the strings of Guitar....");
		
	}

	@Override
	void play() {
		System.out.println("Playing the strings of Guitar....");
		
	}
	void pluck() { //exclusive
		System.out.println("Plucking the guitar.....");
	}

	@Override
	void use() {
		System.out.println("Using the guitar.....");
		
	}
	
}

class ElectronicGuitar extends Guitar
{
	void preset() {
		System.out.println("Switching on the presets.....");
	}
	void powerOn() {
		System.out.println("Powering on.....");
	}
	void powerOff() {
		System.out.println("Powering off.....");
	}
}


