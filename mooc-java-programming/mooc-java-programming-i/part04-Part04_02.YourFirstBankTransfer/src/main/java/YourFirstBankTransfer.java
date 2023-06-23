
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account accountOne = new Account("Matthews account", 1_000);
        Account accountTwo = new  Account("My account", 0);

        accountOne.withdrawal(100);
        accountTwo.deposit(100);

        System.out.println(accountOne);
        System.out.println(accountTwo);
    }
}
