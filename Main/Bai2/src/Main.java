public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4.0, 5.0);
        Rectangle r2 = new Rectangle(3.0, 3.0);

        System.out.println("Rectangle 1 - width: " + r1.width + ", height: " + r1.height);
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Is square: " + r1.isSquare());
        System.out.println("-----------------");

        System.out.println("Rectangle 2 - width: " + r2.width + ", height: " + r2.height);
        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());
        System.out.println("Is square: " + r2.isSquare());
    }
}
