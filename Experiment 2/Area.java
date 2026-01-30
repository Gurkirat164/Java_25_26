public class Area {
    double area (double radius) {
        return 3.14 * radius * radius;
    }

    double area (double length, double breadth) {
        return length * breadth;
    }

    public static void main(String args[]) {
        Area a = new Area();

        double circleArea = a.area(5.0);
        System.out.println("Area of Circle: " + circleArea);

        double rectangleArea = a.area(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
