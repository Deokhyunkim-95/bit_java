package day15;

import javax.swing.JOptionPane;

import day14.Command;

//Test05 람다식으로 바꾼것
//람다식 = 변수에 함수를 등록하여 사용하는 기능
//인터페이스에 추상메소드가 하나만 있어야한다.
public class Test06 {
	public static void main(String[] args) {

		String msg = JOptionPane.showInputDialog("1.list 2.update 3.delete 4.insert q.quit");

		Command list = () -> System.out.println("list");

		Command update = () -> System.out.println("Update");

		Command delete = () -> System.out.println("Delete");

		Command insert = () -> {
			System.out.println("Insert");
		};

		switch (msg) {
		case "1":
			list.exec();
			break;
		case "2":
			update.exec();
			break;
		case "3":
			delete.exec();
			break;
		case "4":
			insert.exec();
			break;
		case "q":
			break;
		default:
			break;
		}
	}

}
