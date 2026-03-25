import java.util.*;
public class Main {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Bank bank = new Bank();

            bank.createAccount("Aryan");
            bank.deposit(1001, 5000);
        }

}
