package day11;

class Teacher extends Person{
	String subject;

	public Teacher() {
		super();
	}
	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject=subject;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void print() {
		super.printA();
		System.out.printf("담당과목 : %s %n",subject);
	}
	
}