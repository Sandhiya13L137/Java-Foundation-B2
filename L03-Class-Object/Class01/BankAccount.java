public class BankAccount {
    void withdraw(double amount) {
        balance -= amount;
    }
    void deposit(double amount) {
        balance += amount;
    }
    String accountNumber;
    String accountHolder;
    double balance;
    void print() {
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Name : "+accountHolder);
        System.out.println("Balance : "+balance);
    }
}
