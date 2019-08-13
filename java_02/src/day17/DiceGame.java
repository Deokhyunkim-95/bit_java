package day17;

public class DiceGame {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DiceGame game = new DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 : " + result1);

		System.out.println("====================================================");

		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 : " + result2);
	}

	int countSameEye(int n) {
		
		Dice dice = new Dice(8);
		Dice dice1 = new Dice(8);
		int a = 0;
		int b = 0;
		int count = 0;
		if (n >= 0) {
			for (int i = 0; i <= n; i++) {
				a = dice.play();
				b = dice1.play();
				System.out.println("a:" + a + "/b:" + b);
				if (a == b) {
					count++;
				}
			}
		}
		else
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println("주사위 면의 갯수는 마이너스가 될수 없습니다.");
			}
		return count;

	}

}
