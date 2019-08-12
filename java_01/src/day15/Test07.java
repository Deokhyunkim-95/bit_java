package day15;

public class Test07 {

	public static void main(String[] args) {
		AAA a = new AAA() { //extends 생략됨

			@Override
			void exec() {
				// TODO Auto-generated method stub

			}
		};
		III i  = new III() { //implements 생략됨
			
			@Override
			public void exec() {
				// TODO Auto-generated method stub
				
			}
		};
		CCC c = new CCC() {
			void exec() {}
		};
	}
}

abstract class AAA {
	abstract void exec();
}

interface III {
	void exec();
}
class CCC{
	void exec() {
		
	}
}