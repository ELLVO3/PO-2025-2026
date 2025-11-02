package zestaw3;

import java.util.ArrayList;
import java.util.Collections;

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

        ArrayList<String> napis = toArrayList("Wsgmaness");
        ArrayList<Integer> liczba = toArrayList(639111);

        tab1.add(1);
        tab1.add(10);
        tab1.add(12);
        tab1.add(20);
        tab1.add(23);
        tab1.add(24);

        tab2.add(2);
        tab2.add(3);
        tab2.add(4);
        tab2.add(8);
        tab2.add(15);

        System.out.println(append(tab1, tab2));
        System.out.println(merge(tab1, tab2));
        System.out.println(mergeSorted(tab1, tab2));

        System.out.println(toArrayList("Wsgmane"));
        System.out.println(toArrayList(6391));

        System.out.println(checkChar(napis, 'm'));
        System.out.println(checkDigit(liczba, 3));

        System.out.println(countChar(napis, 's'));
        System.out.println(countDigit(liczba, 1));

        System.out.println(uniqueArrayList(napis));
        System.out.println(uniqueArrayList(liczba));

        System.out.println(countArrayList(napis));
        System.out.println(countArrayList(liczba));

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

    static ArrayList mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> result = new ArrayList<Integer>();

        int i = 0;
        int j = 0;

        while(i < tab1.size() && j < tab2.size()){
            result.add(tab1.get(i));
            result.add(tab2.get(j));
            i++;
            j++;
        }

        Collections.sort(result);
        return result;
    }

    // Zadanie 4.
    // Napisz funkcje
    //		toArrayList(String napis)
    //		toArrayList(int liczba),
    // które z napisu/liczby tworzą listę tablicową posortowanych rosnąco znaków/cyfr.

    static ArrayList toArrayList(String napis){
        ArrayList<String> result = new ArrayList<String>();

        for(char c : napis.toCharArray()){
            result.add(String.valueOf(c));
        }
        Collections.sort(result);
        return result;
    }

    static ArrayList toArrayList(int liczba){
        ArrayList<Integer> result = new ArrayList<Integer>();

        String numStr = String.valueOf(liczba);

        for(char c : numStr.toCharArray()){
            result.add(Character.getNumericValue(c));
        }
        Collections.sort(result);
        return result;
    }

    // Zadanie 5.
    // Napisz funkcje
    //		checkChar(ArrayList<String> tab, char znak)
    // 		checkDigit(ArrayList<Integer> tab, int cyfra),
    // które sprawdzają czy podany znak/cyfra jest w liście
    // tablicowej z zadania 4 i zwracają true lub false.

    static boolean checkChar(ArrayList<String> tab, char znak){
        return tab.contains(String.valueOf(znak));
    }

    static boolean checkDigit(ArrayList<Integer> tab, int cyfra){
        return tab.contains(cyfra);
    }

    // Zadanie 6.
    // Napisz funkcje
    //		countChar(ArrayList<String> tab, char znak)
    // 		countDigit(ArrayList<Integer> tab, int cyfra),
    // które zliczają występowanie podanego znaku/cyfry
    // w liście tablicowej z zadania 4 i zwracają ilość zliczonych elementów.

    static int countChar(ArrayList<String> tab, char znak){
        int counter = 0;
        for(String s : tab){
            if(s.equals(String.valueOf(znak))){
                counter++;
            }
        }
        return counter;
    }

    static int countDigit(ArrayList<Integer> tab, int cyfra){
        int counter = 0;
        for(int a : tab){
            if(a == cyfra){
                counter++;
            }
        }
        return counter;
    }

    // Zadanie 7.
    // Napisz funkcje
    //		uniqueArrayList(ArrayList<String> tab)
    // 		uniqueArrayList(ArrayList<Integer> tab),
    // które tworzą dwuwymiarową listę tablicową unikalnych wartości,
    // a każda z wartości ma przyporządkowane 0.
    // Przykład: tab=[1,4,5,5,7,7] wynik -> [[1,0], [4,0], [5,0], [7,0]]

    static <T> ArrayList<ArrayList<T>> uniqueArrayList(ArrayList<T> tab){
        ArrayList<ArrayList<T>> result = new ArrayList<>();
        ArrayList<T> unique = new ArrayList<>();

        for(T a : tab){
            if(!unique.contains(a)){
                unique.add(a);
            }
        }

        for(T a : unique){
            ArrayList<T> temp = new ArrayList<>();
            temp.add(a);

            if(a instanceof Integer){
                temp.add((T) Integer.valueOf(0));
            }

            else if(a instanceof String){
                temp.add((T) ("0"));
            }

            result.add(temp);
        }
        return result;
    }

    // Zadanie 8.
    // Napisz funkcje
    // 		countArrayList(ArrayList<String> tab)
    // 		countArrayList(ArrayList<Integer> tab),
    // które tworzą dwuwymiarową listę tablicową, w której
    // zliczana jest ilość występujących cyfry/znaków z tablic z zadania 4
    // Przykład: tab=[1,4,5,5,7,7] wynik -> [[1,1], [4,1], [5,2], [7,2]]


    static <T> ArrayList<ArrayList<T>> countArrayList(ArrayList<T> tab){
        ArrayList<ArrayList<T>> result = new ArrayList<>();
        ArrayList<T> unique = new ArrayList<>();

        for(T x : tab){
            if(!unique.contains(x)){
                unique.add(x);
            }
        }

        for(T x : unique){
            int counter = 0;
            for(T y : tab){
                if(x.equals(y)){
                    counter++;
                }
            }

            ArrayList<T> temp = new ArrayList<>();
            temp.add(x);

            if(x instanceof Integer){
                temp.add((T) Integer.valueOf(counter));
            }

            else if(x instanceof String){
                temp.add((T) String.valueOf(counter));
            }
            result.add(temp);
        }
        return result;
    }
}
