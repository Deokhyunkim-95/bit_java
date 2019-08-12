package day06;

public class Test03 {
	public static void main(String[] args) {

//	int num;
//	String name;
		Employee emp1 = new Employee();// 객체생성
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.setAge(01);
		emp2.setName("홍길동");
		emp2.setDept("인사부");
		emp2.setSingle(true);
		emp2.display();

		Employee emp3 = new Employee();
		emp3.setAge(02);
		emp3.setName("고길동");
		emp3.setDept("영업부");
		emp2.setSingle(false);
		emp3.display();
	}
}
