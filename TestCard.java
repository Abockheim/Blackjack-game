import java.util.ArrayList;
import java.util.Scanner;

/*
Creates random blackjack hands, with 2 to 6 cards,
and prints out the blackjack value of each hand.
The user decides when to stop.
*/

public class TestCard {

public static void main(String[] args) {

Deck deck; // A deck of cards.
Card card; // A card dealt from the deck.
ArrayList<Card> handPlayer = new ArrayList<Card>();
ArrayList<Card> handDealer = new ArrayList<Card>();
String choice = "hit"; // Set to true if user wants to continue.
int valuePlayer=0,valueDealer=0;
deck = new Deck(); // Create the deck.
Scanner reader = new Scanner(System.in);
deck.shuffle();
System.out.println();
System.out.println();
card = deck.dealCard();
handPlayer.add(card);

card = deck.dealCard();
handDealer.add(card);

System.out.println("Dealer first card contains:" + handDealer.get(0).toString());
while (choice.equalsIgnoreCase("hit")) {
System.out.println("\nPlayer hand contains:");
valuePlayer=0;
card = deck.dealCard();
handPlayer.add(card);
for (int i = 0; i < handPlayer.size(); i++) {
System.out.println(" " + handPlayer.get(i).toString());
valuePlayer=valuePlayer+handPlayer.get(i).getValue();
}
System.out.println("Value of hand is " + valuePlayer);
if (valuePlayer > 21) {
System.out.println("Sorry you busted and game is over");
return;
} else if(handPlayer.size()==5){
System.out.println("Player wins");
return;
}else{
System.out.println();
System.out.println("Do you want to hit or stay?");
choice = reader.nextLine();
while (!(choice.equalsIgnoreCase("hit") || choice.equalsIgnoreCase("stay"))) {
System.out.println("Invalid Choice. Please give again :");
choice = reader.nextLine();
}
}
}
System.out.println("\n\nDealer Chance Started.");
while(true)
{
valueDealer=0;
card = deck.dealCard();
handDealer.add(card);

for (int i = 0; i < handDealer.size(); i++) {
System.out.println(" " + handDealer.get(i).toString());
valueDealer=valueDealer+handDealer.get(i).getValue();
}
System.out.println("Value of hand is " + valueDealer);
if(valueDealer>=17){
break;
}
System.out.println("\n\nDealer hit.\n");
}
if(valueDealer>21){
System.out.println("Dealer busted and Player Wins");
}else if(valueDealer>valuePlayer){
System.out.println("Dealer got more score. You lost.");
}else{
System.out.println("You Won.");
}
reader.close();
}
}