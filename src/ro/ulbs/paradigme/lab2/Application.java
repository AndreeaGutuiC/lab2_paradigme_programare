package ro.ulbs.paradigme.lab2;

public class Application {
    public static void main(String[] args) {
        Triangle tri = new Triangle((float)1.1, (float)2.0);
        Circle c = new Circle((float)1.5);
        Square sq = new Square((float)1.2);
        System.out.println("Triangle area = " + tri.getArea()+" details: " + tri);
        System.out.println("Circle area = " + c.getArea() + " details: " + c);
        System.out.println("Square area = " + sq.getArea() + " details: " + sq);
        Triangle tri2 = new Triangle((float)1.1, (float)2.0);
        System.out.println("Triangle2 equals to Triangle1: " + tri.equals(tri2));
    }
}
