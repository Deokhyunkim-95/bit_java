package day19_ex;

import java.util.Scanner;

public class BookAPP {
	static int num=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookMgr2 mgr = new BookMgr2();
		
		Scanner scanner = new Scanner(System.in);
		String cmd = null;
		String quit = null;

		while (true) {
			System.out.println("******** 명령선택  ********");
			System.out.println("1. insert(등록)");
			System.out.println("2. delete(삭제)");
			System.out.println("3. 목록 출력");
			System.out.println("4. 도서 검색");
			System.out.println("q. quit(종료)");
			System.out.println("************************");
			System.out.println("");
			System.out.println("수행할 명령을 선택하세요!");
			System.out.print("1 2 3 4 5 중 하나를 선택하세요..");

			// i = inputnumber.nextInt();
			cmd = scanner.nextLine().trim();

			switch (cmd.trim()) {
			case "1":
				System.out.println("insert 작업을 수행하는 기능 호출.");
				System.out.println("Book title을 입력하세요");
				String title = scanner.nextLine();
				System.out.println("Book 가격 입력하세요");
				int price = scanner.nextInt();
				scanner.nextLine();
				mgr.addBook(new Book(++num, title,price));
				break;

			case "2":
				System.out.println("delete 작업을 수행하는 기능 호출.");
				System.out.println("Book title을 입력하세요");
				title = scanner.nextLine();
				mgr.deleteBook(title);
				break;

			case "3":
				System.out.println("몰록출력 작업을 수행하는 기능 호출.");
				mgr.printBookList();
				break;
			
			case "4":
				System.out.println("도서검색 하는 기능 호출.");
				System.out.println("Book title을 입력하세요");
				title = scanner.nextLine();
				mgr.searchTitlebook(title);
				break;
				
			case "q":
				System.out.println("정말 종료 하려면 q/Q 를 입력하세요");
				quit = scanner.nextLine().trim();
				if (quit.equals("q") || quit.equals("Q")) {
					System.out.println("프로그램을 종료합니다.");
					scanner.close();
					scanner = null;
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