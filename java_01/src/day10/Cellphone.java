package day10;

public class Cellphone {

	String model;
	String number;
	int chord;
	
	public Cellphone() {
		
	}
	
	public Cellphone(String model, String number, int chord) {
		this.model=model;
		this.number=number;
		this.chord=chord;
	}

	public void setNumber(String n) {
		number=n;
	}
	public String getModel() {
		return model;
	}
	public int getChord() {
		return chord;
	}
	public String getNumber() {
		return number;
	}
	
	
	class MP3Phone extends Cellphone {
		
		int size;
		public MP3Phone (String model, String num , int chord, int size) {
			super(model,num,chord);
//			this.model=model;
//			this.number=num;
//			this.chord=chord;
			this.size=size;
		}
	}
}
