/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee111819;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 */
public class Deduction extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form Deduction
     */
    public Deduction() {
        initComponents();
        con = Employee111819.connect();
    }

    public void tapon() {
        sss.setText("");
        pi.setText("");
        ph.setText("");
        other.setText("");
        t.setText("");
    }

    public void clear() {
        id.setText("");
        fn.setText("");
        ln.setText("");
        job.setText("");
        deparment.setText("");
        gp.setText("");
        search.setText("");
    }

    int val7 = 0;
    int val8 = 0;
    int val9 = 0;
    int val10 = 0;
    int netpay;
    int tgp;
    int td = 0;
    String mark;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        deparment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        job = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        gp = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        sss = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ph = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        other = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        t = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("FirstName :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 120, 100, 41);

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(420, 30, 410, 40);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Deduction");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 30, 305, 41);

        fn.setEditable(false);
        getContentPane().add(fn);
        fn.setBounds(210, 120, 200, 40);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Search ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 30, 90, 41);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("LastName :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 180, 100, 41);

        ln.setEditable(false);
        getContentPane().add(ln);
        ln.setBounds(210, 180, 200, 40);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Employee ID :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 240, 110, 41);

        id.setEditable(false);
        getContentPane().add(id);
        id.setBounds(210, 240, 200, 40);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Department :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(510, 120, 100, 41);

        deparment.setEditable(false);
        getContentPane().add(deparment);
        deparment.setBounds(610, 120, 200, 40);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("JobTitle :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(510, 180, 100, 41);

        job.setEditable(false);
        job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobActionPerformed(evt);
            }
        });
        getContentPane().add(job);
        job.setBounds(610, 180, 200, 40);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Deduction");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(780, 380, 130, 41);

        gp.setEditable(false);
        gp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpActionPerformed(evt);
            }
        });
        getContentPane().add(gp);
        gp.setBounds(610, 240, 200, 40);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel1.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("SSS :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 40, 70, 41);
        jPanel1.add(sss);
        sss.setBounds(120, 40, 200, 40);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Pagibig :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 110, 90, 41);
        jPanel1.add(pi);
        pi.setBounds(120, 110, 200, 40);

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Philhealth :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(350, 40, 100, 41);
        jPanel1.add(ph);
        ph.setBounds(440, 40, 200, 40);

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Others :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(360, 110, 90, 41);
        jPanel1.add(other);
        other.setBounds(440, 110, 200, 40);

        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 200, 140, 50);

        jButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(370, 200, 140, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 380, 730, 300);

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Grosspay :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(510, 240, 100, 41);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel2.setLayout(null);

        jButton4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(10, 250, 110, 40);

        jButton5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(10, 180, 110, 30);

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 130, 110, 30);

        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });
        jPanel2.add(t);
        t.setBounds(10, 50, 110, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(780, 380, 130, 300);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(90, 100, 750, 230);

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(320, 20, 520, 60);

        setSize(new java.awt.Dimension(958, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        try {
            String sql = "select * from ALLOWANCE where EmpID=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, search.getText());
            rs = pst.executeQuery();
            String val = rs.getString("EmpID");
            id.setText(val);
            String val2 = rs.getString("FirstName");
            fn.setText(val2);
            String val3 = rs.getString("LastName");
            ln.setText(val3);
            String val4 = rs.getString("Department");
            deparment.setText(val4);
            String val5 = rs.getString("JobTitle");
            job.setText(val5);
            int val6 = rs.getInt("Salary");
            int val7 = rs.getInt("Total");
            int waw = val6 + val7;

            String tgp = String.valueOf(waw);
            gp.setText(tgp);

        } catch (Exception e) {

        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clear();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String sql = "insert into CLICKD(EmpID, FirstName, LastName, Department, JobTitle, Grosspay, SSS, PhilHealth, PagIbig, Others , NetPay)values(?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);

            pst.setString(1, id.getText());
            pst.setString(2, fn.getText());
            pst.setString(3, ln.getText());
            pst.setString(4, deparment.getText());
            pst.setString(5, job.getText());
            pst.setString(6, gp.getText());

            val7 = Integer.parseInt(sss.getText());
            val8 = Integer.parseInt(ph.getText());
            val9 = Integer.parseInt(pi.getText());
            val10 = Integer.parseInt(other.getText());
            td = val7 + val8 + val9 + val10;

            netpay = td - tgp;

            pst.setInt(7, val7);
            pst.setInt(8, val8);
            pst.setInt(9, val9);
            pst.setInt(10, val10);

            pst.setInt(11, (int) netpay);

            String total2 = String.valueOf(netpay);
            t.setText(total2);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Data Inserted");
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, exc);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception exc) {
            }
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tapon();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void gpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MAIN obj = new MAIN();
        obj.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try {
            int r = JOptionPane.showConfirmDialog(null, "Do you want to update salary?", "UPDATE SALARY", JOptionPane.YES_NO_OPTION);
            if (r == 0) {
                int minus = Integer.parseInt(t.getText());
                int plus = Integer.parseInt(gp.getText());
                int calcAmount = plus - minus;
                mark = String.valueOf(calcAmount);
                gp.setText(mark);

                String val1 = id.getText();
                String val2 = gp.getText();

                String sql = "update ALLOWANCE set Salary='" +val2+ "' where EmpID='" +val1+ "'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Record Updated");
            }
        } catch (Exception e) {
            
        } finally {
            try {
                pst.close();
                rs.close();

            } catch (Exception e) {

            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tActionPerformed

    private void jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobActionPerformed

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
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deduction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deparment;
    private javax.swing.JTextField fn;
    private javax.swing.JTextField gp;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField job;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField other;
    private javax.swing.JTextField ph;
    private javax.swing.JTextField pi;
    private javax.swing.JTextField search;
    private javax.swing.JTextField sss;
    private javax.swing.JTextField t;
    // End of variables declaration//GEN-END:variables
}
