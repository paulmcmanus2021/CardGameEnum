//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class GameTest {
//    Game game;
//    Deck deck;
//    Card card;
//    Player player;
//    Player dealer;
//
//    @Before
//    public void before(){
//        deck = new Deck();
//        Card card1 = new Card(SuitType.SPADES, RankType.ACE);
//        Card card2 = new Card(SuitType.HEARTS, RankType.QUEEN);
//        Card card3 = new Card(SuitType.CLUBS, RankType.TEN);
//        Card card4 = new Card(SuitType.DIAMONDS, RankType.EIGHT);
//        Player player = new Player();
//        Player dealer = new Player();
//    }
//
//    @Test
//    public void canDealCardToPlayers(){
//        game.dealCard(Player dealer);
//        game.dealCard(Player player);
//        assertEquals(1, player.getPlayerHandSize());
//        assertEquals(1, dealer.getPlayerHandSize());
//    }
//}
