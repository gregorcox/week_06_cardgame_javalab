import java.util.ArrayList;

public class Player {
    
    private String name;
    private ArrayList<Card> hand;
    
    public Player(String name){
        this.hand = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int handCount() {
        return this.hand.size();
    }
}
