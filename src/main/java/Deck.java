import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deckOfCards;

    public Deck(){
        this.deckOfCards = new ArrayList<>();
        setupDeck();
    }

    public void setupDeck(){
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                Card card = new Card(rank, suit);
                this.deckOfCards.add(card);
            }
        }
    }

    public int getCardCount() {
        return this.deckOfCards.size();
    }
}
