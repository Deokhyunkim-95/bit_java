package day12_abstract;

public abstract class Shape {
	
	private String name;
	protected double area;


	public Shape(String name) {
		super();
		this.name=name;	
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract void calculatrionArea();


	public void print() {
		System.out.printf("%s의 면적은 : %s %n",name,area);
	}	
	
}