package day21;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.stream.Stream;

import javax.swing.*;

public class Test06 {
	public static void main(String[] args) {
		new DrawImg();
	}
}
class DrawImg extends Frame{
	Image im;
	
	DrawImg(){
		super.setTitle("DrawImg");
		im = Toolkit.getDefaultToolkit().getImage("c://img//2.gif");
		
		String[] fontlist = Toolkit.getDefaultToolkit().getFontList(); //예전에는 썻는데 지금은 쓰지마
		Stream.of(fontlist).forEach(i-> System.out.println(i));
		
		
		setSize(500,500);
		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		repaint();//스스로 paint를 호출해준다.
	}
	public void paint(Graphics g) {
		g.drawImage(im,20,20,450,450,this);
	}
}
