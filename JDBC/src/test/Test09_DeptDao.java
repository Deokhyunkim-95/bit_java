package test;

import java.util.List;

import DAO.DeptDao;
import VO.Dept;

public class Test09_DeptDao {
	public static void main(String[] args) {
		DeptDao dao = new DeptDao();

		dao.getAllDeptRec().forEach(i -> System.out.println(i));
//		
//		for(Dept data : dao.getAllDeptRec() ) {
//			System.out.println(data);
//		}

	}
}
