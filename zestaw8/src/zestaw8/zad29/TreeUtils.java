package zestaw8.zad29;

public class TreeUtils {
    public static void findMinMaxHeight(Tree[] trees, Pair<? super Tree> result){
        if(trees == null || trees.length == 0){
            throw new IllegalArgumentException("Problem z tablicą.");
        }

        Tree min = trees[0];
        Tree max = trees[0];

        for(Tree t : trees){
            if(t.compareTo(min) < 0){
                min = t;
            }
            if(t.compareTo(max) > 0){
                max = t;
            }
        }

        result.setFirst(min);
        result.setSecond(max);
    }
}
