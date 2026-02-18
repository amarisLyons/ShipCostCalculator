import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarations

        double ship;
        double total;

        System.out.println("Please enter the price of the item.");
        Scanner in = new Scanner(System.in);
        double price = in.nextDouble();
        if (price < 100) {
        ship = price * 0.02;
        total = ship + price;
            System.out.println("The shipping cost is $" + ship + ". And the total price is $" + total + ".");}

        else {
            ship = 0;
            total = ship + price;
            System.out.println("The shipping cost is $0. And the total price is $" + total + ".");
        }
    }

    }