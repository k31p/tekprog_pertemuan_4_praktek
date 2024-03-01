public class TestShape {
    public static void main(String[] args) {
        // Membuat instance tanpa memberi parameter
        Shape shape1 = new Shape();
        // Membuat dua instance dengan parameter
        Shape shape2 = new Shape("Blue", false);
        // instance circle
        Circle circle = new Circle(5.2, "Cyan");
        // instance rectangle
        Rectangle rectangle = new Rectangle(4, 7, "Yellow", false);
        // instance square
        Square square = new Square(4.3, "Pink", true);

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
    }
}
