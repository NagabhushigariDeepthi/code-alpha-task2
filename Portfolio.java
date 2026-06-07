package StockTradingPlatform;
import java.util.HashMap;
import java.util.Map;

public class Portfolio {

    private Map<String, Integer> holdings;

    public Portfolio() {
        holdings = new HashMap<>();
    }

    public void buyStock(String symbol, int quantity) {
        holdings.put(symbol, holdings.getOrDefault(symbol, 0) + quantity);
    }

    public void sellStock(String symbol, int quantity) {
        if (!holdings.containsKey(symbol))
            return;

        int currentQty = holdings.get(symbol);

        if (quantity >= currentQty)
            holdings.remove(symbol);
        else
            holdings.put(symbol, currentQty - quantity);
    }

    public Map<String, Integer> getHoldings() {
        return holdings;
    }
}