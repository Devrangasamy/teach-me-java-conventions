package circlecylinder;

public class Main {
    public static void main(String[] args) {

        Cylinder defaultCylinder = new Cylinder();
        System.out.println("Default Cylinder:");
        System.out.println("Base Radius: " + defaultCylinder.getBase().getRadius());
        System.out.println("Base Color: " + defaultCylinder.getBase().getColor());
        System.out.println("Height: " + defaultCylinder.getHeight());
        System.out.println("Volume: " + defaultCylinder.volume());
        System.out.println("Surface Area: " + defaultCylinder.surfaceArea());


        Cylinder customCylinder = new Cylinder(5.0, "blue", 10.0);
        System.out.println("\nCustom Cylinder:");
        System.out.println("Base Radius: " + customCylinder.getBase().getRadius());
        System.out.println("Base Color: " + customCylinder.getBase().getColor());
        System.out.println("Height: " + customCylinder.getHeight());
        System.out.println("Volume: " + customCylinder.volume());
        System.out.println("Surface Area: " + customCylinder.surfaceArea());
    }
}
