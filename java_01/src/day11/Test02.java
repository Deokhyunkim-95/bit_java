package day11;

public class Test02 {

	public static void main(String[] args) {
		Person[] p = { new Student("홍길동", 20, 2012001), new Teacher("이순신", 30, "JAVA"),
				new Employee("유관순", 40, "교무과") };
//		Object[] p = { new Student("홍길동", 20, 2012001), new Teacher("이순신", 30, "JAVA"),
//				new Employee("유관순", 40, "교무과") };

//		for (Person data:p) {
//			data.printA();
//			System.out.println();
//		}
//		for (Object data : p) {
//			data.printA();
//			System.out.println();
//		}
//		System.out.println("===========================================================");
//		
		for (Person data : p) {
//			// 자식 영역의 자원을 접글할때는 다운 캐스팅 필요
//			// 반드시 하단부에 어떤 객체가 바인딩 되어 있는지 타입 체크 필요
//			if (data instanceof Student)
//				((Student) data).print();
//			if (data instanceof Teacher)
//				((Teacher) data).print();
//			if (data instanceof Employee)
//				((Employee) data).print();
//
//		}
			data.print();
		}
	}

}