
package day11;

public class Test01 {

	public static void main(String[] args) {
		Person a = new Student("홍길동", 20, 2012001);
		Person t = new Teacher("이순신", 30, "JAVA");
		Person e = new Employee("유관순", 40, "교무과");

		Person p = a;
		// p.printA();

		((Student) p).print();

		p = t;

		((Teacher) p).print();

		p = e;
		((Employee) p).print();

	}
}