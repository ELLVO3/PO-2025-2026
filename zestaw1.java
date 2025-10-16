package zestaw1;
import java.util.Scanner;

// Programowanie obiektowe
// ----------------------------------------
// Podstawowe operacje wejścia/wyjścia,
// arytmetyczne, instrukcje warunkowe oraz pętle.
// ----------------------------------------
// mgr inż. Adam Zalewski
// University of Warmia and Mazury in Olsztyn
// Faculty of Mathematics and Computer Science
// Institute of Computer Science
// Chair of Applied Computer Science and Mathematical Modeling

public class zestaw1 {

    // Zadanie 0.
    // Napisz funkcję główną (main).
    public static void main(String[] args) {
        // zadanie_1();
        // zadanie_2();
        // zadanie_3();
        // zadanie_4();
        // zadanie_5();
        // zadanie_6();
        // zadanie_8();
        // zadanie_9();
        // zadanie_10();
        // zadanie_11();
        // zadanie_12();
        // zadanie_13();
        // zadanie_14();
        // System.out.println(zadanie_15());
        // zadanie_16();
        // zadanie_17();
        // zadanie_18();
        // zadanie_19();
        // zadanie_20(5, 2);
        // System.out.println(zadanie_21(5));
        // System.out.println(zadanie_22(5));
        // System.out.println(zadanie_23(5, 3));
        // System.out.println(zadanie_24(10));
        // System.out.println(zadanie_25(10));
        // System.out.println(zadanie_26(10));
        // System.out.println(zadanie_27(3));
        // System.out.println(zadanie_28(2));
        // System.out.println(zadanie_29(2));
        // System.out.println(zadanie_30(30));
    }

    // Zadanie 1.
    // Wypisz swoje imię i nazwisko na ekranie.

    static void zadanie_1() {
        System.out.println("Maciej Wojciechowski");
    }

    // Zadanie 2.
    // Wypisz długość imienia i nazwiska.

    static void zadanie_2() {
        String firstName = "Maciej";
        String lastName = "Wojciechowski";

        System.out.println("Długość Imienia: " + firstName.length());
        System.out.println("Długość Nazwiska: " + lastName.length());
    }

    // Zadanie 3.
    // Za pomocą printf połącz 3 wyrazy "Ala" "ma" "kota"
    // w jeden i wyświetl go na ekranie.

    static void zadanie_3() {
        System.out.printf("%s %s %s", "Ala", "ma", "kota");
    }

    // Zadanie 4.
    // W zdaniu „Ala ma kota” zastąp
    // wszystkie litery „a” literą „e”.

    static void zadanie_4() {
        String text = "Ala ma kota";
        System.out.println(text.replace("a", "e"));
    }

    // Zadanie 5.
    // Napisz program, który będzie pobierał dwa słowa
    // od użytkownika i wypisywał je na ekranie.

    static void zadanie_5() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Podaj pierwsze słowo: ");
        String slowo1 = myObj.nextLine();

        System.out.print("Podaj drugie słowo: ");
        String slowo2 = myObj.nextLine();

        System.out.println(slowo1 + slowo2);
    }

    // Zadanie 6.
    // Napisz program, który będzie pobierał dwie liczby od
    // użytkownika i wypisał ich sumę, różnicę, iloczyn i iloraz.

    static void zadanie_6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        float l1 = sc.nextFloat();

        System.out.print("Podaj drugą liczbę: ");
        float l2 = sc.nextFloat();

        System.out.println("Suma: " + (l1 + l2));
        System.out.println("Różnica: " + (l1 - l2));
        System.out.println("Iloczyn: " + (l1 * l2));
        System.out.println("Iloraz: " + (l1 / l2));
    }


    // Zadanie 8.
    // Napisz program, który będzie pobierał
    // liczbę x od użytkownika i wypisał tę liczbę:
    //      • Powiększoną o 140
    //      • Pomniejszoną o 31
    //      • Powiększoną 7 razy
    //      • Pomniejszoną 13 razy
    //      • Modulo 7
    //      • Część całkowita z dzielenia przez 4
    //      • Podniesioną do potęgi 45
    //      • Iloczyn bitowy z 67
    //      • Suma bitowa z 59
    //      • XOR z 23
    //      • Przesuniętą o 5 bitów w lewo
    //      • Przesuniętą o 6 bitów w prawo

    static void zadanie_8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int x = sc.nextInt();

        System.out.println(x + 140);
        System.out.println(x - 31);
        System.out.println(x * 7);
        System.out.println(x / 13.0);
        System.out.println(x % 7);
        System.out.println(x / 4);
        System.out.println(Math.pow(x, 45));
        System.out.println(x & 67);
        System.out.println(x | 59);
        System.out.println(x ^ 23);
        System.out.println(x << 5);
        System.out.println(x >> 6);
    }

    // Zadanie 9.
    // Napisz program, który sprawdza czy podana
    // liczba jest parzysta i wypisuje odpowiedni komunikat.

    static void zadanie_9() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");

        int liczba = sc.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("Liczba jest parzysta :)");
        } else {
            System.out.println("Liczba nie jest parzysta :(");
        }
    }

    // Zadanie 10.
    // Napisz program, który pobiera od użytkownika trzy liczby
    // i wypisuje je w kolejności rosnącej.

    static void zadanie_10() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj a: ");
        int a = sc.nextInt();

        System.out.print("Podaj b: ");
        int b = sc.nextInt();

        System.out.print("Podaj c: ");
        int c = sc.nextInt();

        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        if (b > c) {
            int t = b;
            b = c;
            c = t;
        }
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        System.out.print(a + "" + b + "" + c);
    }


    // Zadanie 11.
    // Napisz program, który pobiera od użytkownika trzy liczby
    // i wypisuje je w kolejności malejącej.

    static void zadanie_11() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj a: ");
        int a = sc.nextInt();

        System.out.print("Podaj b: ");
        int b = sc.nextInt();

        System.out.print("Podaj c: ");
        int c = sc.nextInt();

        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        if (b < c) {
            int t = b;
            b = c;
            c = t;
        }
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }

        System.out.print(a + "" + b + "" + c);
    }

    // Zadanie 12.
    // Napisz program, który rozwiązuje równanie liniowe ax + b = 0
    // o parametrach a i b podanych przez użytkownika.

    static void zadanie_12() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj liczbę a: ");
        float a = scan.nextFloat();

        System.out.print("Podaj liczbę b: ");
        float b = scan.nextFloat();

        System.out.println("x = " + (-b / a));
    }

    // Zadanie 13.
    // Napisz program, który pobiera od użytkownika wartości parametrów
    // a, b i c, i sprawdza czy można z nich zbudować trójkąt.

    static void zadanie_13() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj a: ");
        int a = sc.nextInt();

        System.out.print("Podaj b: ");
        int b = sc.nextInt();

        System.out.print("Podaj c: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Można zbudować trójkąt :)");
        } else {
            System.out.println("Nie można zbudować trójkąta :(");
        }
    }

    // Zadanie 14.
    // Napisz program, który pobiera od użytkownika wartości parametrów
    // a, b i c, które powinny być bokami pewnego trójkąta
    // i sprawdza czy trójkąt jest ostrokątny, prostokątny czy rozwartokątny.

    static void zadanie_14() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj a: ");
        int a = sc.nextInt();

        System.out.print("Podaj b: ");
        int b = sc.nextInt();

        System.out.print("Podaj c: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a * a + b * b > c * c) {
                System.out.println("Trójkąt jest ostrokątny :>");
            } else if (a * a + b * b == c * c) {
                System.out.println("Trójkąt jest prostokątny :L");
            } else {
                System.out.println("Trójkąt jest rozwartokątny :>>");
            }
        } else {
            System.out.println("Nie można zbudować trójkąta :(");
        }
    }

    // Zadanie 15.
    // Napisz program, który pobiera od użytkownika liczbę m oraz n
    // i zwraca resztę z dzielenia m przez n.

    static int zadanie_15() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbę m: ");
        int m = sc.nextInt();

        System.out.print("Podaj liczbę n: ");
        int n = sc.nextInt();

        return m % n;
    }

    // Zadanie 16.
    // Napisz program, który oblicza podatek należny
    // na podstawie kwoty dochodu podanej przez użytkownika
    // i następujących progów podatkowych:
    //      Kwota wolna od podatku: 30 000 zł
    //      I próg podatkowy: do 120 000 zł stawka 12%
    //      II próg podatkowy: od 120 000 zł stawka 32%
    //      Danina solidarnościowa: od 1 000 000 zł stawka 4%
    // Kwota zmniejszająca podatek wynosi 3 600 zł.

    static void zadanie_16() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj dochód: ");
        float dochod = sc.nextFloat();

        if (dochod < 30000.00) {
            System.out.println("Brak podatku należnego");
        } else if (dochod > 30000.00 && dochod < 120000.00) {
            System.out.println("Podatek należny: " + ((dochod * 0.12) - 3600.00));
        } else if (dochod < 120000.00 && dochod > 1000000.00) {
            System.out.println("Podatek należny: " + ((dochod * 0.32) - 3600.00));
        } else {
            System.out.println("Podatek należny: " + (dochod * 0.04));
        }

    }

    // Zadanie 17.
    // Napisz program, który pobiera od użytkownika liczbę n
    // i wypisze dla długości boków od 1 do n
    // wszystkie trójki pitagorejskie.

    static void zadanie_17() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj liczbę n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (i * i + j * j == k * k && i < j && j < k) {
                        System.out.printf("%d %d %d\n", i, j, k);
                    }
                }
            }
        }
    }

    // Zadanie 18.
    // Napisz program, który pobiera od użytkownika liczbę n
    // i wypisze wszystkie liczby pierwsze od 2 do n.

    static void zadanie_18() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj n: ");

        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean flaga = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flaga = false;
                    break;
                }
            }
            if (flaga) {
                System.out.println(i);
            }
        }
    }

    // Zadanie 19.
    // Napisz program, który pobiera od użytkownika liczbę m i n,
    // a następnie wypisze wszystkie liczby m-cyfrowe,
    // które podzielne są przez n.

    static void zadanie_19() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj m: ");
        int m = sc.nextInt();

        System.out.print("Podaj n: ");
        int n = sc.nextInt();

        int start = (int) Math.pow(10, m - 1);
        int end = (int) Math.pow(10, m) - 1;

        for (int i = start; i <= end; i++) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }

    }

    // Zadanie 20.
    // Napisz program, który wypisze piramidę z gwiazdek (*)
    // w dwóch wariantach, której wysokość jest liczbą n.
    // Program powinien przyjmować dwa argumenty - n (wysokość) i v (wariant).

    static void zadanie_20(int n, int v) {
        if(v == 1){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
        }

        else if(v == 2){
            for(int i = 1; i <= n; i++){
                for(int j = i; j < n; j++){
                    System.out.print(" ");
                }

                for(int k = 1; k <= i; k++){
                    System.out.print(" *");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // Zadanie 21.
    // Napisz program, który obliczy i zwróci silnie liczby n.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_21(int n) {
        int wynik = 1;

        for (int i = n; i > 1; i--) {
            wynik *= i;
        }

        return wynik;
    }

    // Zadanie 22.
    // Napisz program, który obliczy i zwróci silnie podwójną liczby n.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_22(int n) {
        int wynik = 1;

        for (int i = n; i > 1; i -= 2) {
            wynik *= i;
        }

        return wynik;
    }

    // Zadanie 23.
    // Napisz program, który obliczy i zwróci silnie m-tą liczby n.
    // Program powinien przyjmować dwa argumenty - liczbę m oraz n.

    static int zadanie_23(int n, int m) {
        int wynik = 1;

        for (int i = n; i > 1; i -= m) {
            wynik *= i;
        }

        return wynik;
    }

    // Zadanie 24.
    // Napisz program, który obliczy i zwróci sumę n
    // kolejnych liczb naturalnych.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_24(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++){
            suma += i;
        }
        return suma;
    }

    // Zadanie 25.
    // Napisz program, który obliczy i zwróci sumę n
    // kolejnych liczb parzystych.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_25(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++){
            if(i % 2 == 0){
                suma += i;
            }
        }
        return suma;
    }

    // Zadanie 26.
    // Napisz program, który obliczy i zwróci sumę n
    // kolejnych liczb nieparzystych.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_26(int n) {
        int suma = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 != 0){
                suma += i;
            }
        }
        return suma;
    }

    // Zadanie 27.
    // Napisz program, który obliczy i zwróci sumę n
    // liczb będących kwadratami kolejnych liczb naturalnych.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_27(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++){
            suma += i * i;
        }
        return suma;
    }

    // Zadanie 28.
    // Napisz program, który obliczy i zwróci sumę n
    // liczb będących sześcianami kolejnych liczb naturalnych.
    // Program powinien przyjmować jeden argument - liczbę n.

    static int zadanie_28(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++){
            suma += i * i * i;
        }
        return suma;
    }

    // Zadanie 29.
    // Napisz program, który obliczy i zwróci sumę n
    // liczb będących odwrotnościami kolejnych liczb naturalnych.
    // Program powinien przyjmować jeden argument - liczbę n.

    static float zadanie_29(int n) {
        float suma = 0;
        for (int i = 1; i <= n; i++){
            suma += 1.0/i;
        }
        return suma;
    }

    // Zadanie 30.
    // Napisz program, który sprawdza (prawda/fałsz)
    // czy liczba n jest doskonała.
    // Program powinien przyjmować jeden argument - liczbę n.

    static boolean zadanie_30(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return n == suma;
    }
}