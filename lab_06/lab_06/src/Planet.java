public class Planet {
    String name;
    Double radius;
    Double sunDistance;
    Satellite satellite;
    public Planet(String name, Double radius, Double sunDistance) {
        this.name = name;
        this.radius = radius;
        this.sunDistance = sunDistance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void getSatelliteInfo() {
        satellite.print();
    }
    public double toThousandKm(String param) {
        double result = 0;
        switch (param) {
            case "sunDistance":
                result = this.sunDistance / 1000;
                break;
            case "radius":
                result = this.radius / 1000;
                break;
        }
        return result;
    }
}
