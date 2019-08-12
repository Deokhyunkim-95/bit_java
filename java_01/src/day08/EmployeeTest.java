package day08;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
//		emp1.setName("홍길동");
//		emp1.setDept("인사부");
//		emp1.setSingle(true);
		emp1.print();
		
		Employee emp2 = new Employee("고길동","영업부",false);
		
		emp2.print();
		
		Employee emp3 = new Employee("김길동","영업부");
		emp3.print();
		
		Employee emp4 = new Employee("최길동","기술부",false);
		emp4.print();
		

	}

}
