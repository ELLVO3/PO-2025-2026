package zestaw7;

public record Wektor3D(double sx, double sy, double sz) {

    public Wektor3D (Punkt3D p1, Punkt3D p2){
        this(p2.x() - p1.x(), p2.y() - p1.y(), p2.z() - p1.z());
    }

    public double modul(){
        return Math.sqrt((sx * sx) + (sy * sy) + (sz * sz));
    }
}
