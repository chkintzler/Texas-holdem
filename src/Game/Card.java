/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Game;

import javax.swing.Icon;
import javax.swing.JLabel;
import java.awt.Container;

/**
 *
 * @author ck119
 */
public class Card extends javax.swing.JFrame{
    
    public Card(int newSuit, int newFaceValue)
    {
        faceValue = newFaceValue;
        suit = newSuit;
    }
    
    public Card(int newSuit, int newFaceValue, Container game, int x, int y)
    {
        faceValue = newFaceValue;
        suit = newSuit;
        
       
        displayCard = new javax.swing.JLabel(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/card" + cardToString() + ".png")));
        
        game.add(displayCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, 70, 90), getComponentCount());
        
        
        
    }
    
    
    private javax.swing.JLabel displayCard;
    private int faceValue;
    private int suit;
    boolean faceUp = false;
    
   
    public void moveCard(Container game, int x, int y, boolean faceUp)
    {
        this.faceUp = faceUp;
        if(faceUp)
            displayCard = new javax.swing.JLabel(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/card" + cardToString() + ".png")));
        else
            displayCard = new javax.swing.JLabel(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png")));
        game.add(displayCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, 70, 90), getComponentCount());
       
    }
    
    public void moveCard(int x, int y)
    {
        displayCard.setLocation(x, y);
    }
    
    public int getValue()
    {
        
        return faceValue;
    }
    
    
    public void flip() 
    {
        
        faceUp = !faceUp;
         if(faceUp)
            displayCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/card" + cardToString() + ".png")));
        else
            displayCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png")));
         
         
         
    }
    
    
    
    public String cardToString()
    {
        String temp = "";
        
        switch(suit)
        {
            case 0: temp = "Clubs";
                    break;
            case 1: temp = "Diamonds";
                    break;
            case 2:
                    temp = "Hearts";
                    break;
            case 3:
                    temp = "Spades";
                    break;                    
        }
        if(faceValue <= 10 && faceValue != 1)
            temp = temp+Integer.toString(faceValue);
        else
            switch(faceValue)
            {
                case 11: temp =temp+"J";
                        break;
                case 12:
                    temp = temp+"Q";
                    break;
                case 13:
                    temp = temp+"K";
                    break;
            }
            
        
        
        return temp;
    }
    
    public int getSuit()
    {
        return suit;
    }
    
    
   
    
    
    
}
