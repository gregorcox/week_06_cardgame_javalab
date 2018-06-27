import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before

     public void setUp(){
        card = new Card(RankType.ACE, SuitType.CLUBS);
    }

    @Test
    public void hasSuitType(){
        assertEquals(SuitType.CLUBS, card.getSuit());
    }
}
