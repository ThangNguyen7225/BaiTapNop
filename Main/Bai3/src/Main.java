public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        circles[0] = new Circle(1.0);
        circles[1] = new Circle(2.0);
        circles[2] = new Circle(3.0);
        circles[3] = new Circle(4.0);
        circles[4] = new Circle(5.0);

        double totalArea = 0;
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Circle " + (i+1) + " radius: " + circles[i].radius + ", area: " + circles[i].area() + ", circumference: " + circles[i].circumference());
            totalArea += circles[i].area();
        }
        System.out.println("Total area of all circles: " + totalArea);
    }
}
