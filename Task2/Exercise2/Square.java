package Assignment4.Task2.Exercise2;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
