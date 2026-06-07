package StockTradingPlatform;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void savePortfolio(User user)
            throws IOException {

        BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter("portfolio.txt"));

        writer.write("User : " + user.getName());
        writer.newLine();

        writer.write("Balance : ₹" +
                user.getBalance());

        writer.newLine();
        writer.newLine();

        writer.write("Holdings");
        writer.newLine();

        for (var entry :
                user.getPortfolio()
                        .getHoldings()
                        .entrySet()) {

            writer.write(
                    entry.getKey()
                            + " -> "
                            + entry.getValue());

            writer.newLine();
        }

        writer.close();
    }
}