package study;

public class Prob10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] s = { 
				new Student("홍길동", 20, 2012001),
				new Teacher("이순신",30,"JAVA"),
				new Employee("유관슌",40,"교무과")
		};
		for(Person data:s) {
			if(data instanceof Employee)((Employee)data).print();
			if(data instanceof Student)((Student)data).print();
			if(data instanceof Teacher)((Teacher)data).print();
		}
		for(Person data:s) {
			data.print();
		}
	}
}

class Person {
	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printA() {
		System.out.printf("이름:%s 나이:%d ", this.getName(), this.getAge());
	}

	public void print() {

	}

}

class Employee extends Person {
	private String dept;

	public Employee() {
		super();
	}

	public Employee(String name, int age) {
		this(name, age, null);
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print() {
		super.printA();
		System.out.printf("부서:%s %n", dept);
	}
}

class Student extends Person {
	private int id;

	public Student() {
	}

	public Student(String name, int age, int id) {
		super(name, age);
//			super.setName(name);
//			super.setAge(age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		super.printA();
		System.out.printf("학번 : %s %n ", id);
	}

}

class Teacher extends Person {
	String subject;

	public Teacher() {
		super();
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print() {
		super.printA();
		System.out.printf("담당과목 : %s %n", subject);
	}

}
