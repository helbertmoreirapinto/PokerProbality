package src.game;

import src.deck.Card;
import src.deck.Deck;

public class Poker {

    Player players[];
    Deck deck;

    public Poker(int num_players) {
        players = new Player[num_players];
        for (int i = 0; i < num_players; i++) {
            players[i] = new Player(String.format("PLAYER %d", i));
        }
    }

    public static void main(String[] args) {
        int NUM_PLAYERS = 10;
        Poker poker = new Poker(NUM_PLAYERS);
        poker.deck = new Deck();
        poker.deck.shuffle();
//        poker.deck.print();
//        System.out.println("-------------------------------------------");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < NUM_PLAYERS; j++) {
                poker.players[j].cards_hand[i] = poker.deck.getCard();
            }
        }

        Card table[] = new Card[5];
        for (int j = 0; j < 5; j++) {
            table[j] = poker.deck.getCard();
        }

        for (int j = 0; j < NUM_PLAYERS; j++) {
            poker.players[j].evaluate_hand(table);
            System.out.print(poker.players[j].toString());
            System.out.print(" ");
            System.out.println(poker.players[j].hand.toString());
        }

        System.out.println("");
        for (int j = 0; j < 5; j++) {
            System.out.print(table[j].toString() + "    ");
        }
        System.out.print("\n");

    }

}
