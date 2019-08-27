package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		Student[] s = new Student[10];
		Student[] sss = { new Student("홍순이", 88, 99), new Student("차순이", 82, 93), new Student("고순이", 80, 91),
				new Student("홍길동", 90, 90)

		};

		Arrays.sort(sss);

		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("홍순이", 88, 99));
		list.add(new Student("차순이", 82, 93));
		list.add(new Student("고순이", 80, 91));

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			if (data.getAvg() >= 90)
				System.out.println(data);
		}
		System.out.println(list.contains(new Student("고순이", 80, 91))); // equals() 오버라이딩 되어 있어야합니다.
		// C U R D
		// 홍길동 90 90 등록
		Student s1 = new Student("홍길동", 90, 90);
		boolean flag = list.add(s1);
		if (flag)
			System.out.println(s1 + "등록되었습니다");

		it = list.iterator(); // iterator를 다시쓰려면 다시 해줘야한다.

		while (it.hasNext()) {
			Student data = it.next();
			if (data.name.equals("홍길동")) {
				data.ko = 100;
				data.math = 100;
				data.setAvg();
				System.out.println(data + " 수정되었습니다.");
			}
		}

		System.out.println("학생 list 출력");
		for(Student data : list) {
			System.out.println(data);
		}
		System.out.println("====================");
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			System.out.println(data);
		}

		System.out.println("**** 학생 " + s1 + "정보삭제  ****");
		
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			if (data.equals(s1)) {
				it.remove();
				System.out.println(s1 + "삭제 되었습니다.");
			}
		}
		Collections.sort(list);
		System.out.println("학생 list 출력");
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			System.out.println(data);
		}

	}
}

class Student extends Object implements Comparable<Student> { //sort하려면 implements Comparable을 해야한다.
	String name;
	int ko;
	int math;
	double avg;

	public Student() {

	}

	public Student(String name, int ko, int math) {
		this.name = name;
		this.ko = ko;
		this.math = math;
		setAvg();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKo() {
		return ko;
	}

	public void setKo(int ko) {
		this.ko = ko;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = (ko + math) / 2.;
	}

	@Override
	public String toString() {
		return "Studnet [name=" + name + ", ko=" + ko + ", math=" + math + ", avg=" + avg + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}

}