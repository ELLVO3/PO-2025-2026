package zestaw7;

public record Punkt3D(double x, double y, double z) implements Comparable<Punkt3D>{

    public double dlugoscDo(Punkt3D other){
        double dlx = this.x() - other.x();
        double dly = this.y() - other.y();
        double dlz = this.z() - other.z();

        return Math.sqrt((dlx * dlx) + (dly * dly) + (dlz * dlz));
    }

    private double odlegloscOdPoczatkuSq(){
        return (x * x) + (y * y) + (z * z);
    }

    public double odlegloscOdPoczatku(){
        return Math.sqrt(this.odlegloscOdPoczatkuSq());
    }

    @Override
    public int compareTo(Punkt3D other){

        double myOdlegloscSq = this.odlegloscOdPoczatkuSq();
        double otherOdlegloscSq = other.odlegloscOdPoczatkuSq();

        return Double.compare(myOdlegloscSq, otherOdlegloscSq);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (o instanceof Punkt3D other){
            double sumaThis = this.x + this.y + this.z;
            double sumaOther = other.x + other.y + other.z;

            return Double.compare(sumaThis, sumaOther) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(this.x + this.y + this.z);
    }
}
