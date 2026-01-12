package zad2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ComputerGraphic> graphicsList = new ArrayList<>();

        graphicsList.add(new Bitmap(100, 100, "wakacje.bmp"));
        graphicsList.add(new Vector(500, 500, "logo.svg"));
        graphicsList.add(new Bitmap(1920, 1080, "tapeta.bmp"));
        graphicsList.add(new Vector(50, 50, "ikona.svg"));
        graphicsList.add(new Bitmap(800, 600, "avatar.bmp"));

        for(ComputerGraphic c : graphicsList){
            c.loadFile();
            c.saveFile();
        }
    }
}
