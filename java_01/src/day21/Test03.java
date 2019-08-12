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

public class Test03 {
	public static void main(String[] args) {
		new UI_3();
	}
}
//dos창에서 실행~~~~~~~~~~~~~~
//awt는 한글로하면 깨지니까 dos창에서 실행
class UI_3 extends Frame implements ActionListener {
	Button red, blue, exit;
	Panel p1;

	UI_3() {
//		f1 = new Frame("awt UI Test ~~");
		super("awt UI Test ~~");
		p1 = new Panel();
		p1.add(red = new Button("red"));
		p1.add(blue = new Button("blue"));
		p1.add(exit = new Button("종료"));
		add(p1, BorderLayout.SOUTH);

		setSize(300, 300);
		setVisible(true);

		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ActionEvent");
//		String msg = e.getActionCommand();
//		System.out.println(msg);

		switch (e.getActionCommand()) {
		case "red":
			p1.setBackground(Color.red);
			break;
		case "blue":
			p1.setBackground(Color.blue);
			break;
		case "종료":
			System.exit(0);
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