package ZestawD.zad3;

public class Podciag {
    public static void main(String[] args) {
        int[] tab = new int[] {1, 2, 2, 2, 5, 5};
        System.out.println(najdluzszyStaly(tab));
    }

    public static int najdluzszyStaly(int[] tab){
        if(tab == null || tab.length == 0){
            return 0;
        }

        int current = 1;
        int longest = 1;

        for(int i = 1; i < tab.length; i++){
            if(tab[i] == tab[i-1]){
                current++;
            }
            else{
                current = 1;
            }
            if(current > longest){
                longest = current;
            }
        }
        return longest;
    }
}
