package day20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import day19.Employee;

public class Test01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		
		list.forEach(i ->System.out.print(i+" "));
		System.out.println();
		list.removeIf(i->i%2==0); //조건에 맞는 엘리먼트 삭제
		list.forEach(i ->System.out.print(i+" "));
		
		System.out.println("\n=======================================\n");

		List<Employee> emp =new ArrayList<Employee>();
		emp.add(new Employee(2017001,"홍길동","영업부"));
		emp.add(new Employee(2018002,"고길동","전산부"));
		emp.add(new Employee(2017011,"최길동","인사부"));
		emp.add(new Employee(2019011,"이길동","인사부"));
		
		System.out.println(emp.stream().filter(i->i.getNumber()>2018001).count());
		emp.stream().filter(i->i.getNumber()>2018001).forEach(i->System.out.println());	
		
		Employee[] e = {
				new Employee(2017001,"홍길동","영업부"),
				new Employee(2018002,"고길동","전산부"),
				new Employee(2017011,"최길동","인사부"),
				new Employee(2019011,"이길동","인사부")
		};
		System.out.println("====== Array Stream =====");
		Stream.of(e).filter(i->i.getDept().equals("인사부")).forEach(i->System.out.println(i));
		//배열을 stream으로 바꾼후 인사부 사원만 추출하여 출력
		System.out.println("====== sort =====");
		Stream.of(e).sorted().forEach(i->System.out.println(i));	
		System.out.println("============================================");
		Stream.of(e). //정렬기준을 바꾸기 위해서 사용가능.
		sorted(( o1,  o2) -> o1.getName().compareTo(o2.getName())).forEach(i->System.out.println(i));
	}
}
