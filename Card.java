//Alexander Bockheim
//CS 145
//Individual Cards

public class Card {

      public final static int SPADES = 0, // Code for the 4 suits.
   
         HEARTS = 1,
   
         DIAMONDS = 2,
   
         CLUBS = 3;

      public final static int ACE = 1, // Code for the non numbered cards.

         JACK = 10, 
      
         QUEEN = 10, 
      
         KING = 10;

      private final int suit; // The suit of this card, one of the constants
      
         // Spades, Hearts, Diamonds, Clubs.

      private final int value; // The value of this cards from 1 to 11.

      public Card(int theValue, int theSuit) {
         
         value = theValue;
         
         suit = theSuit;
   }

      public int getSuit() {
         
         // Return the int that codes for this card's suit.
      
      return suit;
   
   }
   
      public int getValue() {
         
         // Return the int that codes for this card's value.
      
      if(value<11)
      
      return value;
      
      else
      
      return 10;
   
   }

      public String getSuitAsString() {
         
         // (If the card's suit is invalid, "Error" is returned.)
      
      switch ( suit ) {
      
      case SPADES: return "Spades";
      
      case HEARTS: return "Hearts"; 
      
      case DIAMONDS: return "Diamonds";
      
      case CLUBS: return "Clubs";
      
      default: return "Error";
   
   }
   
}

      public String getValueAsString() {
               
         // If the card's value is invalid, "Error" is returned.
      
      switch ( value ) {
      
      case 1: return "Ace";
      
      case 2: return "2";
      
      case 3: return "3";
      
      case 4: return "4";
      
      case 5: return "5";
      
      case 6: return "6";
      
      case 7: return "7";
      
      case 8: return "8";
      
      case 9: return "9";
      
      case 10: return "10";
      
      case 11: return "Jack";
      
      case 12: return "Queen";
      
      case 13: return "King";
   
      default: return "Error";

   }

}

      public String toString() {

         // Return a String representation of this card, such as "8 of Spades" or "King of Diamonds".
      
      return getValueAsString() + " of " + getSuitAsString();
   }


} // end class Card