	package day12_abstract;

public class Rectangular extends Shape {
	private double width;
	private double height;

	
	
	public Rectangular(String name,double width,double height) {
		super(name);
		this.width=width;
		this.height=height;
		// TODO Auto-generated constructor stub
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void calculatrionArea() {
		// TODO Auto-generated method stub
		super.setArea(width*height);
	}

}
