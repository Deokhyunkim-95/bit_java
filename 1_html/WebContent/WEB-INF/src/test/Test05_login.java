package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import util.JDBCUtil;

public class Test05_login {
	public static void main(String[] args) {
		System.out.println(" 로그인 처리 ");

		Connection con = null;
		Statement st = null;//? 처리 x
		PreparedStatement ps = null;// ? 처리 o
		
		ResultSet rs = null;

		
		String id = null ;
		String pw = null ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요");
		id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		pw = sc.nextLine();
				
//		String sql = "select * from users where id =' "+id+" ' and password = ' "+pw+" ' "; 보안상 위험 sql injection의 대상이 된다.
		String sql = "select * from users where id =? and password = ? "; //?표가 잇는 sql은 statement 사용이 불가
		

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql); //성능이 더 좋다.
			ps.setString(1, id);
			ps.setString(2, pw);
			
			rs = ps.executeQuery();//()안에 sql없음
			
			if(rs.next()) {
				System.out.println(rs.getString("id")+"님 로그인 되었습니다.");
				System.out.printf("%s / %s ",rs.getString("id"),rs.getString("name"));
			}
			else {
				System.out.println("로그인 실패");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			JDBCUtil.close(con, ps, rs);

		}

	}
}
