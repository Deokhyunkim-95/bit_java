package day08;

public class Card {
	final static int WIDTH = 100;
	final static int HEIGHT = 250;
	
	String kind = "다이아몬드";
	int number;
	
	public static void main(String[] args) {
//		Card.width=0;
		System.out.println(WIDTH+"*"+HEIGHT);
		System.out.println(new Card().kind);
		
	}
}
