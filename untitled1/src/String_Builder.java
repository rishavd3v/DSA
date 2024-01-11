public class String_Builder {
    public static void main(String[] args) {
        // String builder basically makes the string mutable
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);




    }
}
