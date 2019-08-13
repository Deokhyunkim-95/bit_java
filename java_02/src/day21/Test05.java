package day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test05 {
	public static void main(String[] args) {
		new UI_5().createUI();;
	}
}

class UI_5 extends JFrame implements ActionListener {
	JButton red, blue, exit;
	TextField msg;
	TextArea output;
	Panel p1,p2;

	void createUI() {
//		f1 = new Frame("awt UI Test ~~");
		super.setTitle("awt UI Test ~~");
		p1 = new Panel();
		p1.add(red = new JButton("red"));
		p1.add(blue = new JButton("blue"));
		p1.add(exit = new JButton("종료"));
		add(p1, BorderLayout.SOUTH);

		p2 = new Panel();
		p2.setLayout(new GridLayout(1,2));
		p2.add(new JLabel("메세지창"));
		p2.add(msg=new TextField());
		add(p2,BorderLayout.NORTH);
		add(output = new TextArea(15,40));
		output.setFont(new Font("Serif", 1, 24));
		
		setSize(300, 300);
		setVisible(true);

		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);

//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				setVisible(false);
//				dispose();
//				System.exit(0);
//			}
//		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		msg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				output.append(msg.getText()+"\n");
				msg.setText("");
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ActionEvent 발생");
		String msg = e.getActionCommand();
		System.out.println(msg);

		switch (msg) {
		case "red":
			p1.setBackground(Color.red);
			break;
		case "blue":
			p1.setBackground(Color.blue);
			break;
		case "종료":
			System.exit(0);
			return;
		default:
			break;
		}

//		if (msg.equals("red")) {
//			p1.setBackground(Color.red);
//		} else if (msg.equals("blue")) {
//			p1.setBackground(Color.blue);
//		} else if (msg.equals("exit")) {
//			setVisible(false);
//		}
	}

}