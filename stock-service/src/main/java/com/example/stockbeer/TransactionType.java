package src.main.java.com.example.stockbeer;

public enum TransactionType {

    INFLOW, OUTFLOW;

    public boolean isIncome() {
        return this == INFLOW;
    }

}