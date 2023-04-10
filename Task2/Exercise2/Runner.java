public class Runner {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 7);
        Square square = new Square(5);

        System.out.println("Area of original rectangle: " + rectangle.getArea());
        double areaRectangleAfter = Calculator.doModificationsAndComputeArea(rectangle);
        System.out.println("Area of rectangle after modifications: " + areaRectangleAfter);

        System.out.println("\nArea of original square: " + square.getArea());
        double areaSquareAfter = Calculator.doModificationsAndComputeArea(square);
        System.out.println("Area of square after modifications: " + areaSquareAfter);
    }
}
