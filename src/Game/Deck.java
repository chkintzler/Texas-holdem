/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
import java.util.*;


/**
 *
 * @author ck119
 */
public class Deck {
    
    public Deck(int size)
    {
        for(int i = 0; i < size; i++)
        {
            deck.add(new Card(i / 13,(i % 14) + 1));                 
        }                       
    }
    
    public Deck()
    {
        
    }
    ArrayList<Card> deck = new ArrayList<Card>();
    
    
    public void printDeck()
    {
        for(int i = 0; i < deck.size(); i++)
            System.out.println(i+1+ ": \t" + deck.get(i).getValue() + " of " + deck.get(i).getSuit());
    }
    
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
    
    public Card get(int index)
    {
        return deck.get(index);
    }
    
    public Card popCard()
    {
        if(deck.size() > 0)
        {
            Card temp = new Card(deck.get(0).getSuit(),deck.get(0).getValue());
            deck.remove(0);
            return temp;
        }
        
        throw new EmptyStackException();
    }
    
    
    
    public void pushCard(Card c)
    {
        deck.add(c);
    }
    
    public void topPushCard(Card c)
    {
        deck.add(0, c);
    }
    
}
