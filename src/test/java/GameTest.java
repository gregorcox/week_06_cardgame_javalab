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
        game = new Game( player1, player2, deck);
    }

    @Test
    public void shuffleIsRandom(){
        assertEquals(1, game.shuffleDeck());

    }

}
