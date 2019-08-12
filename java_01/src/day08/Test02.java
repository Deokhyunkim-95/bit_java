package day08;

public class Test02 {

	public static void main(String[] args) {
		Student[] students = { 
				new Student("홍길동", 2019001, 90, 99, 71), 
				new Student("김길동", 2019007, 99, 79, 72),
				new Student("최길동", 2019041, 91, 89, 73), 
				new Student("박길동", 2019021, 69, 92, 77),
				new Student("강길동", 2019011, 59, 90, 41) 
				};
		for (Student data : students) {
			if(data.getGrade() == 'B')
			data.print();
		}
	}
}

class Student {
	private String name;
	private int number;
	private int kor;
	private int eng;
	private int math;
	private char grade;

	public Student() {

	}

	public Student(String name, int number, int kor, int eng, int math) {
		this.name = name;
		this.number = number;
//		this.kor = kor;
		this.setKor(kor);
//		this.eng = eng;
		this.setEng(eng);
//		this.math = math;
		this.setMath(math);
		// setGradeProcess();
	}

	public Student(String data) {
		// for()
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if(!checkJumsu(kor)) return;
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if(!checkJumsu(eng)) return;
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(!checkJumsu(math)) return;
		this.math = math;
	}

	public char getGrade() {
		this.setGradeProcess();
		return grade;
	}

	private void setGradeProcess() {
		double avg = (kor + eng + math) / 3.;
		this.grade = avg >= 90 ? 'A' : (avg >= 80 ? 'B' : (avg >= 70 ? 'C' : (avg >= 60 ? 'D' : 'F')));
	}

	private boolean checkJumsu(int num) {
		boolean flag = true;
		
		if (!(num >= 0 && num <= 100)) {
			System.out.println(num + "점수가 유효하지 않습니다.");
			flag = false;
		}
		return flag;
	}

	public void print() {
		System.out.printf("%s, %.2f, %c %n", name, (kor + eng + math) / 3., this.getGrade());
	}
}
