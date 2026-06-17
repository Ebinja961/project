public class ShapeDemo {
    public static void printAreas(Shape[] shapes) {

        for (Shape shape : shapes) {
            System.out.println(
                    shape + " Area = "
                            + shape.getArea());
        }
    }
    public static Shape largest(Shape[] shapes) {
        Shape largest = shapes[0];

        for (Shape shape : shapes) {

            if (shape.getArea() >
                    largest.getArea()) {

                largest = shape;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        try {

            Shape[] shapes = {

                    new Circle(
                            5,
                            "Red",
                            true),

                    new Rectangle(
                            4,
                            6,
                            "Blue",
                            true),

                    new Triangle(
                            3,
                            4,
                            5,
                            "Green",
                            true)
            };
            printAreas(shapes);
            System.out.println(
                    "\nLargest Shape: "
                            + largest(shapes));
            Triangle t =
                    new Triangle(
                            1,
                            2,
                            10,
                            "Black",
                            true);
        } catch (InvalidShapeException e) {
            System.out.println(
                    "Exception Caught: "
                            + e.getMessage());
        }
    }
}