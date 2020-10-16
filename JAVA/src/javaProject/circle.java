package javaProject;

public class circle extends point implements caculation{
	double R;
	
	public double getR() {
		return R;
	}

	public void setR(double r) {
		R = r;
	}

	public circle(float x, float y, double r) {
		super(x, y);
		R = r;
	}
	public double area() {
		return (Math.pow(R, 2)*Math.PI);
	}
	public double perimeter() {
		return (R*2*Math.PI);
	}
}
