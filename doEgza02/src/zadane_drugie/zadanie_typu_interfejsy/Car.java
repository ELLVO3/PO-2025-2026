package zadane_drugie.zadanie_typu_interfejsy;

public class Car implements Vehicle{

    @Override
    public void startEngine(String fuelType) {
        if(fuelType.equals("diesel") || fuelType.equals("benzyna")){
            System.out.println("Silnik uruchomiony z użyciem " + fuelType);
        }
        else {
            System.out.println("Nieznany typ paliwa.");
        }
    }

    @Override
    public boolean canDrive(int fuelLevel) {
        if(fuelLevel > 5){
            return true;
        }
        else return false;
    }
}
