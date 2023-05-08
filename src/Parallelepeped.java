public class Parallelepeped {
    private double height;
    private double lenght;
    private double widght;

    public Parallelepeped(double height, double lenght, double widght) {
        this.height = height;
        this.lenght = lenght;
        this.widght = widght;
    }

    public double getArea() {
        return 2 * ((height * lenght) + (lenght * widght) + (height * widght));
    }

    public double getVolume() {
        return lenght * widght * height;
    }
}
