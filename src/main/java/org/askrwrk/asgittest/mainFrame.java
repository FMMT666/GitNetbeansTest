/**
 * Why can't I 'git pull' on this machine???
 * Now, it works on that ^^ one, but not on this <<
 * :-/
 */

package org.askrwrk.asgittest;

import java.awt.Color;

/**
 *
 * @author askr
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
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

    butBurp = new javax.swing.JButton();
    panelOne1 = new org.askrwrk.panels.panelOne();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    butBurp.setText("*burp*");
    butBurp.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        butBurpActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelOne1Layout = new javax.swing.GroupLayout(panelOne1);
    panelOne1.setLayout(panelOne1Layout);
    panelOne1Layout.setHorizontalGroup(
      panelOne1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 0, Short.MAX_VALUE)
    );
    panelOne1Layout.setVerticalGroup(
      panelOne1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 244, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(panelOne1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 313, Short.MAX_VALUE)
            .addComponent(butBurp)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(panelOne1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(butBurp)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents


  /**
   * 
   * @param evt 
   */
  private void butBurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBurpActionPerformed

    // Just some changes to test Github release tags in Netbeans.
    
    Color curColor = panelOne1.getBackground();
    Color newColor;
    
    if( curColor == Color.red )
      newColor = Color.green;
    else if( curColor == Color.green )
      newColor = Color.blue;
    else if( curColor == Color.blue )
      newColor = Color.yellow;
    else if( curColor == Color.yellow )
      newColor = Color.pink;
    else if( curColor == Color.pink )
      newColor = Color.red;
    else
      newColor = Color.red;
    
    panelOne1.setBackground( newColor );

  }//GEN-LAST:event_butBurpActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton butBurp;
  private org.askrwrk.panels.panelOne panelOne1;
  // End of variables declaration//GEN-END:variables
}
