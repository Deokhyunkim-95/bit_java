package day11;

class Employee extends Person{
	private String dept;
	
	public Employee() {
		super();
	}
	
	public Employee(String name , int age) {
		this(name,age,null);
	}
	public Employee(String name, int age, String dept) {
		super(name,age);
		this.dept=dept;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		super.printA();
		System.out.printf("부서:%s %n",dept);
	}
}