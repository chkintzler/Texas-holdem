/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import javax.swing.Icon;
import javax.swing.JLabel;

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
    
    public Card(int newSuit, int newFaceValue, int x, int y, boolean faceUp)
    {
        faceValue = newFaceValue;
        suit = newSuit;
        
        //card = new javax.swing.JLabel();
        
        //player2card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png"))); // NOI18N
        //player2card2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        //getContentPane().add(player2card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 70, 90));
       
    }
    
    private int faceValue;
    private int suit;
    boolean faceUp = false;
    
   
    
    
    public int getValue()
    {
        
        return faceValue;
    }
    
    
    
    public String cardToString()
    {
        return (((suit) == 0) ? ("Clubs"):(((suit) == 1) ? ("Diamonds"):(((suit) == 2) ? ("Hearts"):("Spades")))) + 
               (((faceValue) <= 10 && faceValue != 1) ? (Integer.toString(faceValue)):(((faceValue) == 11) ? ("J"):(((faceValue) == 12) ? ("Q"):(((faceValue) == 1) ? ("K"):("A")))));
    }
    
    public int getSuit()
    {
        return suit;
    }
    
    
    
    
    
    
    
}
