import java.util.ArrayList;

public class Player {

    private ArrayList<Card> playerHand;

    public Player() {
        this.playerHand = new ArrayList<Card>();
    }

    public ArrayList<Card> getPlayerHand() {
        return this.playerHand;
    }

    public int getPlayerHandSize(){
        return this.playerHand.size();
    }

    public void addCardToHand(Card card){
        this.playerHand.add(card);
    }

    public int getHandValue() {
        int handValue = 0;
        for (Card card : this.playerHand){
            handValue += card.getValueFromEnum();
        }
        return handValue;
    }
}
