package day14;

abstract class Shape implements DrawandMove {
	abstract double area();
}

interface Drawable {
	public abstract void draw();
}

interface Moveable {
	void move(int m); // 자동으로 public abstract 처리가 된다
}

interface DrawandMove extends Drawable, Moveable {}

public class Circle extends Shape implements Cloneable{ // implement는 상속보다는 구현해서 쓴다는 의미가 크다.
	public Point p;
	public int r;

	public Circle() {

	}

	public Circle(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}

	@Override
	double area() {
		return r * r * Math.PI;
	}

	@Override
	public void draw() {
		System.out.println(getClass().getName() + "그리기");
		// TODO Auto-generated method stub

	}

	public void move(int m) {
		// TODO Auto-generated method stub
		p.setX(p.getX() - m);
		p.setY(p.getY() - m);

	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		result = prime * result + r;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (r != other.r)
			return false;
		return true;
	}
	@Override
	public Circle clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Circle c = (Circle) super.clone();
		Point p = c.p.clone();
		c.p = p;
		return c;
	}

}
