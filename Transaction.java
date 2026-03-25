import java.time.LocalDateTime;

public class Transaction {
    private static int counter = 1;

    private int transactionId;
    private String type;
    private double amount;
    private LocalDateTime date;

    public Transaction(String type, double amount) {
        this.transactionId = counter++;
        this.type = type;
        this.amount = amount;
        this.date = LocalDateTime.now();
    }
}
