import java.util.*;

public class Bank {
    private Map<Integer, Account> accounts = new HashMap<>();
    private static int accountCounter = 1001;

    public void createAccount(String name) {
        int accNo = accountCounter++;
        Account acc = new Account(accNo, name);
        accounts.put(accNo, acc);

        System.out.println("Account created. Account Number: " + accNo);
    }

    public void deposit(int accNo, double amount) {
        Account acc = accounts.get(accNo);

        if (acc == null) {
            System.out.println("Account not found");
            return;
        }

        acc.deposit(amount);
    }

    public void withdraw(int accNo, double amount) {
        Account acc = accounts.get(accNo);

        if (acc == null) {
            System.out.println("Account not found");
            return;
        }
        try {
            acc.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showHistory(int accNo) {
        Account acc = accounts.get(accNo);

        if (acc == null) {
            System.out.println("Account not found");
            return;
        }

        acc.printTransactionHistory();
    }
}
