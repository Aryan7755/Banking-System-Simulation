import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        bank.loadFromFile();

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    bank.createAccount(name);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int accNo = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    bank.depositAmount(accNo, amt);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();
                    System.out.print("Enter amount: ");
                    amt = sc.nextDouble();
                    bank.withdrawAmount(accNo, amt);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accNo = sc.nextInt();
                    bank.showHistory(accNo);
                    break;

                case 5:
                    bank.saveToFile();
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}