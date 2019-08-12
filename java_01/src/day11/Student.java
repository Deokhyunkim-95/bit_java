package day11;


class Student extends Person {
	private int id;

	public Student() {}
	
	public Student(String name, int age, int id) {
		super(name,age);
//		super.setName(name);
//		super.setAge(age);
		this.id=id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		super.printA();
		System.out.printf("학번 : %s %n ",id);
	}
	
}