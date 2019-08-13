package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test06_Command_Map {
	public static void main(String[] args) {
		// Map 구조로 설계
//		Command delete = new DeleteCommand();
//		Command update = new UpdateCommand();
//		Command select = new SelectCommand();
//		Command insert = new InsertCommand();

		Map<String, Command> map = new HashMap<String, Command>();

		map.put("delete", new DeleteCommand());
		map.put("update", new UpdateCommand());
		map.put("select", new SelectCommand());
		map.put("insert", new InsertCommand());
		map.put("new",new Command() {
						@Override
						public void exec() {
							System.out.println("기능추가");
						}
					});

		Scanner scanner = new Scanner(System.in);
		System.out.println("delete update select insert중 하나 입력");
		String cmd = scanner.nextLine(); // delete update select insert

		Command command =map.get(cmd); //map을 돌면서 key값이 cmd로 입력한게 있는지 찾는다.
		System.out.println("command : "+command);
		if(command != null)	command.exec();
		else System.out.println("없는 기능");;
		
	}
}