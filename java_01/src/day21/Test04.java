package day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test04 {
	public static void main(String[] args) {
		new UI_4();
	}
}

class UI_4 extends JFrame implements ActionListener {
	JButton red, blue, exit;
	Panel p1;

	UI_4() {
//		f1 = new Frame("awt UI Test ~~");
		super("awt UI Test ~~");
		p1 = new Panel();
		p1.add(red = new JButton("red"));
		p1.add(blue = new JButton("blue"));
		p1.add(exit = new JButton("종료"));
		add(p1, BorderLayout.SOUTH);

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