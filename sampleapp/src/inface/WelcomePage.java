/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inface;
/**
 *
 * @author user
 */
public class WelcomePage extends javax.swing.JFrame {

    /**
     * Creates new form first
     */
    public WelcomePage() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inface/asset/Capture5555.PNG"))); // NOI18N
        jLabel2.setText("jLabel3");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 286, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT MANAGEMENT SYSTEM");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 450, 53));

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(102, 204, 0));
        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 180, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Loading.......");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 530));

        setSize(new java.awt.Dimension(706, 564));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        //homePage home = new homePage();
        //home.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       // try {
           // for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               // if ("Nimbus".equals(info.getName())) {
                   // javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  //  break;
              //  }
          // }
       // } catch (ClassNotFoundException ex) {
           // java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (InstantiationException ex) {
          //  java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (IllegalAccessException ex) {
           // java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
          //  java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       // java.awt.EventQueue.invokeLater(new Runnable() {
           // public void run() {
           //     new WelcomePage().setVisible(true);
            //}
        //});
        
        
        WelcomePage load = new WelcomePage();
        load.setVisible(true);
        
        try
        {
            for(int i = 0 ; i <100;i++)
            {
                Thread.sleep(50);
                load.jProgressBar1.setValue(i);
                
            }
            load.setVisible(false);
            homePage log =new homePage();
            log.setVisible(true);
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}