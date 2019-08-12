package day08;

public class BlockTest {
	public static void main(String[] args) {
		Block b1 = new Block();
		b1.print();
		Block b3 = new Block();
		Block b4 = new Block(55);
		b4.print();
	}
}
class Block{
	int i;
	int j;
	static String name;
	static{
//		System.out.println("static { }"); 스태틱자원초기화
		name = "~~~";
	}
	//생성자보다 먼저 수행이 된다. (초기화 블락)
	{	
		this.j=99;
//		System.out.println("{      }");
	}
	public Block() {
		this.j=99;
	}
	public Block(int i) {
		this.j=99;
		this.i = i ;
//		System.out.println("생성자");
	}
	public void print() {
		System.out.printf("i=%s , j = %s , name = %s %n",i,j,name);
	}
}