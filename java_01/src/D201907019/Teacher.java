package D201907019;

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
		System.out.printf("이 름 :    %4s    나 이 :     %4d    부 서 :     %s %n",super.getName(),super.getAge(),this.subject);
		}	
}
