/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.EmptyStackException;

/**
 *
 * @author Cam
 */
public class Player extends Deck {
    
    public Player()
    {
        money = 100;
    }
    
    public Player(int startingMoney)
    {
        money = startingMoney;
    }
    
    int money;
    
    public void printHand()
    {
        for(int i = 0; i < deck.size(); i++)
            System.out.println(i+1+ ": \t" + deck.get(i).getValue() + " of " + deck.get(i).getSuit());
    }
    
    
    
}
