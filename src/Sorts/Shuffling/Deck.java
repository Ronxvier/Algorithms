package Sorts.Shuffling;

public class Deck {
    Card[] deck;
    public Deck() {
        int N=0;
        this.deck = new Card[52];
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
        for (String suit: suits){
            for (int i = 1; i<=13; i++){
                switch (i) {
                    case (1):
                        deck[N] = new Card(suit, "Ace");
                        break;
                    case (11):
                        deck[N] = new Card(suit, "Jack");
                        break;
                    case (12):
                        deck[N] = new Card(suit, "Queen");
                        break;
                    case (13):
                        deck[N] = new Card(suit, "King");
                        break;
                    default:
                        deck[N] = new Card(suit,i);
                        break;
                }
                N++;
            }
        }

    }

    public void list() {
        for (Card card : deck) {
            System.out.println(card.toString());
        }
    }

    public void shuffle() {
        for (double i=0; i<deck.length; i++) {
            double r = i*Math.random(); // generate random number between 0 & i;
            Card temp = deck[(int)(i)];
            deck[(int)(i)] = deck[(int)(r)];
            deck[(int)(r)] = temp;
        }
    }
}
