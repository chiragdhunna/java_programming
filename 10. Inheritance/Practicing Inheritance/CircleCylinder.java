class Circle {
    protected double radius;

    Circle() {
        this.radius = 1;
        System.out.println("Default Constructor of Circle");
    }

    Circle(double radius) {
        this.radius = radius;
        System.out.println("Parameterised Constructor of Circle");

    }

    protected double area() {
        return Math.PI * radius * radius;
    }

    protected double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle {
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

public class CircleCylinder {
    public static void main(String[] args) {
        Cylinder cylindar = new Cylinder(9.32, 1.29);
        System.out.println("Volume is : " + cylindar.volume());
    }
}
