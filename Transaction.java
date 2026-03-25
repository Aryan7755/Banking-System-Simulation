import java.time.LocalDateTime;

public class Transaction {
    private static int counter = 1;

    private int transactionId;
    private String type;
    private double amount;
    private LocalDateTime date;
}
