package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test04 {
	public static void main(String[] args) {
		
		Map<Integer,Employee> map = new HashMap<Integer,Employee>();
		
		map.put(2017002, new Employee(2017002,"김씨","마케팅부"));
		map.put(2017009, new Employee(2017009,"김씨","마케팅부"));
		map.put(2017012, new Employee(2017012,"홍씨","영업부"));
		map.put(2018002, new Employee(2018002,"박씨","마케팅부"));
		map.put(2019002, new Employee(2019002,"김씨","영업부"));
	
		//사원 조회 사번을 입력하세요 2018002
		
		System.out.println("2018002 사번의 사원 조회 내역");
		System.out.println(map.get(2018002));
		
		
		//우리회사에 근무하는 사원들중 마케팅부에 근무하는 사원출력
		System.out.println(" 마케팅부 사원 목록 출력");
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Integer num = it.next();
			System.out.println("num : "+num);
			Employee emp = map.get(num);
			System.out.println("emp : "+emp);
			if(emp.dept.equals("마케팅부")) {
				System.out.println(emp);
			}
		}
		
		//삭제 사번기준 삭제 2018002
		System.out.println("2018002 사번의 사원 삭제(퇴사처리)");
		System.out.println("삭제 정보 : "+map.remove(2018002));
		System.out.println("2018002 사원 정보 : "+map.get(2018002));
		
		

	}
}
