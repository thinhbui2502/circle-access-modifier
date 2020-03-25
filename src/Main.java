public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());
        System.out.println(circle1.getArea());

        Circle circle2 = new Circle(50);
        System.out.println(circle2.toString());
        System.out.println(circle2.getArea());

    }
}
