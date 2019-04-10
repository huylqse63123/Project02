/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.KeyEvent;

/**
 *
 * @author cwalk
 */
public class SearchEngDialog extends javax.swing.JDialog {
  SearchVnDialog.DialogListener listener;
  
  public SearchEngDialog(DictionaryManager parent, boolean modal) {
    super(parent, modal);
    this.listener = parent;
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    btnsearchENG = new javax.swing.JButton();
    txtENVN = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Anh-Việt");

    jLabel1.setText("Key word:");

    btnsearchENG.setText("Search");
    btnsearchENG.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnsearchENGActionPerformed(evt);
      }
    });

    txtENVN.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtENVNKeyPressed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(27, 27, 27)
        .addComponent(jLabel1)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addComponent(btnsearchENG)
            .addContainerGap(141, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtENVN)
            .addContainerGap())))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(45, 45, 45)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txtENVN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(btnsearchENG)
        .addContainerGap(32, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtENVNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtENVNKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      btnsearchENGActionPerformed(null);
    }
  }//GEN-LAST:event_txtENVNKeyPressed

  private void btnsearchENGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchENGActionPerformed
    String keyword = txtENVN.getText().trim().toLowerCase();
    listener.search("EN", keyword);
    dispose();
  }//GEN-LAST:event_btnsearchENGActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnsearchENG;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JTextField txtENVN;
  // End of variables declaration//GEN-END:variables
}

