package ex;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import DAO.UserDao;
import VO.UserVO;
import service.UserServiceImpl;

public class UserApp {

	public static void main(String[] args) throws FileNotFoundException {
		new Gui1();
	}
}

class Gui1 extends JFrame {
	UserDao user = new UserDao();
//	UserVO vo = new UserVO();
	UserServiceImpl service = new UserServiceImpl(user);
	
	JButton insert, update, login, exit;
	TextField PASSWORD, ROLE, ID,NAME;
	
	TextArea output;

	Gui1() throws FileNotFoundException {
		Panel p1 = new Panel();
		p1.add(insert = new JButton("등록"));
		p1.add(update = new JButton("수정"));
		p1.add(login = new JButton("로그인"));
		p1.add(exit = new JButton("종료"));
		add(p1, BorderLayout.SOUTH);

		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(4, 2));
		p2.add(new JLabel("   ID   "));
		p2.add(ID = new TextField(20));
		p2.add(new JLabel("  PASSWORD  "));
		p2.add(PASSWORD = new TextField(20));
		p2.add(new JLabel(" NAME "));
		p2.add(NAME = new TextField(20));
		p2.add(new JLabel("  ROLE  "));
		p2.add(ROLE = new TextField(20));
		add(p2, BorderLayout.NORTH);

		add(output = new TextArea(15, 50));
		output.setFont(new Font(null, 1, 20));

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		update.addActionListener(e -> {
			UserVO vo = new UserVO();
			
			vo.setId(ID.getText());
			vo.setName(NAME.getText());	
			vo.setPassword(PASSWORD.getText());
			vo.setRole(ROLE.getText());
			
			user.UpdateUser(vo);
		});
		insert.addActionListener(e -> {	
			UserVO vo = new UserVO();
			
			vo.setId(ID.getText());
			vo.setName(NAME.getText());
			vo.setPassword(PASSWORD.getText());
			vo.setRole(ROLE.getText());
			
			user.insertUser(vo);
		});
		login.addActionListener((e) -> {
			UserVO vo = new UserVO();
			
			vo.setId(ID.getText());
//			vo.setName(NAME.getText());
			vo.setPassword(PASSWORD.getText());
//			vo.setRole(ROLE.getText());
			
			System.out.println(user.LoginUser(vo));
			
		});
		exit.addActionListener(e -> System.exit(0));

	}
}