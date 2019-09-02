package test;

import java.util.List;

import dao.DeptDao;
import vo.Dept;

public class Test09_DeptDao {
	public static void main(String[] args) {
		DeptDao dao = new DeptDao();
		
		dao.getDeptRec().forEach(i -> System.out.println(i));
		System.out.println("---------------------------------");
		dao.getDeptRec(2,3).forEach(i -> System.out.println(i));
//		
//		for(Dept data : dao.getAllDeptRec() ) {
//			System.out.println(data);
//		}

	}
}
