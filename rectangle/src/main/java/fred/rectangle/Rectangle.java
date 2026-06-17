public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width,
            double height,
            String color,
            boolean filled)
            throws InvalidShapeException {
        super(color, filled);

        if (width <= 0 || height <= 0) {
            throw new InvalidShapeException(
                    "Dimensions must be positive");
        }

        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
    public void resize(double factor)
            throws InvalidShapeException {

        if (factor <= 0) {
            throw new InvalidShapeException(
                    "Invalid resize factor");
        }
        width *= factor;
        height *= factor;
    }
    public String toString() {
        return "Rectangle Area=" + getArea();
    }
}