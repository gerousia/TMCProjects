
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }

    public Money minus(Money decreaser) {
        int newEuro = this.euros;
        int newCents = this.cents;

        if (newCents < decreaser.cents) {
            --newEuro;

            newCents += 100 - decreaser.cents;
        } else {
            newCents -= decreaser.cents;
        }

        if (newEuro >= decreaser.euros) {
            newEuro -= decreaser.euros;
        } else {
            return new Money(0, 0);
        }

        return new Money(newEuro, newCents);
    }

    public boolean lessThan (Money compared) {
        return this.euros < compared.euros || (this.euros == compared.euros && this.cents < compared.cents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
