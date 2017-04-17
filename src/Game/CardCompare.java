/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.Comparator;

/**
 *
 * @author Cam
 */
public class CardCompare implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return o2.getValue() - o1.getValue();
        
    }
}
