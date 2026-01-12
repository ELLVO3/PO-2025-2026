package zad1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WorkTool> tools = new ArrayList<>();

        tools.add(new Hammer("Młot Thora", 2022));
        tools.add(new Screwdriver("Śrubokręt Gwiazdkowy", 2021));
        tools.add(new Saw("Piła Twoja-Moja", 2019));
        tools.add(new Hammer("Mały Młoteczek", 2023));
        tools.add(new Screwdriver("Śrubokręt Płaski", 2018));

        for(WorkTool t : tools){
            t.use();
        }
    }
}
