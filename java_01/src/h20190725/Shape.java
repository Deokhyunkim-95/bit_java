package h20190725;

abstract class Shape {
	int numSides;
	
	public Shape() {
		
	}
	public Shape(int numSides) {
		this.numSides=numSides;
	}
	public int getNumSides() {
		return numSides;
	}
	abstract double getArea();
	
}
