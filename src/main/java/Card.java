public class Card {
    
    private RankType rank;
    private SuitType suit;
    
    
    public Card(RankType rank, SuitType suit){
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit() {
        return suit;
    }
}
