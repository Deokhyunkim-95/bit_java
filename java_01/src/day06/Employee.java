package day06;

public class Employee {
	// 데이터(변수)+기능(메소드)

	private String name; // 이름
	private String dept; // 부서
	private int age; // 사번정보(201901)
	
	private boolean single;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(!(age>0 && age <= 100)) {
			System.out.println("(age)나이 정보가 올바르지 x");
			
		}
		
		this.age = age;
	}

	public void display() {
		System.out.printf("[나이:%-10s,이름:%10s,부서:%10s, 결혼유무:%10s] %n", this.getAge(), this.getName(), this.getDept(), this.isSingle());
		return;
	}
	

	public boolean isSingle() {
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}
}