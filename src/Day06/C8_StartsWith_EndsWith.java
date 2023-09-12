package Day06;

public class C8_StartsWith_EndsWith {

    public static void main(String[] args) {

        String str = "Java candir.";

        System.out.println(str.contains("a")); // true
        System.out.println(str.startsWith("a")); // false
        System.out.println(str.endsWith("a")); // false

        System.out.println(str.startsWith("Java candir.")); // true
        System.out.println(str.endsWith("Java candir.")); // true

        System.out.println(str.endsWith("candir")); // false
        System.out.println(str.startsWith("")); // true
        System.out.println(str.endsWith("")); // true

        System.out.println(str.startsWith("java")); // false
    }
}
