import java.util.ArrayList;

public class Dealer {

    private ArrayList<Deck> deck;
    private ArrayList<Card> dealerHand;

    public Dealer() {
        this.dealerHand = new ArrayList<Card>();
    }

    public ArrayList<Card> getDealerHand() {
        return dealerHand;
    }

    public int getHandSize(){
        return dealerHand.size();
    }
}
