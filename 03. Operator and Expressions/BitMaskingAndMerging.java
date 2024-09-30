public class BitMaskingAndMerging{
    public static void main(String[] args) {
        int a = 3, b = 12;

        System.out.println("a in Binary is -- >" + Integer.toBinaryString(a));
        System.out.println("b in Binary is -- >" + Integer.toBinaryString(b));

        int mergedBit = a<<4 | b;

        // System.out.println("Merged Bit of a and b is -- > " + (mergedBit|0b00000000));
        System.out.println(String.format("%16s", Integer.toBinaryString(mergedBit)).replace(' ', '0'));

        System.out.println("Number on Left Side of Merged Bit is -- > " + ((mergedBit&0b11110000) >> 4));
        System.out.println("Number on Right Side of Merged Bit is -- > " + ((mergedBit&0b00001111)));
    }
}