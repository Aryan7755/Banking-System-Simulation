import java.util.*;

public class Account {
    private int accountNumber;
    private String holderName;
    private double balance;
    private List<Transaction> transactions;

    public Account(int accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }
}
