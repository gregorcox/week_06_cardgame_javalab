import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Deck deck;

    @Before
    public void setUp() {
        deck = new Deck();
        player1 = new Player("John");
        player2 = new Player("Kevin");
        game = new Game( player1, player2, deck);

    }


  @Test
    public void playerGetsCard(){
        game.deal();
        assertEquals(1, player2.handCount());

  }


}
