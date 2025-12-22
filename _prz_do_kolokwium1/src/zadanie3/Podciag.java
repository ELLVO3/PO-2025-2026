package zadanie3;

public class Podciag {

    static void main(String[] args) {
        int[] tab = new int[] {5,1,0};
        System.out.println(podciag(tab));
    }

    public static int podciag(int[] tab){
        if(tab == null || tab.length == 0){
            return 0;
        }
        if(tab.length == 1){
            return 1;
        }

        int maxLength = 1;
        int currentLength = 1;

        for(int i = 1; i < tab.length; i++){
            if(tab[i] < tab[i - 1]){
                currentLength++;
            }
            else{
                if(currentLength > maxLength){
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }

        if(currentLength > maxLength){
            maxLength = currentLength;
        }

        return maxLength;
    }
}
