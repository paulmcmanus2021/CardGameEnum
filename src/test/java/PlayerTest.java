import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Deck deck;
    Card card;
    Player player;

    @Before
    public void before(){
        deck = new Deck(){};
        player = new Player();
    }

    @Test
    public void playerHandStartsEmpty(){
        deck.populateDeck();
        assertEquals(0, player.getPlayerHandSize());
        assertEquals(52, deck.getDeckSize());
    }
}
