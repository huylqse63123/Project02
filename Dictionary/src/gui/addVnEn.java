/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author cwalk
 */
public class addVnEn extends javax.swing.JDialog {
  
  DictionaryManager parent;
  public addVnEn(DictionaryManager parent, boolean modal) {
    super(parent, modal);
    this.parent = parent;
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    btnsearchENG = new javax.swing.JButton();
    txtVn = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    txtEng = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Thêm nghĩa (VA)");

    jLabel1.setText("Vietnamese:");

    btnsearchENG.setText("Add");
    btnsearchENG.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnsearchENGActionPerformed(evt);
      }
    });

    jLabel2.setText("English:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(116, 116, 116)
        .addComponent(btnsearchENG, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(100, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtEng)
          .addComponent(txtVn, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(45, 45, 45)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txtVn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnsearchENG)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnsearchENGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchENGActionPerformed
    // TODO add your handling code here:
    String vn = txtVn.getText().trim().toLowerCase();
    String en = txtEng.getText().trim().toLowerCase();
    parent.addVn(vn, en);
    dispose();
  }//GEN-LAST:event_btnsearchENGActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnsearchENG;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JTextField txtEng;
  private javax.swing.JTextField txtVn;
  // End of variables declaration//GEN-END:variables
}

