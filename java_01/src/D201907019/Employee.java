package D201907019;

class Employee extends Person {
	String dept;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age , String dept) {
		super(name,age);
		this.dept=dept;
	}

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public void print() {
		System.out.printf("이 름 :    %4s    나 이 :     %4d    부 서 :     %s %n",super.getName(),super.getAge(),this.dept);
		}	
}
