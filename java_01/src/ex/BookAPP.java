package ex;

import java.util.Scanner;

public class BookAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		String cmd ;
		Scanner inputnumber = new Scanner(System.in);

		for (;;) {
			System.out.println("******** 명령선택  ********");
			System.out.println("1. insert(등록)");
			System.out.println("2. delete(삭제)");
			System.out.println("3. update(수정)");
			System.out.println("4. quit(종료)");
			System.out.println("************************");
			System.out.println("");
			System.out.println("수행할 명령을 선택하세요!");
			System.out.print("1 2 3 4 중 하나를 선택하세요..");

			//i = inputnumber.nextInt();
			cmd = inputnumber.nextLine();
			i = Integer.parseInt(cmd);
			
			
			if (i == 1) {
				System.out.println("등록 작업을 수행합니다.");
			} else if (i == 2) {
				System.out.println("삭제 작업을 수행합니다.");
			} else if (i == 3) {
				System.out.println("수정 작업을 수행합니다.");
			} else if (i == 4) {
				System.out.println("프로그램 종료.");
				break;
			}
			
			else {
				System.out.println("명령이 없습니다.");
				System.out.println("다시 선택해주세요.");
			}
		}
		inputnumber.close();
		inputnumber=null;
	}
	
}