package zadL3;

import java.util.TreeMap;

public class AvgCalculator {

    public static void main(String[] args) {
        TreeMap<String, Double> grades = new TreeMap<>();

        grades.put("Maths", 3.0);
        grades.put("Geography", 4.5);
        grades.put("P-E", 5.0);
        grades.put("Civics", 3.5);

        System.out.println("Class -> Grade: " + grades);

        System.out.println("Grades' average: " + calculateAverageValue(grades));
    }

    public static <K> double calculateAverageValue(TreeMap<K, Double> map){
        if(map == null || map.isEmpty()){
            return 0.0;
        }

        double sum = 0.0;

        for(Double values : map.values()){
            sum += values;
        }

        return sum / map.size();
    }
}
