
package inface;

import code.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class studentPage extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst =null;
    

 
    public studentPage() {
        initComponents();
        
        conn = DBconnect.connect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        arnumber = new javax.swing.JTextField();
        stdnama = new javax.swing.JTextField();
        duka = new javax.swing.JTextField();
        subbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lipinaya = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        elipinaya = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        mura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("welcome");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Student Page");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 260, 60));

        jLabel2.setText("AR number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel4.setText("TP number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, 10));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "M", "F" }));
        jPanel1.add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, -1));
        jPanel1.add(arnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 180, -1));
        jPanel1.add(stdnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 180, -1));
        jPanel1.add(duka, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, -1));

        subbtn.setText("Submit");
        subbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subbtnActionPerformed(evt);
            }
        });
        jPanel1.add(subbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        lipinaya.setText(" ");
        lipinaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lipinayaActionPerformed(evt);
            }
        });
        jPanel1.add(lipinaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 180, -1));

        jLabel7.setText("DOB");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        bd.setText(" ");
        bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdActionPerformed(evt);
            }
        });
        jPanel1.add(bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 180, -1));

        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        elipinaya.setText(" ");
        jPanel1.add(elipinaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 180, -1));

        jLabel9.setText("Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        mura.setText(" ");
        mura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muraActionPerformed(evt);
            }
        });
        jPanel1.add(mura, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 490));

        setSize(new java.awt.Dimension(486, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subbtnActionPerformed
       
        int ar;
        String nama;
        int tel;
        String gend;
        String mail;
        String pass;
        String add;
        String birth;
        
        
        ar = Integer.parseInt(arnumber.getText());
        nama = stdnama.getText();
        tel =Integer.parseInt(duka.getText());
        gend = combo.getSelectedItem().toString();
        mail =elipinaya.getText();
        pass=mura.getText();
        add=lipinaya.getText();
        birth=bd.getText();
        
        try {
            
            String sql ="INSERT INTO student (arnumber,name,stemail,stpassword,tpnumber,stadd,stdob,gender)VALUES('"+ar+"','"+nama+"','"+mail+"','"+pass+"','"+tel+"','"+add+"','"+birth+"','"+gend+"')";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "plece login now");
            login log =new login();
            log.setVisible(true);
            this.dispose();
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
       
    }//GEN-LAST:event_subbtnActionPerformed

    private void lipinayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lipinayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lipinayaActionPerformed

    private void bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdActionPerformed

    private void muraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_muraActionPerformed

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
            java.util.logging.Logger.getLogger(studentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new studentPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arnumber;
    private javax.swing.JTextField bd;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField duka;
    private javax.swing.JTextField elipinaya;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lipinaya;
    private javax.swing.JTextField mura;
    private javax.swing.JTextField stdnama;
    private javax.swing.JButton subbtn;
    // End of variables declaration//GEN-END:variables
}
