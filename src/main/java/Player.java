import java.util.ArrayList;

public class Player {

    private ArrayList<Card> playerHand;

    public Player() {
        this.playerHand = new ArrayList<Card>();
    }

    public ArrayList<Card> getPlayerHand() {
        return playerHand;
    }

    public int getPlayerHandSize(){
        return this.playerHand.size();
    }
}
