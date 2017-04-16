/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Cam
 */
public class Player extends Deck  {
    
    public Player()
    {
        money = 100;
        folded = false;
    }
    
    public Player(int startingMoney, int number)
    {
        money = startingMoney;
        folded = false;
        this.number = number;
    }
    
    int money;
    int number;
    boolean folded;
    boolean isAI;
    String name;
    
    public boolean isAI (){
        return false;
    }
    
    public void printHand()
    {
        for(int i = 0; i < deck.size(); i++)
            System.out.println(i+1+ ": \t" + deck.get(i).getValue() + " of " + deck.get(i).getSuit());
    }
    
   

    public Card getCard(int index)
    {
        return deck.get(index);
    }
    
    public int handRank(Deck deck)
    {
        
        Deck temp = new Deck();
        temp.pushCard(this.deck.get(0));
        temp.pushCard(this.deck.get(1));
        
        for(int i = 0; i < 5; i++)
            temp.pushCard(deck.get(i));
        
        
        Collections.sort(temp.deck, new CardCompare());
        
        
        
        boolean sameSuit = temp.get(0).getSuit() == temp.get(1).getSuit() && temp.get(1).getSuit() == temp.get(2).getSuit() && temp.get(2).getSuit() == temp.get(3).getSuit() && temp.get(3).getSuit() == temp.get(4).getSuit();
        
           
        
        /////////////////////////////////////////////////////// royal flush
        if(temp.get(0).getValue() == 13 && temp.get(1).getValue() == 12 && temp.get(2).getValue() == 11 && temp.get(3).getValue() == 10 && temp.get(4).getValue() == 1 && sameSuit)
            return 1;
         ///////////////////////////////////////////////////////   staright flush
        int lastValue;
        for(int j = 0; j < 3; j++)
        {
            lastValue = temp.get(j).getValue();
        
            for(int i = j+1; i < 5; i++)
            {
                if(temp.get(i).getValue() != lastValue-1)
                    break;
                if(i == 4 && sameSuit)
                    return 2;
            }
        }
        ///////////////////////////////////////////////////////four of a kind
        for(int j = 0; j < 4; j++)
        {
            lastValue = temp.get(j).getSuit();
        
            for(int i = j+1; i < 4; i++)
            {
                if(temp.get(i).getSuit() != lastValue)
                    break;
                if(i == 4)
                    return 3;
            }
        }
        ///////////////////////////////////////////////////////
       for(int j = 0; j < 5; j++)
        {
            lastValue = temp.get(j).getSuit();
        
            for(int i = j+1; i < 3; i++)
            {
                if(temp.get(i).getSuit() != lastValue)
                    break;
                if(i == 4)
                    return 3;
            }
        }
        ////////////////////////////////////////////////////////pair
              for(int j = 0; j < 6; j++){
                  
            lastValue = temp.get(j).getValue();
        
            for(int i = j+1; i < 2; i++)
            {
                if(temp.get(i).getValue() != lastValue)
                    break;
                if(i == 2)
                    return 883;
            }
        }
            
        
        return 0;
    }
   
    
    
}
