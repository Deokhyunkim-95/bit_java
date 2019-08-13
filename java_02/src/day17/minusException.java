package day17;

public class minusException extends Exception {
	public minusException() {
		super("minus Exception : 음수 허용 안돼");
	}
	public minusException(String msg) {
		super(msg);
	}
}
