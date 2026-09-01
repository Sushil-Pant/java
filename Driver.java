import java.util.Scanner;
import shapes.Circle;
import shapes.Rectangle;

class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        System.out.println("Area of Circle = " + c.area(radius));
        System.out.println("Area of Rectangle = " +
                           r.area(length, breadth));

        sc.close();
    }
}