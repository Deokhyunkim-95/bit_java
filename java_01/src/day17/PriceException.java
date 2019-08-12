package day17;

public class PriceException extends Exception {
	public PriceException() {
		super("PriceException : 음수 허용 안돼");
	}
	public PriceException(String msg) {
		super(msg);
	}
}
