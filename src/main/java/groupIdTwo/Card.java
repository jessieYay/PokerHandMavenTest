package groupIdTwo;

public class Card {

    private final Rank rank;

    private final Suit suit;

    public Card(Rank rank, Suit suit) {

        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return this.rank;
    }
    public Suit getSuit() {
        return suit;
    }
}
