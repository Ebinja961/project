public abstract class Shape{
    protected String color;
    protected boolean filled;

    public Shape(){
        color = "white";
        filled = false;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void resize(double factor);
            throws InvalidShapeException;

    public String toString(){
        return "Color=" + color +
                ", Filled=" + filled;
    }
}