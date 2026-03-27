import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        return "ID: " + transactionId +
                " | Type: " + type +
                " | Amount: " + amount +
                " | Time: " + date.format(formatter);
    }
}
