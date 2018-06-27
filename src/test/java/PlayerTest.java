import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;


    @Before
    public void setUp(){
        player1 = new Player("Adam");
        player2 = new Player("John");
    }

    @Test
    public void hasName(){
        assertEquals("Adam", player1.getName());
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0,player1.handCount());
    }

}
