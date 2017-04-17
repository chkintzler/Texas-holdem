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
        
        
        Deck temp3 = duplicateDeck(temp);
        
        
        /////////////////////////////////////////////////////////
        if(temp2.deck.size() >= 5)
        {
            for(int i = 0; i < 8-temp2.deck.size();i++)
            {
                if(temp.get(0+i).getValue() == 13 && temp.get(1+i).getValue() == 12 && temp.get(2+i).getValue() == 11 && temp.get(3+i).getValue() == 10 && temp.get(temp.deck.size()-1).getValue() == 1)
                {
                    if(temp.get(0+i).getSuit() == temp.get(1+i).getSuit() && temp.get(1+i).getSuit() == temp.get(2+i).getSuit() && temp.get(2+i).getSuit() == temp.get(3+i).getSuit() && temp.get(2+i).getSuit() == temp.get(temp.deck.size()-1).getSuit())
                    {
                        return 1;
                    }
                }
                                    
            }
        }
        
        
        /////////////////////////////////////////////////////////
        
        if(temp2.deck.size() >= 5)
        {
            for(int i = 0; i < 8-temp2.deck.size();i++)
            {
                
                if(temp2.get(0+i).getValue() == temp2.get(1+i).getValue()+1 && temp2.get(0+i).getSuit() == temp2.get(1+i).getSuit())
                {
                    if(temp2.get(1+i).getValue() == temp2.get(2+i).getValue()+1)
                    {
                        if(temp2.get(2+i).getValue() == temp2.get(3+i).getValue()+1)
                        {
                            if(temp2.get(3+i).getValue() == temp2.get(4+i).getValue()+1)
                            {
                                return 2;
                            }
                        }
                    }
                }
                    
            }
        }
        
        
        
        
        
        
        
        
        /////////////////////////////////////////////////////////
        
         for(int i=0; i<4; i++){
            if(temp.get(i).getValue()==temp.get(i+1).getValue() && temp.get(i).getValue()==temp.get(i+2).getValue() && temp.get(i).getValue()==temp.get(i+3).getValue())
                return 3;
        }
        
        
        ///////////////////////////////////////////////////
        
        
        
        for(int i=0; i<4; i++){
            if(temp.get(i).getValue()==temp.get(i+1).getValue() && temp.get(i).getValue()==temp.get(i+2).getValue())
            {
                temp3.removeCard(i);
                temp3.removeCard(i+1);
                temp3.removeCard(i+2);
                
                int numPairs = 0;
                for (int j = 0; j < 6; j++) {
                    if (temp.get(j).getValue() == temp.get(j + 1).getValue()) {
                        numPairs++;
                    }
                    if (numPairs == 2) {
                        return 4;
                    }
                }
            }
        }
        
        
        
        
        
        
        /////////////////////////////////////////////////////////////flush
        int spadeCount = 0;
        int heartCount = 0;
        int diamondCount = 0;
        int clubCount = 0;
        for(int i=0; i<=6; i++)
        {
            if(temp.get(i).getSuit()== 0)
                clubCount++;
            if(temp.get(i).getSuit()== 1)
                diamondCount++;
            if(temp.get(i).getSuit()== 2)
                heartCount++;
            if(temp.get(i).getSuit()== 3)
                spadeCount++;
        } if(clubCount >=5 || diamondCount >=5 || heartCount >=5 || spadeCount >=5)
            return 5;
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
    
    
    
    public Deck duplicateDeck(Deck input)
    {
        Deck temp = new Deck();
        for(int i = 0; i < 7; i++)
            temp.pushCard(input.get(i));
        return temp;
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
                    if(temp.get(i).unique || temp.get(j).unique)
                    {
                        uniqueDeck.pushCard(temp.get(i));
                        temp.get(i).unique = true;
                        temp.get(j).unique = true;
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
