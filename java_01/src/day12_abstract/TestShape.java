package day12_abstract;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shape = new Shape[2];
		
		shape[0] = new Circle("원",10);
		shape[1] = new Rectangular("직사각형",10,20);
		
		for(int i = 0 ; i < shape.length ; i++) {
			shape[i].calculatrionArea();
			shape[i].print();
		}
	}

}
