
package gui;

import model.DicLibrary;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cwalk
 */
public final class DictionaryManager extends javax.swing.JFrame implements SearchVnDialog.DialogListener {
  DicLibrary dic = new DicLibrary();
  public DictionaryManager() throws IOException {
    initComponents();
    dic.loadFile();
  }
  
  @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      btnVnEn = new javax.swing.JButton();
      btnEnVn = new javax.swing.JButton();
      btnAddVNEN = new javax.swing.JButton();
      btnAddENVN = new javax.swing.JButton();
      btnSaveFile = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      txtResult = new javax.swing.JTextArea();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Dictionary Manager");
      setResizable(false);
      getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      btnVnEn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
      btnVnEn.setText("EN-VN");
      btnVnEn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnVnEnActionPerformed(evt);
         }
      });

      btnEnVn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
      btnEnVn.setText("VN-EN");
      btnEnVn.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEnVnActionPerformed(evt);
         }
      });

      btnAddVNEN.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
      btnAddVNEN.setText("Add VN-EN");
      btnAddVNEN.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAddVNENActionPerformed(evt);
         }
      });

      btnAddENVN.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
      btnAddENVN.setText("Add EN-VN");
      btnAddENVN.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAddENVNActionPerformed(evt);
         }
      });

      btnSaveFile.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
      btnSaveFile.setText("Save to File");
      btnSaveFile.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSaveFileActionPerformed(evt);
         }
      });

      jLabel1.setFont(new java.awt.Font("VnGalleria2", 0, 14)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 51, 51));
      jLabel1.setText("DICTIONARY APPLICATION");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(btnEnVn)
               .addComponent(btnVnEn))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btnAddENVN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnAddVNEN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE))
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGap(62, 62, 62)
                  .addComponent(btnSaveFile, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jLabel1)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnVnEn)
               .addComponent(btnAddENVN))
            .addGap(30, 30, 30)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnEnVn)
               .addComponent(btnAddVNEN))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnSaveFile)
            .addGap(27, 27, 27))
      );

      txtResult.setColumns(20);
      txtResult.setRows(5);
      jScrollPane1.setViewportView(txtResult);

      jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
      jLabel2.setText("HuyLQSE63123");

      jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
      jLabel3.setText("@Copyright");

      jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
      jLabel4.setText("Version 1.02");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(36, 36, 36)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
            .addContainerGap())
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addGap(64, 64, 64))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(39, 39, 39)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jScrollPane1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(jLabel3)
               .addComponent(jLabel4))
            .addContainerGap(14, Short.MAX_VALUE))
      );

      getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 300));

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void btnSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFileActionPerformed
      try {
         dic.saveFile();
         JOptionPane.showMessageDialog(this, "Saved successfull!");
      } catch (IOException ex) {
         Logger.getLogger(DictionaryManager.class.getName()).log(Level.SEVERE, null, ex);
      }
   }//GEN-LAST:event_btnSaveFileActionPerformed

   private void btnAddENVNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddENVNActionPerformed
      java.awt.EventQueue.invokeLater(() -> {
         addEnVn dialog = new addEnVn(DictionaryManager.this, true);
         dialog.setLocationRelativeTo(rootPane);
         dialog.setVisible(true);
      });
   }//GEN-LAST:event_btnAddENVNActionPerformed

   private void btnAddVNENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVNENActionPerformed
      // TODO add your handling code here:
      java.awt.EventQueue.invokeLater(() -> {
         addVnEn dialog = new addVnEn(DictionaryManager.this, true);
         dialog.setLocationRelativeTo(rootPane);
         dialog.setVisible(true);
      });
   }//GEN-LAST:event_btnAddVNENActionPerformed

   private void btnEnVnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnVnActionPerformed
      // TODO add your handling code here:
      java.awt.EventQueue.invokeLater(() -> {
         SearchVnDialog dialog = new SearchVnDialog(DictionaryManager.this, true);
         dialog.setLocationRelativeTo(rootPane);
         dialog.setVisible(true);
      });
   }//GEN-LAST:event_btnEnVnActionPerformed

   private void btnVnEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVnEnActionPerformed
      // TODO add your handling code here:
      java.awt.EventQueue.invokeLater(() -> {
         SearchEngDialog dialog = new SearchEngDialog(DictionaryManager.this, true);
         dialog.setLocationRelativeTo(rootPane);
         dialog.setVisible(true);
      });
   }//GEN-LAST:event_btnVnEnActionPerformed

  
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
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(DictionaryManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      try {
        new DictionaryManager().setVisible(true);
      } catch (IOException ex) {
        Logger.getLogger(DictionaryManager.class.getName()).log(Level.SEVERE, null, ex);
      }
    });
  }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnAddENVN;
   private javax.swing.JButton btnAddVNEN;
   private javax.swing.JButton btnEnVn;
   private javax.swing.JButton btnSaveFile;
   private javax.swing.JButton btnVnEn;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextArea txtResult;
   // End of variables declaration//GEN-END:variables

  public void addEng(String left, String right) {
    dic.insertTree("EN", left, right);
    dic.insertTree("VN", right, left);
  }
  
  public void addVn(String left, String right) {
    dic.insertTree("VN", left, right);
    dic.insertTree("EN", right, left);
  }

  @Override
  public void search(String lang, String word) {
    String result = dic.search(lang, word);
    if (result == null)
      JOptionPane.showMessageDialog(this, "Being Under Construction...");
    else txtResult.setText(result);
  }
}
