package W02_DataTypesAndVariables.Labs;

import java.util.Scanner;

public class P11_RefactorVolumeOfPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //double dul, sh, V = 0;
        //System.out.print("Length: ");
        //dul = Double.parseDouble(scanner.nextLine());
        //System.out.print("Width: ");
        //sh = Double.parseDouble(scanner.nextLine());
        //System.out.print("Height: ");
        //V = Double.parseDouble(scanner.nextLine());
        //V = (dul + sh + V) / 3;
        //System.out.printf("Pyramid Volume: %.2f", V);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double volume = (length * width * height) / 3;

        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f", volume);





    }
}
