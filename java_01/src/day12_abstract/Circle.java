package day12_abstract;

public class Circle extends Shape {
	private double radius;

	
	public Circle(String name,double radius) {
		super(name);
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void calculatrionArea() {
		super.setArea(Math.PI*radius*radius);
	}


}
