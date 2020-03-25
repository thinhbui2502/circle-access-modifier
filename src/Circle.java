public class Circle {
    private double radius = 1;
    private String color = "red";

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public String toString() {
        return "Radius: " + this.radius + " - Color: " + this.color;
    }
}
