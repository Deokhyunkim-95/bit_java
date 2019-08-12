package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test03 {
	public static void main(String[] args) {
		Student[] s = new Student[10];
		Student[] sss = { new Student("홍순이", 88, 99), new Student("차순이", 82, 93), new Student("고순이", 80, 91),
				new Student("홍길동", 90, 90)

		};

		Arrays.sort(sss);

		Vector<Student> list = new Vector<Student>(5,10);
		System.out.println("capacity:"+list.capacity()); //배열이 크기
		System.out.println("size : "+list.size()); //데이터가 몇개 들어 왔는지
		list.add(new Student("홍순이", 88, 99));
		list.add(new Student("차순이", 82, 93));
		list.add(new Student("고순이", 80, 91));
		System.out.println("capacity:"+list.capacity()); //배열이 크기 처음에 지정된 10개보다 많아서 자동적으로 resizing되어 20으로 됨
		System.out.println("size : "+list.size()); //데이터가 몇개 들어 왔는지

//		Collections.sort((List<String>) list.get(0));
//		System.out.println(list);

//		System.out.println(list);
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

//		list.add(new Student("홍길동",90,90));
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
