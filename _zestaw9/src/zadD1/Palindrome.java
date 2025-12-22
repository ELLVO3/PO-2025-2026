package zadD1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class Palindrome {

    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        LinkedList<String> words2 = new LinkedList<>();

        words.add("kajak");
        words.add("heyo");
        words.add("kajak");
        System.out.println(isPalindrome(words));

        words2.add("słoma");
        words2.add(" ");
        words2.add("amołs");
        System.out.println(isPalindrome(words2));

    }

    public static <T> boolean isPalindrome(LinkedList<T> list){
        if(list == null || list.size() <= 1){
            return true;
        }

        Iterator<T> forwardIterator = list.iterator();
        Iterator <T> backwardIterator = list.descendingIterator();

        for(int i = 0; i < list.size() / 2; i++){
            T frontElement = forwardIterator.next();
            T backElement = backwardIterator.next();

            if(!Objects.equals(frontElement, backElement)){
                return false;
            }
        }
        return true;
    }
}
