package Lab.Abstraction;

abstract class Shape {

    abstract double calculateArea();

    void displayShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    void displayShape() {
        super.displayShape();
        System.out.println("Circle");
    }
}

class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    void displayShape() {
        super.displayShape();
        System.out.println("Rectangle");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(2, 2.2);
        s1.displayShape();
        System.out.println("Rectangle area is:" + s1.calculateArea());

        Shape s2 = new Circle(6);
        s2.displayShape();
        System.out.println("Circle area is:" + s2.calculateArea());

    }
}
