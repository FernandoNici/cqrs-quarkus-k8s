package src.main.java.com.example.stockbeer;

import java.util.Map;

public class Transaction {

    private final String beerId;
    private final String description;
    private final TransactionType transactionType;
    private final double value;

    public Transaction(String beerId, String description, TransactionType transactionType, double value) {
        this.beerId = beerId;
        this.description = description;
        this.transactionType = transactionType;
        this.value = value;
    }

    public boolean isIncome() {
        return transactionType.isIncome();
    }

    public String getBeerId() {
        return beerId;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static Transaction ofMap(Map<String, Object> map) {
        return new Transaction(
                map.get("beerId").toString(),
                map.get("description").toString(),
                TransactionType.valueOf(map.get("type").toString()),
                Double.parseDouble(map.get("value").toString()));
    }

}
