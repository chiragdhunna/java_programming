class Cylindar {
    public double radius;
    public double height;

    Cylindar() {
        radius = 10;
        height = 20;
    }

    Cylindar(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void totalArea() {
        System.out.println("Total Area is : " + 2 * (Math.PI * radius * height + Math.PI * radius * radius));
    }

    public void lidArea() {
        System.out.println("Lid Area is : " + 2 * Math.PI * radius * radius);
    }

    public void volume() {
        System.out.println("Volume is : " + Math.PI * radius * radius * height);
    }

}

public class CylindarMain {
    public static void main(String[] args) {
        Cylindar cylindar = new Cylindar(3.96, 2.67);
        cylindar.totalArea();
    }
}
