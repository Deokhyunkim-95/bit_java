package day06;

public class Animal {
	
	private boolean live;
	private int age;
	private String name;	
	
	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		 if(age < 41 && age > 0) {
			 this.age = age;
		 }
		 else {
			 System.out.println("나이가 잘못 입력 되었습니다.");
			 System.out.println("나이를 다시 입력해주세요");
		 }
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		
		System.out.printf("[나이:%-10s,동물이름:%10s,생존여부:%10s] %n", this.age, this.name, this.live);

	}

}
