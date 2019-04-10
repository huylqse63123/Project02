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
public class SearchVnDialog extends javax.swing.JDialog {
  DialogListener listener;
  interface DialogListener {
    void search(String lang, String word);
  }

  public SearchVnDialog(DictionaryManager parent, boolean modal) {
    super(parent, modal);
    this.listener = parent;
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    btnsearchVN = new javax.swing.JButton();
    txtVnEn = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Việt-Anh");

    jLabel1.setText("Key word:");

    btnsearchVN.setText("Search");
    btnsearchVN.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnsearchVNActionPerformed(evt);
      }
    });

    txtVnEn.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtVnEnKeyPressed(evt);
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
            .addComponent(btnsearchVN)
            .addContainerGap(141, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtVnEn)
            .addContainerGap())))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(45, 45, 45)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txtVnEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(btnsearchVN)
        .addContainerGap(32, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtVnEnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVnEnKeyPressed
    // TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      btnsearchVNActionPerformed(null);
    }
  }//GEN-LAST:event_txtVnEnKeyPressed

  private void btnsearchVNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchVNActionPerformed
    // TODO add your handling code here:
    String keyword = txtVnEn.getText().trim().toLowerCase();
    listener.search("VI", keyword);
    dispose();
  }//GEN-LAST:event_btnsearchVNActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnsearchVN;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JTextField txtVnEn;
  // End of variables declaration//GEN-END:variables
}

