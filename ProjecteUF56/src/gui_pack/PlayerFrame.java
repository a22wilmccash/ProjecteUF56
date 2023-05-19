/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui_pack;

import java.util.ArrayList;
import projecteuf56.*;
import static projecteuf56.PrimeraTaula.numJug;

public class PlayerFrame extends javax.swing.JFrame {

    static int indexPresentat = 0;

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
        introName = new javax.swing.JLabel();
        introAge = new javax.swing.JLabel();
        introTeam = new javax.swing.JLabel();
        isRetired = new javax.swing.JLabel();
        playerName = new javax.swing.JLabel();
        playerAge = new javax.swing.JLabel();
        playerTeams = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        introName.setText("Nom del jugador:");

        introAge.setText("Edat del jugador:");

        introTeam.setText("Equips integrats:");

        isRetired.setText("Està jubilat?");

        playerName.setText("Nom");

        playerAge.setText("Edat");

        playerTeams.setText("Equips");

        jLabel1.setText("jubilat");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(introName)
                            .addComponent(introTeam)
                            .addComponent(isRetired)
                            .addComponent(introAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerName)
                            .addComponent(playerAge)
                            .addComponent(playerTeams)
                            .addComponent(jLabel1))
                        .addGap(155, 155, 155))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextPlayer)
                    .addComponent(prevPlayer))
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
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(introTeam)
                    .addComponent(playerTeams))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moreDetails)
                    .addComponent(removePlayer)
                    .addComponent(updatePlayer))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarJugador() {
        
        ArrayList<Jugadors> numJug = PrimeraTaula.getNumJug();
        String nomJug = numJug.get(indexPresentat).getNom();
        int edat = numJug.get(indexPresentat).getEdat();
        boolean retired;
        
        String equips = numJug.get(indexPresentat).getEquip();

        playerName.setText(nomJug);
        playerAge.setText(edat + "");
        playerTeams.setText(equips);

    }

    private void removePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlayerActionPerformed
        PrimeraTaula.EliminarRegistre(PrimeraTaula.numJug.get(indexPresentat).getNom());

    }//GEN-LAST:event_removePlayerActionPerformed

    private void moreDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreDetailsActionPerformed
        MorePlayerFrame mpf = new MorePlayerFrame();
        String nom = numJug.get(indexPresentat).getNom();
        SegonaTaula.llistarDetalls(nom);
        mpf.mostrarDetalls();
        mpf.setVisible(true);
    }//GEN-LAST:event_moreDetailsActionPerformed

    private void updatePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePlayerActionPerformed
        ModifyPlayerFrame mpf = new ModifyPlayerFrame();
        mpf.setVisible(true);
    }//GEN-LAST:event_updatePlayerActionPerformed

    private void prevPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevPlayerActionPerformed
        indexPresentat--;
        mostrarJugador();
    }//GEN-LAST:event_prevPlayerActionPerformed

    private void nextPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPlayerActionPerformed
        indexPresentat++;
        mostrarJugador();
    }//GEN-LAST:event_nextPlayerActionPerformed

    /**
     * @param args the command l ine arguments
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton moreDetails;
    private javax.swing.JButton nextPlayer;
    private javax.swing.ButtonGroup opRetired;
    private javax.swing.JLabel playerAge;
    private javax.swing.JLabel playerName;
    private javax.swing.JLabel playerTeams;
    private javax.swing.JButton prevPlayer;
    private javax.swing.JButton removePlayer;
    private javax.swing.JButton updatePlayer;
    // End of variables declaration//GEN-END:variables
}
