public class Solution {
    public static void main(String args[]) throws IOException {
        BankAccount baObject = new BankAccount();
        baObject.print();
        baObject.accountNumber = "1235432545";
        baObject.accountHolder = "Steve Jobs";
        baObject.balance = 1000000.00;
        baObject.print();
        baObject.withdraw(1000.00);
        baObject.print();
        baObject.deposit(5000.00);
        baObject.print();
    }
}
