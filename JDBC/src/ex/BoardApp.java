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

import dao.BoardDao;
import dao.UserDao;
import service.BoardServiceimpl;
import service.UserServiceImpl;
import vo.BoardVO;
import vo.UserVO;

public class BoardApp {

	public static void main(String[] args) throws FileNotFoundException {
		new Gui2();
	}
}

class Gui2 extends JFrame {
	BoardDao board = new BoardDao();
	BoardServiceimpl service = new BoardServiceimpl(board);

	JButton insert, update, delete,search, exit;
	TextField TITLE, CONTENT, CNT, ID;

	TextArea output;

	Gui2() throws FileNotFoundException {
		Panel p1 = new Panel();
		p1.add(insert = new JButton("등록"));
		p1.add(update = new JButton("수정"));
		p1.add(delete = new JButton("삭제"));
		p1.add(search = new JButton("검색"));
		p1.add(exit = new JButton("종료"));
		add(p1, BorderLayout.SOUTH);

		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(4, 2));
		p2.add(new JLabel("   Title   "));
		p2.add(TITLE = new TextField(20));
		p2.add(new JLabel("  Content  "));
		p2.add(CONTENT = new TextField(20));
		p2.add(new JLabel("  Cnt  "));
		p2.add(CNT = new TextField(20));
		p2.add(new JLabel("  ID "));
		p2.add(ID = new TextField(20));
		add(p2, BorderLayout.NORTH);

		add(output = new TextArea(15, 50));
		output.setFont(new Font(null, 1, 20));

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		insert.addActionListener(e -> {
			BoardVO vo = new BoardVO();

			vo.setTitle(TITLE.getText());
			vo.setContent(CONTENT.getText());
			vo.setCnt(CNT.getText());
			vo.setId(ID.getText());

			board.insertBoard(vo);
		});
		update.addActionListener(e -> {
			BoardVO vo = new BoardVO();

			vo.setTitle(TITLE.getText());
			vo.setContent(CONTENT.getText());
			vo.setCnt(CNT.getText());
			vo.setId(ID.getText());

			if(board.UpdateBoard(vo)>0) {
				output.setText(board.UpdateBoard(vo)+"개가 수정되었습니다.");
			}
			else
				output.setText("업데이트 실패");
		});
		delete.addActionListener((e) -> {
			BoardVO vo = new BoardVO();

			vo.setTitle(TITLE.getText());
			vo.setContent(CONTENT.getText());
			vo.setCnt(CNT.getText());
			vo.setId(ID.getText());
			
			board.DeleteBoard(vo);	
			if(board.DeleteBoard(vo)>0) {
				output.setText(board.DeleteBoard(vo)+"개가 삭제되었습니다.");
			}
			else
				output.setText("삭제 실패");
			
		});
		search.addActionListener((e) -> {
			BoardVO vo = new BoardVO();

			vo.setTitle(TITLE.getText());
			vo.setContent(CONTENT.getText());
			vo.setCnt(CNT.getText());
			vo.setId(ID.getText());
			
			board.SearchBoard(TITLE.getText()).forEach(i->output.append(i+"\n"));
			
			
		});
		exit.addActionListener(e -> System.exit(0));

	}
}