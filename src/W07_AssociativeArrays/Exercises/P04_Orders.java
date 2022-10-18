package W07_AssociativeArrays.Exercises;

import java.util.*;

public class P04_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<Double>> products = new LinkedHashMap<>();

        while (!command.equals("buy")){
            String product = command.split("\\s+")[0];
            Double price = Double.parseDouble(command.split("\\s+")[1]);
            Double quantity = Double.parseDouble(command.split("\\s+")[2]);



            if(!products.containsKey(product)) {
                List<Double> currentProduct = new ArrayList<>();
                currentProduct.add(price);
                currentProduct.add(quantity);
                products.put(product, currentProduct);
            }else {
                double currentQuantity = products.get(product).get(1) + quantity;
                List<Double> currentProduct = new ArrayList<>();
                currentProduct.add(price);
                currentProduct.add(currentQuantity);
                products.put(product, currentProduct);

            }


            command = scanner.nextLine();
        }
        products.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0)*entry.getValue().get(1)));



    }
}
