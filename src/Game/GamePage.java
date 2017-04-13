/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
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
        for(int i = 0; i < humans + 2; i++)
            players.add(new Player());
        gameLoop();
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

        callButton = new javax.swing.JButton();
        card1 = new javax.swing.JLabel();
        card2 = new javax.swing.JLabel();
        card3 = new javax.swing.JLabel();
        card4 = new javax.swing.JLabel();
        card5 = new javax.swing.JLabel();
        deck = new javax.swing.JLabel();
        player2card1 = new javax.swing.JLabel();
        player2card2 = new javax.swing.JLabel();
        placeBetButton = new javax.swing.JButton();
        foldButton1 = new javax.swing.JButton();
        betAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        potAmount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        peekButton = new javax.swing.JButton();
        player1card1 = new javax.swing.JLabel();
        player1card2 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        callButton.setText("Call");
        getContentPane().add(callButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 630, 100, 80));

        card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png"))); // NOI18N
        card1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 70, -1));

        card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png"))); // NOI18N
        card2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 70, 90));

        card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png"))); // NOI18N
        card3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(card3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 70, 90));

        card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png"))); // NOI18N
        card4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(card4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 70, 90));

        card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png"))); // NOI18N
        card5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(card5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 70, 90));

        deck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png"))); // NOI18N
        deck.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(deck, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 70, 90));

        player2card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png"))); // NOI18N
        player2card1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(player2card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 70, 90));

        player2card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png"))); // NOI18N
        player2card2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(player2card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 70, 90));

        placeBetButton.setText("Bet");
        placeBetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeBetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(placeBetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 630, 100, 40));

        foldButton1.setText("Fold");
        getContentPane().add(foldButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 630, 100, 80));

        betAmount.setText("$20");
        getContentPane().add(betAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 680, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Pot:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        potAmount.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        potAmount.setText("$0");
        getContentPane().add(potAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 50, 40));

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

        player1card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png"))); // NOI18N
        player1card1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(player1card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 70, 90));

        player1card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Cards/cardBack_blue2.png"))); // NOI18N
        player1card2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(player1card2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 70, 90));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Backgrounds/poker table.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void placeBetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeBetButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeBetButtonActionPerformed

    private void peekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peekButtonActionPerformed
        // TODO add your handling code here:
        
        //System.out.println(currentPlayer.deck.get(0).cardToString());
        //System.out.println(currentPlayer.deck.get(1).cardToString());
        player1card1.setIcon(new javax.swing.ImageIcon(getClass().getResource(flip(currentPlayer.get(0))))); 
        player1card2.setIcon(new javax.swing.ImageIcon(getClass().getResource(flip(currentPlayer.get(1))))); 
        
    }//GEN-LAST:event_peekButtonActionPerformed
     
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
    
    
    public void gameLoop()
    {
        mainDeck = new Deck(52);
        
        mainDeck.shuffle();
        
        for(Iterator currentPlayer = players.listIterator(); currentPlayer.hasNext();)
        {
            Player temp = ((Player)currentPlayer.next());
            temp.pushCard(mainDeck.popCard());
        }
        for(Iterator currentPlayer = players.listIterator(); currentPlayer.hasNext();)
        {
            Player temp = ((Player)currentPlayer.next());
            temp.pushCard(mainDeck.popCard());
        }
        
        /*for(Iterator currentPlayer = players.listIterator(); currentPlayer.hasNext();)
        {
            Player temp = ((Player)currentPlayer.next());
            temp.printDeck();
            
        }*/
        playerIter = players.iterator();
        currentPlayer = (Player)playerIter.next();
        
        
        
        
        
    }
    // 0 = clubs
    // 1 = diamonds
    // 2 = hearts
    // 3 = spades
    
    
    
    public void placeCard(int x, int y)
    {
        
    }
    
    public String flip(Card card) 
    {
        card.faceUp = !card.faceUp;
         if(card.faceUp)
            return "/Game/Cards/card"+card.cardToString()+".png";
        else
            return "/Game/Cards/cardBack_blue2.png";
    }
    
    public void pause(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    
    
    Deck mainDeck;
    ArrayList<Player> players = new ArrayList<Player>();
    Iterator playerIter;
    Player currentPlayer;
    int playerNumber = 1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField betAmount;
    private javax.swing.JButton callButton;
    private javax.swing.JLabel card1;
    private javax.swing.JLabel card2;
    private javax.swing.JLabel card3;
    private javax.swing.JLabel card4;
    private javax.swing.JLabel card5;
    private javax.swing.JLabel deck;
    private javax.swing.JButton foldButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton peekButton;
    private javax.swing.JButton placeBetButton;
    private javax.swing.JLabel player1card1;
    private javax.swing.JLabel player1card2;
    private javax.swing.JLabel player2card1;
    private javax.swing.JLabel player2card2;
    private javax.swing.JLabel potAmount;
    // End of variables declaration//GEN-END:variables
}
