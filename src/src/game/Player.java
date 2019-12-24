package src.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import src.deck.Card;

public class Player implements Comparable<Player> {

    String name;
    Card[] cards_hand;
    Hand hand;

    public Player(String name) {
        this.name = name;
        cards_hand = new Card[2];
    }

    public Player() {
        this("player");
    }

    @Override
    public String toString() {
        return name + ": " + cards_hand[0].toString() + " " + cards_hand[1].toString();
    }

    public void evaluate_hand(Card[] cards_table) {
        List<Card> c_hand = new ArrayList<>();
        c_hand.addAll(Arrays.asList(cards_hand));
        c_hand.addAll(Arrays.asList(cards_table));
        Collections.sort(c_hand);
        int count_suits = 1;
        int aux = -1;

        for (Card c : c_hand) {
            if (aux == -1 || aux != c.suit.code) {
                count_suits = 1;
                aux = c.suit.code;
            } else {
                count_suits++;
            }
            if (count_suits == 5) {
                break;
            }
        }

        if (count_suits == 5) {
            hand = Hand.FLUSH;
        } else {
            hand = Hand.HIGH_CARD;
        }
    }

    @Override
    public int compareTo(Player p) {
        int comp = (p.hand.note < this.hand.note) ? 1 : (p.hand.note > this.hand.note) ? -1 : 0;
        return comp;
    }

}
