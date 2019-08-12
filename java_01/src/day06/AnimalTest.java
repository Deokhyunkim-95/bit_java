package day06;

import java.util.Scanner;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal rhinoceros = new Animal();
		Scanner input = new Scanner(System.in);
			
		rhinoceros.setAge(3);
		rhinoceros.setName("큰뿔소");
		rhinoceros.setLive(true);
		rhinoceros.display();
		
		System.out.println("이름변경 변경할 이름을 입력해주세요:");
		String cname = input.nextLine();
		
		rhinoceros.setName(cname);
		rhinoceros.display();
	}

}
