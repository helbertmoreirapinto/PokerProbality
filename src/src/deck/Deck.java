package src.deck;

import java.lang.reflect.Array;

/**
 *
 * @author helbert
 */
public final class Deck {

    private final Card deck[];
    private static final int NUM_CARDS = 52;
    private static final int NUM_SHUFFLE = 10000;

    public Deck() {
        deck = new Card[NUM_CARDS];
        init_deck();
    }

    private void init_deck() {
        char value;
        Suit suit;
        for (int i = 0; i < NUM_CARDS; i++) {
            suit = Suit.getSuit(i / 13);
            value = getValue((i % 13) + 1);
            deck[i] = new Card(suit, value);
        }
    }

    private char getValue(int num_value) {
        Character c = '1';
        switch (num_value) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                while (--num_value > 0) {
                    c++;
                }
                return c;
            case 10:
                return 'D';
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

    public void shuffle() {
        int rand;
        Card aux;

        for (int k = 0; k < NUM_SHUFFLE; k++) {
            for (int i = 0; i < NUM_CARDS; i++) {
                rand = i;
                while (rand == i) {
                    rand = (int) (Math.random() * NUM_CARDS);
                }
                aux = deck[i];
                deck[i] = deck[rand];
                deck[rand] = aux;
            }
        }
    }

    public Card getCard() {
        int i = NUM_CARDS - 1;
        Card card = deck[i];
        while (card == null) {
            card = deck[--i];
        }
        deck[i] = null;
        return card;
    }

    public void print() {
        int i = 0;
        for (Card card : deck) {
            System.out.println(i++ + " " + card.toString());
        }
    }

    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        d.print();

//        System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(d.getCard().toString());
//        }
    }
}
