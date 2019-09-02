package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test02 {

	public static void main(String[] args) {

		// [ JDBC ORACLE로 연동 ]
		// - Database 연동 시 JDBC Driver 설치가 필요!

		// [ DB 연동시 필요한 정보들 ]
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // -> 연결하는 data가 있는 곳까지 가기 위한 protocol
		// OCI driver 도 있는데 이건 상용임! 우린 thin 다운받음~
		// 여기서 xe는 X ID Name을 뜻함
		String user = "SCOTT"; // madang, hr
		String pw = "TIGER"; // madang, hr 등등 있는거 다 가능

		// dept
//		String sql = "select * from dept";

		// emp
//		String sql =  "select * from emp"; // -> ; 안들어감!
		// -> 처리하고자 하는 SQL 구문

		// 상사보다 급여가 많은 사원 목록
		String sql = // " " 에 blank 넣어야함!
				"select e.ename as \"사원명\", e.sal as \"사원급여\", m.ename as \"상사명\", m.sal as \"상사급여\"" + // alias &
																										// escape처리
						"from emp e " + "join emp m " + "on e.mgr = m.empno " + "where e.sal > m.sal";

		// view emp_dept로 test 해보깅

		System.out.println("************** JDBC TEST **************");

		Connection con = null;
		Statement st = null;
		ResultSet rs = null; // select 구문의 결과값을 받을 객체
		int result = 0; // DML의 결과값을 받을 객체

		// 1. JDBC Driver 설치 : OJDBC6.jar file을 class path에 추가해서 인식시키기 ->
		// C:\lib\OJDBC6.jar 여기 있다~

		// 2. Driver Loading: Driver 객체를 memory에 띄우기

//		new oracle.jdbc.OracleDriver()  // -> memory에 올라갈 class가 compile time에 결정됨    => 노우 => 이렇게하면 Oracle로만 연동해야함..!
		try {
			Class.forName(driver); // -> memory에 올라갈 class가 runtime에 결정됨
			// -> driver 를 loading하면 driver manager가 관리해줌

			// 3. DB로 연결: Connection 생성

			con = DriverManager.getConnection(url, user, pw);
//			System.out.println(con); //만들어졌는지 확인

			// 4. SQL 구문을 관리해주는 관리 객체(Statement) 생성
			st = con.createStatement();

			// 5. SQL 구문 실행
			rs = st.executeQuery(sql); // 실행해
			// -> 실행 결과값을 rs가 갖고있음!
//			System.out.println(rs);

			// [ .getMetaData().getColumnCount() ]
			// : select 구문의 column 개수 알아보기
//			System.out.println(rs.getMetaData().getColumnCount());

			// 6. 결과값 handling
			while (rs.next()) {
				// -> .next() : cursor를 내리는 명령문

				// dept table
//				System.out.print(rs.getString("deptno")+ "\t");
//				System.out.print(rs.getString("dname")+ "\t");
//				System.out.print(rs.getString("loc")+ "\n");

				// emp table => data type에 맞게 getString 등등 맞게 써라
//				System.out.print(rs.getInt("empno") + "\t");
////				System.out.print(rs.getInt(1) + "\t");
//				       //-> Column Index로 써도 되지만 Column name을 가는게 정확함~~
//				System.out.print(rs.getString("ename") + "\t");
//				System.out.print(rs.getString("job") + "\t");
//				System.out.print(rs.getString("mgr") + "\t");
//				System.out.print(rs.getDate("hiredate") + "\t");
//				System.out.print(rs.getString("sal") + "\t");
//				System.out.print(rs.getString("comm") + "\n");

				// 상사보다 급여가 많은 사원 목록
				System.out.print(rs.getString("사원명") + "\t");
				System.out.print(rs.getString("사원급여") + "\t");
				System.out.print(rs.getString("상사명") + "\t");
				System.out.print(rs.getString("상사급여") + "\n");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver 확인 필요");
			// -> 이거 뜨면 driver이름 제대로 되어 있는지랑 class path 제대로 되있는지 확인해
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// 7. 자원 반납
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (con != null)
					con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		System.out.println("***************** END *****************");

	}
}