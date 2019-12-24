package src.deck;

public class Card implements Comparable<Card> {

    public char value;
    public Suit suit;
    public int code;

    @Deprecated
    public Card(Suit suit, char value) {
        this.suit = suit;
        this.value = value;
    }

    public Card(int code) {
        this.code = code;
        this.suit = Suit.getSuit(code / 13);
        this.value = getValue((code % 13) + 1);
    }

    @Override
    public String toString() {
        return suit.toString() + value;
    }

    @Override
    public int compareTo(Card c) {
        int comp = (c.code < this.code) ? 1 : (c.code > this.code) ? -1 : 0;
        return comp;
    }

    private char getValue(int num_value) {
        switch (num_value) {
            case 1:
                return 'A';
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                char c = '1';
                while (--num_value > 0) {
                    c++;
                }
                return c;
            case 10:
                return 'T';
            case 11:
                return 'J';
            case 12:
                return 'Q';
            case 13:
                return 'K';
            default:
                return ' ';
        }
    }
}
