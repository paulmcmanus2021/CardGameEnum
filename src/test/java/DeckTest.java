import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck(){};
        card = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.getDeckSize());
    }

    @Test
    public void addCardToDeck() {
        deck.addCardToDeck(card);
        assertEquals(1, deck.getDeckSize());
    }

    @Test
    public void canPopulateDeck(){
        deck.populateDeck();
        assertEquals(52, deck.getDeckSize());
    }

    @Test //manually compared via step over in debugger
    public void testShuffleDeckWithOutput(){
        deck.populateDeck();
        deck.shuffleDeck();
    }

    @Test
    public void canDealCard(){
        deck.populateDeck();
        deck.dealCard();
        assertEquals(51, deck.getDeckSize());
    }


}
