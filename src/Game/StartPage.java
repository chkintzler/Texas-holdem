package Game;

import Game.InstructionsPage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kory
 */
public class StartPage extends javax.swing.JFrame {

    /**
     * Creates new form StartPage
     */
    public StartPage() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        startButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        humanPlayers = new javax.swing.JComboBox<String>();
        aiPlayers = new javax.swing.JComboBox<String>();
        instructButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AI Difficulty");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, -1, -1));
        jLayeredPane1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, -1, -1));

        startButton.setText("Start Game");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 230, 100));

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Texas Hold'em");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));

        humanPlayers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single Player", "2 Player", "3 Player", "4 Player" }));
        jLayeredPane1.add(humanPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 150, 30));

        aiPlayers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No AI", "1 AI", "2 AI", "3 AI" }));
        aiPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aiPlayersActionPerformed(evt);
            }
        });
        jLayeredPane1.add(aiPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 150, 30));

        instructButton.setText("Instructions");
        instructButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(instructButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/Backgrounds/gaming_poker_cards.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        GamePage game = new GamePage(aiPlayers.getSelectedIndex(), humanPlayers.getSelectedIndex());
        game.setVisible(true);
        dispose();
    }//GEN-LAST:event_startButtonActionPerformed

    private void instructButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructButtonActionPerformed
        // TODO add your handling code here:
        InstructionsPage instructions = new InstructionsPage();
        instructions.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_instructButtonActionPerformed

    private void aiPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aiPlayersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aiPlayersActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aiPlayers;
    private javax.swing.JComboBox<String> humanPlayers;
    private javax.swing.JButton instructButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
