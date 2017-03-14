/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card cardOne = new Card("Ace", "Spade", 1);
		Card cardTwo = new Card("King", "Heart", 13);
		Card cardThree = new Card("Eight", "Club", 8);
		Card cardFour = new Card("Ace", "Spade", 1);
		System.out.println(cardOne.suit());
		System.out.println(cardTwo.rank());
		System.out.println(cardThree.pointValue());
		System.out.println(cardOne.matches(cardFour));
		System.out.println(cardTwo.toString());
	}
}
