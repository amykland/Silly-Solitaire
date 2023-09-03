
import javahelpers.*;

public class DeckTester {
    public static void main(String[] args) {
        Rank[] ranks = {Rank.ACE, Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN, Rank.EIGHT, Rank.NINE};
        Suit[] suits = {Suit.SPADE, Suit.HEART, Suit.CLUB, Suit.DIAMOND};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //Deck d = new Deck(ranks, suits, values);
        //d.shuffle();
        //System.out.println(d);
        Deck y = new Deck(ranks, suits, values);
        for(int i = 0; i<8; i++) {
            y.perfectShuffle();
        }
        System.out.println(y);
        StandardDeck g = new StandardDeck();
        g.simulatedShuffle(6, 4);
        System.out.println(g);
        g = new StandardDeck();
        for(int i = 0; i<8; i++) {
            g.simulatedShuffle(6 ,4);
        }
    }
}
