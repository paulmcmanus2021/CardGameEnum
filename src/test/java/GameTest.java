import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Player player1;
    Player player2;
    ArrayList<Player> players;


    @Before
    public void before(){
        game = new Game();
        card1 = new Card(SuitType.HEARTS,RankType.ACE);
        card2 = new Card(SuitType.CLUBS,RankType.EIGHT);
        card3 = new Card(SuitType.SPADES,RankType.JACK);
        card4 = new Card(SuitType.DIAMONDS,RankType.FIVE);
        player1 = new Player();
        player2 = new Player();
        players = new ArrayList<Player>();
    }

    @Test
    public void canDealMultipleCardsToMultiplePlayers(){
        player1.addCardToHand(card1);
        player2.addCardToHand(card2);
        player1.addCardToHand(card3);
        player2.addCardToHand(card4);
        assertEquals(2, player1.getPlayerHandSize());
        assertEquals(2, player2.getPlayerHandSize());
    }

    @Test
    public void canGetMultiplePlayersHandValue(){
        player1.addCardToHand(card1);
        player2.addCardToHand(card2);
        player1.addCardToHand(card3);
        player2.addCardToHand(card4);
        assertEquals(11, player1.getHandValue());
        assertEquals(13, player2.getHandValue());
    }

    @Test
    public void canAddPlayersToArrayList() {
        game.addPlayer(player1);
        assertEquals(2, game.getPlayerCount());
    }

    @Test
    public void canCompareHandValues(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        player1.addCardToHand(card1);
        player2.addCardToHand(card2);
        player1.addCardToHand(card3);
        player2.addCardToHand(card4);
        assertEquals(player2, game.compareHandValues(player1, player2));
    }
}
