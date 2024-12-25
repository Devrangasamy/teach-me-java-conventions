package circlecylinder;

public class Circle {
    private double radius;
    private String color;

    // Default constructor with default radius and color
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor to specify radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Calculate area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }
}
