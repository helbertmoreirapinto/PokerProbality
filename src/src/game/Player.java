package src.game;

import src.deck.Card;

/**
 *
 * @author helbert
 */
public class Player {

    String name;
    Card hand[];

    public Player(String name) {
        this.name = name;
        hand = new Card[2];
    }

    public Player() {
        this("player");
    }

    @Override
    public String toString() {
        return name + ": " + hand[0].toString() + ", " + hand[1].toString();
    }
}
