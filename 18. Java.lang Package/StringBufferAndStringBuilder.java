public class StringBufferAndStringBuilder {
    public static void main(String[] args) {

        // It is Thread Safe

        StringBuffer stringBuffer = new StringBuffer("Hello World");
        System.out.println(stringBuffer);
        stringBuffer.append(" added Extra");
        System.out.println(stringBuffer);
        stringBuffer.insert(0, 'a');
        System.out.println(stringBuffer);

        // This is not Thread Safe
        StringBuilder stringBuilder = new StringBuilder("Hello World");
        System.out.println(stringBuilder);
        stringBuilder.append(" added Extra");
        System.out.println(stringBuilder);
        stringBuilder.insert(0, 'a');
        System.out.println(stringBuilder);

    }
}
