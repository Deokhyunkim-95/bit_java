package D201907019;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		
		Student s = new Student("홍길동",20,200201);
		s.print();
		
		Employee e = new Employee("이순신",30,"JAVA");
		e.print();
		
		Teacher t = new Teacher("유관순",40,"교무과");
		t.print();

	}

}
