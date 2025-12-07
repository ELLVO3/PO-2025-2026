package zestaw7;

public record Wektor3D(double sx, double sy, double sz) implements Comparable<Wektor3D>{

    public Wektor3D(Punkt3D start, Punkt3D end){
        this(end.x() - start.x(), end.y() - start.y(), end.z() - start.z());
    }

    public double calculateMagnitude(){
        return Math.sqrt((sx * sx) + (sy * sy) + (sz * sz));
    }

    @Override
    public int compareTo(Wektor3D other){
        double myMagnitude = this.calculateMagnitude();
        double otherMagnitude = other.calculateMagnitude();

        return Double.compare(otherMagnitude, myMagnitude);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;

        if(o == null || getClass() != o.getClass()) return false;

        Wektor3D other = (Wektor3D) o;

        double scalarProduct = (this.sx * other.sx) + (this.sy * other.sy) + (this.sz * other.sz);

        return Double.compare(scalarProduct, 0.0) == 0;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
