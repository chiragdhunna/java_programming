class CircleCY {
    protected double radius;

    CircleCY() {
        this.radius = 1;
        System.out.println("Default Constructor of CircleCY");
    }

    CircleCY(double radius) {
        this.radius = radius;
        System.out.println("Parameterised Constructor of CircleCY");

    }

    protected double area() {
        return Math.PI * radius * radius;
    }

    protected double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends CircleCY {
    private double height;

    Cylinder() {
        this.height = 1;
        System.out.println("Default Constructor of Cylinder");

    }

    Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
        System.out.println("Parameterised Constructor of Circle");
    }

    public double volume() {
        return area() * height;
    }
}

public class CircleCYCylinder {
    public static void main(String[] args) {
        Cylinder cylindar = new Cylinder(9.32, 1.29);
        System.out.println("Volume is : " + cylindar.volume());
    }
}
