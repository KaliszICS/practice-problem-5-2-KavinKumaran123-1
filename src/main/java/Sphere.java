public class Sphere extends Circle {

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}