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
        
        Deck temp2 = makeUnqiue(temp);
        
        temp2.printDeck();
        System.out.println("");
        temp.printDeck();
        
        
        
        /////////////////////////////////////////////////////////////straight
        if(temp2.deck.size() >= 5)
        {
            for(int i = 0; i < 8-temp2.deck.size();i++)
            {
                
                if(temp2.get(0+i).getValue() == temp2.get(1+i).getValue()+1)
                {
                    if(temp2.get(1+i).getValue() == temp2.get(2+i).getValue()+1)
                    {
                        if(temp2.get(2+i).getValue() == temp2.get(3+i).getValue()+1)
                        {
                            if(temp2.get(3+i).getValue() == temp2.get(4+i).getValue()+1)
                            {
                                return 6;
                            }
                        }
                    }
                }
                    
            }
        }
 
              ///////////////////////////////////////////////////////three of a kind
        for(int i=0; i<4; i++){
            if(temp.get(i).getValue()==temp.get(i+1).getValue() && temp.get(i).getValue()==temp.get(i+2).getValue())
                return 7;
        }
       ///////////////////////////////////////////////////////two pair
        int numPairs =0;
        for(int i=0; i<6; i++){
            if(temp.get(i).getValue()==temp.get(i+1).getValue()){
                numPairs++;
            }
            if (numPairs==2)
                return 8;
        }
        ////////////////////////////////////////////////////////pair
        for(int i=0; i<6; i++){
            if(temp.get(i).getValue()==temp.get(i+1).getValue())
                return 9;
        }
            ////////////////////////////////////////////////////////
              return 10 ;//temp.get(0).getValue();
        
        //return 0;
    }
    
    
    
   public Deck makeUnqiue(Deck temp)
    {
        boolean unique;

        Deck uniqueDeck = new Deck();

        for(int i = 0; i < 7; i++)
        {
            unique = true;
            for(int j = 0; j < 7; j++)
            {
                if(temp.get(i) != temp.get(j) && temp.get(i).getValue() == temp.get(j).getValue())
                {
                    unique = false;
                    if(!temp.get(i).faceUp || !temp.get(j).faceUp)
                    {
                        uniqueDeck.pushCard(temp.get(i));
                        temp.get(i).faceUp = true;
                        temp.get(j).faceUp = true;
                    }
                    break;
                }
            }

            if(unique)
                uniqueDeck.pushCard(temp.get(i));




        }


        return uniqueDeck;
    }
    
    
}
