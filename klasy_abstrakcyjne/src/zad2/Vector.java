package zad2;

public class Vector extends ComputerGraphic{
    public Vector(int width, int height, String fileName) {
        super(width, height, fileName);
    }

    @Override
    public void loadFile() {
        System.out.println("Ładowanie Wektora...");
    }

    @Override
    public void saveFile(){
        System.out.println("Zapisywanie Wektora...");
    }
}
