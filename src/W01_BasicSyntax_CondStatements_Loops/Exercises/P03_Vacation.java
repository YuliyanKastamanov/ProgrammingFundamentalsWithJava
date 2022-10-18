package W01_BasicSyntax_CondStatements_Loops.Exercises;

import java.util.Scanner;

public class P03_Vacation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;

        if (type.equals("Students")){



            if (day.equals("Friday")){

                totalPrice = count*8.45;

            } else if(day.equals("Saturday")){
                totalPrice = count*9.80;

            } else if(day.equals("Sunday")){
                totalPrice = count*10.46;
            }


            if (count>=30){
                totalPrice = totalPrice*0.85;
            }


        } else if (type.equals("Business")) {

            if(count>=100){
                if (day.equals("Friday")) {

                    totalPrice = (count - 10) * 10.90;

                } else if (day.equals("Saturday")) {
                    totalPrice = (count - 10) * 15.60;

                } else if (day.equals("Sunday")) {
                    totalPrice = (count - 10) * 16;
                }


            }else {

                if (day.equals("Friday")) {

                    totalPrice = count * 10.90;

                } else if (day.equals("Saturday")) {
                    totalPrice = count * 15.60;

                } else if (day.equals("Sunday")) {
                    totalPrice = count * 16;
                }

            }



        } else if (type.equals("Regular")) {

            if (day.equals("Friday")) {

                totalPrice = count * 15;

            } else if (day.equals("Saturday")) {
                totalPrice = count * 20;

            } else if (day.equals("Sunday")) {
                totalPrice = count * 22.50;
            }

            if (count>=10 && count<=20){
                totalPrice = totalPrice * 0.95;
            }
        }

        System.out.printf("Total price: %.2f", totalPrice);


    }
}
