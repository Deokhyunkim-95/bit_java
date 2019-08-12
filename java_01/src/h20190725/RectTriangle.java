package h20190725;

public class RectTriangle extends Shape{
	double width;
	double height;
	
	public RectTriangle() {
		super(3);
	}
	
	public RectTriangle(double w, double h) {
		super(3);
		this.width=w;
		this.height=h;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (width*height)/2;
	}
	
}
