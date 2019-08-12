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

public class Test02 {
	public static void main(String[] args) {
		new UI_2();
	}
}

class UI_2 extends Frame{
	Button red, blue, exit;
	Panel p1;

	UI_2() {
		super("awt UI Test ~~");
		p1 = new Panel();
		p1.add(red = new Button("red"));
		p1.add(blue = new Button("blue"));
		p1.add(exit = new Button("exit"));
		add(p1, BorderLayout.SOUTH);

		setSize(300, 300);
		setVisible(true);

		red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p1.setBackground(Color.red);
			}
		});

		blue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p1.setBackground(Color.blue);
			}
		});

		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p1.setVisible(false);
				System.exit(0);
			}
		});

		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		class WindowEventP extends WindowAdapter {

			@Override
			public void windowClosing(WindowEvent e) {
//				f1.setVisible(false);
//				f1.dispose();
				System.exit(0);
			}
		}

	}

}