import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Card card1;
    Card card2;
    Card card3;
    Card card4;

    @Before
    public void before(){
        deck = new Deck(){};
        dealer = new Dealer();
        card1 = new Card(SuitType.SPADES, RankType.ACE);
        card2 = new Card(SuitType.HEARTS, RankType.TEN);
        card3 = new Card(SuitType.DIAMONDS, RankType.ACE);
        card4 = new Card(SuitType.CLUBS, RankType.NINE);
    }

    @Test
    public void dealerHandStartsEmpty(){
        assertEquals(0, dealer.getHandSize());
    }

//    @Test
//    public void canDealToSelf(){
//        dealer.dealCard(dealer);
//        assertEquals(0, dealer.getHandSize());
//    }
//
//    @Test
//    public void canDealToPlayer(){
//        dealer.dealCard(player);
//        assertEquals(1, player.getHandSize());
//    }

}
