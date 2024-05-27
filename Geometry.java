import java.util.Scanner;

class Geometry {
    static double areaRectangle(double length, double width) {
        return length * width;
    }

    static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    static double volumeBox(double length, double width, double height) {
        return length * width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geometry Calculator\n");

        while (true) {
            System.out.println("1. Calculate area of a rectangle");
            System.out.println("2. Calculate area of a circle");
            System.out.println("3. Calculate volume of a box");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.println("Area of the rectangle: " + Geometry.areaRectangle(length, width));
                    break;
                case 2:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of the circle: " + Geometry.areaCircle(radius));
                    break;
                case 3:
                    System.out.print("Enter length of the box: ");
                    length = scanner.nextDouble();
                    System.out.print("Enter width of the box: ");
                    width = scanner.nextDouble();
                    System.out.print("Enter height of the box: ");
                    double height = scanner.nextDouble();
                    System.out.println("Volume of the box: " + Geometry.volumeBox(length, width, height));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
