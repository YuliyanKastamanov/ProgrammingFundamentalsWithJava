package Exam_Prep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String product = scanner.nextLine();
            String regex = "[@][#]+(?<product>[A-Z][A-Za-z0-9]{4,}[A-Z])[@][#]+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(product);

            if(matcher.find()){
                String currentProduct = matcher.group("product");
                String productGroup = "";
                boolean isDigit = false;
                for (int j = 0; j < currentProduct.length(); j++) {
                    char currentChar = currentProduct.charAt(j);
                    if(currentChar >= 48 && currentChar <= 57){
                        productGroup = productGroup + currentChar;
                        isDigit = true;
                    }
                }
                if(isDigit){
                    System.out.println("Product group: " + productGroup);
                }else {
                    System.out.println("Product group: 00");
                }

            }else{
                System.out.println("Invalid barcode");
            }

        }




    }
}
