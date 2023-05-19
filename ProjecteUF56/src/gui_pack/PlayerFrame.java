/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui_pack;

import java.util.ArrayList;
import projecteuf56.*;

public class PlayerFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public PlayerFrame() {
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

        opRetired = new javax.swing.ButtonGroup();
        moreDetails = new javax.swing.JButton();
        removePlayer = new javax.swing.JButton();
        updatePlayer = new javax.swing.JButton();
        nextPlayer = new javax.swing.JButton();
        prevPlayer = new javax.swing.JButton();
        retiredTrue = new javax.swing.JCheckBox();
        retiredFalse = new javax.swing.JCheckBox();
        introName = new javax.swing.JLabel();
        introAge = new javax.swing.JLabel();
        introTeam = new javax.swing.JLabel();
        isRetired = new javax.swing.JLabel();
        playerName = new javax.swing.JLabel();
        playerAge = new javax.swing.JLabel();
        playerTeams = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        moreDetails.setText("Més Detalls");
        moreDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreDetailsActionPerformed(evt);
            }
        });

        removePlayer.setText("Borrar Jugador");
        removePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlayerActionPerformed(evt);
            }
        });

        updatePlayer.setText("Modificar Jugador");
        updatePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePlayerActionPerformed(evt);
            }
        });

        nextPlayer.setText("Següent>");
        nextPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPlayerActionPerformed(evt);
            }
        });

        prevPlayer.setText("<Prev");
        prevPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevPlayerActionPerformed(evt);
            }
        });

        opRetired.add(retiredTrue);
        retiredTrue.setText("Sí");

        opRetired.add(retiredFalse);
        retiredFalse.setText("No");

        introName.setText("Nom del jugador:");

        introAge.setText("Edat del jugador:");

        introTeam.setText("Equips integrats:");

        isRetired.setText("Està jubilat?");

        playerName.setText("Nom");

        playerAge.setText("Edat");

        playerTeams.setText("Equips");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(moreDetails)
                .addGap(12, 12, 12)
                .addComponent(removePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updatePlayer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prevPlayer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextPlayer)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(introName)
                                    .addComponent(introTeam)
                                    .addComponent(isRetired)
                                    .addComponent(introAge))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(retiredTrue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(retiredFalse))
                                    .addComponent(playerName)
                                    .addComponent(playerAge)
                                    .addComponent(playerTeams)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(58, 58, 58)))
                        .addGap(112, 112, 112))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextPlayer)
                    .addComponent(prevPlayer)
                    .addComponent(jButton1))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(introName)
                    .addComponent(playerName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(introAge)
                    .addComponent(playerAge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isRetired)
                    .addComponent(retiredTrue)
                    .addComponent(retiredFalse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(introTeam)
                    .addComponent(playerTeams))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moreDetails)
                    .addComponent(removePlayer)
                    .addComponent(updatePlayer))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlayerActionPerformed
        int i = 0;
        PrimeraTaula.EliminarRegistre(PrimeraTaula.numJug.get(i).getNom());

    }//GEN-LAST:event_removePlayerActionPerformed

    private void moreDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreDetailsActionPerformed
        MorePlayerFrame mpf = new MorePlayerFrame();
        mpf.setVisible(true);
    }//GEN-LAST:event_moreDetailsActionPerformed

    private void updatePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePlayerActionPerformed
        AddPlayerFrame apf = new AddPlayerFrame();
        apf.setVisible(true);
    }//GEN-LAST:event_updatePlayerActionPerformed

    private void prevPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevPlayerActionPerformed

    }//GEN-LAST:event_prevPlayerActionPerformed

    private void nextPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPlayerActionPerformed

    }//GEN-LAST:event_nextPlayerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PrimeraTaula.llistarRegistres();
        ArrayList<Jugador> numJug = PrimeraTaula.getNumJug();
        String nomJug = numJug.get(0).getNom();
        playerName.setText(nomJug);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel introAge;
    private javax.swing.JLabel introName;
    private javax.swing.JLabel introTeam;
    private javax.swing.JLabel isRetired;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton moreDetails;
    private javax.swing.JButton nextPlayer;
    private javax.swing.ButtonGroup opRetired;
    private javax.swing.JLabel playerAge;
    private javax.swing.JLabel playerName;
    private javax.swing.JLabel playerTeams;
    private javax.swing.JButton prevPlayer;
    private javax.swing.JButton removePlayer;
    private javax.swing.JCheckBox retiredFalse;
    private javax.swing.JCheckBox retiredTrue;
    private javax.swing.JButton updatePlayer;
    // End of variables declaration//GEN-END:variables
}
