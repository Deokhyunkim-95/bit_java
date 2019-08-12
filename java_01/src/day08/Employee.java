package day08;

/**
 * documention file을 위한 주석
 * @author kdh
 * @since 2019.07.16
 * @version 1.0
 *
 */
public class Employee {
	static String cName="BIT";
	private String name;
	private String dept;
	private boolean single;
	
	public Employee() { //default생성자,기본생성자 생성자 함수의 역할을 초기화 작업을 주로 한다.
		this("사원이름","ooo부서",true);
		
		//System.out.println("Employee() call");
//		this.name = "사원이름";
//		this.dept = "ooo부서";
//		this.single = true;
		
		
	}
	public Employee(String name,String dept) { //default생성자,기본생성자 생성자 함수의 역할을 초기화 작업을 주로 한다.
		this(name,dept,false);
	//	System.out.printf("Employee(%s,%s) call%n",name,dept);
//		this.name = name;
//		this.dept = dept;

	}
	public Employee(String name,String dept,boolean single) { //default생성자,기본생성자 생성자 함수의 역할을 초기화 작업을 주로 한다.
		//System.out.printf("Employee(%s,%s,%s) call%n",name,dept,single);
		super();
		this.name = name;
		this.dept = dept;
		this.single = single;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		int num = 9;
		this.dept = dept;
	}

	public boolean isSingle() {
		return single;
	}
	/**
	 * 
	 * @param single 미혼인지 ? 
	 */
	public void setSingle(boolean single) {
		this.single = single;
	}
	/**
	 * @param Employee 정보 출력
	 */
	public void print() {
		System.out.println("회사명 : "+cName);
		System.out.printf("[사원명 :%s ,근무부서:%s ,single:%b]%n",name,dept,single);//인스턴스 자원을 안쓴다.
	}
}
