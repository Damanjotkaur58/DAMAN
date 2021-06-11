/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 * @ modifier Damanjot kaur 
 * @ student number 991626934
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card d = new Card();
           d.setValue((int)Math.floor(Math.random()*13+1)); //d.setValue(insert call to random number generator here
           d.setSuit(Card.SUITS[(int)(Math.random()*4)]); //d.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            magicHand[i]=d;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(Systems.in);
        Card myCard = new Card();
        System.out.println("Enter a card between 1 and 13:");
        int gValue = input.nextint();
        myCard.setValue(gValue);
        System.out.println("Enter a suit: 1(Hearts),2(Diamonds),3(Spades),4(Clubs)");
        int gSuits = input.nextint();
        myCard.setSuit(Card.SUITS[gSuits-1]);
        //and search magicHand here
        boolean match = true;
        for (Card magicHand1 : magicHand) {
            if (myCard.getValue() == magicHand1.getValue() && myCard.getSuit().equals(magicHand1.getSuit())) {
                match = true;
                break;
            } else {
                match=false;
            }
        }
        //Then report the result here
        if(match){
            System.out.println("Your card is in magic hand, YOU WON!!");
        }else{
            System.out.println("Your card is not in magic hand, YOU LOSE,better luck next time!");
        
    }
        
    }
    
}
