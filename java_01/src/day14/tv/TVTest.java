package day14.tv;

public class TVTest {
	public static void main(String[] args) {
		
		play(new STV());
		play(new LTV());//low high q
		play(new ITV());
		
	}
	public static void play(TV tv) {
		tv.poweron();
		tv.poweroff();
	}
}
