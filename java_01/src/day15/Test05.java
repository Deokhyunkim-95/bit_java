package day15;

import javax.swing.JOptionPane;

import day14.Command;

public class Test05 {
	public static void main(String[] args) {
		
		String msg = JOptionPane.showInputDialog("1.list 2.update 3.delete 4.insert q.quit");

		Command list = new Command() {

			@Override
			public void exec() {
				System.out.println("list");
			}
		};

		Command update = new Command() {

			@Override
			public void exec() {
				System.out.println("Update");
			}
		};

		Command delete = new Command() {
			@Override
			public void exec() {
				// TODO Auto-generated method stub
				System.out.println("Delete");
			}
		};

		Command insert = new Command() {
			@Override
			public void exec() {
				// TODO Auto-generated method stub
				System.out.println("Insert");
			}
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
