package day10;

public class Dog extends Animal{
	private String name = "강아지이름";
	private String kind = "강아지 종류";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Dog() {
		super("강아지과");
	}
	public Dog(String kind, String name) {
		super("강아지과");
		this.kind=kind;
		this.name=name;
	}
	public Dog(String superkind,String kind, String name) {
		super(superkind);
		//super.kind= superkind;
		this.kind = kind;
		this.name = name;
		
	}
	public void dogprint() {
		System.out.printf("[%s : %s : %s]%n",super.kind,this.kind,this.name);
	}
	public String getsuperKind() {
		return super.kind;
	}
	
	public void print() {
//		super.print();
//		System.out.printf("%s : %s %n",kind,name);
		this.dogprint();
	}
}