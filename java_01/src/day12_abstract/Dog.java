package day12_abstract;

public class Dog extends Animal {
	String kind;
	String name;

	public String getKind() {
		return kind;
	}

	public Dog() {
		super("강아지");
	}

	public Dog(String kind, String name) {
		super("강아지");
		this.kind = kind;
		this.name = name;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void breath() {

		System.out.println(super.kind+"폐로 숨쉬기");
		
	}

	@Override
	public String toString() {
		return "Dog [kind=" + kind + ", name=" + name + "]";
	}

	
}
