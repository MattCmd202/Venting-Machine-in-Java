import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("\tWelcome to the Market");
        System.out.println("\n1. Coca Cola: $1");
        System.out.println("2. Mountain Dew: $1.99");
        System.out.println("3. Sprite: $1.25");
        System.out.println("4. Royal: $1.50");

        System.out.print("\nWhat would you like to buy: ");
        int choice = scnr.nextInt();

        double price = 0.0;
        String item = "";

        if (choice == 1) {    //You can change and add new products here
            price = 1;
            item = "Coca Cola";
        } else if (choice == 2) {
            price = 1.99;
            item = "Mountain Dew";
        } else if (choice == 3) {
            price = 1.25;
            item = "Sprite";
        } else if (choice == 4) {
            price = 1.50;
            item = "Royal";
        } else {
            System.out.println("Invalid. Please Enter a Valid choice.");
            choice = scnr.nextInt();
        }

        System.out.printf("\nYou choose %s for $%.2f.\n" ,item, price);

        System.out.println("Enter Amount: ");
        double pay = scnr.nextDouble();

        if (pay < price) {
            System.out.println("Insufficient Balance.");
            pay = scnr.nextDouble();
        } else if (pay == price) {
            System.out.printf("Thank you for buying %s." ,item);
        } else {
            double change = pay - price;
            System.out.printf("Your change is $%.2f. Thank you for buying %s.",change,item);
        }
        scnr.close();
    }
}
