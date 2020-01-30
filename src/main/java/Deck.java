import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

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
}
