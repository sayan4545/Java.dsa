package OOPS.polymorphism;

public class Implementation {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        shape.area();
        triangle.area();
        circle.area();
    }
}
