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

        for(Card f : this.cards ){
            if(!cardsWithSameSuit.containsKey(f.getSuit())){
                cardsWithSameSuit.put(f.getSuit(),new ArrayList<>());
            }
            cardsWithSameSuit.get(f.getSuit()).add(f);
        }
        for(Suit su : cardsWithSameSuit.keySet()){
            if(cardsWithSameSuit.get(su).size() == 5){
                return "Flush";
            }

        }



        for(Card s : this.cards){
            if(!cardsWithSameRank.containsKey(s.getRank())){
                cardsWithSameRank.put(s.getRank(), new ArrayList<>());

            }
            cardsWithSameRank.get(s.getRank()).add(s);
        }
        for(Rank r : cardsWithSameRank.keySet()){
            if(cardsWithSameRank.get(r).size() == 4){
                return  "four of a kind";
            }
            else if(cardsWithSameRank.get(r).size() == 3){
                return "three of a kind";
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
