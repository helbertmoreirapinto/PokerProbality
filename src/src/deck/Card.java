package src.deck;

/**
 *
 * @author helbert
 */
public class Card {

    char value;
    Suit suit;

    public Card(Suit suit, char value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }
}
