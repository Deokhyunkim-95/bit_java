package day10;

public class Test03 {
	public static void main(String[] args) {
		Time t1 = new Time(13,20,20);
		
		
	}
}

class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		super();//부모의 생성자를 호출하는 문장,없어도 자동호출
	}

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}