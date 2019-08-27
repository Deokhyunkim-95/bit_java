package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		String[] names1 = {"이순신","김순신","박순신","강순신"};
		System.out.println(Arrays.toString(names1));
		Arrays.sort(names1);
		System.out.println(Arrays.toString(names1));

		System.out.println("=======================");
		
		List<String> list = new ArrayList<String>();
		list.add("김길동");
		list.add("고길동");
		list.add("홍길동");
		list.add("최길동");
		list.add("박길동");
		list.add("공길동");
		list.add("이길동");

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
		
		List<String> list2 = new ArrayList<String>(list.subList(1, 4));
		System.out.println(list2);
		
		Object[] obj = list.toArray();
		System.out.println("obj = >"+Arrays.toString(obj)); //Object[] type
		
		String[] obj2 = new String[list.size()];
		list.toArray(obj2);
		System.out.println("obj2 => " +Arrays.toString(obj2)); //String[] type
	
		String[] sss = {"111","999","777","333"};
		
		List<String> sslist = new ArrayList<String>(Arrays.asList(sss)); //asList를 사용해서 배열을 ArraysList로 바꾼다.
		System.out.println(sslist);
		
		System.out.println("====list 다루기====");
		System.out.println(list);
		System.out.println(list.contains("이길동")); //contains로 list에 아길동이 있는지 찾는다.
		
		for(int i = 0 ; i<list.size();i++) {
			System.out.println(list.get(i).charAt(0)+"**");
		}
		
		for(String data:list) {
			System.out.print(data+"      ");
		}
		System.out.println();
		Iterator<String> it = list.iterator();  //표준화된 작업
		while (it.hasNext()) {
			String data = it.next();
			if(data.equals("고길동")) {
				System.out.println("고길동 삭제 되었습니다.");
				it.remove();
				
			}
		}
		System.out.println(list);
	}
	
	
}
