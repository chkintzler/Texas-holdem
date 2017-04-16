/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;


import java.awt.Color;
import java.util.*;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author Cam
 */
public class GamePage extends javax.swing.JFrame {

    /**
     * Creates new form GamePage
     */
    public GamePage(int ai, int humans) {
        initComponents();
        for(int i = 0; i < humans + ai + 1; i++)
        {
            players.add(new Player(100,i));
        }
        gameSetup();
    }
    public GamePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InstructionButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        callButton = new javax.swing.JButton();
        checkButton = new javax.swing.JButton();
        deck = new javax.swing.JLabel();
        placeBetButton = new javax.swing.JButton();
        foldButton1 = new javax.swing.JButton();
        betAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        potAmount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        peekButton = new javax.swing.JButton();
        dolllarSign = new javax.swing.JTextField();
        currentPlayerMoney = new javax.swing.JTextField();
        player4Indicator = new javax.swing.JLabel();
        player2Indicator = new javax.swing.JLabel();
        player1Indicator = new javax.swing.JLabel();
        player3Indicator = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InstructionButton.setText("Instructions");
        InstructionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstructionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(InstructionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Player Money:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 540, -1, -1));

        jToggleButton1.setText("Return to Main Menu");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, -1));

        callButton.setText("Call");
        callButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callButtonActionPerformed(evt);
            }
        });
        getContentPane().add(callButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 630, 100, 80));

        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });
        getContentPane().add(checkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 630, 100, 80));

        deck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png"))); // NOI18N
        deck.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(deck, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, 70, 90));

        placeBetButton.setText("Bet");
        placeBetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeBetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(placeBetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 630, 100, 40));

        foldButton1.setText("Fold");
        foldButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foldButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(foldButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 630, 100, 80));

        betAmount.setText("0");
        getContentPane().add(betAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 680, 80, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Pot: $");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        potAmount.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        potAmount.setText("0");
        getContentPane().add(potAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 150, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Backgrounds/plainWhite.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 40));

        peekButton.setText("Peek cards");
        peekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peekButtonActionPerformed(evt);
            }
        });
        getContentPane().add(peekButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 629, 160, 70));

        dolllarSign.setEditable(false);
        dolllarSign.setText("$");
        getContentPane().add(dolllarSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 680, 20, 30));

        currentPlayerMoney.setEditable(false);
        currentPlayerMoney.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        currentPlayerMoney.setText("$");
        currentPlayerMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentPlayerMoneyActionPerformed(evt);
            }
        });
        getContentPane().add(currentPlayerMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 560, 160, 60));
        getContentPane().add(player4Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 290, 110, 110));
        getContentPane().add(player2Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, 110));
        getContentPane().add(player1Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, 110, 110));
        getContentPane().add(player3Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 110, 110));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Backgrounds/poker table.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void placeBetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeBetButtonActionPerformed
        
        
        if(Integer.parseInt(betAmount.getText()) <= currentPlayer.money && Integer.parseInt(betAmount.getText()) > 0)
        {
            pot +=Integer.parseInt(betAmount.getText());
            currentPlayer.money -= Integer.parseInt(betAmount.getText());
            lastBet = Integer.parseInt(betAmount.getText());
            currentPlayerMoney.setForeground(Color.black);
            nextPlayer();
            
        }
        else
        {
            currentPlayerMoney.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_placeBetButtonActionPerformed

    private void peekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peekButtonActionPerformed
        // TODO add your handling code here:
        
        currentPlayer.getCard(0).flip();
        currentPlayer.getCard(1).flip();
        
    }//GEN-LAST:event_peekButtonActionPerformed

    private void currentPlayerMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentPlayerMoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentPlayerMoneyActionPerformed

    private void callButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callButtonActionPerformed
        // TODO add your handling code here:
        
        if(lastBet <= currentPlayer.money && lastBet != -1)
        {
            pot +=lastBet;
            currentPlayer.money -= lastBet;
            currentPlayerMoney.setForeground(Color.black);
            nextPlayer();
            
        }
        else
        {
            currentPlayerMoney.setForeground(Color.red);
        }
        
    }//GEN-LAST:event_callButtonActionPerformed

    private void InstructionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstructionButtonActionPerformed
        // TODO add your handling code here:
        
        InstructionsPage instructions = new InstructionsPage();
        instructions.setVisible(true);
        //dispose();
    }//GEN-LAST:event_InstructionButtonActionPerformed

    private void foldButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foldButton1ActionPerformed
        // TODO add your handling code here:
                
        currentPlayer.getCard(0).flip();
        currentPlayer.getCard(1).flip();
    }//GEN-LAST:event_foldButton1ActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here
        if (lastBet==0|| lastBet ==-1){
            lastBet=0;
            nextPlayer();
        }
        
    }//GEN-LAST:event_checkButtonActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        StartPage s = new StartPage();
        s.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed
     
    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePage().setVisible(true);
                
                
            }
        });
        
        
    }
    
    
    public void gameSetup()
    {
        mainDeck = new Deck(52);
        //onTable = new Deck(0);
        mainDeck.shuffle();
        
        //puts 5 cards face down on the table.
        for(int i = 0; i < 5; i++)
            middleCards.pushCard(mainDeck.popCard(), getContentPane(), 410 + i * 90 , 280, false);
            
        
        for(Iterator currentPlayer = players.listIterator(); currentPlayer.hasNext();)
        {
            Player temp = ((Player)currentPlayer.next());
            switch(temp.number)
            {
                case 0: temp.pushCard(mainDeck.popCard(),getContentPane(),550,510,false);
                        temp.pushCard(mainDeck.popCard(),getContentPane(),640,510,false);
                        break;
                case 2: temp.pushCard(mainDeck.popCard(),getContentPane(),550,110,false);
                        temp.pushCard(mainDeck.popCard(),getContentPane(),640,110,false);
                        break;
                case 1: temp.pushCard(mainDeck.popCard(),getContentPane(),160,310,false);
                        temp.pushCard(mainDeck.popCard(),getContentPane(),240,310,false);
                        break;
                case 3: temp.pushCard(mainDeck.popCard(),getContentPane(),960,300,false);
                        temp.pushCard(mainDeck.popCard(),getContentPane(),1040,300,false);
                        break;
                default: break;
            }
            
        }
      
        playerIter = players.listIterator();
        nextPlayer();
        
        
    }
    // 0 = clubs
    // 1 = diamonds
    // 2 = hearts
    // 3 = spades
    
    
    public void nextPlayer()
    {

        potAmount.setText(Integer.toString(pot));
        
        betAmount.setText("0");
        if(!playerIter.hasNext())
        {
            turnCount++;
            while(playerIter.hasPrevious())
                playerIter.previous();
        }
        currentPlayer = (Player)playerIter.next();
        
        currentPlayerMoney.setText("$ " +Integer.toString(currentPlayer.money) + ".00");
        
        
        
        switch(currentPlayer.number){

            case 0: player1Indicator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Backgrounds/indicator.png")));
                    player3Indicator.setIcon(null);
                    player2Indicator.setIcon(null);
                    player4Indicator.setIcon(null);
                    break;
            case 2: player3Indicator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Backgrounds/indicator.png")));
                    player1Indicator.setIcon(null);
                    player2Indicator.setIcon(null);
                    player4Indicator.setIcon(null);
                    break;
            case 1: player2Indicator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Backgrounds/indicator.png")));
                    player1Indicator.setIcon(null);
                    player3Indicator.setIcon(null);
                    player4Indicator.setIcon(null);
                    break;
            case 3: player4Indicator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Backgrounds/indicator.png")));
                    player1Indicator.setIcon(null);
                    player3Indicator.setIcon(null);
                    player2Indicator.setIcon(null);
                    break;
            default: break;
        }
        
        if(currentPlayer.number == 0)
            switch(turnCount)
            {
                case 1: mainDeck.popCard().moveCard(this,410,280,true);
                        mainDeck.popCard().moveCard(this,500,280,true);
                        mainDeck.popCard().moveCard(this,590,280,true);
                        break;
                case 2: mainDeck.popCard().moveCard(this,680,280,true);
                        break;
                case 3: mainDeck.popCard().moveCard(this,770,280,true);
                        break;
                case 4: endShowAll();
                        break;
                default: break;
            }
        
        
        
    }
    
    
   
    
    public synchronized void pause(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    
    
    public void endShowAll(){

               for(Iterator currentPlayer = players.listIterator(); currentPlayer.hasNext();)
        {
            Player temp = ((Player)currentPlayer.next());
            switch(temp.number)
            {
                case 0: temp.getCard(0).flip();
                        temp.getCard(1).flip();
                        break;
                case 1: temp.getCard(0).flip();
                        temp.getCard(1).flip();
                        break;
                case 2: temp.getCard(0).flip();
                        temp.getCard(1).flip();
                        break;
                case 3: temp.getCard(0).flip();
                        temp.getCard(1).flip();
                        break;
                default: break;
            }
            
        }
    }
    Deck mainDeck = new Deck();
    ArrayList<Player> players = new ArrayList<Player>();
    Deck middleCards = new Deck();
    ListIterator playerIter;
    Player currentPlayer;
    int playerNumber = 1;
    int pot = 0;
    int lastBet = -1;
    int turnCount = 0;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton InstructionButton;
    private javax.swing.JTextField betAmount;
    private javax.swing.JButton callButton;
    private javax.swing.JButton checkButton;
    private javax.swing.JTextField currentPlayerMoney;
    private javax.swing.JLabel deck;
    private javax.swing.JTextField dolllarSign;
    private javax.swing.JButton foldButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton peekButton;
    private javax.swing.JButton placeBetButton;
    private javax.swing.JLabel player1Indicator;
    private javax.swing.JLabel player2Indicator;
    private javax.swing.JLabel player3Indicator;
    private javax.swing.JLabel player4Indicator;
    private javax.swing.JLabel potAmount;
    // End of variables declaration//GEN-END:variables
}
