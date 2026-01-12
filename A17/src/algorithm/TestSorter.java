package algorithm;

public class TestSorter {
    public static void main(String[] args) {
        Integer[] tab = {1,2,3};

        System.out.println(Sorter.isSorted(tab));

        Integer[] tab2 = {3,2,1};
        System.out.println(Sorter.isSorted(tab2));
    }
}
