package ocp;

public class Square implements Shape {

    private int side;

    public int getSide() {
        return side;
    }

    public Square(int side) {}

    @Override
    public double getSquareArea() {
        return side * side;
    }
}
