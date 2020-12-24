/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inface;

import code.DBconnect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.util.*;

/**
 *
 * @author Kavinda
 */
public class addprofile extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    HashMap<Integer,Integer>  comboItems = new HashMap<Integer,Integer> ();

    /**
     * Creates new form addprofile
     */
    public addprofile() {
        initComponents();
        conn=DBconnect.connect();
        tableload();
        loadComboBox();
    }
    
    public void loadComboBox(){
         try {
            String query = "Select id,course_name from course;";
            pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            jComboBox1.insertItemAt("SELECT A COURSE",0);
            int index = 1;
            
            while (rs.next()) {
                String name = rs.getString("course_name");
                int idCmb = rs.getInt("id");
                jComboBox1.insertItemAt(name,index);
                comboItems.put(index,idCmb);
                index ++;
            }
            jComboBox1.setSelectedIndex(0);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void tableload(){
        try {
            String sql="SELECT id as Id, arnumber as AR_Number,name as Name,course_id as Course_ID,stemail as Email,stpassword as Password,tpnumber as Mobile,stadd as Address,stdob as DOB,gender as Gender FROM student ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void tabledata(){

        int r = table1.getSelectedRow();
        String Id= table1.getValueAt(r, 0) == null ? "" : table1.getValueAt(r, 0).toString();
        String AR=  table1.getValueAt(r, 1) == null ? "" : table1.getValueAt(r, 1).toString();
        String Name= table1.getValueAt(r, 2) == null ? "" : table1.getValueAt(r, 2).toString();
        String course_id = table1.getValueAt(r, 3) == null ? "" : table1.getValueAt(r, 3).toString();
        Integer key = 0;
        for (Map.Entry<Integer,Integer> entry : comboItems.entrySet()) {
            if(course_id.equals(entry.getValue().toString())) {
                key = entry.getKey();
                break;
            }
        }
        String Email= table1.getValueAt(r, 4) == null ? "" : table1.getValueAt(r, 4).toString();        
        String Password= table1.getValueAt(r, 5) == null ? "" : table1.getValueAt(r, 5).toString();
        String Mobile= table1.getValueAt(r, 6) == null ? "" : table1.getValueAt(r, 6).toString();
        String Address= table1.getValueAt(r, 7) == null ? "" : table1.getValueAt(r, 7).toString();
        String Birth= table1.getValueAt(r, 8) == null ? "" : table1.getValueAt(r, 8).toString();
        String Gender= table1.getValueAt(r, 9) == null ? "" : table1.getValueAt(r, 9).toString();
    
         id.setText(Id);
         ar.setText(AR);
         name.setText(Name);
         jComboBox1.setSelectedIndex(key);
         mail.setText(Email);
         mura.setText(Password);
         duka.setText(Mobile);
         lipinaya.setText(Address);
         bday.setText(Birth);
         lin.setText(Gender);
         
   
    }
    public void search(){
    String srch=search.getText(); 
    
        try {
            String sql="SELECT * FROM student WHERE arnumber LIKE '%"+srch+"%' or name LIKE '%"+srch+"%'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void update(){
        String Id;
        String arnu;
        String nama;        
        Integer course = jComboBox1.getSelectedIndex();
        String tel;
        String gend;
        String email;
        String pass;
        String add;
        String birth;

        try {
            Id =id.getText();
            if(!Id.equals("")){
                arnu =  ar.getText();
                nama = name.getText();
                String course_id = comboItems.get(course).toString();
                tel = duka.getText();
                gend = lin.getText();
                email =mail.getText();
                pass=mura.getText();
                add=lipinaya.getText();
                birth=bday.getText();

                String sql="UPDATE student SET arnumber='"+arnu+"', name='"+nama+"', course_id='"+course_id+"',stemail='"+email+"',stpassword='"+pass+"',tpnumber='"+tel+"',stadd='"+add+"',stdob='"+birth+"',gender='"+gend+"' WHERE id='"+Id+"'";
                pst=conn.prepareCall(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Updated");
                clear();
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    public void clear(){
        
        search.setText("");
        ar.setText("");
        name.setText("");
        mail.setText("");
        mura.setText("");
        duka.setText("");
        lipinaya.setText("");
        bday.setText("");
        lin.setText("");
        jComboBox1.setSelectedIndex(0);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ar = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        mura = new javax.swing.JTextField();
        duka = new javax.swing.JTextField();
        lipinaya = new javax.swing.JTextField();
        bday = new javax.swing.JTextField();
        lin = new javax.swing.JTextField();
        insertbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        clear2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        note = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Refresh Table");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 478, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("AR No:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 105, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 145, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Mobile No:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Address");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Birth");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 414, -1, -1));
        jPanel1.add(ar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 98, 250, 30));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 134, 250, 30));
        jPanel1.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 207, 250, 30));
        jPanel1.add(mura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 247, 250, 30));
        jPanel1.add(duka, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 287, 250, 30));

        lipinaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lipinayaActionPerformed(evt);
            }
        });
        jPanel1.add(lipinaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 327, 250, 30));
        jPanel1.add(bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 367, 250, 30));
        jPanel1.add(lin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 407, 250, 30));

        insertbtn.setBackground(new java.awt.Color(255, 255, 153));
        insertbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        insertbtn.setText("Insert");
        insertbtn.setBorderPainted(false);
        insertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtnActionPerformed(evt);
            }
        });
        jPanel1.add(insertbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 478, 155, 30));

        updatebtn.setBackground(new java.awt.Color(153, 255, 102));
        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(0, 51, 51));
        updatebtn.setText("Update");
        updatebtn.setBorderPainted(false);
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 519, 100, 30));

        clear.setBackground(new java.awt.Color(204, 204, 204));
        clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear.setText("Clear");
        clear.setBorderPainted(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 519, 100, 30));

        deletebtn.setBackground(new java.awt.Color(255, 102, 102));
        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.setBorderPainted(false);
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 519, 100, 30));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("STUDENT DETAILS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 160, 30));

        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText(" ");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 449, 20, 20));

        search.setToolTipText("AR number or Name");
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 13, 90, 30));

        clear2.setBackground(new java.awt.Color(204, 204, 204));
        clear2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear2.setText("Search");
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });
        jPanel1.add(clear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 12, 89, 30));

        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 171, 250, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Course ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 80, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 560));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        table1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 540, 560));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setText("Notice  :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, -1, -1));

        note.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteActionPerformed(evt);
            }
        });
        getContentPane().add(note, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 320, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Publish");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 630, 110, 30));

        jButton3.setBackground(new java.awt.Color(204, 255, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Notice Area");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tableload();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        tabledata();
    }//GEN-LAST:event_table1MouseClicked

    private void table1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table1KeyReleased
        // TODO add your handling code here:
        tabledata();
    }//GEN-LAST:event_table1KeyReleased

    private void insertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbtnActionPerformed
         int arnu;
        String nama;
        int tel;
        String gend;
        String email;
        String pass;
        String add;
        String birth;
        Integer course = jComboBox1.getSelectedIndex();
                        
        

        
        try {
                    
            arnu = Integer.parseInt(ar.getText());
            nama = name.getText();
            tel =Integer.parseInt(duka.getText());
            String course_id = comboItems.get(course).toString();
            gend = lin.getText();
            email =mail.getText();
            pass=mura.getText();
            add=lipinaya.getText();
            birth=bday.getText();
        
            String sql ="INSERT INTO student (arnumber,name,course_id,stemail,stpassword,tpnumber,stadd,stdob,gender)VALUES('"+arnu+"','"+nama+"','"+course_id+"','"+email+"','"+pass+"','"+tel+"','"+add+"','"+birth+"','"+gend+"')";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Succsess");
            tableload();
            clear();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_insertbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        update();
        tableload();
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int del= JOptionPane.showConfirmDialog(null, "confirm DELETE");
        
        if(del==0){
        String Id= id.getText();
            try {
                String sql="DELETE FROM student WHERE id='"+Id+"'";
                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "DELETED");
                tableload();
                clear();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_deletebtnActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        clear();
        tableload();
    }//GEN-LAST:event_clearActionPerformed

    private void noteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String notic=note.getText();
        int n=JOptionPane.showConfirmDialog(null, "Are you sure");
        
        if(n==0){
        
        try {
            String sql="INSERT INTO spnote(Notice)VALUES('"+notic+"')";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"published");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         stprofile sp=new stprofile();
         sp.setVisible(true);
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lipinayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lipinayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lipinayaActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_clear2ActionPerformed

    private void table1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_table1KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        admin_home home = new admin_home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_searchKeyReleased

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
            java.util.logging.Logger.getLogger(addprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ar;
    private javax.swing.JTextField bday;
    private javax.swing.JButton clear;
    private javax.swing.JButton clear2;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField duka;
    private javax.swing.JLabel id;
    private javax.swing.JButton insertbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lin;
    private javax.swing.JTextField lipinaya;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField mura;
    private javax.swing.JTextField name;
    private javax.swing.JTextField note;
    private javax.swing.JTextField search;
    private javax.swing.JTable table1;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
