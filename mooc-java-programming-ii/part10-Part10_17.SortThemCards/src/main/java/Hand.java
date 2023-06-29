import java.util.*;

public class Hand implements Comparable<Hand> {
    private final List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(cards);
    }

    public int getValue() {
        return cards.stream()
                .mapToInt(Card::getValue)
                .reduce(Integer::sum).orElse(0);
    }

    public void sortBySuit() {
        cards.sort(Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue));
    }

    @Override
    public int compareTo(Hand another) {
        return Comparator.comparingInt(Hand::getValue)
                .compare(this, another);
    }
}
