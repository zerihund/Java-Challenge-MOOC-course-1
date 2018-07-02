
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account accountA = new Account("A", 100);
        Account accountB = new Account("B", 0);
        Account accountC = new Account("C", 0);
        transfer(accountA, accountB, 50);
        transfer(accountB, accountC, 25);
    }

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
