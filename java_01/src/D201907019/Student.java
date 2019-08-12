package D201907019;

class Student extends Person{
	int id;
	
	public Student() {
		
	}
	public Student(String name , int age, int id) {
		super(name,age);
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void print() {
		System.out.printf("이 름 :    %4s    나 이 :     %4d    부 서 :     %s %n",super.getName(),super.getAge(),this.id);
		}	
}
