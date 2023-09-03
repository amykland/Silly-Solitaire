public class CardTester {
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        Card TwoSpade = new Card(Rank.TWO, Suit.SPADE, 2);
        Card FiveHeart = new Card(Rank.FIVE, Suit.HEART, 5);
        Card ClubKing = new Card(Rank.KING, Suit.CLUB, 13);
        System.out.println(TwoSpade);
        System.out.println(FiveHeart);
        System.out.println(ClubKing);
    }
}
