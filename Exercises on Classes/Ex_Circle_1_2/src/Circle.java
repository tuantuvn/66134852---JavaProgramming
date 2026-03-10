
public class Circle {
	private double radius;
	public Circle() {
		radius = 1.0;
		
	}
	public Circle(double r) {
		this.radius = r;
		
	}
	public void setRadius(double radius) {
		this.radius = radius; 
	}
	public double getArea() {
		return 2 * Math.PI * radius;
	}
	public String toString() {
        return "Circle[radius=" + radius + "]";
	}
}
