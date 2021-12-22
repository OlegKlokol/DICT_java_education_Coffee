import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String enter;
        Coffee coffeebuy = new Coffee();
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            enter = scanner.nextLine();

            if (enter.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                enter = scanner.nextLine();
                coffeebuy.buy(enter);
            }
            if (enter.equals("take")) {
                coffeebuy.take(enter);

            }
            if (enter.equals("fill")) {
                coffeebuy.fill(enter);
            }
            if (enter.equals("remaining")) {
                coffeebuy.remaining(enter);
            }
        } while (!enter.equals("exit"));

    }
}
