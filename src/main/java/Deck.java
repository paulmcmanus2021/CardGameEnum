import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;
    private Player player;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public void populateDeck() {
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    public int getDeckSize() {
        return this.cards.size();
    }

    public void addCardToDeck(Card card){
        this.cards.add(card);
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public Card dealCard(){
        //removes the first card, and slides the others down an index position
        return cards.remove(0);
    }

}
