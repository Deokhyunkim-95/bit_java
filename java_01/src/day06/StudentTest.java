package day06;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student();
		stu1.setName("홍길동");
		stu1.setGrade(90);
		stu1.setYear(22);
		
		System.out.println("점수:"+stu1.getGrade()+"   이름:"+stu1.getName()+"   	나이:"+stu1.getYear());
	
		
	}

}
