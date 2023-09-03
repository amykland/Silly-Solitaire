import java.util.*;

public class ElevensBoard {
    public ElevensBoard() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 7 *** */
    }

    public void newGame() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 7 *** */
    }

    public int size() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 7 *** */
        return 9;
    }

    public int deckSize() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 7 *** */
        return -1;
    }

    public Card cardAt(int k) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 7 *** */
        return null;
    }

    @Override
    public String toString() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 7 *** */
        String s = "the cards on the board...";
        return s;
    }

    // The following methods enforce the rules for this game
    public boolean gameIsWon() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 7 *** */
        return false;
    }

    /**
     * Determines if the selected cards form a valid group for removal.
     * In Elevens, the legal groups are (1) a pair of non-face cards
     * whose values add to 11, and (2) a group of three cards consisting of
     * a jack, a queen, and a king in some order.
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal;
     *         false otherwise.
     */
    public boolean isLegal(List<Integer> selectedCards) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
        return false;
    }

    /**
     * Determine if there are any legal plays left on the board.
     * In Elevens, there is a legal play if the board contains
     * (1) a pair of non-face cards whose values add to 11, or (2) a group
     * of three cards consisting of a jack, a queen, and a king in some order.
     * @return true if there is a legal play left on the board;
     *         false otherwise.
     */
    public boolean anotherPlayIsPossible() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
        return false;
    }

    /**
     * Check for an 11-pair in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find an 11-pair.
     * @return true if the board entries in selectedCards
     *              contain an 11-pair; false otherwise.
     */
    private boolean containsPairSum11(List<Integer> selectedCards) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
        return false;
    }

    /**
     * Check for a JQK in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find a JQK group.
     * @return true if the board entries in selectedCards
     *              include a jack, a queen, and a king; false otherwise.
     */
    private boolean containsJQK(List<Integer> selectedCards) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
        return false;
    }
    
    public List<Integer> findPlayIsPossible() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void replaceSelectedCards(List<Integer> selectedCards) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Do a play (if there is one)
     * @return Successfully played a play or not
     */
    public final boolean playIfPossible() {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
        throw new UnsupportedOperationException();
    }
}
