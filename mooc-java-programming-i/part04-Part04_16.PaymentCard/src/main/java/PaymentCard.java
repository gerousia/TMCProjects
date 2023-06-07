public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        if (openingBalance > 0) {
            this.balance = openingBalance;
        }
    }

    public void eatAffordably() {
        double cost = 2.60;
        if (this.balance >= cost) {
            this.balance -= cost;
        }
    }

    public void eatHeartily() {
        double cost = 4.60;
        if (this.balance >= cost) {
            this.balance -= cost;
        }
    }

    public void addMoney(double amount) {
        double maxBalance = 150.0;

        if (amount > 0) {
            this.balance = this.balance + amount > maxBalance
                    ? maxBalance
                    : this.balance + amount;
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of "+ this.balance + " euros";
    }
}
