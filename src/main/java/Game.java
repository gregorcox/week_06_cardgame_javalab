import java.util.Collections;
import java.util.ArrayList;

public class Game {
    private Deck deck;
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2, Deck deck)
    {
        this.player1 = player1;
        this.player2 = player2;
        this.deck = new Deck();
    }




    public Card drawsCard(){
        deck.shuffleDeck();
        return this.deck.deckOfCards.remove(0);

    }


    public void deal(){
        Card card1 = drawsCard();
        Card card2 = drawsCard();
        player1.hand.add(card1);
        player2.hand.add(card2);

    }

    public String checkWinner(){
        deal();
        if (player1.hand.remove(0).value() > player2.hand.remove(0).value()) {
            return player1.getName();
        } else {
            return player2.getName();
        }
    }

    public String playGame(){
        deal();
        return checkWinner();
    }

//    public String playGame(){
////        deck.shuffleDeck();
////        Card card1 = deck.deckOfCards.remove(0);
////        Card card2 = deck.deckOfCards.remove(1);
////        player1.hand.add(card1);
////        player2.hand.add(card2);
//        if (card1.value() > card2.value()) {
//            return "Player 1 wins!";
//        } else {
//            return "Player 2 wins!";
//                }
//            }







}



