package BridgePattern;

public class PrintMorseCode extends MorseCode {
//garam
	
	public PrintMorseCode(MorseCodeFunction function) {
		super(function);
		// TODO Auto-generated constructor stub
	}

	public PrintMorseCode g(){
		dash();dash();dot();space();
		return this;
	}
	
	public PrintMorseCode a(){
		dot();dash();space();
		return this;
	}
	
	public PrintMorseCode r(){
		dot();dash();dot();space();
		return this;
	}
	
	public PrintMorseCode m(){
		dash();dash();space();
		return this;
	}
}
