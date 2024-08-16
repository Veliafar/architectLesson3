package ocp;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Circle(3));

        double sumSquareArea = 0;
        for (Shape shape : shapes) {
            sumSquareArea += shape.getSquareArea();
        }

        System.out.printf("Sum Square Area: %.2f\n", sumSquareArea);
    }
}
