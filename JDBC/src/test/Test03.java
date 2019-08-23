package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int deptno = 10;
		if(args.length!=0) {
			 deptno=Integer.parseInt(args[0]);
		}
		
		
		String sql ="select * from emp where deptno="+deptno;
		
		System.out.println("************JDBC TEST************");
		
		Connection con = JDBCUtil.getConnection();
		Statement st = null;
		ResultSet rs = null; //select 결과값
		int result = 0; //dml의 결과값
		
		//1.JDBC DRIVER 설치 : classpath
		//2. 드라이버 로딩
		
		//new orcle.jdbc.oracleDriver()
		try {
//			Class.forName(driver); //driver를 관리해준다.
			
			
			//3. DB로 연결 Connection생성
//			con = DriverManager.getConnection(url,user,pw);
			//4. sql 구문을 관리해 주는 관리 객체(Statement) 생성
			st = con.createStatement();
			//5. sql 실행
			rs = st.executeQuery(sql); //select 구문의 결과값을 가르키는 구조
//			System.out.println(rs.getMetaData().getColumnCount());
			//6. 결과값 핸들링
			
			while(rs.next()) { //cursor라는게 존재하는데  rs.next는 cursor내리는 명령
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\n");
//				st.executeQuery(sql);//select구문
//				st.executeUpdate(sql);//dml구문
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(con, st, rs);
			//7. 자원반납
		}
		

		
		System.out.println("************ end *************");
	}

}
