 
package inface;

import code.DBconnect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

 
public class adminPage extends javax.swing.JFrame {

   Connection conn=null;
   PreparedStatement pst=null;
   
    public adminPage() {
        initComponents();
        conn=DBconnect.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        an = new javax.swing.JTextField();
        at = new javax.swing.JTextField();
        anic = new javax.swing.JTextField();
        ae = new javax.swing.JTextField();
        ap = new javax.swing.JTextField();
        aa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Admin Login");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel3.setText("Tel Number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setText("NIC Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel7.setText("Address");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        an.setText(" ");
        an.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anActionPerformed(evt);
            }
        });
        jPanel1.add(an, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 190, -1));

        at.setText(" ");
        at.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atActionPerformed(evt);
            }
        });
        jPanel1.add(at, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 190, -1));

        anic.setText(" ");
        anic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anicActionPerformed(evt);
            }
        });
        jPanel1.add(anic, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 190, -1));

        ae.setText(" ");
        ae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aeActionPerformed(evt);
            }
        });
        jPanel1.add(ae, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 190, -1));

        ap.setText(" ");
        jPanel1.add(ap, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 190, -1));

        aa.setText(" ");
        jPanel1.add(aa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 190, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anActionPerformed

    private void atActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atActionPerformed

    private void anicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anicActionPerformed

    private void aeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String addn;
       String addt;
       String addni;
       String addm;
       String addp;
       String addad;
       
       addn = an.getText();
       addt =at.getText();
       addni = anic.getText();
       addm=ae.getText();
       addp=ap.getText();
       addad=aa.getText();
       
        try {
            String sql;
            sql="INSERT INTO admin(addname,addtell,addnic,addemail,addpassword,addadd) VALUES('"+addn+"','"+addt+"','"+addni+"','"+addm+"','"+addp+"','"+addad+"')";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Succses"); 
            addprofile adp=new addprofile();
            adp.setVisible(true);
            this.dispose();
            
        } catch ( HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        addlogin al=new addlogin();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aa;
    private javax.swing.JTextField ae;
    private javax.swing.JTextField an;
    private javax.swing.JTextField anic;
    private javax.swing.JTextField ap;
    private javax.swing.JTextField at;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
