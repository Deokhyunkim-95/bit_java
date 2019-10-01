package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

import util.JDBCUtil;
import vo.UserVO;

public class UserDao {
	// Create(insert)
	public int insertUser(UserVO vo) {
		System.out.println("회원등록 완료");
		String sql = "INSERT INTO users(id, password, name, role) VALUES(?,?,?,?) ";

		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);

			// ? 세팅
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getRole());

			// 실행 및 결과값 핸들링
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}

	// Update(id 값이 일치할때 password 변경)
	public int updateUser(UserVO vo) {
		String sql = "update users set id =? where password=?";
		System.out.println("update 완료");

		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());

			// 실행 및 결과값 핸들링
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}

	// Delete(id값 과 password 값이 일치 할 때 삭제) =>FK,PK 값이기 때문에 삭제 잘 안됨. pass

	// 회원리스트 출력
	public List<UserVO> getUsersRec() {
		String sql = "select * from(" + "select rownum row#, id, password, name, role "
				+ "from (select * from users order by rownum)) ";

		List<UserVO> list = new ArrayList<UserVO>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			// ps.setInt(1, 1);
			// ps.setInt(2, 5);//row 5개씩 가져오겠다.
			// 실행 및 결과값 핸들링
			rs = ps.executeQuery();
			while (rs.next()) {
				UserVO vo = new UserVO();
				vo.setId(rs.getString("id")); // MYbatis 에서는 Bookid와 bookid가 같으면 자동으로 rowmapping을 해준다.
				vo.setPassword((rs.getString("password")));
				vo.setName(rs.getString("name"));
				vo.setRole(rs.getString("role"));

				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return list;
	}

	// 로그인
	public UserVO login(UserVO vo) {

		String sql = "select * from users where id=?";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UserVO data = null;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, vo.getId());
			// 실행 및 결과값 핸들링
			rs = ps.executeQuery();


			while (rs.next()) {
				
				data= new UserVO();
				data.setId(rs.getString("id"));
				data.setName(rs.getString("name"));
				data.setRole(rs.getString("role"));
				

				if (BCrypt.checkpw(vo.getPassword(), rs.getString("password"))) {
					System.out.println("It matches");
					return data;
				} else {
					System.out.println("It does not match");
					return null;
					
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return data;
	}
}