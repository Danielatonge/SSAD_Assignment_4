public class Calculator {
    public static double doModificationsAndComputeArea(Rectangle rectangle) {
        // Modify rectangles in some way using setters
        rectangle.setLength(5);
        rectangle.setWidth(3);

        // Returns the area of the modified rectangle
        return rectangle.getArea();
    }
}

