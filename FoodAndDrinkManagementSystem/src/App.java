import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What do you want to choose?:"
                    + "\n1. See Menu"
                    + "\n2. Order Food and Drink");
            int selected = sc.nextInt();

            if (selected == 1) {
                System.out.println("Foods:");
                for (int i = 0; i < FoodsAndDrinks.foods.length; i++) {
                    System.out.println(FoodsAndDrinks.foods[i]);
                }
                System.out.println("--------------------------------------");
                System.out.println("Drinks:");
                for (int i = 0; i < FoodsAndDrinks.drinks.length; i++) {
                    System.out.println(FoodsAndDrinks.drinks[i]);
                }
            } else if (selected == 2) {
                System.out.println("How many food do you want to order?:");
                int count_of_ordered_foods = sc.nextInt();
                int i = 0;
                while (i < count_of_ordered_foods) {
                    i++;
                    sc.nextLine();
                    System.out.println("Order food " + i + ":");
                    String food = sc.nextLine();
                }

                System.out.println("How many drink do you want to order?:");
                int count_of_ordered_drinks = sc.nextInt();
                int b = 0;
                while (b < count_of_ordered_foods) {
                    b++;
                    sc.nextLine();
                    System.out.println("Order drink " + b + ":");
                    String drink = sc.nextLine();
                }

                System.out.println("Enter card: ");
                String card_number = sc.nextLine();
                Cards.cards.add(card_number);
                System.out.println("Cash: " + ((count_of_ordered_drinks + count_of_ordered_foods) * 2) + "$");
            } else if (selected == 3) {
                break;
            } else {
                System.out.println("There are no section like that!!!");
            }
        }
    }
}
