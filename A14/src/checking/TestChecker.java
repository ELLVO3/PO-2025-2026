package checking;

import static checking.Checker.isEitherNull;

public class TestChecker {
    public static void main(String[] args) {
        String a = null;
        String b = null;
        String c = "c";
        String d = "c";

        System.out.println(isEitherNull(a, b));
        System.out.println(isEitherNull(a, c));
        System.out.println(isEitherNull(c, d));

    }
}
