import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Player dealer;
    private Deck deck;

    public Game() {
        this.players = new ArrayList<Player>();
        this.dealer = new Player();
        this.deck = new Deck();
        this.players.add(dealer);
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public int getPlayerCount() {
        return this.players.size();
    }

    //Need to put draw event in.
    public Player compareHandValues(Player player1, Player player2) {
           if (player1.getHandValue() > player2.getHandValue()){
                 return player1;}
           else { return player2;}
           }

   public Player compareHandValuesArray(ArrayList<Player> players) {
       Player currentPlayer = players.get(0);
       for (Player player : players) {
           if (player.getHandValue() > currentPlayer.getHandValue()){
                return player;
           }
       }
       return currentPlayer;
   }

//end of class bracket
}

