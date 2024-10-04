class Rectangle {
    public double length;
    public double breadth;

    Rectangle() {
        length = 10;
        breadth = 20;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area is : " + length * breadth);
    }

    public void perimeter() {
        System.out.println("Perimeter is : " + 2 * (length + breadth));
    }

    public boolean isSquare() {
        return length == breadth;
    }
}

public class RectangleMain {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println("rectangle is : " + rectangle.isSquare());
    }
}
