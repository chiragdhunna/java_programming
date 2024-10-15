public class MathDemo {
    public static void main(String[] args) {
        System.out.println("Absolute : ");
        System.out.println(Math.abs(-123));

        System.out.println("Absolute : ");
        System.out.println(StrictMath.abs(-123));

        System.out.println("Cuber Root : ");
        System.out.println(Math.cbrt(27));

        System.out.println("Exact Decrement : ");
        System.out.println(Math.decrementExact(7));

        System.out.println("Convert to Radians : ");
        System.out.println(Math.toRadians(90));

        System.out.println("Floor Division : ");
        System.out.println(Math.floorDiv(50,9));

        System.out.println("e power x : ");
        System.out.println(Math.exp(1));

        System.out.println("Log base 10 : ");
        System.out.println(Math.log10(23));

        System.out.println("Maximum : ");
        System.out.println(Math.max(96, 69));

        System.out.println("Tan : ");
        System.out.println(Math.tan(2.01));

        System.out.println("Random : ");
        System.out.println(Math.random()*10);
    }
}
