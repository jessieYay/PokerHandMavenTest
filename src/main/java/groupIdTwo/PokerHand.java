package groupIdTwo;

import java.util.ArrayList;
import java.util.HashMap;

public class PokerHand {


    private Card[] cards;

    public PokerHand(Card[] cards) {

        this.cards = cards;
    }

    public String getDescription() {
        HashMap<Suit, ArrayList<Card>> cardsWithSameSuit = new HashMap<>();
        HashMap<Rank, ArrayList<Card>> cardsWithSameRank = new HashMap<>();



        for(Card s : this.cards){
            if(!cardsWithSameRank.containsKey(s.getRank())){
                cardsWithSameRank.put(s.getRank(), new ArrayList<>());

            }
            cardsWithSameRank.get(s.getRank()).add(s);
        }
        for(Rank r : cardsWithSameRank.keySet()){
            if(cardsWithSameRank.get(r).size() == 4){
                return  "Four of a kind of type: " + r.getDescription();
            }
            else if(cardsWithSameRank.get(r).size() == 3){
                return "3 of a kind of type: " + r.getDescription();
            }
            else if(cardsWithSameRank.get(r).size() == 2){
                return "pair of: " + r.getDescription();

            }
        }


        Rank MaxRank = Rank.Number_2;
        for(Card c : this.cards){
            if(c.getRank().compareTo(MaxRank) > 0){
                MaxRank = c.getRank();

            }
        }
        return "high card: " + MaxRank.getDescription();
    }
}
