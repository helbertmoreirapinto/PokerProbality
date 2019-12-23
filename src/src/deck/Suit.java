package src.deck;

/**
 *
 * @author helbert
 */
public enum Suit {
    DIAMOND,
    HEART,
    SPADES,
    CLUB;

    static Suit getSuit(int num_suit) {
        switch (num_suit) {
            case 0:
                return CLUB;
            case 1:
                return HEART;
            case 2:
                return SPADES;
            case 3:
                return DIAMOND;
            default:
                return null;
        }
    }
}
