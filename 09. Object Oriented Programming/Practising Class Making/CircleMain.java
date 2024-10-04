class Circle {
    public double radius;

    Circle() {
        radius = 1;
    }

    Circle(double r) {
        radius = r;
    }

    public void area() {
        System.out.println("Area of the circle is : " + (Math.PI * radius * radius));
    }

    public void perimeter() {
        System.out.println("Perimeter of the Circle is : " + (2 * Math.PI * radius));
    }

}

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(3.43);
        circle.area();
    }
}
