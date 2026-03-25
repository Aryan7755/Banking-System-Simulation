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
}
