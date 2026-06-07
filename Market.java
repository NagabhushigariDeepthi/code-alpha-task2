package StockTradingPlatform;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Market {

    private Map<String, Stock> stocks;

    public Market() {

        stocks = new HashMap<>();

        stocks.put("AAPL", new Stock("AAPL", 180));
        stocks.put("TSLA", new Stock("TSLA", 250));
        stocks.put("GOOGL", new Stock("GOOGL", 140));
        stocks.put("AMZN", new Stock("AMZN", 170));
    }

    public void displayMarket() {

        System.out.println("\n===== MARKET DATA =====");

        for (Stock stock : stocks.values()) {

            System.out.println(
                    stock.getSymbol()
                            + " : ₹"
                            + String.format("%.2f",
                            stock.getPrice()));
        }
    }

    public Stock getStock(String symbol) {
        return stocks.get(symbol);
    }

    public void updatePrices() {

        Random random = new Random();

        for (Stock stock : stocks.values()) {

            double change =
                    (random.nextDouble() * 20) - 10;

            stock.setPrice(
                    Math.max(50,
                            stock.getPrice() + change));
        }
    }
}
