package se.lexicon.elmira;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyMachine m = new MyMachine();
        System.out.println("Press a to add currency.");
        System.out.println("Press b to buy.");
        System.out.println("Press c to end session.");
        System.out.println("Press d to see a product description.");
        System.out.println("Press e to see the balance.");
        System.out.println("Press f to see all the products.");
        System.out.println("Press g to finish the program.");
        String item = "";
        while(!item.equals("g")) {
            System.out.print("***** Enter item: ");
            item = scanner.nextLine();
            /* add currency */
            if (item.equals("a")) {
                System.out.print("----- Enter money: ");
                int money = Integer.parseInt(scanner.nextLine());
                m.addCurrency(money);
            }
            /* buy */
            else if (item.equals("b")) {
                System.out.print("----- Enter product number: ");
                int number = Integer.parseInt(scanner.nextLine());
                m.request(number);
            }
            /* end session */
            else if (item.equals("c")) {
                System.out.println(m.endSession());
            }
            /* description */
            else if (item.equals("d")) {
                System.out.print("----- Enter product number: ");
                int number = Integer.parseInt(scanner.nextLine());
                System.out.println(m.getDescription(number));
            }
            /* balance */
            else if (item.equals("e")) {
                System.out.println(m.getBalance());
            }
            /* names */
            else if (item.equals("f")) {
                int i = 0;
                String[] all = m.getProducts();
                for (i = 0; i < all.length; i++)
                    System.out.println(all[i]);
            }
            /* finish */
            else if (item.equals("g")) {
                return;
            }
        }
    }
}

