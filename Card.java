public class Card {
    private int value;
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit, int value) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        this.value = value;
        this.rank = rank;
        this.suit = suit;
    }
    
    public Suit getSuit() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        return suit;
    }
    
    public Rank getRank() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        return rank;
    }
    
    public int getValue() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        return value;
    }
    
    public String toString() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        return rank.toString() + " of " + suit.toString() + "s (point value = " + value+ ")";
    }
}
