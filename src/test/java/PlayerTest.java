import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void setUp(){
        player = new Player("Adam");
    }

    @Test
    public void hasName(){
        assertEquals("Adam", player.getName());
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0,player.handCount());
    }
}
