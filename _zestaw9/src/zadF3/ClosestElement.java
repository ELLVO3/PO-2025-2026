package zadF3;

import java.util.TreeSet;

public class ClosestElement {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(19);
        set.add(22);

        int target = 20;

        Integer closest = findClosestElement(set, target);

        System.out.println("Set: " + set);
        System.out.println("Target: " + target);
        System.out.println("Closest: " + closest);

    }

    public static Integer findClosestElement(TreeSet<Integer> set, Integer target){
        if(set == null || set.isEmpty()){
            return null;
        }

        Integer floor = set.floor(target);
        Integer ceiling = set.ceiling(target);

        if(floor == null){
            return ceiling;
        }

        if(ceiling == null){
            return floor;
        }

        if(floor.equals(ceiling)){
            return floor;
        }

        int distToFloor = target - floor;
        int distToCeiling = ceiling - target;

        if(distToFloor <= distToCeiling){
            return floor;
        }
        else {
            return ceiling;
        }
    }
}
