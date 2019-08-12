package day06;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		
		Employee emp2 = new Employee();
		emp2.setAge(26);
		emp2.setName("홍길동");
		emp2.setDept("인사부");
		emp2.setSingle(true);
		
		Employee emp3 = new Employee();
		emp3.setAge(27);
		emp3.setName("고길동");
		emp3.setDept("영업부");
		emp3.setSingle(false);
	
		Employee emp4 = new Employee();
		emp4.setAge(28);
		emp4.setName("김길동");
		emp4.setDept("영업부");
		emp4.setSingle(false);

		
		Employee[] emp = { emp1,emp2, emp3, emp4 };
		int sum =0,count=0;
		for (Employee data : emp) {
			// \System.out.println(data.getDept());
			if (data.getDept()!=null && data.getDept().equals("영업부")) {
				sum =sum+data.getAge();
				count++;
				data.display();
			}			
		}
		System.out.println("영업부의 인원은 "+count+"명입니다.");
		System.out.println("영업부의 평균 나이는 "+ (float)sum/count);
		
		System.out.println("== single==");
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].isSingle()) {
				emp[i].display();
			}
		}
	}
}
