
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here

        //Declare and instantiate the account
        Account account = new Account("My Account", 100);

        //Call the method deposit
        account.deposit(20);

        /*
        Print the balance. Note that this only works this way because the toString
        method was overridden. This could also be accomplished by writing a
        method specifically dedicated to printing the balance.
        */
        System.out.println(account);

    }
}
