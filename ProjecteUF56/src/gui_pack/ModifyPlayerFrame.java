/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui_pack;

import static gui_pack.PlayerFrame.indexPresentat;
import projecteuf56.*;

/**
 *
 * @author sonnymccammond
 */
public class ModifyPlayerFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddPlayerFrame
     */
    public ModifyPlayerFrame() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        introAge = new javax.swing.JLabel();
        introTeam = new javax.swing.JLabel();
        isRetired = new javax.swing.JLabel();
        inputPlayerAge = new javax.swing.JTextField();
        inputPlayerTeam = new javax.swing.JTextField();
        addPlayerButton = new javax.swing.JButton();
        retiredTrue = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        introAge.setText("Introdueix l'edat del jugador:");

        introTeam.setText("En quin equip juga/va jugar?");

        isRetired.setText("Està jubilat?");

        addPlayerButton.setText("Acceptar");
        addPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerButtonActionPerformed(evt);
            }
        });

        retiredTrue.setText("Sí");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(addPlayerButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(introTeam)
                            .addComponent(isRetired)
                            .addComponent(introAge))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPlayerAge, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputPlayerTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(retiredTrue))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(introAge)
                    .addComponent(inputPlayerAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isRetired)
                    .addComponent(retiredTrue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(introTeam)
                    .addComponent(inputPlayerTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addPlayerButton)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayerButtonActionPerformed
        String nom, equip;
        String edat;
        boolean jubilat;
        int any;
        nom = PrimeraTaula.numJug.get(indexPresentat).getNom();
        equip = inputPlayerTeam.getText();
        edat = inputPlayerAge.getText();

        jubilat = retiredTrue.isSelected();

        try {
            any = Integer.parseInt(edat);
        } catch (NumberFormatException nfe) {
            any = 0;
        }
        PrimeraTaula.numJug.remove(indexPresentat);
        Jugadors j = new Jugadors(nom, any, jubilat, equip);
        PrimeraTaula.numJug.add(indexPresentat, j);
        PrimeraTaula.EditarRegistre(nom, any, jubilat, equip);
        ModifyPlayerFrame.super.dispose();

    }//GEN-LAST:event_addPlayerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyPlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyPlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyPlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyPlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyPlayerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPlayerButton;
    private javax.swing.JTextField inputPlayerAge;
    private javax.swing.JTextField inputPlayerTeam;
    private javax.swing.JLabel introAge;
    private javax.swing.JLabel introTeam;
    private javax.swing.JLabel isRetired;
    private javax.swing.JRadioButton retiredTrue;
    // End of variables declaration//GEN-END:variables
}
