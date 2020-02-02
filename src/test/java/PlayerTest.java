import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Deck deck;
    Card card1;
    Card card2;
    Card card3;
    Player player;

    @Before
    public void before(){
        deck = new Deck();
        card1 = new Card(SuitType.HEARTS,RankType.ACE);
        card2 = new Card(SuitType.CLUBS,RankType.EIGHT);
        card3 = new Card(SuitType.SPADES,RankType.JACK);
        player = new Player();

    }

    @Test
    public void playerHandStartsEmpty(){
        deck.populateDeck();
        assertEquals(0, player.getPlayerHandSize());
        assertEquals(52, deck.getDeckSize());
    }

    @Test
    public void canDealCardToPlayer(){
        player.addCardToHand(card1);
        assertEquals(1, player.getPlayerHandSize());
    }

    @Test
    public void canGetHandValue(){
        player.addCardToHand(card1);
        player.addCardToHand(card2);
        assertEquals(9, player.getHandValue());
    }
}
