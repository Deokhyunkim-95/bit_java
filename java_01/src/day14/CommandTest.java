package day14;

import javax.swing.JOptionPane;

public class CommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command cmd = new ListCommand();
		String key = JOptionPane.showInputDialog("list/delete/insert/update");
		
		switch (key) {
		case "delete":
			cmd = new DeleteCommand();
			break;
		case "insert":
			cmd = new InsertCommand();
			break;
		case "update":
			cmd = new UpdateCommand();
			break;

		default:
			break;
		}
		cmd.exec();
		cmd.check();
		
	}

}
