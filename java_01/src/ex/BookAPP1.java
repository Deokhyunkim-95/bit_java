package ex;

import java.util.Scanner;

public class BookAPP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String cmd = null;
		String quit = null;

		while (true) {
			System.out.println("******** 명령선택  ********");
			System.out.println("1. insert(등록)");
			System.out.println("2. delete(삭제)");
			System.out.println("3. update(수정)");
			System.out.println("4. quit(종료)");
			System.out.println("************************");
			System.out.println("");
			System.out.println("수행할 명령을 선택하세요!");
			System.out.print("1 2 3 4 중 하나를 선택하세요..");

			// i = inputnumber.nextInt();
			cmd = scanner.nextLine().trim();

			switch (cmd.trim()) {
			case "1":
				System.out.println("insert 작업을 수행하는 기능 호출.");
				break;

			case "2":
				System.out.println("delete 작업을 수행하는 기능 호출.");
				break;

			case "3":
				System.out.println("update 작업을 수행하는 기능 호출.");
				break;

			case "4":
				System.out.println("정말 종료 하려면 q/Q 를 입력하세요");
				quit = scanner.nextLine().trim();
				if (quit.equals("q") || quit.equals("Q")) {
					System.out.println("프로그램을 종료합니다.");
					scanner.close();
					scanner = null;
//					return; //현재의 함수 종료 의미
					System.exit(0); // App종료
				}
				else
					break;

			default:
				System.out.println("없는 명령입니다..");
				break;
			}
		}
	}

}