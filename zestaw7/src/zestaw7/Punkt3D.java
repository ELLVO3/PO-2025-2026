package zestaw7;

import java.util.Objects;

public record Punkt3D(double x, double y, double z) implements Comparable<Punkt3D>{

    public double calculateDistance(Punkt3D other) {
        double dlx = x - other.x();
        double dly = y - other.y();
        double dlz = z - other.z();

        return Math.sqrt((dlx * dlx) + (dly * dly) + (dlz * dlz));
    }

    public double distanceFromOrigin(){
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    @Override
    public int compareTo(Punkt3D other){
        double myDistance = this.distanceFromOrigin();
        double otherDistance = other.distanceFromOrigin();

        return Double.compare(myDistance, otherDistance);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;

        if(o == null || getClass() != o.getClass()) return false;

        Punkt3D point3D = (Punkt3D) o;

        double mySum = this.x + this.y + this.z;
        double otherSum = point3D.x + point3D.y + point3D.z;

        return Double.compare(mySum, otherSum) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x + y + z);
    }
}