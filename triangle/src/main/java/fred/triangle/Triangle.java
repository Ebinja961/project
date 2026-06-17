public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    public Triangle(double a,
            double b,
            double c,
            String color,
            boolean filled)
            throws InvalidShapeException {

        super(color, filled);

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new InvalidShapeException(
                    "Sides must be positive");
        }

        if ((a + b <= c) ||
                (a + c <= b) ||
                (b + c <= a)) {

            throw new InvalidShapeException(
                    "Triangle inequality violated");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea() {

        double s =
                getPerimeter() / 2;

        return Math.sqrt(
                s * (s - a) *
                        (s - b) *
                        (s - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }
    public void resize(double factor)
            throws InvalidShapeException {

        if (factor <= 0) {
            throw new InvalidShapeException(
                    "Invalid resize factor");
        }
        a *= factor;
        b *= factor;
        c *= factor;
    }
    public String toString() {
        return "Triangle Area=" + getArea();
    }
}