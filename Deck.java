import java.util.*;

public class Deck {
    private int size;
    private Card[] cards;

    public Deck(Rank[] ranks, Suit[] suits, int[] values) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        cards = new Card[suits.length*ranks.length];
        int counter = 0;
        for(int i = 0; i<suits.length; i++) {
            for(int j = 0; j<ranks.length; j++) {
                cards[counter] = new Card(ranks[j], suits[i], values[j]);
                counter++;
            }
        }
        size = originalSize();
    }

    public boolean isEmpty() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        if(size == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        return size;
    }

    public Card deal() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        selectionShuffle();
        size--;
        return cards[size];
    }

    @Override
    public String toString() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String output = "Deck size = ";
        output += size;
        output += "\nUndealt cards: \n";
        for(int i = 0; i<size; i++) {
            output += cards[i];
            output += "\n";
        }
        output = output + "Dealt cards: \n";
        for(int i = size; i<52; i++) {
            output += cards[i];
            output += "\n";
        }
        return output;
    }
    
    public void perfectShuffle() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 3-4 *** */
        size = originalSize();
        Card[] h1 = new Card[size/2];
        Card[] h2 = new Card[size/2];
        for(int i = 0; i<size/2; i++) {
            h1[i] = cards[i];
        }
        for(int i = size/2; i<size; i++) {
            h2[i-size/2] = cards[i];
        }
        for(int i = 0; i<size; i++) {
            if(i%2 == 0) {
                cards[i] = h1[i/2];
            } else {
                cards[i] = h2[i/2];
            }
        }
    }

    private void selectionShuffle() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 3-4 *** */
        size = originalSize();
        Random r = new Random();
        Card temp = new Card(null, null, 0);
        for(int i = 51; i>0; i--) {
            int k = r.nextInt(i);
            temp = cards[k];
            cards[k] = cards[i];
            cards[i] = temp;
        }
    }

    public void simulatedShuffle(int t, int f) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 3-4 *** */
        size = originalSize();
        Random r = new Random();
        boolean h1t = true;
        int h1pos = 0;
        int h2pos = 0;
        Card[] h1;
        if(r.nextInt(1) == 1) {
            h1 = new Card[size/2+r.nextInt(t)];
        } else {
            h1 = new Card[size/2-r.nextInt(t)];
        }
        Card[] h2 = new Card[size-h1.length];
        for(int i = 0; i<h1.length; i++) {
            h1[i] = cards[i];
        }
        for(int i = h1.length; i<size; i++) {
            h2[i-h1.length] = cards[i];
        }
        for(int i = 0; i<size; i++) {
            if(h1t) {
                for(int j = 0; i<r.nextInt(f)+1; i++) {
                    if(h1.length > h1pos) {
                        cards[i] = h1[j+h1pos];
                        h1pos++;
                    }
                    h1t = false;
                }
            } else {
                for(int j = 0; i<r.nextInt(f)+1; i++) {
                    if(h2.length > h2pos) {
                        cards[i] = h2[j+h2pos];
                        h2pos++;
                    }
                    h1t = true;
                }
            }
        }
    }
    public void shuffle() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 3-4 *** */
        // Call the shuffle you want to use
        selectionShuffle();
    }
    
    private int originalSize() {
        return cards.length;
    }
}
