package Sorts.Shuffling;

public class Card {
    String Suit;
    Object Value;
    public Card(String suit, Object value) {
        this.Suit = suit;
        this.Value = value;
    }
    public String toString() {
        return Value + " of " + Suit;
    }
}
