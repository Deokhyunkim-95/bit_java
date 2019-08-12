package day12_abstract;

public abstract class Animal {	//상속을 전제로 만들어진 클래스
	
	protected String kind = "동물의 종류";

	public Animal() {
		super();
	}
	
	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public abstract void breath();

	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("Animal kind : %s " , kind);
		
	}


}
