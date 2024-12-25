package circlecylinder;

public class Cylinder {
    private Circle base;
    private double height;

    // Constructor with default values
    public Cylinder() {
        this.base = new Circle();
        this.height = 1.0;
    }

    // Constructor to specify base radius, color, and height
    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    // Getters and setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    // Calculate volume of the cylinder
    public double volume() {
        return base.area() * height;
    }

    // Calculate surface area of the cylinder
    public double surfaceArea() {
        double baseArea = base.area();
        double lateralSurface = 2 * Math.PI * base.getRadius() * height;
        return 2 * baseArea + lateralSurface;
    }
}
