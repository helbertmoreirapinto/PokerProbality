package src.deck;

public enum Suit {
    CLUB(2, '♣'),
    HEART(1, '♥'),
    SPADES(0, '♠'),
    DIAMOND(3, '♦');

    public int code;
    public char simb;

    Suit(int code, char simb) {
        this.code = code;
        this.simb = simb;
    }

    @Override
    public String toString() {
        return String.valueOf(this.simb);
    }

    public static Suit getSuit(int num_suit) {
        for (Suit elem : Suit.values()) {
            if (elem.code == num_suit) {
                return elem;
            }
        }
        return null;
    }
}
