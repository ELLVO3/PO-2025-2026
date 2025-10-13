package zestaw2;

// Programowanie obiektowe
// ----------------------------------------
// Operacje na tablicach.
// ----------------------------------------
// mgr inż. Adam Zalewski
// University of Warmia and Mazury in Olsztyn
// Faculty of Mathematics and Computer Science
// Institute of Computer Science
// Chair of Applied Computer Science and Mathematical Modeling

public class zestaw2 {

    // Zadanie 0.
    // Napisz funkcję główną (main).
    public static void main(String[] args){
        int[] tab = generujTablice(500, 0, 350);
        System.out.println(ileNieparzystych(tab));
        System.out.println(ileParzystych(tab));
        System.out.println(ileDodatnich(tab));
        System.out.println(ileUjemnych(tab));
        System.out.println(ileZerowych(tab));
        System.out.println(ileMaxymalnych(tab));
        System.out.println(ileMinimalnych(tab));
        System.out.println(sumaDodatnich(tab));
        System.out.println(sumaUjemnych(tab));
        System.out.println(sumaOdwrotnosci(tab));
        System.out.println(sredniaArytmetyczna(tab));
        System.out.println(sredniaGeometryczna(tab));
        System.out.println(sredniaHarmoniczna(tab));
    }

    // Zadanie 1.
    // Napisz funkcję generujTablice(n, minWartosc, maxWartosc), która generuje tablicę liczb gdzie n oznacza ilość
    // elementów tablicy, minWartosc wartość minimalną w tablicy,
    // a maxWartosc wartość maksymalną.

    static int[] generujTablice(int n, int minWartosc, int maxWartosc){
        int[] tab = new int[n];

        for(int i = 0; i < n; i++){
            tab[i] = (int)(Math.random() * (maxWartosc - minWartosc + 1)) + minWartosc;
        }

        return tab;
    }

    // Zadanie 2.
    // Napisz funkcję wypiszTablice(tab, n, m), która wypisuje na ekranie tablice
    // w formie macierzy o wymiarach n x m. W przypadku gdy n*m
    // jest większe od długości tablicy program wypisuje puste pola.
    // Zadbaj o to, aby liczby były ułożone równo.

    static void zadanie_2(){

    }

    // Zadanie 3.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileNieparzystych(tab)
    //  zliczającą ilość liczb nieparzystych w tablicy.

    static int ileNieparzystych(int[] tab){
        int result = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 == 1){
                result++;
            }
        }
        return result;
    }

    // Zadanie 4.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileParzystych(tab)
    //  zliczające ilość liczb parzystych w tablicy.

    static int ileParzystych(int[] tab){
        int result = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 == 0){
                result++;
            }
        }
        return result;
    }

    // Zadanie 5.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileDodatnich(tab)
    //  zliczające ilość liczb dodatnich w tablicy.

    static int ileDodatnich(int[] tab){
        int result = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                result++;
            }
        }
        return result;
    }

    // Zadanie 6.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileUjemnych(tab)
    //  zliczające ilość liczb ujemnych w tablicy.

    static int ileUjemnych(int[] tab){
        int result = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] < 0){
                result++;
            }
        }
        return result;
    }

    // Zadanie 7.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileZerowych(tab)
    //  zliczające ilość liczb o wartości zero w tablicy.

    static int ileZerowych(int[] tab){
        int result = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == 0){
                result++;
            }
        }
        return result;
    }

    // Zadanie 8.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileMaxymalnych(tab)
    //  zliczające ilość liczb o wartości max w tablicy.

    static int ileMaxymalnych(int[] tab){
        int max = tab[0];
        for(int i = 1; i < tab.length; i++){
            if(max < tab[i]){
                max = tab[i];
            }
        }

        int result = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == max){
                result++;
            }
        }
        return result;
    }

    // Zadanie 9.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileMinimalnych(tab)
    //  zliczające ilość liczb o wartości min w tablicy.

    static int ileMinimalnych(int[] tab){
        int min = tab[0];
        for(int i = 1; i < tab.length; i++){
            if(min > tab[i]){
                min = tab[i];
            }
        }

        int result = 0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i] == min){
                result++;
            }
        }
        return result;
    }

    // Zadanie 10.
    //  Wykorzystując funkcję z zadania 1. napisz funkcje ileUnikalnych(tab)
    //  zliczające ilość liczb, które się nie powtarzają w tablicy.

    static void zadanie_10(){

    }

    // Zadanie 11.
    // Wykorzystując funkcje z zadania 1. napisz funkcje sumaDodatnich(tab)
    // wykonującą odpowiednie operacje arytmetyczne na elemantach tablicy.

    static double sumaDodatnich(int[] tab){
        double suma = 0;
        for(int i: tab){
            if(i > 0){
                suma += i;
            }
        }
        return suma;
    }

    // Zadanie 12.
    // Wykorzystując funkcje z zadania 1. napisz funkcje sumaUjemnych(tab)
    // wykonującą odpowiednie operacje arytmetyczne na elemantach tablicy.

    static double sumaUjemnych(int[] tab){
        double suma = 0;
        for(int i: tab){
            if(i < 0){
                suma += i;
            }
        }
        return suma;
    }

    // Zadanie 13.
    // Wykorzystując funkcje z zadania 1. napisz funkcje sumaOdwrotnosci(tab)
    // wykonującą odpowiednie operacje arytmetyczne na elemantach tablicy.

    static double sumaOdwrotnosci(int[] tab){
        double suma = 0;
        for(int i: tab){
            if(i != 0){
                suma += 1./i;
            }
        }
        return suma;
    }

    // Zadanie 14.
    // Wykorzystując funkcje z zadania 1. napisz funkcje sredniaArytmetyczna(tab)
    // wykonującą odpowiednie operacje arytmetyczne na elemantach tablicy.

    static double sredniaArytmetyczna(int[] tab){
        return (sumaDodatnich(tab) + sumaUjemnych(tab))/tab.length;
    }

    // Zadanie 15.
    // Wykorzystując funkcje z zadania 1. napisz funkcje sredniaGeometryczna(tab)
    // wykonującą odpowiednie operacje arytmetyczne na elemantach tablicy.

    static double sredniaGeometryczna(int[] tab){
        double result = 1;

        for(int i = 0; i < tab.length; i++){
            result *= tab[i];
        }

        return Math.pow(result, 1./tab.length);
    }

    // Zadanie 16.
    // Wykorzystując funkcje z zadania 1. napisz funkcje sredniaHarmoniczna(tab)
    // wykonującą odpowiednie operacje arytmetyczne na elemantach tablicy.

    static double sredniaHarmoniczna(int[] tab){
        return tab.length/sumaOdwrotnosci(tab);
    }

    // Zadanie 17.
    // Napisz funkcje funkcjaLiniowa(tab, a, b) zwracające tablice wartości funkcji.

    static void zadanie_17(){

    }

    // Zadanie 18.
    // Napisz funkcje funkcjaKwadratowa(tab, a, b, c) zwracające tablice wartości funkcji.

    static void zadanie_18(){

    }

    // Zadanie 19.
    // Napisz funkcje funkcjaWykladnicza(tab, a, b) zwracające tablice wartości funkcji.

    static void zadanie_19(){

    }

    // Zadanie 20.
    // Napisz funkcje funkcjaSignum(tab) zwracające tablice wartości funkcji.

    static void zadanie_20(){

    }

    // Zadanie 21.
    // Wykorzystując funkcję z zadania 1. napisz funkcje najdluzszyCiagDodatnich(tab),
    // która wykonuje odpowiednie operacje na tablicy.

    static void zadanie_21(){

    }

    // Zadanie 22.
    // Wykorzystując funkcję z zadania 1. napisz funkcje najdluzszyCiagUjemnych(tab),
    // która wykonuje odpowiednie operacje na tablicy.

    static void zadanie_22(){

    }

    // Zadanie 23.
    // Wykorzystując funkcję z zadania 1. napisz funkcje odwrocTablice(tab),
    // która wykonuje odpowiednie operacje na tablicy.

    static void zadanie_23(){

    }

    // Zadanie 24.
    // Wykorzystując funkcję z zadania 1. napisz funkcje odwrocTablice(tab, indeksStart, indeksStop),
    // która wykonuje odpowiednie operacje na tablicy.

    static void zadanie_24(){

    }

    // Zadanie 25.
    //  Napisz funkcję generujZakres(n, minWartosc, maxWartosc),
    //  która generuje tablicę liczb o równych odstępach od siebie.

    static void zadanie_25(){

    }
}
