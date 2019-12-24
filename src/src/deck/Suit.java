package src.deck;

public enum Suit {
    CLUB(0, '♣'),
    HEART(1, '♥'),
    SPADES(2, '♠'),
    DIAMOND(3, '♦');

    int code;
    char simb;
    
    Suit(int code, char simb) {
        this.code = code;
        this.simb = simb;
    }
    
    @Override
    public String toString(){
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
