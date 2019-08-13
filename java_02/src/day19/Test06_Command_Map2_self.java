package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test06_Command_Map2_self {
	public static void main(String[] args) {
		// Map 구조로 설계
		Command delete = new DeleteCommand();
		Command update = new UpdateCommand();
		Command select = new SelectCommand();
		Command insert = new InsertCommand();

		Map<String, Command> map = new HashMap<String, Command>();

		map.put("delete", delete);
		map.put("update", update);
		map.put("select", select);
		map.put("insert", insert);

		Scanner scanner = new Scanner(System.in);
		System.out.println("delete update select insert중 하나 입력");
		String cmd = scanner.nextLine(); // delete update select insert

		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String value = it.next();
			System.out.println("value:"+value);
			Command Cmd = map.get(it.next());
			System.out.println("Cmd:"+Cmd);
			if (value.equals(cmd)) {
				Cmd.exec();

			}
		}
	}
}
