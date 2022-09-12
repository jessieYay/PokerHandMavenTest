package groupIdTwo;

public class PokerHand {


    private Card[] cards;

    public PokerHand(Card[] cards) {

        this.cards = cards;
    }

    public String getDescription() {

        return "high card: Ace";
    }
}
