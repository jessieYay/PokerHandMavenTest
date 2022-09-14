package groupIdTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokerHandTest {

    @Test

    void shouldScoreHighCard(){

        var pokerHand = new PokerHand(new Card[] {
                new Card(Rank.Number_2, Suit.Hearts),
                new Card(Rank.Number_3, Suit.Clubs),
                new Card(Rank.Number_10, Suit.Diamonds),
                new Card(Rank.Ace, Suit.Spades),
                new Card(Rank.Number_7, Suit.Hearts),
        });

        assertEquals(pokerHand.getDescription(), "high card: Ace");

    }

    @Test

    void shouldScorePair(){

        var pokerHand = new PokerHand(new Card[] {
                new Card(Rank.Number_2, Suit.Hearts),
                new Card(Rank.Number_2, Suit.Spades),
                new Card(Rank.Ace, Suit.Diamonds),
                new Card(Rank.Number_3, Suit.Clubs),
                new Card(Rank.Number_7, Suit.Hearts),
        });

        assertEquals(pokerHand.getDescription(), "pair of: 2");

    }
}
