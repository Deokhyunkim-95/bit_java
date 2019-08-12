package h20190725;

class Rectangle extends Shape implements Resizable{
	double width;
	double height;
	
	public Rectangle() {
		super(4);
	}
	public Rectangle(double w, double h) {
		super(4);
		this.width=w;
		this.height=h;
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
	double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		this.width = this.getWidth()*s;
		this.height = this.getHeight()*s;
		System.out.println("new area:"+width*height);
		
	}

}
