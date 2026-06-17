public class Circle extends Shape {
    private double radius;
    public Circle(double radius,
            String color,
            boolean filled)
            throws InvalidShapeException {
        super(color, filled);
        if (radius <= 0) {
            throw new InvalidShapeException(
                    "Radius must be positive");
        }
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void resize(double factor)
            throws InvalidShapeException {

        if (factor <= 0) {
            throw new InvalidShapeException(
                    "Resize factor must be positive");
        }
        radius *= factor;
    }
    public String toString() {
        return "Circle Radius=" + radius;
    }
}