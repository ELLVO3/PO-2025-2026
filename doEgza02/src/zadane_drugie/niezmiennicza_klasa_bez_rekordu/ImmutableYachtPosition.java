package zadane_drugie.niezmiennicza_klasa_bez_rekordu;

public final class ImmutableYachtPosition {
    private final double latitude;
    private final double longitude;
    private final double altitude;

    public ImmutableYachtPosition(double latitude, double longitude, double altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public ImmutableYachtPosition move(double latitudeChange, double longitudeChange, double altitudeChange){
        return new ImmutableYachtPosition(this.latitude + latitudeChange,
                this.longitude + longitudeChange,
                this.altitude + altitudeChange);
    }

    @Override
    public String toString() {
        return "ImmutableYachtPosition{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                '}';
    }
}
