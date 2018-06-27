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

    public RankType getRank() {
        return rank;
    }

    public int value() {
        return this.rank.getValue();
    }

    public Card addCard( RankType rank, SuitType suit){
        return new Card(rank, suit);
    }




}


