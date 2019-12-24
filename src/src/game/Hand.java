package src.game;

public enum Hand {
    ROYAL_FLUSH(10, "royal"),
    STRAIGHT_FLUSH(9, "straight flush"),
    FOUR(8, "four of a kind"),
    FULL_HOUSE(7, "full house"),
    FLUSH(6, "flush"),
    STRAIGHT(5, "straight"),
    THREE(4, "three of a kind"),
    TWO_PAIR(3, "two pair"),
    ONE_PAIR(2, "one pair"),
    HIGH_CARD(1, "high card");

    int note;
    String hand;

    Hand(int note, String hand) {
        this.note = note;
        this.hand = hand;
    }

    @Override
    public String toString() {
        return hand;
    }

}
