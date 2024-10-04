class Rectangle {
    private double length;
    private double breadth;

    Rectangle() {
        length = 10;
        breadth = 20;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return this.length;
    }

    public double getBreadth() {
        return this.breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
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

public class PrivateRectangle {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10.0);
        rectangle.setBreadth(20.0);
        System.out.println("This rectangle is Square? : " + rectangle.isSquare());
        System.out.println("Length is : " + rectangle.getLength());
        System.out.println("Breadth is : " + rectangle.getBreadth());
    }
}
