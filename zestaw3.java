package _zestaw3;

import java.util.ArrayList;

// Programowanie obiektowe
// ----------------------------------------
// Operacje na listach tablicowych.
// ----------------------------------------
// mgr inż. Adam Zalewski
// University of Warmia and Mazury in Olsztyn
// Faculty of Mathematics and Computer Science
// Institute of Computer Science
// Chair of Applied Computer Science and Mathematical Modeling

public class zestaw3 {

    // Zadanie 0.
    // Napisz funkcję główną (main).

    public static void main(String[] args){
        ArrayList<Integer> tab1 = new ArrayList<Integer>();
        ArrayList<Integer> tab2 = new ArrayList<Integer>();

        tab1.add(1);
        tab1.add(2);
        tab1.add(3);
        tab1.add(4);

        tab2.add(5);
        tab2.add(6);
        tab2.add(7);

        System.out.println(append(tab1, tab2));
        System.out.println(merge(tab1, tab2));
    }

    // Zadanie 1.
    // Napisz funkcję
    //		append(ArrayList<Integer> tab1, ArrayList<Integer> tab2),
    // która tworzy nową listę tablicową poprzez
    // dołączenie drugiej listy tablicowej do pierwszej.

    static ArrayList append(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < tab1.size(); i++){
            result.add(tab1.get(i));
        }
        for(int element : tab2){
            result.add(element);
        }
        return result;
    }

    // Zadanie 2.
    // Napisz funkcję
    //		merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2),
    // która tworzy nową listę tablicową poprzez
    // dołączenie drugiej listy tablicowej do pierwszej w taki sposób,
    // że elementy wstawiane są na przemian. W przypadku, gdy skończą się
    // elementy jednej listy to do wyniku należy dołączyć pozostałe elementy.

    static ArrayList merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> result = new ArrayList<Integer>();

        int i = 0;
        int j = 0;

        while(i < tab1.size() && j < tab2.size()){
            result.add(tab1.get(i));
            result.add(tab2.get(j));
            i++;
            j++;
        }

        while(i < tab1.size()){
            result.add(tab1.get(i));
            i++;
        }

        while(j < tab2.size()){
            result.add(tab2.get(j));
            j++;
        }
        return result;
    }

    // Zadanie 3.
    // Napisz funkcję
    //		mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2),
    // która tworzy nową listę tablicową poprzez
    // dołączenie drugiej listy tablicowej do pierwszej w taki sposób,
    // że elementy wstawiane są w porządku rosnącym.

    static void zadanie_3(){

    }

    // Zadanie 4.
    // Napisz funkcje
    //		toArrayList(String napis)
    //		toArrayList(int liczba),
    // które z napisu/liczby tworzą listę tablicową posortowanych rosnąco znaków/cyfr.

    static void zadanie_4(){

    }

    // Zadanie 5.
    // Napisz funkcje
    //		checkChar(ArrayList<String> tab, char znak)
    // 		checkDigit(ArrayList<Integer> tab, int cyfra),
    // które sprawdzają czy podany znak/cyfra jest w liście
    // tablicowej z zadania 4 i zwracają true lub false.

    static void zadanie_5(){

    }

    // Zadanie 6.
    // Napisz funkcje
    //		countChar(ArrayList<String> tab, char znak)
    // 		countDigit(ArrayList<Integer> tab, int cyfra),
    // które zliczają występowanie podanego znaku/cyfry
    // w liście tablicowej z zadania 4 i zwracają ilość zliczonych elementów.

    static void zadanie_6(){

    }

    // Zadanie 7.
    // Napisz funkcje
    //		uniqueArrayList(ArrayList<String> tab)
    // 		uniqueArrayList(ArrayList<Integer> tab),
    // które tworzą dwuwymiarową listę tablicową unikalnych wartości,
    // a każda z wartości ma przyporządkowane 0.
    // Przykład: tab=[1,4,5,5,7,7] wynik -> [[1,0], [4,0], [5,0], [7,0]]

    static void zadanie_7(){

    }

    // Zadanie 8.
    // Napisz funkcje
    // 		countArrayList(ArrayList<String> tab)
    // 		countArrayList(ArrayList<Integer> tab),
    // które tworzą dwuwymiarową listę tablicową, w której
    // zliczana jest ilość występujących cyfry/znaków z tablic z zadania 4
    // Przykład: tab=[1,4,5,5,7,7] wynik -> [[1,1], [4,1], [5,2], [7,2]]


    static void zadanie_8(){

    }
}

