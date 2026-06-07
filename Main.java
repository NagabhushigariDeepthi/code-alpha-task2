package StockTradingPlatform;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
            throws Exception {

        Scanner sc = new Scanner(System.in);

        User user =
                new User("Investor", 100000);

        Market market = new Market();

        while (true) {

            System.out.println("\n===== STOCK TRADING PLATFORM =====");

            System.out.println("1. View Market Data");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. View Transactions");
            System.out.println("6. Update Market Prices");
            System.out.println("7. Save Portfolio");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    market.displayMarket();
                    break;

                case 2:

                    System.out.print("Enter Symbol: ");
                    String buySymbol =
                            sc.next().toUpperCase();

                    System.out.print("Quantity: ");
                    int buyQty = sc.nextInt();

                    Stock buyStock =
                            market.getStock(buySymbol);

                    if (buyStock == null) {

                        System.out.println(
                                "Stock not found!");
                        break;
                    }

                    double cost =
                            buyStock.getPrice() * buyQty;

                    if (cost > user.getBalance()) {

                        System.out.println(
                                "Insufficient Balance!");
                        break;
                    }

                    user.deductBalance(cost);

                    user.getPortfolio()
                            .buyStock(
                                    buySymbol,
                                    buyQty);

                    user.getTransactions()
                            .add(
                                    new Transaction(
                                            "BUY",
                                            buySymbol,
                                            buyQty,
                                            cost));

                    System.out.println(
                            "Stock Purchased Successfully!");
                    break;

                case 3:

                    System.out.print("Enter Symbol: ");
                    String sellSymbol =
                            sc.next().toUpperCase();

                    System.out.print("Quantity: ");
                    int sellQty = sc.nextInt();

                    Stock sellStock =
                            market.getStock(sellSymbol);

                    if (sellStock == null) {

                        System.out.println(
                                "Stock not found!");
                        break;
                    }

                    double revenue =
                            sellStock.getPrice() * sellQty;

                    user.addBalance(revenue);

                    user.getPortfolio()
                            .sellStock(
                                    sellSymbol,
                                    sellQty);

                    user.getTransactions()
                            .add(
                                    new Transaction(
                                            "SELL",
                                            sellSymbol,
                                            sellQty,
                                            revenue));

                    System.out.println(
                            "Stock Sold Successfully!");
                    break;

                case 4:

                    System.out.println(
                            "\n===== PORTFOLIO =====");

                    user.getPortfolio()
                            .getHoldings()
                            .forEach(
                                    (symbol, qty) ->
                                            System.out.println(
                                                    symbol +
                                                            " -> "
                                                            + qty +
                                                            " Shares"));

                    System.out.println(
                            "\nBalance : ₹" +
                                    String.format("%.2f",
                                            user.getBalance()));

                    break;

                case 5:

                    System.out.println(
                            "\n===== TRANSACTIONS =====");

                    user.getTransactions()
                            .forEach(System.out::println);

                    break;

                case 6:

                    market.updatePrices();

                    System.out.println(
                            "Market Prices Updated!");
                    break;

                case 7:

                    FileManager.savePortfolio(user);

                    System.out.println(
                            "Portfolio Saved Successfully!");

                    break;

                case 8:

                    FileManager.savePortfolio(user);

                    System.out.println(
                            "Thank You!");

                    sc.close();

                    System.exit(0);

                default:

                    System.out.println(
                            "Invalid Choice!");
            }
        }
    }
}
