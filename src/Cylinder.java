public class Cylinder {
    private double height;
    private double rasius;

    public Cylinder(double height, double rasius) {
        this.height = height;
        this.rasius = rasius;
    }

    public double getArea() {
        return 2 * Math.PI * rasius * (height + rasius);
    }

    public double getVolume() {
        return Math.PI * rasius * rasius * height;
    }
}
