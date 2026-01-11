package checking;

import static checking.Check.isEqualOrNull;

public class TestCheck {
    public static void main(String[] args) {
        String a = null;
        String b = null;
        String c = "c";
        String d = "d";
        String e = "c";

        System.out.println(isEqualOrNull(a, b));
        System.out.println(isEqualOrNull(c, e));
        System.out.println(isEqualOrNull(a, d));
    }
}
