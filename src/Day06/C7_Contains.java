package Day06;

public class C7_Contains {

    public static void main(String[] args) {

        String str = "Javaya cok calisirsan, cok cabuk is bulursun";

        System.out.println(str.contains("a")); // true
        System.out.println(str.contains("Java")); // true
        System.out.println(str.contains("java")); // false

        System.out.println(str.contains("av")); // true

        System.out.println(str.contains(" ")); // true

        System.out.println(str.contains("")); // true

        System.out.println(str.contains("cok calis")); // true

    }
}
