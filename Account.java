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

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }

        balance += amount;
        transactions.add(new Transaction("DEPOSIT", amount));
        System.out.println("Deposit successful");
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        }

        balance -= amount;
        transactions.add(new Transaction("WITHDRAW", amount));
        System.out.println("Withdrawal successful");
    }

    public void printTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found");
            return;
        }

        System.out.println("\nTransaction History:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }



}
