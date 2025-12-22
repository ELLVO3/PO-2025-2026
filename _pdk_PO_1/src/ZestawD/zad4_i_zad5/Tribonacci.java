package ZestawD.zad4_i_zad5;

public class Tribonacci {
    public static void main(String[] args) {
        wypiszTribonacci(10);
        System.out.println(sredniaTribonacci(5));
    }

    public static void wypiszTribonacci(int n) {

        int a = 0;
        int b = 0;
        int c = 1;

        for (int i = 0; i < n; i++) {
            int currentValue;

            if (i == 0) {
                currentValue = 0;
            } else if (i == 1) {
                currentValue = 0;
            } else if (i == 2) {
                currentValue = 1;
            } else {
                currentValue = a + b + c;

                a = b;
                b = c;
                c = currentValue;
            }

            if (i == 0) {
                System.out.println(currentValue + " ");
            } else {
                System.out.println(currentValue);
            }
        }
        System.out.println();
    }

    public static double sredniaTribonacci(int n) {
        int a = 0;
        int b = 0;
        int c = 1;
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            int currentValue;

            if (i == 0) {
                currentValue = 0;
            } else if (i == 1) {
                currentValue = 0;
            } else if (i == 2) {
                currentValue = 1;
            } else {
                currentValue = a + b + c;

                a = b;
                b = c;
                c = currentValue;
            }
            sum += currentValue;
        }
        return sum / n;
    }
}