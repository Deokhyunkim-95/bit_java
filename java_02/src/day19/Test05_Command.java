package day19;

import java.util.Scanner;

public class Test05_Command {
	public static void main(String[] args) {
		Command delete = new DeleteCommand();
		Command update = new UpdateCommand();
		Command select = new SelectCommand();
		Command insert = new InsertCommand();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("delete update select insert중 하나 입력");
		String cmd = scanner.nextLine(); //delete update select insert
		
		switch (cmd) {
		case "insert":
			insert.exec();
			break;
		case "update":
			update.exec();
			break;
		case "select":
			select.exec();
			break;
		case "delete":
			delete.exec();
			break;
		default:
			System.out.println("잘못입력했습니다.");
			break;
		}
	}
}
