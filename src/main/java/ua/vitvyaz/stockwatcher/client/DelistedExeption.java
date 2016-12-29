package ua.vitvyaz.stockwatcher.client;

import java.io.Serializable;

/**
 * Created by methype on 28.12.2016.
 */
public class DelistedExeption extends Exception implements Serializable {
    private String symbol;

    public DelistedExeption() {
    }

    public DelistedExeption(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
