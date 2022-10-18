package W04_Methods.Labs;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Create a method that calculates and returns the area of a rectangle by given width and length.

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = getRectangleArea(width, length);

        System.out.printf("%.0f",area);
    }

    private static double getRectangleArea(double width, double length) {

        return width * length;
    }
}

