public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Programming";
        b1.author = "Hoang";
        b1.price = 100;
        b1.inStock = true;

        Book b2 = new Book();
        b2.title = "Python Basics";
        b2.author = "Minh";
        b2.price = 80;
        b2.inStock = true;

        Book b3 = new Book();
        b3.title = "C++ Advanced";
        b3.author = "Tuan";
        b3.price = 120;
        b3.inStock = false;

        System.out.println("Book 1:");
        b1.printInfo();
        System.out.println("After 10% discount:");
        b1.applyDiscount(10);
        b1.printInfo();
        System.out.println("-----------------");

        System.out.println("Book 2:");
        b2.printInfo();
        System.out.println("After 10% discount:");
        b2.applyDiscount(10);
        b2.printInfo();
        System.out.println("-----------------");

        System.out.println("Book 3:");
        b3.printInfo();
        System.out.println("After 10% discount:");
        b3.applyDiscount(10);
        b3.printInfo();
    }
}
