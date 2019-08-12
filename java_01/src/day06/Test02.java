package day06;

public class Test02 {
	public static void main(String[] args) {
		
//		int num;
//		String name;
		Employee emp1 = new Employee();//객체생성
		System.out.println(emp1.getAge()+":"+emp1.getName()+":"+emp1.getDept());
		
		Employee emp2 = new Employee();
		emp2.setAge(19);
		emp2.setName("홍길동");
		emp2.setDept("인사부");	
		emp2.setSingle(true);
		System.out.println(emp2.getAge()+":"+emp2.getName()+":"+emp2.getDept()+":"+emp2.isSingle());
		
		Employee emp3 = new Employee();
		emp3.setAge(27);
		emp3.setName("고길동");
		emp3.setDept("영업부");
		emp3.setSingle(false);
		System.out.println(emp3.getAge()+":"+emp3.getName()+":"+emp3.getDept()+":"+emp3.isSingle());
		
		
	}
	
}
