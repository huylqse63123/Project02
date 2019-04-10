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
public class addEnVn extends javax.swing.JDialog {
  
  DictionaryManager parent;
  public addEnVn(DictionaryManager parent, boolean modal) {
    super(parent, modal);
    this.parent = parent;
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    btnsearchEng = new javax.swing.JButton();
    txtEng = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    txtVn = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Thêm nghĩa(AV)");

    jLabel1.setText("English:");

    btnsearchEng.setText("Add");
    btnsearchEng.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnsearchEngActionPerformed(evt);
      }
    });

    jLabel2.setText("Vietnamese");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addComponent(jLabel1))
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel2)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtVn)
          .addComponent(txtEng, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnsearchEng, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(45, 45, 45)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txtEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtVn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnsearchEng)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnsearchEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchEngActionPerformed
    // TODO add your handling code here:
    String en = txtEng.getText().trim().toLowerCase();
    String vn = txtVn.getText().trim().toLowerCase();
    parent.addEng(en, vn);
    dispose();
  }//GEN-LAST:event_btnsearchEngActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnsearchEng;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JTextField txtEng;
  private javax.swing.JTextField txtVn;
  // End of variables declaration//GEN-END:variables
}

