package Sorts.Shuffling;

public class ShuffleTest {
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        myDeck.shuffle();
        myDeck.list();
        System.out.println("Number of Cards in the Deck: "+ myDeck.deck.length);
    }
}
