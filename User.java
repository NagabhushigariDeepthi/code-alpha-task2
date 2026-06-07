package StockTradingPlatform;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private double balance;
    private Portfolio portfolio;
    private List<Transaction> transactions;

    public User(String name, double balance) {

        this.name = name;
        this.balance = balance;

        portfolio = new Portfolio();
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public void deductBalance(double amount) {
        balance -= amount;
    }
}